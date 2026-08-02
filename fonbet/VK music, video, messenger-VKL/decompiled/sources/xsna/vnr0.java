package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonEcommStat$BusinessVerificationRequirementsShowItem;
import com.vk.stat.scheme.CommonEcommStat$TypeAvitoIntegrationViewItem;
import com.vk.stat.scheme.CommonEcommStat$TypeCommunityVerificationClickItem;
import com.vk.stat.scheme.CommonEcommStat$TypeCommunityVerificationViewItem;
import com.vk.stat.scheme.CommonEcommStat$TypeEcommClickItem;
import com.vk.stat.scheme.CommonEcommStat$TypeEcommViewItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.hzp0;

/* compiled from: VerifiedSellerAnalyticsImpl.kt */
/* loaded from: classes18.dex */
public final class vnr0 implements unr0 {
    @Override // xsna.unr0
    public final void a(long j) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem = new CommonEcommStat$TypeCommunityVerificationClickItem(CommonEcommStat$TypeCommunityVerificationClickItem.Event.BUSINESS_VERIFICATION_REQUIREMENT_VKBUSINESS_APPROVED_CLICK, j);
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonEcommStat$TypeEcommClickItem(CommonEcommStat$TypeEcommClickItem.Type.TYPE_COMMUNITY_VERIFICATION_CLICK, null, null, commonEcommStat$TypeCommunityVerificationClickItem, 6, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // xsna.unr0
    public final void b(long j) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem = new CommonEcommStat$TypeCommunityVerificationClickItem(CommonEcommStat$TypeCommunityVerificationClickItem.Event.PREMIUM_VERIFICATION_REQUIREMENT_RATING_CLICK, j);
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonEcommStat$TypeEcommClickItem(CommonEcommStat$TypeEcommClickItem.Type.TYPE_COMMUNITY_VERIFICATION_CLICK, null, null, commonEcommStat$TypeCommunityVerificationClickItem, 6, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // xsna.unr0
    public final void c(long j) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem = new CommonEcommStat$TypeCommunityVerificationClickItem(CommonEcommStat$TypeCommunityVerificationClickItem.Event.PREMIUM_VERIFICATION_REQUIREMENT_STRIKES_CLICK, j);
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonEcommStat$TypeEcommClickItem(CommonEcommStat$TypeEcommClickItem.Type.TYPE_COMMUNITY_VERIFICATION_CLICK, null, null, commonEcommStat$TypeCommunityVerificationClickItem, 6, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // xsna.unr0
    public final void d(long j) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem = new CommonEcommStat$TypeCommunityVerificationClickItem(CommonEcommStat$TypeCommunityVerificationClickItem.Event.PREMIUM_VERIFICATION_REQUIREMENT_RATING_CLICK, j);
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonEcommStat$TypeEcommClickItem(CommonEcommStat$TypeEcommClickItem.Type.TYPE_COMMUNITY_VERIFICATION_CLICK, null, null, commonEcommStat$TypeCommunityVerificationClickItem, 6, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // xsna.unr0
    public final void e(long j) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem = new CommonEcommStat$TypeCommunityVerificationClickItem(CommonEcommStat$TypeCommunityVerificationClickItem.Event.PREMIUM_VERIFICATION_REQUIREMENT_SUBSCRIPTION_CLICK, j);
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonEcommStat$TypeEcommClickItem(CommonEcommStat$TypeEcommClickItem.Type.TYPE_COMMUNITY_VERIFICATION_CLICK, null, null, commonEcommStat$TypeCommunityVerificationClickItem, 6, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // xsna.unr0
    public final void f(long j) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem = new CommonEcommStat$TypeCommunityVerificationClickItem(CommonEcommStat$TypeCommunityVerificationClickItem.Event.BUSINESS_VERIFICATION_START_CLICK, j);
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonEcommStat$TypeEcommClickItem(CommonEcommStat$TypeEcommClickItem.Type.TYPE_COMMUNITY_VERIFICATION_CLICK, null, null, commonEcommStat$TypeCommunityVerificationClickItem, 6, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // xsna.unr0
    public final void g(long j, ArrayList arrayList, ArrayList arrayList2) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, null, null, null, null, 62, null);
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(((Boolean) it.next()).booleanValue() ? 1 : 0));
        }
        CommonEcommStat$TypeCommunityVerificationViewItem commonEcommStat$TypeCommunityVerificationViewItem = new CommonEcommStat$TypeCommunityVerificationViewItem(CommonEcommStat$TypeCommunityVerificationViewItem.Type.BUSINESS_VERIFICATION_REQUIREMENTS_SHOW, j, null, new CommonEcommStat$BusinessVerificationRequirementsShowItem(arrayList, arrayList3), 4, null);
        CommonEcommStat$TypeAvitoIntegrationViewItem commonEcommStat$TypeAvitoIntegrationViewItem = null;
        new hzp0.q(schemeStat$EventItem, new CommonEcommStat$TypeEcommViewItem(CommonEcommStat$TypeEcommViewItem.Type.TYPE_COMMUNITY_VERIFICATION_VIEW, commonEcommStat$TypeAvitoIntegrationViewItem, commonEcommStat$TypeCommunityVerificationViewItem, 2, null)).a();
    }

    @Override // xsna.unr0
    public final void h(long j) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem = new CommonEcommStat$TypeCommunityVerificationClickItem(CommonEcommStat$TypeCommunityVerificationClickItem.Event.PREMIUM_VERIFICATION_REQUIREMENT_VKBUSINESS_APPROVED_CLICK, j);
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonEcommStat$TypeEcommClickItem(CommonEcommStat$TypeEcommClickItem.Type.TYPE_COMMUNITY_VERIFICATION_CLICK, null, null, commonEcommStat$TypeCommunityVerificationClickItem, 6, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // xsna.unr0
    public final void i(long j) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem = new CommonEcommStat$TypeCommunityVerificationClickItem(CommonEcommStat$TypeCommunityVerificationClickItem.Event.VERIFICATIONS_SETTINGS_CLICK, j);
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonEcommStat$TypeEcommClickItem(CommonEcommStat$TypeEcommClickItem.Type.TYPE_COMMUNITY_VERIFICATION_CLICK, null, null, commonEcommStat$TypeCommunityVerificationClickItem, 6, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // xsna.unr0
    public final void j(long j) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem = new CommonEcommStat$TypeCommunityVerificationClickItem(CommonEcommStat$TypeCommunityVerificationClickItem.Event.BUSINESS_VERIFICATION_CLICK, j);
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonEcommStat$TypeEcommClickItem(CommonEcommStat$TypeEcommClickItem.Type.TYPE_COMMUNITY_VERIFICATION_CLICK, null, null, commonEcommStat$TypeCommunityVerificationClickItem, 6, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // xsna.unr0
    public final void k(long j) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem = new CommonEcommStat$TypeCommunityVerificationClickItem(CommonEcommStat$TypeCommunityVerificationClickItem.Event.PREMIUM_VERIFICATION_CLICK, j);
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonEcommStat$TypeEcommClickItem(CommonEcommStat$TypeEcommClickItem.Type.TYPE_COMMUNITY_VERIFICATION_CLICK, null, null, commonEcommStat$TypeCommunityVerificationClickItem, 6, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // xsna.unr0
    public final void l(long j) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem = new CommonEcommStat$TypeCommunityVerificationClickItem(CommonEcommStat$TypeCommunityVerificationClickItem.Event.BUSINESS_VERIFICATION_REQUIREMENT_VKBUSINESS_EXISTS_CLICK, j);
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonEcommStat$TypeEcommClickItem(CommonEcommStat$TypeEcommClickItem.Type.TYPE_COMMUNITY_VERIFICATION_CLICK, null, null, commonEcommStat$TypeCommunityVerificationClickItem, 6, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // xsna.unr0
    public final void m(long j) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem = new CommonEcommStat$TypeCommunityVerificationClickItem(CommonEcommStat$TypeCommunityVerificationClickItem.Event.PREMIUM_VERIFICATION_START_CLICK, j);
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonEcommStat$TypeEcommClickItem(CommonEcommStat$TypeEcommClickItem.Type.TYPE_COMMUNITY_VERIFICATION_CLICK, null, null, commonEcommStat$TypeCommunityVerificationClickItem, 6, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
