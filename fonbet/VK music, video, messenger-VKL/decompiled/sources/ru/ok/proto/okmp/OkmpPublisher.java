package ru.ok.proto.okmp;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import one.video.streaming.tools.LogInterface;
import ru.ok.media.NetStats;
import ru.ok.media.logging.Logger;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.utils.DataSample;
import ru.ok.media.utils.TimedEvent;
import ru.ok.media.utils.VideoSize;
import ru.ok.proto.NetPublisher;
import ru.ok.proto.PacketStats;
import ru.ok.proto.PublisherConfiguration;
import ru.ok.proto.QualityController;
import ru.ok.proto.okmp.OkmpClient;
import ru.ok.proto.okmp.OkmpPublisher;
import ru.ok.proto.okmp.messages.MetadataMessage;
import ru.ok.proto.okmp.messages.PublishMessage;
import ru.ok.proto.okmp.messages.UnpublishMessage;
import ru.ok.proto.rtmp.RtmpMessages;
import ru.ok.proto.rtmp.Utils;
import ru.ok.proto.rtmp.amf.entries.AmfNumber;
import xsna.ep0;
import xsna.hv1;
import xsna.id;
import xsna.iv1;
import xsna.ji;
import xsna.kl2;
import xsna.m06;
import xsna.mz70;
import xsna.ne7;
import xsna.o1;
import xsna.od6;
import xsna.r490;
import xsna.tto0;
import xsna.tv9;
import xsna.xy6;

/* loaded from: classes9.dex */
public class OkmpPublisher implements NetPublisher {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "Publisher";
    private String appName;
    private final m06 audioBWEstimator;
    private NetPublisher.Callback callback;
    private OkmpClient client;
    private final PublisherConfiguration config;
    private final Handler handler;
    private final HandlerThread handlerThread;
    private String host;
    private int lastError;
    private int lastVideoTS;
    private final String link;
    private final LoggerInterface logger;
    private Map<String, Object> metadata;
    private final mz70 oktpConfig;
    private final LogInterface oktpLogger;
    private boolean paused;
    private int port;
    private boolean publishingStarted;
    private final OkmpQualityController qualityController;
    private InetSocketAddress remoteAddress;
    private boolean stopped;
    private byte[] storedAacConfig;
    private byte[] storedH264Config;
    private VideoSize videoSize;
    private TimedEvent lastConfigTransmission = new TimedEvent();
    private TimedEvent lastVideoFrameEvent = new TimedEvent();
    private int rotation = -1;
    private final PacketStats packetStats = new PacketStats();

    /* renamed from: ru.ok.proto.okmp.OkmpPublisher$2, reason: invalid class name */
    public class AnonymousClass2 implements OkmpClient.Listener {
        final /* synthetic */ OkmpClient val$client;

        public AnonymousClass2(OkmpClient okmpClient) {
            this.val$client = okmpClient;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClose$0(OkmpClient okmpClient, int i) {
            if (okmpClient != null) {
                PacketStats packetStats = okmpClient.getPacketStats();
                ne7.m(OkmpPublisher.TAG, "adding packet stats: " + OkmpPublisher.this.packetStats + " += " + packetStats);
                OkmpPublisher.this.packetStats.add(packetStats);
            }
            if (okmpClient != OkmpPublisher.this.client) {
                ne7.J(OkmpPublisher.TAG, "different client in ClientListener::onClose() closure");
                return;
            }
            OkmpPublisher.this.qualityController.setClient(null);
            OkmpPublisher.this.client = null;
            OkmpPublisher.this.retry(i);
        }

        @Override // ru.ok.proto.okmp.OkmpClient.Listener
        public void onClose(final int i) {
            ne7.m(OkmpPublisher.TAG, "onClose(" + i + ")");
            Handler handler = OkmpPublisher.this.handler;
            final OkmpClient okmpClient = this.val$client;
            handler.post(new Runnable() { // from class: ru.ok.proto.okmp.a
                @Override // java.lang.Runnable
                public final void run() {
                    OkmpPublisher.AnonymousClass2.this.lambda$onClose$0(okmpClient, i);
                }
            });
        }

        @Override // ru.ok.proto.okmp.OkmpClient.Listener
        public void onConnected() {
            ne7.m(OkmpPublisher.TAG, "onConnected()");
            if (this.val$client != OkmpPublisher.this.client) {
                return;
            }
            OkmpPublisher.this.qualityController.setClient(this.val$client);
            NetPublisher.Callback callback = OkmpPublisher.this.callback;
            callback.handleHandshakeComplete(callback.getId());
        }
    }

