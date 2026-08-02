package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class o6m0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o6m0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                p6m0 p6m0Var = (p6m0) this.c;
                p6m0Var.e = null;
                p6m0Var.b.f();
                break;
            case 1:
                dz20 dz20Var = (dz20) this.c;
                if (dz20Var != null) {
                    dz20Var.Qc(null);
                    break;
                }
                break;
            default:
                zo80 zo80Var = ((ebv0) this.c).H;
                if (zo80Var != null) {
                    zo80Var.invoke();
                    break;
                }
                break;
        }
    }
}
