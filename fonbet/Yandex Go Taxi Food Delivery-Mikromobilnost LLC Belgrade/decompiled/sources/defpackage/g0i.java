package defpackage;

/* loaded from: classes12.dex */
public final class g0i extends h55 {
    public final if9 D;
    public e0i E;
    public final f0i F;

    public g0i(if9 if9Var) {
        super(null);
        this.D = if9Var;
        this.F = new f0i(this);
    }

    public static final void P(g0i g0iVar, tls tlsVar) {
        e0i e0iVar = g0iVar.E;
        if (e0iVar != null) {
            e0iVar.i();
        }
        if (g0iVar.u()) {
            g0iVar.r(tlsVar);
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        izh izhVar = (izh) obj;
        boolean z = izhVar.l;
        kxx kxxVar = hxx.a;
        if (z) {
            e0i e0iVar = new e0i();
            this.E = e0iVar;
            E(e0iVar, zy11.a, sy60.Q2, kxxVar);
        }
        E((m950) this.D.get(), izhVar, this.F, kxxVar);
    }
}
