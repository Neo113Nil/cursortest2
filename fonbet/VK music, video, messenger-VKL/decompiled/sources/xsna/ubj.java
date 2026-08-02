package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ubj implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ubj(Object obj, int i) {
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
            default:
                n1j0 n1j0Var = (n1j0) this.c;
                n1j0Var.F = null;
                if (n1j0Var.w) {
                    n1j0Var.dismiss();
                    break;
                }
                break;
        }
    }
}
