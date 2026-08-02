package defpackage;

/* loaded from: classes13.dex */
public abstract class c9p0 {
    private static volatile c9p0 a;

    public static c9p0 a(c9p0 c9p0Var) {
        a = c9p0Var;
        return c9p0Var;
    }

    public static c9p0 c() {
        if (a == null) {
            synchronized (c9p0.class) {
                try {
                    if (a == null) {
                        a = new b9p0();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract ma b();
}