    public OkmpPublisher(HandlerThread handlerThread, String str, PublisherConfiguration publisherConfiguration, int i, final LoggerInterface loggerInterface) {
        StringBuilder b = xy6.b(i, "OkmpPublisher() - link=", str, ", initialBitrate", ",config=");
        b.append(publisherConfiguration);
        ne7.m(TAG, b.toString());
        this.audioBWEstimator = new m06(1000000L, new tto0());
        this.handlerThread = handlerThread;
        this.handler = new Handler(handlerThread.getLooper());
        this.link = str;
        this.config = publisherConfiguration;
        this.logger = loggerInterface;
        LogInterface logInterface = new LogInterface() { // from class: ru.ok.proto.okmp.OkmpPublisher.1
            @Override // one.video.streaming.tools.LogInterface
            public boolean enabled() {
                return loggerInterface.detailedEnabled();
            }

            @Override // one.video.streaming.tools.LogInterface
            public void message(String str2) {
                loggerInterface.logDetailed(str2);
            }
        };
        this.oktpLogger = logInterface;
        this.qualityController = new OkmpQualityController(i, publisherConfiguration.maxDelayMS, publisherConfiguration.delayThresholdSwitchDown, logInterface);
        this.oktpConfig = new mz70(publisherConfiguration.attachSN);
    }

