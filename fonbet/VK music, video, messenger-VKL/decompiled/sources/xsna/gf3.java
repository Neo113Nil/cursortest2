package xsna;

import android.content.DialogInterface;
import xsna.ejx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class gf3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gf3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 1:
                u0q0 u0q0Var = (u0q0) this.c;
                i4a.a = null;
                u0q0Var.a();
                break;
            case 2:
                n1j0 n1j0Var = (n1j0) this.c;
                n1j0Var.G = null;
                if (n1j0Var.w) {
                    n1j0Var.dismiss();
                }
                n1j0Var.x();
                break;
            default:
                ejx0 ejx0Var = (ejx0) this.c;
                Object obj = ejx0Var.a;
                ejx0.a aVar = ejx0Var.g;
                if (obj instanceof ey50) {
                    ((ey50) obj).Y().H(aVar);
                }
                ejx0Var.f = null;
                break;
        }
    }
}
