package one.video.calls.sdk.net.signaling.wt.nal;

import one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportCompressorDecompressor;

/* compiled from: NALSocket.kt */
/* loaded from: classes8.dex */
public interface NALSocket {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: NALSocket.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final String getCOMPRESSION_NAME() {
            return WebTransportCompressorDecompressor.COMPRESSION_NAME;
        }
    }

    /* compiled from: NALSocket.kt */
    public interface Listener {
        void onClosed(int i, String str);

        void onFailure(Throwable th);

        void onMessage(String str);

        void onOpen();
    }

    void close(int i, String str);

    String getId();

    void send(String str);
}
