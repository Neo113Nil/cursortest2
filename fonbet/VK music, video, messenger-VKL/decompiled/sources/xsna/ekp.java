package xsna;

import android.content.DialogInterface;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ekp implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ekp(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                wjp wjpVar = ((ikp) obj).h;
                if (wjpVar != null) {
                    wjpVar.Z1();
                    break;
                }
                break;
            default:
                int i3 = ProfileFriendsFragment.k0;
                zwd0 zwd0Var = (zwd0) ((ProfileFriendsFragment) obj).S;
                if (zwd0Var != null) {
                    zwd0Var.Z7();
                    break;
                }
                break;
        }
    }
}
