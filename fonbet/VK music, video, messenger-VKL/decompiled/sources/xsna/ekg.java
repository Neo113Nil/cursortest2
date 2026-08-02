package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentManager;
import com.vk.api.likes.LikesGetList;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.utils.CommunityOrganizationTitleBuilder;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.profile.ui.community.CommunityMessagesFragment;
import com.vk.profile.user.api.data.CommunityProfileDeeplinkParams;
import com.vk.search.integration.api.SearchTab;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.webapp.fragments.CommunityManageFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.fragments.friends.lists.GroupInviteFriendsFragment;
import com.vkontakte.android.fragments.messages.chat_invite.accept.ChatInviteFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.cpu;

/* compiled from: CommonGroupsBridge.kt */
/* loaded from: classes7.dex */
public final class ekg implements cpu {
    public final Object b;
    public final ProfileFragmentProviderComponent c;
    public final bpn0 d = new bpn0(new com.vk.movika.sdk.base.ui.o0(13));
    public final Object e;

    public ekg(Lazy<? extends SearchUiComponent> lazy, ProfileFragmentProviderComponent profileFragmentProviderComponent, Lazy<? extends NewsfeedRouterComponent> lazy2) {
        this.b = lazy;
        this.c = profileFragmentProviderComponent;
        this.e = lazy2;
    }

    @Override // xsna.cpu
    public final gxh D() {
        t6g0 t6g0Var = t6g0.b;
        return t6g0.b();
    }

