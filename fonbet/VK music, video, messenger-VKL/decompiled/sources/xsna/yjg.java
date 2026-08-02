package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.vk.contacts.ContactsManager;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.friends.impl.birthdays.presentation.BirthdaysListFragment;
import com.vk.friends.impl.followers.presentation.fragments.AllFollowersListFragment;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.im.ui.bridges.MaxButtonVariants;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: CommonFriendsBridge.kt */
/* loaded from: classes7.dex */
public final class yjg implements zls {
    public static final yjg a = new yjg();

    @Override // xsna.zls
    public final boolean H0() {
        return com.vk.contacts.d.a.H0();
    }

    @Override // xsna.zls
    public final void a(Context context, boolean z) {
        ozv.a();
        o19.j(context).a(context, z);
    }

    @Override // xsna.zls
    public final boolean b(Context context, Window window, boolean z) {
        zvm0.k(xwk.e().T(), context, window, z, false, 8);
        return true;
    }

    @Override // xsna.zls
    public final void c(Activity activity, FragmentManager fragmentManager, Object obj) {
        VkPeopleSearchParams vkPeopleSearchParams = obj instanceof VkPeopleSearchParams ? (VkPeopleSearchParams) obj : null;
        new dxh0(activity, new nv90(vkPeopleSearchParams != null ? vkPeopleSearchParams.copy() : new VkPeopleSearchParams(), activity)).a(fragmentManager);
    }

    @Override // xsna.zls
    public final void d(Context context, VoipCallSource voipCallSource, UserId userId, boolean z) {
        g2v.c().j().d(context, voipCallSource, userId, z);
    }

    @Override // xsna.zls
    public final void e(Context context) {
        ContactsManager.R0(com.vk.contacts.d.a, context, false, null, null, new i3g(context, 1), 30);
    }

    @Override // xsna.zls
    public final void f(Context context, String str) {
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(str, "");
        aVar.s();
        aVar.C(context);
    }

    @Override // xsna.zls
    public final void g(Context context, String str, List list) {
        zal0 a2 = g2v.d().a();
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            dq.h(((Number) it.next()).longValue(), arrayList);
        }
        zal0.e(a2, context, arrayList, str, 20);
    }

    @Override // xsna.zls
    public final void h(Context context) {
        ozv.a();
        new BirthdaysListFragment.a().k(context);
    }

    @Override // xsna.zls
    public final void i(Context context, UserProfile userProfile, VoipCallSource voipCallSource) {
        g2v.c().j().k(context, userProfile, voipCallSource, MaxButtonVariants.ForInstalledOnly);
    }

    @Override // xsna.zls
    public final void j(Context context, UserId userId, String str) {
        o0w.x(g2v.c().b(), context, null, userId.b, null, null, null, false, null, null, null, str, null, null, "friends_list", "friends_list", null, null, false, null, null, null, null, null, 1073716218);
    }

    @Override // xsna.zls
    public final void k(Context context) {
        ozv.a();
        new AllFollowersListFragment.a(o25.a().c(), context.getString(R.string.followers)).k(context);
    }

    @Override // xsna.zls
    public final void l(Context context, String str, String str2, long j) {
        g2v.d().a().n(context, null, pn00.k(new Pair("ref", str), new Pair("recipient_ids", String.valueOf(j)), new Pair("date", str2)));
    }

    @Override // xsna.zls
    public final void m(Context context) {
        ozv.a();
        FriendRequestsFragment.a aVar = new FriendRequestsFragment.a();
        aVar.j.putString("ref", "friends");
        aVar.k(context);
    }

    @Override // xsna.zls
    public final void n(Context context, UserProfile userProfile) {
        g2v.d().a().r(context, userProfile.c, "friends");
    }
}
