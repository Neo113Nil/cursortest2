package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewCancelPinnedClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewLeftActivePinnedClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewManagePinnedClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPinClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupEnsureCancelViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupRepinViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewRepinClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewResumeClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPinCommunityReviewUnpinClickItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.hzp0;

/* compiled from: PinCommunityReviewAnalyticsFacadeImpl.kt */
/* loaded from: classes18.dex */
public final class nla0 implements mla0 {
    public static void x(MobileOfficialAppsMarketStat$TypeMarketClick.b bVar) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, null, null, null, null, bVar, 63), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public static void y(MobileOfficialAppsMarketStat$TypeMarketView.b bVar) {
        new hzp0.g0(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, null, null, null, null, null, 62, null), MobileOfficialAppsMarketStat$TypeMarketView.a.b(null, null, null, bVar, 31), null).a();
    }

    @Override // xsna.mla0
    public final void a(long j, String str) {
        x(new CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem(j, str));
    }

    @Override // xsna.mla0
    public final void b(int i, long j) {
        y(new CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem(j, "", i));
    }

    @Override // xsna.mla0
    public final void c(long j) {
        x(new CommonMarketStat$TypeMarketPinCommunityReviewLeftActivePinnedClickItem(j, ""));
    }

    @Override // xsna.mla0
    public final void d(long j, String str) {
        y(new CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinViewItem(j, str));
    }

    @Override // xsna.mla0
    public final void e(long j) {
        x(new CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedCancelClickItem(j, ""));
    }

    @Override // xsna.mla0
    public final void f(long j, String str) {
        x(new CommonMarketStat$TypeMarketPinCommunityReviewRepinClickItem(j, str));
    }

    @Override // xsna.mla0
    public final void g(long j) {
        x(new CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedResumeClickItem(j, ""));
    }

    @Override // xsna.mla0
    public final void h(long j) {
        x(new CommonMarketStat$TypeMarketPinCommunityReviewCancelPinnedClickItem(j, ""));
    }

    @Override // xsna.mla0
    public final void i(long j) {
        y(new CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem(j, ""));
    }

    @Override // xsna.mla0
    public final void j(long j, String str) {
        x(new CommonMarketStat$TypeMarketPinCommunityReviewUnpinClickItem(j, str));
    }

    @Override // xsna.mla0
    public final void k(int i, long j) {
        x(new CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyClickItem(j, "", i));
    }

    @Override // xsna.mla0
    public final void l(int i, long j) {
        x(new CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayClickItem(j, "", i));
    }

    @Override // xsna.mla0
    public final void m(long j) {
        y(new CommonMarketStat$TypeMarketPinCommunityReviewPopupEnsureCancelViewItem(j, ""));
    }

    @Override // xsna.mla0
    public final void n(long j) {
        x(new CommonMarketStat$TypeMarketPinCommunityReviewManagePinnedClickItem(j, ""));
    }

    @Override // xsna.mla0
    public final void o(long j) {
        x(new CommonMarketStat$TypeMarketPinCommunityReviewResumeClickItem(j, ""));
    }

    @Override // xsna.mla0
    public final void p(long j) {
        y(new CommonMarketStat$TypeMarketPinCommunityReviewPopupCanceledPinnedViewItem(j, ""));
    }

    @Override // xsna.mla0
    public final void q(long j, String str) {
        x(new CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinTryAgainClickItem(j, str));
    }

    @Override // xsna.mla0
    public final void r(long j, String str) {
        y(new CommonMarketStat$TypeMarketPinCommunityReviewPopupAlreadyPinnedViewItem(j, str));
    }

    @Override // xsna.mla0
    public final void s(long j, String str) {
        y(new CommonMarketStat$TypeMarketPinCommunityReviewPopupRepinViewItem(j, str));
    }

    @Override // xsna.mla0
    public final void t(int i, long j, String str) {
        y(new CommonMarketStat$TypeMarketPinCommunityReviewPopupPinForMoneyViewItem(j, str, i));
    }

    @Override // xsna.mla0
    public final void u(long j, String str) {
        y(new CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorPinViewItem(j, str));
    }

    @Override // xsna.mla0
    public final void v(long j, String str) {
        x(new CommonMarketStat$TypeMarketPinCommunityReviewPinClickItem(j, str));
    }

    @Override // xsna.mla0
    public final void w(long j) {
        y(new CommonMarketStat$TypeMarketPinCommunityReviewPopupManagePinnedViewItem(j, ""));
    }
}
