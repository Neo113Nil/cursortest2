package xsna;

/* compiled from: MpeghUtil.java */
/* loaded from: classes12.dex */
public final class gg30 {

    /* compiled from: MpeghUtil.java */
    public static class a {
        public int a;
        public long b;
        public int c;
    }

    public static int a(wi90 wi90Var, int i, int i2, int i3) {
        fxc0.p(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        e9x.a(e9x.a(i4, i5), 1 << i3);
        if (wi90Var.b() < i) {
            return -1;
        }
        int g = wi90Var.g(i);
        if (g == i4) {
            if (wi90Var.b() < i2) {
                return -1;
            }
            int g2 = wi90Var.g(i2);
            g += g2;
            if (g2 == i5) {
                if (wi90Var.b() < i3) {
                    return -1;
                }
                return wi90Var.g(i3) + g;
            }
        }
        return g;
    }

    public static void b(wi90 wi90Var) {
        wi90Var.o(3);
        wi90Var.o(8);
        boolean f = wi90Var.f();
        boolean f2 = wi90Var.f();
        if (f) {
            wi90Var.o(5);
        }
        if (f2) {
            wi90Var.o(6);
        }
    }

    public static void c(wi90 wi90Var) {
        int g;
        int g2 = wi90Var.g(2);
        if (g2 == 0) {
            wi90Var.o(6);
            return;
        }
        int a2 = a(wi90Var, 5, 8, 16) + 1;
        if (g2 == 1) {
            wi90Var.o(a2 * 7);
            return;
        }
        if (g2 == 2) {
            boolean f = wi90Var.f();
            int i = f ? 1 : 5;
            int i2 = f ? 7 : 5;
            int i3 = f ? 8 : 6;
            int i4 = 0;
            while (i4 < a2) {
                if (wi90Var.f()) {
                    wi90Var.o(7);
                    g = 0;
                } else {
                    if (wi90Var.g(2) == 3 && wi90Var.g(i2) * i != 0) {
                        wi90Var.n();
                    }
                    g = wi90Var.g(i3) * i;
                    if (g != 0 && g != 180) {
                        wi90Var.n();
                    }
                    wi90Var.n();
                }
                if (g != 0 && g != 180 && wi90Var.f()) {
                    i4++;
                }
                i4++;
            }
        }
    }
}
