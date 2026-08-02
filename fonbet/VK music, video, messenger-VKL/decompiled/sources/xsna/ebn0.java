package xsna;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.menu.presentation.entity.MenuItemUiData;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.navigation.marked.FragmentWithGlobalSearch$EntryMethod;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.profile.user.api.data.UserProfileSkeletonParams;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: SuperAppRouterImpl.kt */
/* loaded from: classes6.dex */
public final class ebn0 implements cbn0 {
    public final ProfileFragmentProviderComponent a;

    public ebn0(ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.a = profileFragmentProviderComponent;
    }

    @Override // xsna.cbn0
    public final void a(Context context, long j, String str) {
        hf3.d(new np20((int) j, context, null, new iq20(str, null, null, null, null, null, null, null, 254), new aq20(null, null, null, null, null, null, null, false, null, false, 4079), 4));
    }

    @Override // xsna.cbn0
    public final void b(Context context, long j, String str) {
        hf3.d(new np20((int) j, context, new mq20(str, (String) null, (String) null, (String) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (String) null, (String) null), null, null, 24));
    }

    @Override // xsna.cbn0
    public final void d(Context context, WebApiApplication webApiApplication, String str, Integer num, UserId userId, String str2) {
        hf3.c(new op20(chx0.b(webApiApplication), context, new mq20(str, (String) null, (String) null, (String) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (String) null, (String) null), new iq20(str2 == null ? webApiApplication.w : str2, null, null, null, null, null, null, null, 254), new aq20(userId != null ? Long.valueOf(userId.b) : null, null, null, null, num, null, null, false, null, false, 4078)));
    }

    @Override // xsna.cbn0
    public final void e(FragmentActivity fragmentActivity) {
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.QR_SCANNER), com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SUPER_APP));
        aVar.s();
        aVar.C(fragmentActivity);
    }

    @Override // xsna.cbn0
    public final void f(FragmentActivity fragmentActivity, FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod) {
        DiscoverSearchFragment.a aVar = new DiscoverSearchFragment.a();
        aVar.y();
        aVar.A(fragmentWithGlobalSearch$EntryMethod);
        aVar.k(fragmentActivity);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // xsna.cbn0
    public final void g(ww50<?> ww50Var, String str) {
        InternalVkMiniApps internalVkMiniApps;
        MenuItemUiData menuItemUiData = null;
        switch (str.hashCode()) {
            case -1338910485:
                if (str.equals("dating")) {
                    internalVkMiniApps = InternalVkMiniApps.DATING;
                    break;
                }
                internalVkMiniApps = null;
                break;
            case -1221262756:
                if (str.equals("health")) {
                    internalVkMiniApps = InternalVkMiniApps.HEALTH;
                    break;
                }
                internalVkMiniApps = null;
                break;
            case 109761319:
                if (str.equals("steps")) {
                    internalVkMiniApps = InternalVkMiniApps.STEPS;
                    break;
                }
                internalVkMiniApps = null;
                break;
            case 957885709:
                if (str.equals("coupons")) {
                    internalVkMiniApps = InternalVkMiniApps.COUPONS;
                    break;
                }
                internalVkMiniApps = null;
                break;
            default:
                internalVkMiniApps = null;
                break;
        }
        if (internalVkMiniApps != null) {
            thx h = internalVkMiniApps.h();
            NavigationDelegateActivity navigationDelegateActivity = ww50Var.b;
            Uri parse = Uri.parse(f870.v(h));
            itg0.a(navigationDelegateActivity, com.vk.common.links.c.e(navigationDelegateActivity, f870.w(h), parse, new dbn0(navigationDelegateActivity, parse), new k170(ww50Var, 27)));
            return;
        }
        MenuItemUiData[] values = MenuItemUiData.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                MenuItemUiData menuItemUiData2 = values[i];
                if (epx.f(menuItemUiData2.i(), str)) {
                    menuItemUiData = menuItemUiData2;
                } else {
                    i++;
                }
            }
        }
        if (menuItemUiData == null) {
            com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("Unknown menu key: ".concat(str)));
        } else {
            m820.c(ww50Var, menuItemUiData.h(), true);
        }
    }

    @Override // xsna.cbn0
    public final void h(Context context) {
        cn o = o25.a().o();
        UserId userId = o.a;
        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
        this.a.ye(userId, null).M(new UserProfileSkeletonParams(o.b, o.c, o.j, false)).k(context);
    }
}
