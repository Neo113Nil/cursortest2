package defpackage;

import android.content.DialogInterface;

/* loaded from: classes7.dex */
public final /* synthetic */ class no81 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ro81.c = false;
                break;
            default:
                ep81.d = false;
                break;
        }
    }
}
