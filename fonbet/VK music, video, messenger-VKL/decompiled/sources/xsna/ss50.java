package xsna;

import android.app.Activity;
import xsna.cxs;

/* compiled from: MyTargetRewardAd.kt */
/* loaded from: classes6.dex */
public final class ss50 implements cxs {
    public cxs.a a;
    public ijg0 b;
    public gzs<s3q0> c;

    @Override // xsna.cxs
    public final void a() {
        ijg0 ijg0Var = this.b;
        ijg0Var.h = null;
        this.a = null;
        ijg0Var.d();
    }

    @Override // xsna.cxs
    public final void b(gzs<s3q0> gzsVar) {
        this.c = gzsVar;
    }

    @Override // xsna.cxs
    public final void c(cxs.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.cxs
    public final boolean isValid() {
        return true;
    }

    @Override // xsna.cxs
    public final void load() {
        this.b.e();
    }

    @Override // xsna.cxs
    public final void show(Activity activity) {
        this.b.f();
        gzs<s3q0> gzsVar = this.c;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        this.c = null;
    }
}
