package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class kzy implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;

    public /* synthetic */ kzy(int i) {
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                qcy<Object>[] qcyVarArr = com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b.n1;
                dialogInterface.dismiss();
                break;
            default:
                yads.o90.a(dialogInterface, i);
                break;
        }
    }

    private final void a(DialogInterface dialogInterface, int i) {
    }
}
