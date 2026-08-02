package defpackage;

/* loaded from: classes5.dex */
public abstract class lk61 {
    private static volatile lk61 a;

    public static void a(za zaVar, boolean z) {
        d().b(zaVar, z);
    }

    public static lk61 c(lk61 lk61Var) {
        a = lk61Var;
        return lk61Var;
    }

    public static lk61 d() {
        if (a == null) {
            synchronized (lk61.class) {
                try {
                    if (a == null) {
                        a = new kk61();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract void b(za zaVar, boolean z);
}
