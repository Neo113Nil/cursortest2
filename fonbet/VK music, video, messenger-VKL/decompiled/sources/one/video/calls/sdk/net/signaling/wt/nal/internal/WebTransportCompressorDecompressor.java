package one.video.calls.sdk.net.signaling.wt.nal.internal;

import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import one.video.calls.sdk.net.signaling.wt.nal.NALLog;
import one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket;
import xsna.emb;
import xsna.zcl;

/* compiled from: WebTransportCompressorDecompressor.kt */
/* loaded from: classes8.dex */
public final class WebTransportCompressorDecompressor implements WebTransportSocket.CompressorDecompressor {
    private static final int BUFFER_SIZE = 512;
    public static final String COMPRESSION_NAME = "deflate-raw";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "WebTransportCompressorDecompressor";
    private final NALLog log;
    private final Deflater deflater = new Deflater(-1, true);
    private final ByteArrayOutputStream deflaterOutput = new ByteArrayOutputStream();
    private final byte[] deflaterBuffer = new byte[512];
    private final Inflater inflater = new Inflater(true);
    private final DecompressorOutputStream inflaterOutput = new DecompressorOutputStream();
    private final byte[] inflaterBuffer = new byte[512];

    /* compiled from: WebTransportCompressorDecompressor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }
    }

    /* compiled from: WebTransportCompressorDecompressor.kt */
    public static final class DecompressorOutputStream extends ByteArrayOutputStream {
        public final String asString() {
            return new String(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, emb.b);
        }
    }

    public WebTransportCompressorDecompressor(NALLog nALLog) {
        this.log = nALLog;
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket.CompressorDecompressor
    public final void compress(byte[] bArr, int i, int i2, WebTransportSocket.CompressorDecompressor.CompressedOutProvider compressedOutProvider) {
        this.deflater.reset();
        this.deflater.setInput(bArr, i, i2);
        this.deflater.finish();
        this.deflaterOutput.reset();
        while (!this.deflater.finished()) {
            this.deflaterOutput.write(this.deflaterBuffer, 0, this.deflater.deflate(this.deflaterBuffer));
        }
        ByteArrayOutputStream byteArrayOutputStream = this.deflaterOutput;
        byteArrayOutputStream.writeTo(compressedOutProvider.getOutputStream(byteArrayOutputStream.size()));
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket.CompressorDecompressor
    public final String decompress(byte[] bArr, int i, int i2) {
        this.inflater.reset();
        this.inflater.setInput(bArr, i, i2);
        this.inflaterOutput.reset();
        while (!this.inflater.finished()) {
            this.inflaterOutput.write(this.inflaterBuffer, 0, this.inflater.inflate(this.inflaterBuffer));
        }
        return this.inflaterOutput.asString();
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket.CompressorDecompressor
    public final void release() {
        try {
            this.deflater.end();
            this.log.log(TAG, "deflater released");
        } catch (Throwable th) {
            this.log.logException(TAG, "Error finalizing deflater", th);
        }
        try {
            this.inflater.end();
            this.log.log(TAG, "inflater released");
        } catch (Throwable th2) {
            this.log.logException(TAG, "Error finalizing inflater", th2);
        }
    }
}
