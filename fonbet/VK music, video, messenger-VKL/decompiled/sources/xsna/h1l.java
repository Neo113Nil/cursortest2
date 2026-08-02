package xsna;

import android.view.View;
import java.util.LinkedHashMap;
import xsna.g1l;

/* compiled from: DateStickyVisibilityMediator.kt */
/* loaded from: classes2.dex */
public final class h1l implements g1l {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // xsna.g1l
    public final void a(View view, wqr0 wqr0Var) {
        this.a.put(view, wqr0Var);
    }

    @Override // xsna.g1l
    public final void b(View view) {
        this.a.remove(view);
    }

    @Override // xsna.g1l
    public final void c(View view, boolean z) {
        bpn0 bpn0Var = i0q0.a;
        g1l.a aVar = (g1l.a) this.a.get(view);
        if (aVar != null) {
            aVar.Q5(z);
        }
    }

    public final void d() {
        this.a.clear();
    }
}
