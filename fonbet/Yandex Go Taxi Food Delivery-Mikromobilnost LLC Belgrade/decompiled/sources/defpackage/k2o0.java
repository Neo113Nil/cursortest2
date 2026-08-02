package defpackage;

/* loaded from: classes13.dex */
public abstract class k2o0 {
    private static volatile k2o0 a;

    public static k2o0 a(k2o0 k2o0Var) {
        a = k2o0Var;
        return k2o0Var;
    }

    public static k2o0 c() {
        if (a == null) {
            synchronized (k2o0.class) {
                try {
                    if (a == null) {
                        a = new j2o0();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract ka b();
}
