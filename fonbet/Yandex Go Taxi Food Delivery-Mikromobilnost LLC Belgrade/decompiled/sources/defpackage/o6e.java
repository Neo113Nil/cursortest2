package defpackage;

/* loaded from: classes8.dex */
public final class o6e implements k9e {
    public final String a;
    public final Object b;
    public final wls c;
    public final xa20 w;

    public o6e(String str, Object obj, wls wlsVar, xa20 xa20Var) {
        this.a = str;
        this.b = obj;
        this.c = wlsVar;
        this.w = xa20Var;
    }

    @Override // defpackage.k9e
    public final void a() {
    }

    @Override // defpackage.k9e
    public final syj0 p(Object obj) {
        Object obj2 = this.b;
        if (obj2 == null) {
            return y5e.u(xpb1.C, "");
        }
        try {
            this.c.invoke(obj, obj2);
            return new lyj0(c1k.a);
        } catch (Throwable th) {
            this.w.a(new ple(this.a, 0), th);
            msb1 msb1Var = msb1.C;
            String message = th.getMessage();
            return y5e.u(msb1Var, message != null ? message : "");
        }
    }

    @Override // defpackage.k9e
    public final String q() {
        return this.a;
    }
}
