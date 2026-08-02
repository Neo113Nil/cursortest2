package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.CommonVideoAdsStat$CommonFields;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdClick;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdClose;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdImpression;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdMenuAction;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdRequest;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdResponse;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.UUID;
import xsna.wc0;

/* compiled from: AdBannerStatTrackerImpl.kt */
/* loaded from: classes14.dex */
public final class xc0 implements wc0 {
    public CommonVideoAdsStat$CommonFields a;
    public String b;
    public String c;
    public Long d;
    public String e;

    public static void i(SchemeStat$TypeAction.b bVar) {
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        UiTrackingScreen b = UiTracker.j.b();
        new iid0(c, SchemeStat$TypeAction.a.b(null, b != null ? b.a : null, bVar, 1)).q();
    }

    @Override // xsna.wc0
    public final void a(String str) {
        this.a = new CommonVideoAdsStat$CommonFields(UUID.randomUUID().toString(), (int) (System.currentTimeMillis() / 1000), str, null, null, 24, null);
        i(new CommonVideoAdsStat$TypeOverlayAdRequest(true, h()));
    }

    @Override // xsna.wc0
    public final void b() {
        i(new CommonVideoAdsStat$TypeOverlayAdResponse(false, null, null, h(), 6, null));
    }

    @Override // xsna.wc0
    public final void c(CommonVideoAdsStat$TypeOverlayAdMenuAction.MenuAction menuAction) {
        i(new CommonVideoAdsStat$TypeOverlayAdMenuAction(this.b, menuAction, null, CommonVideoAdsStat$TypeOverlayAdMenuAction.MenuSource.OVERLAY_MENU, h(), 4, null));
    }

    @Override // xsna.wc0
    public final void d(CommonVideoAdsStat$TypeOverlayAdClose.CloseSource closeSource, CommonVideoAdsStat$TypeOverlayAdClose.CloseReason closeReason) {
        i(new CommonVideoAdsStat$TypeOverlayAdClose(this.c, closeSource, closeReason, null, null, null, null, h(), 120, null));
    }

    @Override // xsna.wc0
    public final void e() {
        CommonVideoAdsStat$TypeOverlayAdClick commonVideoAdsStat$TypeOverlayAdClick = new CommonVideoAdsStat$TypeOverlayAdClick(this.c, this.d, h());
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), commonVideoAdsStat$TypeOverlayAdClick, 2)).q();
    }

    @Override // xsna.wc0
    public final void f(boolean z, CommonVideoAdsStat$CommonFields.BannerType bannerType, wc0.a aVar) {
        this.a = CommonVideoAdsStat$CommonFields.a(h(), 0, aVar.a, bannerType, 7);
        this.b = UUID.randomUUID().toString();
        String str = aVar.c;
        this.c = str;
        this.d = aVar.d;
        i(new CommonVideoAdsStat$TypeOverlayAdResponse(z, aVar.b, str, h()));
    }

    @Override // xsna.wc0
    public final void g() {
        if (epx.f(this.e, h().a)) {
            return;
        }
        i(new CommonVideoAdsStat$TypeOverlayAdImpression(this.c, h()));
        this.e = h().a;
    }

    public final CommonVideoAdsStat$CommonFields h() {
        return CommonVideoAdsStat$CommonFields.a(this.a, (int) (System.currentTimeMillis() / 1000), null, null, 29);
    }
}
