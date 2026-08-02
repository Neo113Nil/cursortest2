package xsna;

import android.content.DialogInterface;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import ru.mail.libverify.notifications.SmsCodeNotificationActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class i4a0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i4a0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((k4a0) obj).c.e.a(new rjd(com.vk.registration.funnels.b.a, 4));
                break;
            case 1:
                int i3 = ProfileFriendsFragment.k0;
                zwd0 zwd0Var = (zwd0) ((ProfileFriendsFragment) obj).S;
                if (zwd0Var != null) {
                    zwd0Var.dn();
                    break;
                }
                break;
            default:
                SmsCodeNotificationActivity.b((SmsCodeNotificationActivity) obj, dialogInterface, i);
                break;
        }
    }
}
