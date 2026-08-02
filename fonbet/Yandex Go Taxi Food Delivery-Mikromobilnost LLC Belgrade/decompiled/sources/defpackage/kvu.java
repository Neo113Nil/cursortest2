package defpackage;

/* loaded from: classes5.dex */
public abstract class kvu {
    private static volatile kvu a;

    public static kvu a(kvu kvuVar) {
        a = kvuVar;
        return kvuVar;
    }

    public static kvu c() {
        if (a == null) {
            synchronized (kvu.class) {
                try {
                    if (a == null) {
                        a = new jvu();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract z7 b(String str, String str2);

    public abstract String d(z7 z7Var);

    public abstract String e(z7 z7Var);
}
