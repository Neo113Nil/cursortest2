package ru.ok.media;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import one.video.streaming.oktp.OktpJNI;
import ru.ok.media.logging.Logger;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.utils.TimedEvent;
import ru.ok.proto.NetPublisher;
import ru.ok.proto.PublisherConfiguration;
import ru.ok.proto.okmp.OkmpHandler;
import ru.ok.proto.okmp.OkmpPublisher;
import ru.ok.proto.okmp.OkmpPublisherNative;
import ru.ok.proto.okmp.PlatformSpecificInfo;
import ru.ok.proto.rtmp.RtmpPublisher;
import xsna.l370;
import xsna.ne7;
import xsna.o93;
import xsna.tto0;

/* loaded from: classes9.dex */
public class ConnectionsManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "Publisher";
    private final PublisherConfiguration config;
    private final int defaultStartBitrate;
    private final Handler handler;
    private final LoggerInterface logger;
    private Collection<String> urls;
    private final HandlerThread workerThread;
    private long benchBW = 10000000;
    private final List<Connection> connections = new ArrayList(2);
    private final TimedEvent startEvent = new TimedEvent();
    private TimedEvent lastHandshakeEvent = new TimedEvent();

    public class Connection implements NetPublisher.Callback {
        static final int STATE_ERROR = 2;
        static final int STATE_HANDSHAKED = 1;
        static final int STATE_INIT = 0;
        static final int STATE_RETRYING = 3;
        private final ConnectionBenchmark benchmark;
        private boolean benchmarkDisabled;
        private NetPublisher.Callback callback;
        private int lastErrorCode;
        public final NetPublisher publisher;
        private int state;
        private volatile boolean stopped;
        private final String url;

        public /* synthetic */ Connection(ConnectionsManager connectionsManager, String str, NetPublisher netPublisher, int i) {
            this(str, netPublisher);
        }

        public void attachCallback(NetPublisher.Callback callback) {
            synchronized (ConnectionsManager.this.connections) {
                try {
                    int i = this.state;
                    if (i == 1) {
                        callback.handleHandshakeComplete(callback.getId());
                    } else if (i == 2) {
                        callback.handleError(callback.getId(), this.lastErrorCode);
                    } else if (i == 3) {
                        callback.handleRetrying(callback.getId());
                    }
                    this.callback = callback;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public int getId() {
            return 0;
        }

        public long getMeasuredBandwidth() {
            return this.benchmark.getResultBitrate();
        }

        public int getState() {
            return this.state;
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public void handleError(int i, int i2) {
            synchronized (ConnectionsManager.this.connections) {
                try {
                    if (this.stopped) {
                        return;
                    }
                    this.state = 2;
                    this.lastErrorCode = i2;
                    NetPublisher.Callback callback = this.callback;
                    if (callback != null) {
                        callback.handleError(callback.getId(), i2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public void handleHandshakeComplete(int i) {
            synchronized (ConnectionsManager.this.connections) {
                try {
                    if (this.stopped) {
                        return;
                    }
                    ne7.t(ConnectionsManager.TAG, "handshake complete; url: " + this.url);
                    startBenchmark();
                    this.state = 1;
                    NetPublisher.Callback callback = this.callback;
                    if (callback != null) {
                        callback.handleHandshakeComplete(callback.getId());
                    }
                    ConnectionsManager.this.lastHandshakeEvent.signal();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public void handlePublishingRestart(int i) {
            synchronized (ConnectionsManager.this.connections) {
                try {
                    if (this.stopped) {
                        return;
                    }
                    NetPublisher.Callback callback = this.callback;
                    if (callback != null) {
                        callback.handlePublishingRestart(callback.getId());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public void handlePublishingStart(int i) {
            synchronized (ConnectionsManager.this.connections) {
                try {
                    if (this.stopped) {
                        return;
                    }
                    NetPublisher.Callback callback = this.callback;
                    if (callback != null) {
                        callback.handlePublishingStart(callback.getId());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public void handleRestarted(int i) {
            synchronized (ConnectionsManager.this.connections) {
                try {
                    if (this.stopped) {
                        return;
                    }
                    this.state = this.publisher.isConnectionChecked() ? 1 : 0;
                    NetPublisher.Callback callback = this.callback;
                    if (callback != null) {
                        callback.handleRestarted(callback.getId());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public void handleRetrying(int i) {
            synchronized (ConnectionsManager.this.connections) {
                try {
                    if (this.stopped) {
                        return;
                    }
                    this.state = 3;
                    NetPublisher.Callback callback = this.callback;
                    if (callback != null) {
                        callback.handleRetrying(callback.getId());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public void handleStopped(int i) {
            synchronized (ConnectionsManager.this.connections) {
                try {
                    if (this.stopped) {
                        return;
                    }
                    NetPublisher.Callback callback = this.callback;
                    if (callback != null) {
                        callback.handleStopped(callback.getId());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean isHandshaked() {
            int i = this.state;
            return i == 1 || (i == 3 && this.publisher.isConnectionChecked());
        }

        public void limitBW(long j) {
            this.benchmark.limitBW(j);
        }

        public void setBackground(boolean z) {
            this.benchmark.setBackground(z);
        }

        public void start() {
            this.publisher.start();
        }

        public void startBenchmark() {
            if (!this.url.startsWith("okmp://") || this.benchmarkDisabled) {
                return;
            }
            this.benchmark.start();
        }

        public void stop() {
            this.stopped = true;
            this.publisher.stop();
        }

        public void stopBenchmark() {
            this.benchmarkDisabled = true;
            this.benchmark.stop();
        }

        private Connection(String str, NetPublisher netPublisher) {
            this.state = 0;
            this.url = str;
            this.publisher = netPublisher;
            ConnectionBenchmark connectionBenchmark = new ConnectionBenchmark(null, ConnectionsManager.this.handler, netPublisher);
            this.benchmark = connectionBenchmark;
            if (ConnectionsManager.this.benchBW > 0) {
                connectionBenchmark.limitBW(ConnectionsManager.this.benchBW);
            }
        }
    }

    public ConnectionsManager(HandlerThread handlerThread, PublisherConfiguration publisherConfiguration, int i, LoggerInterface loggerInterface) {
        this.workerThread = handlerThread;
        this.config = publisherConfiguration;
        this.defaultStartBitrate = i;
        this.handler = new Handler(handlerThread.getLooper());
        this.logger = loggerInterface;
    }

    private NetPublisher createOkmpPublisher(String str, PublisherConfiguration publisherConfiguration, int i) {
        if (!publisherConfiguration.isOkmpNativeEnabled()) {
            return new OkmpPublisher(this.workerThread, str, publisherConfiguration, i, this.logger);
        }
        try {
            URI uri = new URI(str);
            String replace = uri.getPath().replace(DomExceptionUtils.SEPARATOR, "");
            String host = uri.getHost();
            int port = uri.getPort();
            if (port < 0) {
                port = 2020;
            }
            int i2 = port;
            InetSocketAddress inetSocketAddress = new InetSocketAddress(host, i2);
            if (inetSocketAddress.isUnresolved()) {
                Logger.w("Failed to resolve address: host=" + host);
                return null;
            }
            String A = l370.A();
            OkmpHandler okmpHandler = new OkmpHandler(this.workerThread.getLooper());
            OkmpPublisherNative okmpPublisherNative = new OkmpPublisherNative(new tto0(), okmpHandler, replace, inetSocketAddress.getAddress().getHostAddress(), i2, publisherConfiguration, i, this.logger, new PlatformSpecificInfo("Android/ru.ok.media/release/" + GrafikaRuntimeConfig.DEBUG + DomExceptionUtils.SEPARATOR + GrafikaRuntimeConfig.VERSION_CODE + "/build" + GrafikaRuntimeConfig.BUILD_NUMBER, Build.BRAND, Build.MANUFACTURER, Build.MODEL, A == null ? "null" : A));
            okmpHandler.setPublisher(okmpPublisherNative);
            return okmpPublisherNative;
        } catch (URISyntaxException e) {
            ne7.n(TAG, "Error parsing url \"" + str + "\": " + e);
            throw new RuntimeException(e);
        }
    }

    private Connection createPublisher(String str, PublisherConfiguration publisherConfiguration, int i) {
        ne7.t(TAG, "Creating publisher with url: " + str);
        String lowerCase = str.toLowerCase();
        int i2 = 0;
        if (lowerCase.startsWith("rtmp://")) {
            RtmpPublisher rtmpPublisher = new RtmpPublisher(this.workerThread, str, publisherConfiguration, i, this.logger);
            Connection connection = new Connection(this, str, rtmpPublisher, i2);
            rtmpPublisher.setCallback(connection);
            return connection;
        }
        if (!lowerCase.startsWith("okmp://")) {
            throw new RuntimeException("Unknown protocol in url: ".concat(str));
        }
        NetPublisher createOkmpPublisher = createOkmpPublisher(str, publisherConfiguration, i);
        Connection connection2 = new Connection(this, str, createOkmpPublisher, i2);
        createOkmpPublisher.setCallback(connection2);
        return connection2;
    }

    private void dropConnections(Connection connection) {
        for (Connection connection2 : this.connections) {
            connection2.stopBenchmark();
            if (connection2 != connection) {
                connection2.stop();
            }
        }
        this.connections.clear();
    }

    private void initializePublisherLogger() {
        OktpJNI.setPublisherLogger(ne7.i);
    }

    private String resolveUrl(String str) {
        String str2;
        try {
            try {
                URI create = URI.create(str);
                str2 = create.getHost();
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str2);
                    if (allByName.length < 1) {
                        ne7.n(TAG, "Failed to resolve host " + str2);
                        return null;
                    }
                    String hostAddress = allByName[new Random().nextInt(allByName.length)].getHostAddress();
                    try {
                        return new URI(create.getScheme(), create.getUserInfo(), hostAddress, create.getPort(), create.getPath(), create.getQuery(), create.getFragment()).toString();
                    } catch (UnknownHostException e) {
                        e = e;
                        str2 = hostAddress;
                        ne7.n(TAG, "Failed to resolve host " + str2 + ": " + e);
                        return null;
                    }
                } catch (UnknownHostException e2) {
                    e = e2;
                }
            } catch (URISyntaxException e3) {
                ne7.n(TAG, "URL syntax error: " + str + ": " + e3);
                return null;
            }
        } catch (UnknownHostException e4) {
            e = e4;
            str2 = null;
        }
    }

    public void close() {
        synchronized (this.connections) {
            dropConnections(null);
        }
    }

    public void limitBW(long j) {
        this.benchBW = Math.min(j, 10000000L);
        ne7.t(TAG, "limitBW: benchBW=" + this.benchBW + " bw=" + j);
        synchronized (this.connections) {
            try {
                Iterator<Connection> it = this.connections.iterator();
                while (it.hasNext()) {
                    it.next().limitBW(this.benchBW);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Connection selectPublisher() throws IOException {
        boolean z = false;
        if (this.startEvent.elapsed() > 3000 && this.lastHandshakeEvent.elapsed(0) > 1000) {
            z = true;
        }
        synchronized (this.connections) {
            try {
                if (this.connections.isEmpty()) {
                    throw new IOException("No connections available");
                }
                for (Connection connection : this.connections) {
                    if (connection.isHandshaked()) {
                        ne7.t(TAG, "selected publisher: " + connection.url);
                        dropConnections(connection);
                        Handler handler = this.handler;
                        NetPublisher netPublisher = connection.publisher;
                        Objects.requireNonNull(netPublisher);
                        handler.post(new o93(netPublisher, 9));
                        return connection;
                    }
                    if (!z) {
                        break;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setBackground(boolean z) {
        synchronized (this.connections) {
            try {
                Iterator<Connection> it = this.connections.iterator();
                while (it.hasNext()) {
                    it.next().setBackground(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setUrls(Collection<String> collection) {
        this.urls = collection;
    }

    public void start() {
        String resolveUrl;
        String resolveUrl2;
        synchronized (this.connections) {
            try {
                if (this.connections.isEmpty()) {
                    this.startEvent.signal();
                    if (this.config.isOkmpEnabled()) {
                        Iterator<String> it = this.urls.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            if (next.toLowerCase().startsWith("okmp://") && (resolveUrl2 = resolveUrl(next)) != null) {
                                this.connections.add(createPublisher(resolveUrl2, this.config, this.defaultStartBitrate));
                                break;
                            }
                        }
                    }
                    if (this.config.isRtmpEnabled()) {
                        Iterator<String> it2 = this.urls.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            String next2 = it2.next();
                            if (next2.toLowerCase().startsWith("rtmp://") && (resolveUrl = resolveUrl(next2)) != null) {
                                this.connections.add(createPublisher(resolveUrl, this.config, this.defaultStartBitrate));
                                break;
                            }
                        }
                    }
                    Iterator<Connection> it3 = this.connections.iterator();
                    while (it3.hasNext()) {
                        it3.next().start();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void stopBenchmark() {
        Iterator<Connection> it = this.connections.iterator();
        while (it.hasNext()) {
            it.next().stopBenchmark();
        }
    }
}