    @Override // xsna.cpu
    public final boolean a(UserId userId) {
        long j = userId.b;
        if (j != 0) {
            if (j > 0) {
                return o25.a().a(userId);
            }
            t6g0 t6g0Var = t6g0.b;
            Group C0 = t6g0.b().C0(fkq0.e(userId));
            if (C0 == null || !C0.d()) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.cpu
    public final Group b(UserId userId) {
        t6g0 t6g0Var = t6g0.b;
        return t6g0.b().C0(fkq0.e(userId));
    }

    @Override // xsna.cpu
    public final void c(Activity activity, FragmentManager fragmentManager, Object obj) {
        VkGroupsSearchParams vkGroupsSearchParams = obj instanceof VkGroupsSearchParams ? (VkGroupsSearchParams) obj : null;
        new dxh0(activity, new vqu(vkGroupsSearchParams != null ? vkGroupsSearchParams.copy() : new VkGroupsSearchParams(), activity)).a(fragmentManager);
    }

    @Override // xsna.cpu
    public final boolean d(UserId userId) {
        long j = userId.b;
        if (j != 0) {
            if (j > 0) {
                return o25.a().a(userId);
            }
            t6g0 t6g0Var = t6g0.b;
            Group C0 = t6g0.b().C0(fkq0.e(userId));
            if (C0 == null || !C0.i) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.cpu
    public final boolean e(UserId userId) {
        long j = userId.b;
        if (j != 0) {
            if (j > 0) {
                return o25.a().a(userId);
            }
            t6g0 t6g0Var = t6g0.b;
            Group C0 = t6g0.b().C0(fkq0.e(userId));
            if (C0 == null || !C0.e()) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.cpu
    public final void g(Context context, UserId userId, cpu.a aVar) {
        UserId e = fkq0.e(userId);
        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
        pwd0 ye = this.c.ye(e, null);
        if (aVar != null) {
            ye.z(new CommunityProfileDeeplinkParams(true, aVar.a, aVar.b, false, 8, null));
        }
        ye.k(context);
    }

    @Override // xsna.cpu
    public final void i(Context context, String str) {
        ChatInviteFragment.T.b(context, Uri.parse(str), null, null, null, true);
    }

    @Override // xsna.cpu
    public final void j(FragmentImpl fragmentImpl, UserId userId, String str, String str2, Integer num, String str3, String str4, boolean z) {
        int i = CommunityManageFragment.i0;
        CommunityManageFragment.a a = CommunityManageFragment.b.a(userId, str, str2, str4, str3, z, 8);
        if (num != null) {
            a.g(num.intValue(), fragmentImpl);
        } else {
            a.l(fragmentImpl);
        }
    }

    @Override // xsna.cpu
    public final void k(Context context, ExtendedUserProfile extendedUserProfile) {
        String str;
        String str2 = extendedUserProfile.a.h;
        com.vk.qrcode.d dVar = com.vk.qrcode.d.b;
        if (extendedUserProfile instanceof ExtendedCommunityProfile) {
            ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) extendedUserProfile;
            if (drm0.D(extendedCommunityProfile.T2, "https://", false)) {
                str = extendedCommunityProfile.T2;
                com.vk.qrcode.d.l(context, str, context.getString(R.string.qr_community), str2, "GROUP".toLowerCase(Locale.getDefault()));
            }
        }
        String str3 = extendedUserProfile.A0;
        str = (str3 == null || drm0.N(str3)) ? null : "https://" + a0a.d + '/' + str3;
        if (str == null) {
            str = "";
        }
        com.vk.qrcode.d.l(context, str, context.getString(R.string.qr_community), str2, "GROUP".toLowerCase(Locale.getDefault()));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.cpu
    public final void l(Context context, UserId userId) {
        if (((Boolean) this.d.getValue()).booleanValue()) {
            ((SearchUiComponent) this.b.getValue()).G9(context, new SearchUiComponent.a.InterfaceC1776a.C1777a(userId.b, SearchTab.WALL));
        } else {
            NewsfeedRouter.l(((NewsfeedRouterComponent) this.e.getValue()).l0(), context, null, userId, null, null, Boolean.FALSE, null, 90);
        }
    }

    @Override // xsna.cpu
    public final void m(Context context, UserId userId) {
        g2v.c().b().d(userId.b, context);
    }

    @Override // xsna.cpu
    public final void n(CommunityProfileFragment communityProfileFragment, String str, String str2) {
        CommunityMessagesFragment.a aVar = new CommunityMessagesFragment.a(str);
        if (!(str2 == null || str2.length() == 0)) {
            aVar.H(str2);
        }
        aVar.F(false, false);
        aVar.A();
        aVar.g(100, communityProfileFragment);
    }

    @Override // xsna.cpu
    public final void o(Context context, boolean z, UserId userId, String str, rl7 rl7Var, sd4 sd4Var) {
        rsg0 y6zVar;
        if (z) {
            y6zVar = new r6z(8, fkq0.a(userId).b, userId, LikesGetList.Type.GROUP.i(), str);
        } else {
            String i = LikesGetList.Type.GROUP.i();
            long j = fkq0.a(userId).b;
            y6zVar = new y6z("likes.delete");
            y6zVar.K("type", i);
            y6zVar.F(userId, "owner_id");
            y6zVar.D(j, "item_id");
            y6zVar.K("ref", str);
        }
        bug0.d(rsg0.y0(y6zVar, null, null, 3), context, null, 6).subscribe(new j50(new i50(rl7Var, 17), 14), new sh6(new dkg(sd4Var, 0), 14));
    }

    @Override // xsna.cpu
    public final void p(CommunityProfileFragment communityProfileFragment, UserId userId) {
        GroupInviteFriendsFragment.a aVar = new GroupInviteFriendsFragment.a(GroupInviteFriendsFragment.class, null, null);
        aVar.j.putParcelable("group_id", userId);
        aVar.A();
        aVar.g(3903, communityProfileFragment);
    }

    @Override // xsna.cpu
    public final void q() {
        bzu.c();
        bzu.c = false;
    }

    @Override // xsna.cpu
    public final void r() {
        bzu.c = true;
    }

    @Override // xsna.cpu
    public final void s(Context context, UserId userId, String str, String str2, String str3) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendPath("community_manage");
        builder.appendQueryParameter("group_id", String.valueOf(userId.b));
        if (str != null) {
            builder.appendQueryParameter("action", str);
        }
        if (str2 != null) {
            builder.appendQueryParameter("page_id", str2);
        }
        if (str3 != null) {
            builder.appendQueryParameter("setting", str3);
        }
        Uri build = builder.build();
        int i = CommunityManageFragment.i0;
        CommunityManageFragment.b.a(userId, build.toString(), null, null, null, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE).k(context);
    }

    @Override // xsna.cpu
    public final void t(Context context, UserId userId) {
        int i = ArticleAuthorPageFragment.a.m;
        ArticleAuthorPageFragment.a.C0378a.a(userId).k(context);
    }

    @Override // xsna.cpu
    public final CharSequence u(cpu.b bVar) {
        CommunityOrganizationTitleBuilder.OrganizationType organizationType;
        Pair pair;
        SpannableStringBuilder append;
        Context context = e43.a;
        Spannable spannable = null;
        if (context == null) {
            context = null;
        }
        if (bVar.a) {
            organizationType = CommunityOrganizationTitleBuilder.OrganizationType.NON_PROFIT_ORGANIZATION;
        } else {
            if (!bVar.b) {
                return "";
            }
            organizationType = CommunityOrganizationTitleBuilder.OrganizationType.GOVERNMENT_ORGANIZATION;
        }
        CommunityOrganizationTitleBuilder.a.getClass();
        int i = CommunityOrganizationTitleBuilder.a.$EnumSwitchMapping$0[organizationType.ordinal()];
        if (i == 1) {
            pair = new Pair(null, Integer.valueOf(R.string.non_profit_organization_title));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(Integer.valueOf(R.drawable.vk_icon_flag_12), Integer.valueOf(R.string.group_government_title));
        }
        Integer num = (Integer) pair.d();
        int intValue = ((Number) pair.g()).intValue();
        if (num != null) {
            ylw ylwVar = new ylw(num.intValue());
            ylwVar.h = R.attr.vk_ui_icon_tertiary;
            ylwVar.f = iah0.a(2);
            spannable = ylwVar.b(context);
        }
        return (spannable == null || (append = new SpannableStringBuilder(spannable).append((CharSequence) rik0.b(iah0.b(2.0f))).append((CharSequence) context.getString(intValue))) == null) ? context.getString(intValue) : append;
    }
}
