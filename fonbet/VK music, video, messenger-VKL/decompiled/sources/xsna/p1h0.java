package xsna;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import java.util.List;
import java.util.Map;
import xsna.m1h0;

/* compiled from: SaveableStateRegistryWrapper.kt */
/* loaded from: classes11.dex */
public final class p1h0 implements m1h0, z1h0 {
    public final /* synthetic */ n1h0 b;
    public androidx.lifecycle.m c;
    public w1h0 d;

    public p1h0(n1h0 n1h0Var) {
        this.b = n1h0Var;
        Object e = n1h0Var.e("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = e instanceof Bundle ? (Bundle) e : null;
        if (bundle != null && this.d == null) {
            w1h0 w1h0Var = new w1h0(new y1h0(this, new gat(this, 9)));
            this.d = w1h0Var;
            w1h0Var.a(bundle);
        }
        n1h0Var.b("androidx.savedstate.SavedStateRegistry", new stg0(this, 1));
    }

    @Override // xsna.m1h0
    public final boolean a(Object obj) {
        return this.b.a(obj);
    }

    @Override // xsna.m1h0
    public final m1h0.a b(String str, gzs<? extends Object> gzsVar) {
        return this.b.b(str, gzsVar);
    }

    @Override // xsna.m1h0
    public final Map<String, List<Object>> d() {
        return this.b.d();
    }

    @Override // xsna.m1h0
    public final Object e(String str) {
        return this.b.e(str);
    }

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        androidx.lifecycle.m mVar = this.c;
        if (mVar != null) {
            return mVar;
        }
        androidx.lifecycle.m mVar2 = new androidx.lifecycle.m(this, false);
        this.c = mVar2;
        return mVar2;
    }

    @Override // xsna.z1h0
    public final v1h0 getSavedStateRegistry() {
        w1h0 w1h0Var = this.d;
        if (w1h0Var == null) {
            w1h0 w1h0Var2 = new w1h0(new y1h0(this, new gat(this, 9)));
            this.d = w1h0Var2;
            w1h0Var2.a(null);
            w1h0Var = w1h0Var2;
        }
        return w1h0Var.b;
    }
}
