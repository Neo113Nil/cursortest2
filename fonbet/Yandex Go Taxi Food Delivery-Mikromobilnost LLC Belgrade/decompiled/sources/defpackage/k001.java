package defpackage;

/* loaded from: classes10.dex */
public final class k001 {
    public final uzz0 a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public k001(uzz0 uzz0Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        d6z.l(iArr.length == jArr2.length);
        d6z.l(jArr.length == jArr2.length);
        d6z.l(iArr2.length == jArr2.length);
        this.a = uzz0Var;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int a = tw21.a(jArr, j, true); a < jArr.length; a++) {
            if ((this.g[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }
}
