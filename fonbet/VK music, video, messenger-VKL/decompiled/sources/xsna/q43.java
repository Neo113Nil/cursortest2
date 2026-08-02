package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class q43 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q43(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                ((w43) this.c).play();
                break;
            case 1:
                ((e8j0) this.c).y1 = null;
                break;
            default:
                ((sbl0) this.c).p = null;
                break;
        }
    }
}
