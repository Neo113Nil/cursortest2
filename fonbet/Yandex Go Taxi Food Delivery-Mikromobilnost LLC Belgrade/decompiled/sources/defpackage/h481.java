package defpackage;

/* loaded from: classes5.dex */
public abstract class h481 {
    private static volatile h481 a;

    public static void a(bb bbVar, boolean z) {
        d().b(bbVar, z);
    }

    public static h481 c(h481 h481Var) {
        a = h481Var;
        return h481Var;
    }

    public static h481 d() {
        if (a == null) {
            synchronized (h481.class) {
                try {
                    if (a == null) {
                        a = new g481();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract void b(bb bbVar, boolean z);
}
