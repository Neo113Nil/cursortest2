package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class fta implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;

    public /* synthetic */ fta(int i) {
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                dialogInterface.cancel();
                break;
            case 1:
                int i2 = bl70.f1;
                com.vk.voip.ui.c.C(com.vk.voip.ui.c.b, null, 0L, false, false, false, null, 231);
                break;
            default:
                yads.o90.b(dialogInterface, i);
                break;
        }
    }
}
