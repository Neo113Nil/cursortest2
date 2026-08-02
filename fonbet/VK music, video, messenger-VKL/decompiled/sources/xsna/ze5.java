package xsna;

import android.content.DialogInterface;
import xsna.ec40;

/* compiled from: AutoDismissListener.kt */
/* loaded from: classes3.dex */
public final class ze5<T> implements ec40.a<T>, DialogInterface.OnDismissListener {
    public final ec40.a<T> b;
    public final dcn c;

    public ze5(ec40.a<T> aVar, dcn dcnVar) {
        this.b = aVar;
        this.c = dcnVar;
    }

    @Override // xsna.ec40.a
    public final boolean a(T t) {
        this.b.a(t);
        this.c.dismiss();
        return true;
    }

    @Override // xsna.ec40.a
    public final boolean b(ec40<T> ec40Var) {
        boolean b = this.b.b(ec40Var);
        this.c.dismiss();
        return b;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ec40.a<T> aVar = this.b;
        DialogInterface.OnDismissListener onDismissListener = aVar instanceof DialogInterface.OnDismissListener ? (DialogInterface.OnDismissListener) aVar : null;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
