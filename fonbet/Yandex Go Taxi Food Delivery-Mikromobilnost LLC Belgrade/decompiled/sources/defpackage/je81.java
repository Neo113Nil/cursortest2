package defpackage;

/* loaded from: classes7.dex */
public final class je81 {
    public final wl71 a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public je81(wl71 wl71Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        if (iArr.length != jArr2.length) {
            w511.q();
            throw null;
        }
        if (jArr.length != jArr2.length) {
            w511.q();
            throw null;
        }
        if (iArr2.length != jArr2.length) {
            w511.q();
            throw null;
        }
        this.a = wl71Var;
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
        for (int f = rf71.f(jArr, j, true); f < jArr.length; f++) {
            if ((this.g[f] & 1) != 0) {
                return f;
            }
        }
        return -1;
    }
}
