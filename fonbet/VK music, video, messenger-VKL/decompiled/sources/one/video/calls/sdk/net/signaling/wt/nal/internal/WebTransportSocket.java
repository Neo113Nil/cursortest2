package one.video.calls.sdk.net.signaling.wt.nal.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import one.video.calls.sdk.net.signaling.wt.nal.NALLog;
import one.video.calls.sdk.net.signaling.wt.nal.NALSocket;
import one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket;
import one.video.calls.sdk_private.z;
import xsna.alk;
import xsna.bqy0;
import xsna.dky0;
import xsna.dqy0;
import xsna.emb;
import xsna.eqy0;
import xsna.gqk;
import xsna.j04;
import xsna.lvb0;
import xsna.npy0;
import xsna.opy0;
import xsna.s3q0;
import xsna.vpy0;
import xsna.wzs;
import xsna.xcl0;
import xsna.yry0;
import xsna.zcl;
import xsna.zjy0;

/* compiled from: WebTransportSocket.kt */
/* loaded from: classes8.dex */
public final class WebTransportSocket implements NALSocket {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int INITIAL_MESSAGE_SIZE = 1024;

    @Deprecated
    public static final String LOG_TAG = "WebTransportSocket";
    private final z client;
    private final CompressorDecompressor compressorDecompressor;
    private final String endpoint;
    private final String hostname;
    private final NALLog log;
    private final LinkedList<String> messageQueue = new LinkedList<>();
    private final Condition messageQueueCondition;
    private final ReentrantLock messageQueueLock;
    private volatile boolean released;
    private npy0 session;

    /* compiled from: WebTransportSocket.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }
    }

    /* compiled from: WebTransportSocket.kt */
    public interface CompressorDecompressor {

        /* compiled from: WebTransportSocket.kt */
        public interface CompressedOutProvider {
            OutputStream getOutputStream(int i);
        }

        void compress(byte[] bArr, int i, int i2, CompressedOutProvider compressedOutProvider);

        String decompress(byte[] bArr, int i, int i2);

        void release();
    }

    /* compiled from: WebTransportSocket.kt */
    public static final class CompressorOutput implements CompressorDecompressor.CompressedOutProvider {
        private final ByteBuffer messageLenBuffer;
        private final byte[] messageLenData;
        private OutputStream outputStream;

        public CompressorOutput() {
            byte[] bArr = new byte[8];
            this.messageLenData = bArr;
            this.messageLenBuffer = ByteBuffer.wrap(bArr);
        }

        public final void flush() {
            OutputStream outputStream = this.outputStream;
            if (outputStream != null) {
                outputStream.flush();
            }
        }

        @Override // one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket.CompressorDecompressor.CompressedOutProvider
        public final OutputStream getOutputStream(int i) {
            OutputStream outputStream = this.outputStream;
            if (outputStream == null) {
                throw new IOException("wt stream compressor has no output");
            }
            alk.d(i, this.messageLenBuffer);
            outputStream.write(this.messageLenData, 0, this.messageLenBuffer.position());
            return outputStream;
        }

        public final void setOutput(OutputStream outputStream) {
            this.outputStream = outputStream;
        }
    }

