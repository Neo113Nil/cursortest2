package defpackage;

/* loaded from: classes5.dex */
public final class fbv0 extends wys {
    public static final /* synthetic */ int T = 0;
    public final yss0 R;
    public final wls S;

    public fbv0(yss0 yss0Var, wls wlsVar) {
        super(yss0Var.asView());
        this.R = yss0Var;
        this.S = wlsVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        v2x v2xVar = (v2x) obj;
        xss0 xss0Var = v2xVar.c;
        gss0 gss0Var = xss0Var.a;
        yss0 yss0Var = this.R;
        yss0Var.renderLead(gss0Var);
        yss0Var.renderBody(xss0Var.b);
        String str = v2xVar.b;
        yss0Var.renderTrail(xss0Var.c, new ebv0(this, str, 0));
        yss0Var.setAction(xss0Var.d, new ebv0(this, str, 1));
    }
}
