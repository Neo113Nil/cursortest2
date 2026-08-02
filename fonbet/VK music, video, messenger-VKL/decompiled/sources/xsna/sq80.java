package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class sq80 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                dialogInterface.cancel();
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }
}
