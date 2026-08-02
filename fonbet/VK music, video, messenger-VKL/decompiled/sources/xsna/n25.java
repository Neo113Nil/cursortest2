package xsna;

import xsna.b25;

/* compiled from: AuthBridge.kt */
/* loaded from: classes.dex */
public final class n25 implements b25.a {
    public final /* synthetic */ gzs<s3q0> b;

    public n25(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    @Override // xsna.b25.a
    public final void d(tbu0 tbu0Var) {
        if (tbu0Var.b()) {
            this.b.invoke();
            tbu0Var.B(this);
        }
    }
}
