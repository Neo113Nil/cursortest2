package xsna;

import android.content.DialogInterface;
import android.view.KeyEvent;
import xsna.v1j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class p1j implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ p1j(KeyEvent.Callback callback, int i) {
        this.b = i;
        this.c = callback;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((u1j) this.c).v.invoke(v1j.r.b);
                break;
            default:
                f7m0 f7m0Var = (f7m0) this.c;
                n7m0 n7m0Var = f7m0Var.x;
                if (n7m0Var != null) {
                    n7m0Var.d.b();
                }
                f7m0Var.dismiss();
                break;
        }
    }
}
