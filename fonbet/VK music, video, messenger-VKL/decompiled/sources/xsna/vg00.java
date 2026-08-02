package xsna;

import android.content.DialogInterface;
import com.vk.settings.impl.presentation.base.fragment.communities.ManageCommunitiesNotificationsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class vg00 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;

    public /* synthetic */ vg00(int i) {
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                int i2 = ManageCommunitiesNotificationsFragment.S;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                    break;
                }
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }
}
