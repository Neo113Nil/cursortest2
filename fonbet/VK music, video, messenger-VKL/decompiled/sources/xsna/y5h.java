package xsna;

import android.content.DialogInterface;
import xsna.z5h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class y5h implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y5h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                ic icVar = ((z5h.a) this.c).j;
                if (icVar != null) {
                    icVar.invoke();
                    break;
                }
                break;
            default:
                dz20 dz20Var = (dz20) this.c;
                if (dz20Var != null) {
                    dz20Var.Qc(null);
                    break;
                }
                break;
        }
    }
}
