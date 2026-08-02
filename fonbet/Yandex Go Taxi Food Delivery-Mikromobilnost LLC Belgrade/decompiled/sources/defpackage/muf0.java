package defpackage;

/* loaded from: classes6.dex */
public abstract class muf0 {
    private static volatile muf0 a;

    public static void a() {
        d().e();
    }

    public static void b(l8x l8xVar) {
        d().f(l8xVar);
    }

    public static muf0 c(muf0 muf0Var) {
        a = muf0Var;
        return muf0Var;
    }

    public static muf0 d() {
        if (a == null) {
            synchronized (muf0.class) {
                try {
                    if (a == null) {
                        a = new luf0();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract void e();

    public abstract void f(l8x l8xVar);
}
