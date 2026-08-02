package defpackage;

/* loaded from: classes8.dex */
public final class eef0 implements fxl {
    public final zuj0 a;

    public eef0(zuj0 zuj0Var) {
        this.a = zuj0Var;
    }

    @Override // defpackage.fxl
    public final xzl a(u1m u1mVar, tls tlsVar) {
        kg90 kg90Var;
        if (jl40.l(u1mVar.a, "bdui/v1/profile")) {
            kg90Var = (kg90) tlsVar.invoke(((avj0) this.a).a.getResources().openRawResource(axh0.profile_fallback));
        } else {
            kg90Var = null;
        }
        if (!(kg90Var instanceof jg90)) {
            return null;
        }
        return new xzl(((h2m) ((jg90) kg90Var).a).a, null, new f0m(0L), 18);
    }
}
