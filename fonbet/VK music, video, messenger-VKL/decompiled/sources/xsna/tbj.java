package xsna;

import android.content.DialogInterface;
import com.vk.api.sdk.ui.VKConfirmationActivity;
import com.vk.contacts.ContactSyncState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class tbj implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tbj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                gzs gzsVar = (gzs) obj;
                com.vk.contacts.c.b.I0(true);
                com.vk.contacts.c.i(ContactSyncState.PERMITTED);
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 1:
                dialogInterface.dismiss();
                ((defpackage.b0) obj).invoke(Boolean.FALSE);
                break;
            default:
                int i3 = VKConfirmationActivity.b;
                ((VKConfirmationActivity) obj).finish();
                break;
        }
    }
}
