package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class hu implements zx2 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public hu(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // yads.zx2
    public final boolean b() {
        return true;
    }

    @Override // yads.zx2
    public final long c() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(this.a);
        sb.append(", sizes=");
        xsna.mq.f(this.b, sb, ", offsets=");
        sb.append(Arrays.toString(this.c));
        sb.append(", timeUs=");
        sb.append(Arrays.toString(this.e));
        sb.append(", durationsUs=");
        sb.append(Arrays.toString(this.d));
        sb.append(")");
        return sb.toString();
    }

    @Override // yads.zx2
    public final xx2 b(long j) {
        int b = mc3.b(this.e, j, true);
        long[] jArr = this.e;
        long j2 = jArr[b];
        long[] jArr2 = this.c;
        by2 by2Var = new by2(j2, jArr2[b]);
        if (j2 >= j || b == this.a - 1) {
            return new xx2(by2Var, by2Var);
        }
        int i = b + 1;
        return new xx2(by2Var, new by2(jArr[i], jArr2[i]));
    }
}
