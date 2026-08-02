package xsna;

import android.app.Activity;
import xsna.cxs;

/* compiled from: MyTargetInterstitialAd.kt */
/* loaded from: classes6.dex */
public final class vr50 implements cxs {
    public cxs.a a;
    public hox b;
    public gzs<s3q0> c;

    @Override // xsna.cxs
    public final void a() {
        hox hoxVar = this.b;
        hoxVar.h = null;
        this.a = null;
        hoxVar.d();
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
