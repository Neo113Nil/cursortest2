package xsna;

import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* compiled from: BatchBuffer.java */
/* loaded from: classes12.dex */
public final class tu6 extends DecoderInputBuffer {
    public long j;
    public int k;
    public int l;

    @Override // androidx.media3.decoder.DecoderInputBuffer
    public final void c() {
        super.c();
        this.k = 0;
    }

    public final boolean i(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        fxc0.p(!decoderInputBuffer.b(1073741824));
        fxc0.p(!decoderInputBuffer.b(268435456));
        fxc0.p(!decoderInputBuffer.b(4));
        if (j()) {
            if (this.k >= this.l) {
                return false;
            }
            ByteBuffer byteBuffer2 = decoderInputBuffer.e;
            if (byteBuffer2 != null && (byteBuffer = this.e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.k;
        this.k = i + 1;
        if (i == 0) {
            this.g = decoderInputBuffer.g;
            if (decoderInputBuffer.b(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = decoderInputBuffer.e;
        if (byteBuffer3 != null) {
            e(byteBuffer3.remaining());
            this.e.put(byteBuffer3);
        }
        this.j = decoderInputBuffer.g;
        return true;
    }

    public final boolean j() {
        return this.k > 0;
    }
}
