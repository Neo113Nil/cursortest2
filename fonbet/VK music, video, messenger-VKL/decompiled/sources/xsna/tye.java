package xsna;

import android.content.DialogInterface;
import xsna.l7v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class tye implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tye(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                ((io.reactivex.rxjava3.disposables.c) this.c).dispose();
                break;
            default:
                ((l7v.b) this.c).c.c = null;
                break;
        }
    }
}
