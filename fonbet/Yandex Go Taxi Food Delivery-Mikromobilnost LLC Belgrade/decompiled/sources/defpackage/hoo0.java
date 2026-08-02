package defpackage;

/* loaded from: classes13.dex */
public abstract class hoo0 {
    private static volatile hoo0 a;

    public static hoo0 a(hoo0 hoo0Var) {
        a = hoo0Var;
        return hoo0Var;
    }

    public static hoo0 c() {
        if (a == null) {
            synchronized (hoo0.class) {
                try {
                    if (a == null) {
                        a = new goo0();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract la b();
}
