package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class hqd implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hqd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                dw20 dw20Var = ((iqd) this.c).d;
                if (dw20Var != null) {
                    dw20Var.hide();
                    break;
                }
                break;
            default:
                tol tolVar = (tol) this.c;
                dialogInterface.dismiss();
                tolVar.invoke(250);
                break;
        }
    }
}
