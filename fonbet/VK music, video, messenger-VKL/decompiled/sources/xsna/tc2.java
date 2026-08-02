package xsna;

import android.view.MenuItem;
import com.vk.notifications.CommunityGroupedNotificationsFragment;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import xsna.uc2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class tc2 implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tc2(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((edo0) obj2).d.invoke(((uc2.a) obj).a);
                break;
            default:
                CommunityGroupedNotificationsFragment communityGroupedNotificationsFragment = (CommunityGroupedNotificationsFragment) obj2;
                int i2 = CommunityGroupedNotificationsFragment.i0;
                CommunityNotificationSettingsFragment.a aVar = new CommunityNotificationSettingsFragment.a(communityGroupedNotificationsFragment.g0, (String) obj);
                aVar.y();
                aVar.g(2, communityGroupedNotificationsFragment);
                break;
        }
        return true;
    }
}
