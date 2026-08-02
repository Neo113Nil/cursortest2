package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: CommunityInviteActionsMenu.kt */
/* loaded from: classes5.dex */
public final class v5h extends wx20 {
    public final kbe c;
    public final akh d;

    public v5h(kbe kbeVar, akh akhVar) {
        this.c = kbeVar;
        this.d = akhVar;
    }

    @Override // xsna.wx20
    public final List<e520> a() {
        return e43.l(new e520(R.id.vk_community_invite_by_link, R.drawable.vk_icon_link_circle_outline_28, R.string.group_invite_by_link, 0, false, 0, 0, false, null, 0, null, false, 8176), new e520(R.id.vk_community_invite_friends, R.drawable.vk_icon_users_outline_28, R.string.invite_friends, 1, false, 0, 0, false, null, 0, null, false, 8176));
    }

    @Override // xsna.wx20
    public final void f(Context context, e520 e520Var) {
        int i = e520Var.a;
        if (i == R.id.vk_community_invite_by_link) {
            this.c.invoke();
        } else if (i == R.id.vk_community_invite_friends) {
            this.d.invoke();
        }
    }
}
