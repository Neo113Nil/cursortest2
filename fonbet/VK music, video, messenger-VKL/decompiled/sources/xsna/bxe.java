package xsna;

import android.content.DialogInterface;
import com.vk.api.sdk.ui.VKConfirmationActivity;
import com.vk.contacts.ContactSyncState;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bxe implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bxe(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((f3b) obj).invoke();
                break;
            case 1:
                izs izsVar = (izs) obj;
                com.vk.contacts.c.b.I0(false);
                com.vk.contacts.c.i(ContactSyncState.NOT_PERMITTED);
                if (izsVar != null) {
                    izsVar.invoke(EmptyList.b);
                    break;
                }
                break;
            default:
                int i3 = VKConfirmationActivity.b;
                ((VKConfirmationActivity) obj).finish();
                break;
        }
    }
}
