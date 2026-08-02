package defpackage;

/* loaded from: classes13.dex */
public abstract class hz91 {
    public static final hxs0 a = new hxs0();
    public static final ixs0 b = new ixs0();

    public static final a2e0 b(String str, long j, tls tlsVar) {
        b2e0 b2e0Var = new b2e0();
        tlsVar.invoke(b2e0Var);
        if (b2e0Var.a == null) {
            ny61.r("Request block must be defined using request { ... }");
            return null;
        }
        if (b2e0Var.b != null) {
            return new a2e0(str, b2e0Var, j);
        }
        ny61.r("Continue polling block must be defined using continuePolling { ... }");
        return null;
    }

    public abstract rbv a();
}
