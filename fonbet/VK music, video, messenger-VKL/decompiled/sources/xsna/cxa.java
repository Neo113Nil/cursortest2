package xsna;

import android.content.DialogInterface;
import com.vk.im.channelcreation.impl.g;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class cxa implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cxa(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((com.vk.im.channelcreation.impl.h) this.c).O(g.C1096g.b);
                dialogInterface.dismiss();
                break;
            default:
                ((UserProfileDialogs) this.c).a.a(UserProfileAction.s.c.C1696c.b);
                break;
        }
    }
}
