package xsna;

/* compiled from: BoxWithConstraintsScopeExt.kt */
/* loaded from: classes17.dex */
public final class wa8 {
    public static long a(va8 va8Var) {
        return b(0, 0, va8Var.f());
    }

    public static final long b(int i, int i2, long j) {
        boolean z = false;
        boolean z2 = o6j.e(j) && o6j.d(j);
        if (o6j.g(j) && o6j.f(j)) {
            z = true;
        }
        if (z2 || z) {
            i = o6j.i(j);
        } else {
            int k = o6j.k(j);
            if (k >= i) {
                i = k;
            }
        }
        if (z2 || z) {
            i2 = o6j.h(j);
        } else {
            int j2 = o6j.j(j);
            if (j2 >= i2) {
                i2 = j2;
            }
        }
        return (i2 & 4294967295L) | (i << 32);
    }
}
