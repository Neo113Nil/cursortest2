package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wsd implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wsd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                atd atdVar = (atd) this.c;
                atdVar.b.t();
                atdVar.i = null;
                break;
            default:
                ((gzs) ((rr1) this.c).c).invoke();
                break;
        }
    }
}
