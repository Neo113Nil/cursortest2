package xsna;

import java.util.Arrays;
import xsna.n3i0;

/* compiled from: ChunkIndex.java */
/* loaded from: classes12.dex */
public final class fcc implements n3i0 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public fcc(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // xsna.n3i0
    public final long getDurationUs() {
        return this.f;
    }

    @Override // xsna.n3i0
    public final n3i0.a getSeekPoints(long j) {
        long[] jArr = this.e;
        int f = y2r0.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.c;
        p3i0 p3i0Var = new p3i0(j2, jArr2[f]);
        if (j2 >= j || f == this.a - 1) {
            return new n3i0.a(p3i0Var, p3i0Var);
        }
        int i = f + 1;
        return new n3i0.a(p3i0Var, new p3i0(jArr[i], jArr2[i]));
    }

    @Override // xsna.n3i0
    public final boolean isSeekable() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(this.a);
        sb.append(", sizes=");
        mq.f(this.b, sb, ", offsets=");
        sb.append(Arrays.toString(this.c));
        sb.append(", timeUs=");
        sb.append(Arrays.toString(this.e));
        sb.append(", durationsUs=");
        sb.append(Arrays.toString(this.d));
        sb.append(")");
        return sb.toString();
    }
}
