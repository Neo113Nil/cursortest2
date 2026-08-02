package defpackage;

/* loaded from: classes4.dex */
public final class ni5 {
    public static ni5 a;

    public static synchronized ni5 a() {
        ni5 ni5Var;
        synchronized (ni5.class) {
            try {
                if (a == null) {
                    a = new ni5();
                }
                ni5Var = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ni5Var;
    }
}
