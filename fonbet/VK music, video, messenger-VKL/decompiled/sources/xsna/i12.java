package xsna;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: MusicCatalogSectionPresenter.kt */
/* loaded from: classes16.dex */
public final class i12 {
    public boolean a;
    public Object b = new WeakReference(null);
    public Object c;

    public void a(boolean z, boolean z2) {
        View view = (View) ((WeakReference) this.b).get();
        if (view != null) {
            if (z) {
                if (iah0.r(view.getContext()) && t5m.a(view.getContext())) {
                    return;
                }
                qcy<Object>[] qcyVarArr = bwt0.a;
                if (view.getSystemUiVisibility() != 1796) {
                    view.setSystemUiVisibility(1796);
                    return;
                }
                return;
            }
            if (z2) {
                bwt0.H(view);
                return;
            }
            qcy<Object>[] qcyVarArr2 = bwt0.a;
            if ((view.getSystemUiVisibility() & 5380) != 5380) {
                view.setSystemUiVisibility(view.getSystemUiVisibility() | 5380);
            }
        }
    }

    public void b(boolean z) {
        rzr0 invoke;
        rlt0 rlt0Var = (rlt0) this.c;
        if (rlt0Var != null) {
            gzs<rzr0> gzsVar = rlt0Var.B;
            if (!z) {
                invoke = gzsVar != null ? gzsVar.invoke() : null;
                if (invoke != null) {
                    invoke.F();
                }
                rlt0Var.i("fullscreen", "off");
                return;
            }
            if (this.a) {
                return;
            }
            this.a = true;
            invoke = gzsVar != null ? gzsVar.invoke() : null;
            if (invoke != null) {
                invoke.G();
            }
            rlt0Var.i("fullscreen", "on");
        }
    }
}
