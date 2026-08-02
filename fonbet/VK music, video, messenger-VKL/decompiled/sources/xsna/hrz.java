package xsna;

import android.content.DialogInterface;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import ru.mail.libverify.notifications.SmsCodeNotificationActivity;
import xsna.fsz;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class hrz implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hrz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((krz) obj).getFeature().C(fsz.a.b);
                break;
            case 1:
                xn50.a.c(((rhc0) obj).c, new PostingAction.Publish.SaveDraft(true));
                break;
            case 2:
                int i3 = ProfileFriendsFragment.k0;
                ((ProfileFriendsFragment) obj).Mf(0, null);
                break;
            default:
                SmsCodeNotificationActivity.c((SmsCodeNotificationActivity) obj, dialogInterface, i);
                break;
        }
    }
}
