package defpackage;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import java.util.Map;

/* loaded from: classes10.dex */
public final class o1m0 implements l1m0, j2m0 {
    public final /* synthetic */ m1m0 a;
    public t b;
    public h2m0 c;

    public o1m0(m1m0 m1m0Var) {
        this.a = m1m0Var;
        Object e = m1m0Var.e("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = e instanceof Bundle ? (Bundle) e : null;
        if (bundle != null && this.c == null) {
            h2m0 h2m0Var = new h2m0(new i2m0(this, new csf0(20, this)));
            this.c = h2m0Var;
            h2m0Var.a(bundle);
        }
        m1m0Var.c(new iik0(25, this), "androidx.savedstate.SavedStateRegistry");
    }

    @Override // defpackage.l1m0
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.l1m0
    public final k1m0 c(sls slsVar, String str) {
        return this.a.c(slsVar, str);
    }

    @Override // defpackage.l1m0
    public final boolean d(Object obj) {
        return this.a.d(obj);
    }

    @Override // defpackage.l1m0
    public final Object e(String str) {
        return this.a.e(str);
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        t tVar = this.b;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this, false);
        this.b = tVar2;
        return tVar2;
    }

    @Override // defpackage.j2m0
    public final g2m0 getSavedStateRegistry() {
        h2m0 h2m0Var = this.c;
        if (h2m0Var == null) {
            h2m0 h2m0Var2 = new h2m0(new i2m0(this, new csf0(20, this)));
            this.c = h2m0Var2;
            h2m0Var2.a(null);
            h2m0Var = h2m0Var2;
        }
        return h2m0Var.b;
    }
}