    private void abort() {
        ne7.m(TAG, "abort()");
        this.handler.post(new iv1(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkTimeout() {
        OkmpClient okmpClient = this.client;
        long elapsed = this.lastVideoFrameEvent.elapsed();
        if (okmpClient == null || elapsed <= this.config.reconnectTimeout) {
            return;
        }
        okmpClient.stop();
        PacketStats packetStats = okmpClient.getPacketStats();
        ne7.m(TAG, "adding packet stats: " + this.packetStats + " += " + packetStats);
        this.packetStats.add(packetStats);
        stop();
        int i = this.lastError;
        if (i == 0) {
            i = 10;
        }
        ne7.n(TAG, "Fatal error, dropping stream; code=" + i);
        NetPublisher.Callback callback = this.callback;
        callback.handleError(callback.getId(), i);
        this.client = null;
    }

    private void composeAndPushMetadata() {
        pushMetadata(Utils.createMetadata(this.storedH264Config, this.storedAacConfig, this.rotation));
    }

    private void doPushMetadata(Map<String, Object> map, OkmpClient okmpClient) {
        if (map != null) {
            okmpClient.sendMessage(this.lastVideoTS, new MetadataMessage(map), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$abort$3() {
        OkmpClient okmpClient = this.client;
        if (okmpClient != null) {
            okmpClient.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$publishStream$2(OkmpClient okmpClient, String str, ByteBuffer byteBuffer) {
        int deserializeStatic = (int) AmfNumber.deserializeStatic(byteBuffer);
        NetPublisher.Callback callback = this.callback;
        if (deserializeStatic != 0) {
            Logger.w("Failed to publish stream, error code=" + deserializeStatic);
            callback.handleError(callback.getId(), 10);
            return;
        }
        this.qualityController.setClient(okmpClient);
        if (this.publishingStarted) {
            callback.handlePublishingRestart(callback.getId());
        } else {
            this.publishingStarted = true;
            callback.handlePublishingStart(callback.getId());
        }
        doPushMetadata(this.metadata, okmpClient);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        retry(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$1() {
        NetPublisher.Callback callback = this.callback;
        try {
            try {
                URI uri = new URI(this.link);
                this.appName = uri.getPath().replace(DomExceptionUtils.SEPARATOR, "");
                this.host = uri.getHost();
                int port = uri.getPort();
                this.port = port;
                if (port < 0) {
                    this.port = 2020;
                }
                InetSocketAddress inetSocketAddress = new InetSocketAddress(this.host, this.port);
                this.remoteAddress = inetSocketAddress;
                if (inetSocketAddress.isUnresolved()) {
                    Logger.w("Failed to resolve address: host=" + this.host);
                    callback.handleError(callback.getId(), 10);
                    return;
                }
                HandlerThread handlerThread = this.handlerThread;
                InetSocketAddress inetSocketAddress2 = this.remoteAddress;
                mz70 mz70Var = this.oktpConfig;
                PublisherConfiguration publisherConfiguration = this.config;
                OkmpClient okmpClient = new OkmpClient(handlerThread, inetSocketAddress2, mz70Var, publisherConfiguration.encryptSignalling, publisherConfiguration.encryptAudio, publisherConfiguration.encryptVideo, publisherConfiguration.tos, publisherConfiguration.iframeIntervalSeconds * 1000, this.oktpLogger, publisherConfiguration.emulateSendErrorPeriodMillis, publisherConfiguration.emulateRecvErrorPeriodMillis);
                this.qualityController.setClient(null);
                okmpClient.setListener(new AnonymousClass2(okmpClient));
                PublisherConfiguration publisherConfiguration2 = this.config;
                okmpClient.start(publisherConfiguration2.minMTU, publisherConfiguration2.maxMTU);
                this.client = okmpClient;
            } catch (URISyntaxException e) {
                ne7.n(TAG, "Error parsing url \"" + this.link + "\"" + e);
                throw new RuntimeException(e);
            }
        } catch (SocketException e2) {
            ne7.n(TAG, "Network error starting OKMP client \"" + this.link + "\": " + e2);
            this.handler.post(new hv1(this, 11));
        } catch (Exception e3) {
            ne7.n(TAG, "Error starting OKMP client \"" + this.link + "\":" + e3);
            callback.handleError(callback.getId(), 12);
            abort();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$4(Runnable runnable) {
        OkmpClient okmpClient = this.client;
        if (okmpClient != null) {
            okmpClient.setEmptyBuffersListener(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$5() {
        OkmpClient okmpClient = this.client;
        if (okmpClient != null) {
            okmpClient.stop();
        }
    }

    private void pushMetadata(Map<String, Object> map) {
        if (this.stopped) {
            return;
        }
        this.metadata = map;
        OkmpClient okmpClient = this.client;
        if (okmpClient != null && this.publishingStarted) {
            doPushMetadata(map, okmpClient);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void retry(int i) {
        ne7.m(TAG, "retry(" + i + ")");
        if (this.stopped) {
            return;
        }
        NetPublisher.Callback callback = this.callback;
        long elapsed = this.lastVideoFrameEvent.elapsed();
        if (elapsed > this.config.reconnectTimeout) {
            ne7.n(TAG, "Fatal error, dropping stream; code=" + i);
            callback.handleError(callback.getId(), i);
            return;
        }
        this.lastError = i;
        ne7.J(TAG, "Retrying connection, timeSinceOk=" + elapsed);
        callback.handleRetrying(callback.getId());
        this.handler.postDelayed(new tv9(this, 8), 500L);
        this.handler.postDelayed(new o1(this, 12), Math.max(0L, this.config.reconnectTimeout - elapsed) + 100);
    }

    @Override // ru.ok.proto.NetPublisher
    public long getBitrate() {
        OkmpClient okmpClient = this.client;
        if (okmpClient != null) {
            return okmpClient.getBitrate();
        }
        return 0L;
    }

    @Override // ru.ok.proto.NetPublisher
    @NonNull
    public String getDebugInfo() {
        return "";
    }

    @Override // ru.ok.proto.NetPublisher
    public String getName() {
        return "OKMP/OK/Java";
    }

    @Override // ru.ok.proto.NetPublisher
    public NetStats getNetStats() {
        OkmpClient okmpClient = this.client;
        if (okmpClient == null) {
            return null;
        }
        return okmpClient.getNetStats();
    }

    @Override // ru.ok.proto.NetPublisher
    public long getNetworkBW(long j) {
        OkmpClient okmpClient = this.client;
        if (okmpClient != null) {
            return okmpClient.getEstimatedBandwidth(j);
        }
        return -1L;
    }

    @Override // ru.ok.proto.NetPublisher
    @NonNull
    public PacketStats getPacketStats() {
        return null;
    }

    @Override // ru.ok.proto.NetPublisher
    public QualityController getQualityController() {
        return this.qualityController;
    }

    @Override // ru.ok.proto.NetPublisher
    public boolean isConnectionChecked() {
        OkmpClient okmpClient = this.client;
        return okmpClient != null && okmpClient.isConnectionChecked();
    }

    @Override // ru.ok.proto.NetPublisher
    public boolean isPaused() {
        return this.paused;
    }

    @Override // ru.ok.proto.NetPublisher
    public void pause() {
        ne7.m(TAG, "pause()");
        this.paused = true;
        OkmpClient okmpClient = this.client;
        if (okmpClient != null) {
            okmpClient.pause();
        }
    }

    @Override // ru.ok.proto.NetPublisher
    public void publishStream(String str) {
        ne7.m(TAG, "publishStream(\"" + str + "\")");
        RtmpMessages.ConnectRequest connectRequest = new RtmpMessages.ConnectRequest();
        final OkmpClient okmpClient = this.client;
        if (okmpClient == null) {
            return;
        }
        connectRequest.getCommandObject().setApp(this.appName);
        connectRequest.getCommandObject().setNetType(this.logger.getNetType());
        okmpClient.sendMessage(0, connectRequest, null);
        okmpClient.sendMessage(0, new PublishMessage(str), new OkmpClient.ReactionRunnable() { // from class: xsna.gz70
            @Override // ru.ok.proto.okmp.OkmpClient.ReactionRunnable
            public final void handle(String str2, ByteBuffer byteBuffer) {
                OkmpPublisher.this.lambda$publishStream$2(okmpClient, str2, byteBuffer);
            }
        });
        okmpClient.setPublishSent(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    @Override // ru.ok.proto.NetPublisher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pushAACAudioFrame(ByteBuffer byteBuffer, boolean z, int i, int i2) {
        int i3;
        ne7.m(TAG, "pushAACAudioFrame() - isHeader=" + z + ", timestamp=" + i + ", data=" + r490.f(byteBuffer, z));
        if (this.stopped) {
            ne7.m(TAG, "pushAACAudioFrame() - stopped");
            return;
        }
        OkmpClient okmpClient = this.client;
        if (okmpClient == null) {
            ne7.m(TAG, "pushAACAudioFrame() - no client");
            return;
        }
        if (z) {
            this.storedAacConfig = new byte[byteBuffer.remaining()];
            int position = byteBuffer.position();
            byteBuffer.get(this.storedAacConfig);
            byteBuffer.position(position);
            this.lastConfigTransmission.signal();
            composeAndPushMetadata();
        } else if (this.storedAacConfig != null && this.lastConfigTransmission.elapsed() > 500) {
            this.audioBWEstimator.a(this.storedAacConfig.length);
            i3 = i;
            okmpClient.pushFrame(Collections.singleton(ByteBuffer.wrap(this.storedAacConfig)), 2, 0, 3, true, i3, 0);
            this.lastConfigTransmission.signal();
            this.audioBWEstimator.a(byteBuffer.remaining());
            okmpClient.pushFrame(Collections.singleton(byteBuffer), 2, 0, !z ? 3 : 0, false, i3, 0);
        }
        i3 = i;
        this.audioBWEstimator.a(byteBuffer.remaining());
        okmpClient.pushFrame(Collections.singleton(byteBuffer), 2, 0, !z ? 3 : 0, false, i3, 0);
    }

    @Override // ru.ok.proto.NetPublisher
    public void pushH264Frame(DataSample dataSample, boolean z, int i, int i2) {
        OkmpClient okmpClient;
        int i3;
        if (this.stopped || (okmpClient = this.client) == null) {
            return;
        }
        this.lastVideoTS = i;
        if (okmpClient.isConnectionChecked()) {
            this.lastVideoFrameEvent.signal();
        }
        if (z) {
            i3 = i;
            okmpClient.pushFrame(Collections.singletonList(ByteBuffer.wrap(this.storedH264Config)), 1, 0, 3, true, i3, 0);
        } else {
            i3 = i;
        }
        okmpClient.pushFrame(dataSample.getBuffers(), 1, 0, z ? 1 : 0, false, i3, 0);
    }

    @Override // ru.ok.proto.NetPublisher
    public void pushH264Headers(byte[] bArr, int i) {
        StringBuilder b = ji.b(i, "pushH264Headers() - ts=", ", headers=");
        b.append(r490.e(bArr));
        ne7.m(TAG, b.toString());
        if (this.stopped) {
            ne7.m(TAG, "pushH264Headers() - stopped");
            return;
        }
        if (this.client == null) {
            ne7.m(TAG, "pushH264Headers() - no client");
        } else if (bArr == null || bArr.length <= 0) {
            this.storedH264Config = null;
        } else {
            this.storedH264Config = (byte[]) bArr.clone();
            composeAndPushMetadata();
        }
    }

    @Override // ru.ok.proto.NetPublisher
    public void resume() {
        ne7.m(TAG, "resume()");
        this.paused = false;
        OkmpClient okmpClient = this.client;
        if (okmpClient != null) {
            okmpClient.resume();
        }
    }

    @Override // ru.ok.proto.NetPublisher
    public boolean sendBenchBytes(int i) {
        ne7.m(TAG, "sendBenchBytes(" + i + ")");
        OkmpClient okmpClient = this.client;
        if (okmpClient != null) {
            okmpClient.sendBenchBytes(i);
        }
        return !this.stopped;
    }

    @Override // ru.ok.proto.NetPublisher
    public void setCallback(NetPublisher.Callback callback) {
        ne7.m(TAG, "setCallback(" + callback + ")");
        this.callback = callback;
    }

    @Override // ru.ok.proto.NetPublisher
    public void setVideoRotation(int i) {
        ne7.m(TAG, "setVideoRotation(" + i + ")");
        this.rotation = i;
        composeAndPushMetadata();
    }

    @Override // ru.ok.proto.NetPublisher
    public void setVideoSize(VideoSize videoSize) {
        if (videoSize.equals(this.videoSize)) {
            return;
        }
        ne7.m(TAG, "setVideoSize(" + videoSize.toString() + ")");
        this.videoSize = videoSize;
    }

    @Override // ru.ok.proto.NetPublisher
    public void start() {
        ne7.m(TAG, "start()");
        this.lastVideoFrameEvent.signalOnce();
        this.handler.post(new id(this, 9));
    }

    @Override // ru.ok.proto.NetPublisher
    public void stop() {
        ne7.m(TAG, "stop()");
        if (this.stopped) {
            return;
        }
        this.stopped = true;
        ne7.t(TAG, "Stopping stream");
        Runnable runnable = new Runnable() { // from class: ru.ok.proto.okmp.OkmpPublisher.3
            boolean done = false;

            @Override // java.lang.Runnable
            public void run() {
                OkmpClient okmpClient = OkmpPublisher.this.client;
                if (this.done || okmpClient == null) {
                    return;
                }
                this.done = true;
                if (!okmpClient.isPublishSent()) {
                    okmpClient.stop();
                    return;
                }
                ne7.t(OkmpPublisher.TAG, "Unpublishing stream");
                okmpClient.sendMessage(0, new UnpublishMessage(""), null);
                okmpClient.setEmptyBuffersListener(new ep0(okmpClient, 8));
            }
        };
        this.handler.post(new od6(3, this, runnable));
        this.handler.postDelayed(runnable, 6000L);
        this.handler.postDelayed(new kl2(this, 5), 10000L);
    }

    @Override // ru.ok.proto.NetPublisher
    public void dropBenchBytes() {
    }

    @Override // ru.ok.proto.NetPublisher
    public void updateBuffers() {
    }

    @Override // ru.ok.proto.NetPublisher
    public void setBitrates(long j, long j2) {
    }
}
