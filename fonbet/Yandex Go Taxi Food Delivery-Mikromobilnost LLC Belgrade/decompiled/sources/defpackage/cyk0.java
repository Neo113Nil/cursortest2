package defpackage;

/* loaded from: classes.dex */
public abstract class cyk0 {
    public static final byk0 a = a(50);

    public static final byk0 a(int i) {
        wta0 a2 = ffx.a(i);
        return new byk0(a2, a2, a2, a2);
    }

    public static byk0 b(int i) {
        return new byk0(ffx.a((i & 1) != 0 ? 0 : 100), ffx.a((i & 2) != 0 ? 0 : 100), ffx.a((i & 4) != 0 ? 0 : 100), ffx.a((i & 8) != 0 ? 0 : 100));
    }

    public static final byk0 c(float f) {
        z7m z7mVar = new z7m(f);
        return new byk0(z7mVar, z7mVar, z7mVar, z7mVar);
    }

    public static final byk0 d(float f, float f2, float f3, float f4) {
        return new byk0(new z7m(f), new z7m(f2), new z7m(f3), new z7m(f4));
    }

    public static byk0 e(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return d(f, f2, f3, f4);
    }
}
