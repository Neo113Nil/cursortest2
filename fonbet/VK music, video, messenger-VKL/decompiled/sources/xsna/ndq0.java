package xsna;

import xsna.f260;

/* compiled from: Uploader.kt */
/* loaded from: classes8.dex */
public final class ndq0 implements f260.a {
    public final /* synthetic */ pdq0 a;

    public ndq0(pdq0 pdq0Var) {
        this.a = pdq0Var;
    }

    @Override // xsna.f260.a
    public final void a(boolean z) {
        pdq0 pdq0Var = this.a;
        if (pdq0Var.d != null) {
            pdq0Var.g.set(z);
            if (z) {
                pdq0Var.d();
            }
        }
    }
}
