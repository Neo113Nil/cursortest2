package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeDialogItem;

/* compiled from: VkVideoDownloadRestrictionStatDelegateImpl.kt */
/* loaded from: classes14.dex */
public final class szv0 implements com.vk.libvideo.api.promo.stats.b {
    public static void d(MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem, 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // com.vk.libvideo.api.promo.stats.b
    public final void a() {
        new y0q0(SchemeStat$TypeDialogItem.DialogItem.VIDEO_DOWNLOAD_RESTRICTION, null).d();
    }

    @Override // com.vk.libvideo.api.promo.stats.b
    public final void b() {
        d(new MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem(MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem.ClickType.CLOSE, MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem.TypeRestriction.TYPE_DOWNLOAD));
    }

    @Override // com.vk.libvideo.api.promo.stats.b
    public final void c() {
        d(new MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem(MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem.ClickType.DOWNLOAD, MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem.TypeRestriction.TYPE_DOWNLOAD));
    }
}
