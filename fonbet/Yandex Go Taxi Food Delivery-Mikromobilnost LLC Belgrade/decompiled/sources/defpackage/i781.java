package defpackage;

/* loaded from: classes5.dex */
public abstract class i781 {
    private static volatile i781 a;

    public static Long a(cb cbVar) {
        return d().b(cbVar);
    }

    public static i781 c(i781 i781Var) {
        a = i781Var;
        return i781Var;
    }

    public static i781 d() {
        if (a == null) {
            synchronized (i781.class) {
                try {
                    if (a == null) {
                        a = new h781();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract Long b(cb cbVar);
}
