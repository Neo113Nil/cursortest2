package xsna;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class psb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ psb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((qsb) this.c).o = null;
                break;
            case 1:
                ((gzs) this.c).invoke();
                break;
            case 2:
                ((s4f) this.c).m = false;
                break;
            case 3:
                ((ndn) this.c).n.b(null);
                break;
            case 4:
                c2x0 c2x0Var = (c2x0) this.c;
                View view = c2x0Var.h1;
                if (view != null) {
                    bwt0.p0(view, true);
                }
                View view2 = c2x0Var.i1;
                if (view2 != null) {
                    bwt0.p0(view2, true);
                }
                View view3 = c2x0Var.j1;
                if (view3 != null) {
                    bwt0.p0(view3, false);
                }
                View view4 = c2x0Var.g1;
                if (view4 != null) {
                    view4.setEnabled(true);
                    break;
                }
                break;
            default:
                com.vk.superapp.widget_settings.p004new.b bVar = (com.vk.superapp.widget_settings.p004new.b) this.c;
                bVar.k = null;
                if (!bVar.n) {
                    bVar.e.onNext(Boolean.FALSE);
                    break;
                } else {
                    bVar.n = false;
                    bVar.q();
                    break;
                }
        }
    }
}
