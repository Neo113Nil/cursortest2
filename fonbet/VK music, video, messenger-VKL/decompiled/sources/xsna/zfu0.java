package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import xsna.iy50;

/* compiled from: VkBrowserNavigationAnalytics.kt */
/* loaded from: classes6.dex */
public final class zfu0 implements k1w0 {
    public final String a;
    public final String b;
    public final WebApiApplication c;

    public zfu0(String str, String str2, WebApiApplication webApiApplication) {
        this.a = str;
        this.b = str2;
        this.c = webApiApplication;
    }

    @Override // xsna.k1w0
    public final void a(long j) {
        iy50 iy50Var = new iy50(0);
        iy50Var.i = e(j);
        iy50Var.y(true);
        iy50Var.q();
    }

    @Override // xsna.k1w0
    public final void d(long j) {
        iy50 iy50Var = new iy50(0);
        iy50Var.i = e(j);
        iy50Var.y(false);
        iy50Var.q();
    }

    public final iy50.a e(long j) {
        SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem = new SchemeStat$TypeMiniAppItem(SchemeStat$TypeMiniAppItem.Type.NAVIGATION, this.b, null, 4, null);
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP;
        WebApiApplication webApiApplication = this.c;
        SchemeStat$EventItem.Type type = webApiApplication.f() ? SchemeStat$EventItem.Type.GAME : SchemeStat$EventItem.Type.MINI_APP;
        long j2 = webApiApplication.q;
        String str = webApiApplication.w;
        rxi0 rxi0Var = rxi0.a;
        long j3 = webApiApplication.b;
        rxi0Var.getClass();
        return new iy50.a(mobileOfficialAppsCoreNavStat$EventScreen, new SchemeStat$EventItem(type, Long.valueOf(j), Long.valueOf(j2), this.a, str, rxi0.b(j3)), e43.a(schemeStat$TypeMiniAppItem));
    }
}