    public WebTransportSocket(String str, String str2, NALLog nALLog, z zVar, CompressorDecompressor compressorDecompressor, NALSocket.Listener listener) {
        this.endpoint = str;
        this.hostname = str2;
        this.log = nALLog;
        this.client = zVar;
        this.compressorDecompressor = compressorDecompressor;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.messageQueueLock = reentrantLock;
        this.messageQueueCondition = reentrantLock.newCondition();
        handleAsync("connect-and-read", s3q0.a, listener, new wzs<s3q0, NALSocket.Listener, s3q0>() { // from class: one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket.1
            {
                super(2);
            }

            @Override // xsna.wzs
            public final /* bridge */ /* synthetic */ s3q0 invoke(s3q0 s3q0Var, NALSocket.Listener listener2) {
                invoke2(s3q0Var, listener2);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(s3q0 s3q0Var, NALSocket.Listener listener2) {
                WebTransportSocket.this.connect(listener2);
            }
        });
    }

    private final void configureSession(npy0 npy0Var, NALSocket.Listener listener) {
        j04 j04Var = new j04(1, this, listener);
        eqy0 eqy0Var = (eqy0) npy0Var;
        eqy0Var.getClass();
        eqy0Var.j = j04Var;
        eqy0Var.i = new Consumer() { // from class: xsna.dix0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                WebTransportSocket.configureSession$lambda$4(WebTransportSocket.this, (opy0) obj);
            }
        };
        eqy0Var.h = new xcl0(this, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureSession$lambda$3(WebTransportSocket webTransportSocket, NALSocket.Listener listener, Long l, String str) {
        webTransportSocket.log.log(LOG_TAG, "session has terminated with " + l + ", " + str);
        webTransportSocket.close(l != null ? (int) l.longValue() : 0, str == null ? "-" : str);
        int longValue = l != null ? (int) l.longValue() : 0;
        if (str == null) {
            str = "-";
        }
        listener.onClosed(longValue, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureSession$lambda$4(WebTransportSocket webTransportSocket, opy0 opy0Var) {
        webTransportSocket.log.log(LOG_TAG, "Got new BIDI stream");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureSession$lambda$5(WebTransportSocket webTransportSocket, opy0 opy0Var) {
        webTransportSocket.log.log(LOG_TAG, "Got new UNI stream");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void connect(NALSocket.Listener listener) {
        try {
            URI create = URI.create(this.endpoint);
            if (create.getPort() < 0) {
                create = new URI(create.getScheme(), create.getUserInfo(), create.getHost(), 443, create.getPath(), create.getQuery(), create.getFragment());
            }
            eqy0 c = new vpy0(create, this.hostname, this.client).c(create);
            this.session = c;
            configureSession(c, listener);
            openSession(c, listener);
        } catch (Throwable th) {
            listener.onFailure(th);
        }
    }

    private final <T> void handleAsync(final String str, final T t, final NALSocket.Listener listener, final wzs<? super T, ? super NALSocket.Listener, s3q0> wzsVar) {
        Thread thread = new Thread(new Runnable() { // from class: xsna.cix0
            @Override // java.lang.Runnable
            public final void run() {
                WebTransportSocket.handleAsync$lambda$7(WebTransportSocket.this, str, wzsVar, t, listener);
            }
        });
        thread.setName("wt-" + str);
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleAsync$lambda$7(WebTransportSocket webTransportSocket, String str, wzs wzsVar, Object obj, NALSocket.Listener listener) {
        webTransportSocket.log.log(LOG_TAG, str.concat(" thread is about to start"));
        try {
            wzsVar.invoke(obj, listener);
        } finally {
            try {
            } finally {
            }
        }
    }

    private final void openSession(npy0 npy0Var, NALSocket.Listener listener) {
        final eqy0 eqy0Var = (eqy0) npy0Var;
        eqy0.b bVar = eqy0.b.b;
        eqy0Var.c(bVar, new bqy0(), new gqk(1));
        vpy0 vpy0Var = eqy0Var.d;
        vpy0Var.b.lock();
        try {
            List list = (List) vpy0Var.c.remove(Long.valueOf(eqy0Var.c));
            if (list != null) {
                list.forEach(new Consumer() { // from class: xsna.qpy0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        eqy0.this.b((dry0) obj);
                    }
                });
                vpy0Var.d -= list.size();
            }
            vpy0Var.b.unlock();
            listener.onOpen();
            if (eqy0Var.e == eqy0.b.a) {
                throw new IllegalStateException("Session is not opened yet");
            }
            if (eqy0Var.e != bVar) {
                throw new IOException("Session is closed");
            }
            zjy0 c = eqy0Var.a.b.c(true);
            dky0 a = c.a();
            yry0 yry0Var = new yry0();
            yry0Var.a = c;
            yry0Var.b = a;
            lvb0 b = c.b();
            ByteBuffer allocate = ByteBuffer.allocate(8);
            int g = alk.g(65L, allocate);
            for (int i = 0; i < g; i++) {
                b.write(allocate.get());
            }
            long j = eqy0Var.c;
            lvb0 b2 = yry0Var.a.b();
            ByteBuffer allocate2 = ByteBuffer.allocate(8);
            int g2 = alk.g(j, allocate2);
            for (int i2 = 0; i2 < g2; i2++) {
                b2.write(allocate2.get());
            }
            eqy0Var.k.add(yry0Var);
            eqy0Var.l.add(yry0Var);
            dqy0 dqy0Var = new dqy0();
            dqy0Var.a = yry0Var;
            handleAsync("send", dqy0Var, listener, new WebTransportSocket$openSession$1$1(this));
            readStreamData(npy0Var, dqy0Var, listener);
        } catch (Throwable th) {
            vpy0Var.b.unlock();
            throw th;
        }
    }

    private final void readStreamData(npy0 npy0Var, opy0 opy0Var, NALSocket.Listener listener) throws IOException {
        InputStream b;
        try {
            b = opy0Var.b();
        } catch (Throwable th) {
            try {
                if (!this.released) {
                    this.log.logException(LOG_TAG, "Error on read from wt stream", th);
                    throw th;
                }
            } finally {
                this.log.log(LOG_TAG, "Read thread has completed");
            }
        }
        if (b == null) {
            throw new IOException("wt stream has no input");
        }
        byte[] bArr = new byte[1024];
        loop0: while (true) {
            try {
                int h = alk.h(b);
                if (h > bArr.length) {
                    bArr = new byte[h];
                }
                int i = 0;
                while (i < h) {
                    int read = b.read(bArr, i, h - i);
                    if (read < 0) {
                        break loop0;
                    } else {
                        i += read;
                    }
                }
                listener.onMessage(this.compressorDecompressor.decompress(bArr, 0, i));
            } catch (EOFException unused) {
                this.log.log(LOG_TAG, "Got EOF while trying to parse next packet length. Guess the stream is closed, exit silently");
            }
        }
        this.log.log(LOG_TAG, "stream closed, leave recv loop");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendStreamData(opy0 opy0Var, NALSocket.Listener listener) throws IOException {
        CompressorOutput compressorOutput = new CompressorOutput();
        while (true) {
            try {
                ReentrantLock reentrantLock = this.messageQueueLock;
                reentrantLock.lock();
                try {
                    try {
                        this.messageQueueCondition.await();
                        if (this.released) {
                            break;
                        }
                        compressorOutput.setOutput(opy0Var.a());
                        while (!this.messageQueue.isEmpty()) {
                            byte[] bytes = this.messageQueue.remove(0).getBytes(emb.b);
                            try {
                                this.compressorDecompressor.compress(bytes, 0, bytes.length, compressorOutput);
                                compressorOutput.flush();
                            } catch (IOException e) {
                                this.log.logException(LOG_TAG, "Error on write to wt stream", e);
                                throw e;
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (InterruptedException e2) {
                    this.log.logException(LOG_TAG, "Send stream interrputed", e2);
                    reentrantLock.unlock();
                }
            } finally {
                this.log.log(LOG_TAG, "Write thread has completed");
            }
        }
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALSocket
    public final void close(int i, String str) {
        try {
            if (!this.released) {
                this.released = true;
                ReentrantLock reentrantLock = this.messageQueueLock;
                reentrantLock.lock();
                try {
                    this.messageQueueCondition.signalAll();
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                    npy0 npy0Var = this.session;
                    if (npy0Var != null) {
                        ((eqy0) npy0Var).a(i, str);
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALSocket
    public final String getId() {
        return this.endpoint;
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALSocket
    public final void send(String str) {
        ReentrantLock reentrantLock = this.messageQueueLock;
        reentrantLock.lock();
        try {
            this.messageQueue.add(str);
            this.messageQueueCondition.signalAll();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
