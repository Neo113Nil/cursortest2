package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ka6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ka6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                gzs gzsVar = (gzs) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            default:
                k7q0 k7q0Var = (k7q0) obj;
                z6q0 z6q0Var = k7q0Var.G;
                if (z6q0Var != null) {
                    z6q0Var.E0(k7q0Var.getContext());
                    break;
                }
                break;
        }
    }
}
