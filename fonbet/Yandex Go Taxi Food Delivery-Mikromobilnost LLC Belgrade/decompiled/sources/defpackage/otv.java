package defpackage;

/* loaded from: classes14.dex */
public final class otv extends wys {
    public static final /* synthetic */ int S = 0;
    public final yss0 R;

    public otv(yss0 yss0Var) {
        super(yss0Var.asView());
        this.R = yss0Var;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        xss0 xss0Var = ((r2x) obj).c;
        gss0 gss0Var = xss0Var.a;
        yss0 yss0Var = this.R;
        yss0Var.renderLead(gss0Var);
        yss0Var.renderBody(xss0Var.b);
        yss0Var.renderTrail(xss0Var.c, new uz1(2));
    }
}
