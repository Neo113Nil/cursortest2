package xsna;

/* compiled from: PlaylistOnboardingModalCard.kt */
/* loaded from: classes6.dex */
public final class xbb0 implements bsf0 {
    public static final int c = iah0.a(96);
    public final v0s0 a;
    public dw20 b;

    public xbb0(wbb0 wbb0Var, v0s0 v0s0Var) {
        this.a = v0s0Var;
    }

    @Override // xsna.bsf0
    public final void close() {
        dw20 dw20Var = this.b;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }
}
