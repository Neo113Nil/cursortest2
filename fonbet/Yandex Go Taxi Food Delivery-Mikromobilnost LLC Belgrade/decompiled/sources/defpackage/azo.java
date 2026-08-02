package defpackage;

/* loaded from: classes10.dex */
public abstract class azo {
    public static volatile azo a;

    public static azo a() {
        if (a != null) {
            return a;
        }
        synchronized (azo.class) {
            if (a == null) {
                try {
                    a = new zyo();
                } catch (NoClassDefFoundError unused) {
                    sgb1.g(3, "ExtenderVersion");
                    a = new yyo();
                }
            }
        }
        return a;
    }

    public static c94 b() {
        return a().c();
    }

    public static boolean e(c94 c94Var) {
        return b().a(c94Var.a, c94Var.b) <= 0;
    }

    public static boolean f(c94 c94Var) {
        return b().a(c94Var.a, c94Var.b) >= 0;
    }

    public abstract c94 c();

    public abstract boolean d();
}
