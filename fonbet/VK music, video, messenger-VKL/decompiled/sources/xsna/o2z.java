package xsna;

import android.app.Activity;
import xsna.cxs;

/* compiled from: LevelPlayFullscreenAdvertisement.kt */
/* loaded from: classes6.dex */
public final class o2z implements cxs {
    public final f4q0 a;
    public gzs<s3q0> b;

    public o2z(f4q0 f4q0Var) {
        this.a = f4q0Var;
    }

    @Override // xsna.cxs
    public final void a() {
        this.a.g();
        this.b = null;
    }

    @Override // xsna.cxs
    public final void b(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    @Override // xsna.cxs
    public final void c(cxs.a aVar) {
        this.a.a(new n2z(aVar, this));
    }

    @Override // xsna.cxs
    public final boolean isValid() {
        return this.a.isReady();
    }

    @Override // xsna.cxs
    public final void load() {
        this.a.load();
    }

    @Override // xsna.cxs
    public final void show(Activity activity) {
        this.a.show(activity);
        gzs<s3q0> gzsVar = this.b;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        this.b = null;
    }
}
