package xsna;

import android.content.DialogInterface;
import android.widget.FrameLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class t86 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ t86(FrameLayout frameLayout, int i) {
        this.b = i;
        this.c = frameLayout;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                u86 u86Var = (u86) this.c;
                u86Var.getAnimationsDelegate().f();
                u86Var.getRequirePresenter().D3();
                u86Var.K = null;
                break;
            default:
                sqt0.e((sqt0) this.c);
                break;
        }
    }
}
