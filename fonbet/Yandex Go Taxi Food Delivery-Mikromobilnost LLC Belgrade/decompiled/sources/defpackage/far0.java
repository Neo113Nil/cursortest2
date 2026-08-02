package defpackage;

/* loaded from: classes5.dex */
public final class far0 extends wys {
    public static final /* synthetic */ int T = 0;
    public final yss0 R;
    public final tls S;

    public far0(yss0 yss0Var, tls tlsVar) {
        super(yss0Var.asView());
        this.R = yss0Var;
        this.S = tlsVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        xss0 xss0Var = ((lar0) obj).b;
        gss0 gss0Var = xss0Var.a;
        yss0 yss0Var = this.R;
        yss0Var.renderLead(gss0Var);
        yss0Var.renderBody(xss0Var.b);
        yss0Var.renderTrail(xss0Var.c, new ear0(this, 0));
        yss0Var.setAction(xss0Var.d, new ear0(this, 1));
    }
}
