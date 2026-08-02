package defpackage;

/* loaded from: classes5.dex */
public abstract class jwj0 {
    private static volatile jwj0 a;

    public static jwj0 a(jwj0 jwj0Var) {
        a = jwj0Var;
        return jwj0Var;
    }

    public static jwj0 c() {
        if (a == null) {
            synchronized (jwj0.class) {
                try {
                    if (a == null) {
                        a = new iwj0();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract ha b(byte[] bArr, Iterable iterable);
}
