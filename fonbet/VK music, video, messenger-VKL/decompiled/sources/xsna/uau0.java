package xsna;

import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.dto.common.data.ApiApplication;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.pip.impl.overlay.MiniAppPiPOverlayService;
import com.vk.superapp.pip.impl.overlay.a;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vkontakte.android.games.fragments.GamesAchievementsFragment;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: VkAppsBridge.kt */
/* loaded from: classes15.dex */
public final class uau0 implements zd3 {
    @Override // xsna.zd3
    public final void a(WebApiApplication webApiApplication, int i, int i2, im80 im80Var, e1s0 e1s0Var, pnr0 pnr0Var, Context context) {
        com.vk.superapp.pip.impl.overlay.a aVar = new com.vk.superapp.pip.impl.overlay.a(context);
        a.C1902a c1902a = new a.C1902a(webApiApplication, i, i2, new d3g(context, im80Var), e1s0Var, pnr0Var);
        gvw0 gvw0Var = aVar.b;
        if (Settings.canDrawOverlays(gvw0Var.a)) {
            aVar.a(c1902a);
        } else {
            gvw0.j(gvw0Var, new u14(13, aVar, c1902a), null, 2);
        }
    }

    @Override // xsna.zd3
    public final io.reactivex.rxjava3.disposables.c b(Context context, ApiApplication apiApplication, String str, String str2, String str3) {
        return hf3.c(new op20(apiApplication, context, new mq20(str, (String) null, (String) null, (String) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (String) null, (String) null), new iq20(str3, str2, null, null, null, null, null, null, 252), null, 16));
    }

    @Override // xsna.zd3
    public final void c(com.vk.movika.sdk.base.observable.w wVar) {
        r3y.a("market_checkout_order", wVar);
    }

    @Override // xsna.zd3
    public final void d(Context context) {
        Long l = MiniAppPiPOverlayService.f;
        MiniAppPiPOverlayService.b.a(context);
    }

    @Override // xsna.zd3
    public final Long e() {
        return MiniAppPiPOverlayService.f;
    }

    @Override // xsna.zd3
    public final void f(Context context, String str) {
        int i = GamesAchievementsFragment.a0;
        if (str == null) {
            Uri.Builder a = er.a(HttpRequest.DEFAULT_SCHEME);
            int i2 = VKSuperAppBrowserFragment.Y;
            str = a.authority(VKSuperAppBrowserFragment.a.a()).appendPath(InternalVkMiniApps.ACHIVEMENTS.h().b).toString();
        }
        new GamesAchievementsFragment.a(str, InternalVkMiniApps.ACHIVEMENTS.h().a, GamesAchievementsFragment.class, false, 20).k(context);
    }
}
