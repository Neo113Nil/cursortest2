package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fpd implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fpd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                ((jpd) this.c).c.t();
                break;
            default:
                o3m0 presenter = ((t3m0) this.c).getPresenter();
                if (presenter != null) {
                    presenter.onDestroy();
                    break;
                }
                break;
        }
    }
}
