package xsna;

import xsna.cxs;

/* compiled from: MyTargetFullscreenAd.kt */
/* loaded from: classes6.dex */
public final class fq50 extends ksi {
    public final /* synthetic */ eq50 a;

    public fq50(eq50 eq50Var) {
        this.a = eq50Var;
    }

    @Override // xsna.ksi
    public final void m() {
        cxs.a aVar = this.a.a;
        if (aVar != null) {
            aVar.onClick();
        }
    }

    @Override // xsna.ksi
    public final void n() {
        cxs.a aVar = this.a.a;
        if (aVar != null) {
            aVar.onDismiss();
        }
    }

    @Override // xsna.ksi
    public final void o() {
        cxs.a aVar = this.a.a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
