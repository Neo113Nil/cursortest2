package xsna;

import androidx.media3.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: EventSampleStream.java */
/* loaded from: classes12.dex */
public final class k0q implements m0h0 {
    public final androidx.media3.common.a b;
    public long[] d;
    public boolean e;
    public r0q f;
    public boolean g;
    public int h;
    public final y3j c = new y3j();
    public long i = C.TIME_UNSET;

    public k0q(r0q r0qVar, androidx.media3.common.a aVar, boolean z) {
        this.b = aVar;
        this.f = r0qVar;
        this.d = r0qVar.b;
        a(r0qVar, z);
    }

    public final void a(r0q r0qVar, boolean z) {
        int i = this.h;
        long j = C.TIME_UNSET;
        long j2 = i == 0 ? -9223372036854775807L : this.d[i - 1];
        this.e = z;
        this.f = r0qVar;
        long[] jArr = r0qVar.b;
        this.d = jArr;
        long j3 = this.i;
        if (j3 == C.TIME_UNSET) {
            if (j2 != C.TIME_UNSET) {
                this.h = y2r0.b(jArr, j2, false);
            }
        } else {
            int b = y2r0.b(jArr, j3, true);
            this.h = b;
            if (this.e && b == this.d.length) {
                j = j3;
            }
            this.i = j;
        }
    }

    @Override // xsna.m0h0
    public final int b(w8s w8sVar, DecoderInputBuffer decoderInputBuffer, int i) {
        int i2 = this.h;
        boolean z = i2 == this.d.length;
        if (z && !this.e) {
            decoderInputBuffer.b = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.g) {
            w8sVar.b = this.b;
            this.g = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.h = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] a = this.c.a(this.f.a[i2]);
            decoderInputBuffer.e(a.length);
            decoderInputBuffer.e.put(a);
        }
        decoderInputBuffer.g = this.d[i2];
        decoderInputBuffer.b = 1;
        return -4;
    }

    @Override // xsna.m0h0
    public final boolean isReady() {
        return true;
    }

    @Override // xsna.m0h0
    public final int skipData(long j) {
        int max = Math.max(this.h, y2r0.b(this.d, j, true));
        int i = max - this.h;
        this.h = max;
        return i;
    }

    @Override // xsna.m0h0
    public final void maybeThrowError() throws IOException {
    }
}
