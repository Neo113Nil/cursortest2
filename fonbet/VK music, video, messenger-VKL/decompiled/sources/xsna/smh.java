package xsna;

import android.content.DialogInterface;
import xsna.tmh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class smh implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ smh(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                tmh tmhVar = (tmh) this.c;
                tmh.c cVar = (tmh.c) this.d;
                io.reactivex.rxjava3.disposables.c cVar2 = tmhVar.h;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                ww50 v = s200.v(tmhVar.b.a);
                if (v != null) {
                    v.H(cVar);
                }
                tmhVar.g = null;
                break;
            default:
                c1q0 c1q0Var = (c1q0) this.c;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.d;
                c1q0Var.b.c();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                    break;
                }
                break;
        }
    }
}
