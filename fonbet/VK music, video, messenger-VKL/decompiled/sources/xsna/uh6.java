package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;

    public /* synthetic */ uh6(int i) {
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                dialogInterface.dismiss();
                break;
            default:
                int i2 = d9m0.n1;
                dialogInterface.cancel();
                break;
        }
    }
}
