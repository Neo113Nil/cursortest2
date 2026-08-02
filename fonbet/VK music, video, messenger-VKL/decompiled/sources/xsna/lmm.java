package xsna;

import kotlin.Pair;

/* compiled from: DialogWeightEncoder.kt */
/* loaded from: classes2.dex */
public final class lmm {
    public static final Pair<Integer, Integer> a;
    public static final Pair<Integer, Integer> b;
    public static final Pair<Integer, Integer> c;
    public static final Pair<Integer, Integer> d;

    static {
        Pair<Integer, Integer> pair = new Pair<>(52, 61);
        a = pair;
        Pair<Integer, Integer> pair2 = new Pair<>(51, 51);
        b = pair2;
        Pair<Integer, Integer> pair3 = new Pair<>(20, 50);
        c = pair3;
        Pair<Integer, Integer> pair4 = new Pair<>(0, 19);
        d = pair4;
        d(pair);
        d(pair3);
        d(pair4);
        m4s.q(pair2.i().intValue(), pair2.j().intValue());
    }

    public static gkx0 a(gkx0 gkx0Var) {
        long j = gkx0Var.b;
        Pair<Integer, Integer> pair = a;
        int intValue = pair.i().intValue();
        int intValue2 = pair.j().intValue();
        m4s.o(intValue, intValue2);
        return new gkx0(j & (~m4s.q(intValue, intValue2)));
    }

    public static final gkx0 b(int i, int i2, int i3, boolean z) {
        return new gkx0(xo9.x(xo9.x(xo9.x(xo9.x(0L, b, z ? 1L : 0L), a, i), c, i2), d, i3));
    }

    public static final gkx0 c(vjm vjmVar) {
        return b(vjmVar.b, vjmVar.c, 0, false);
    }

    public static void d(Pair pair) {
        ((Number) pair.j()).intValue();
        ((Number) pair.i()).intValue();
    }
}
