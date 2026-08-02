package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem;
import com.vk.stat.scheme.SchemeStat$TypeDialogItem;
import xsna.gzp0;

/* compiled from: VkVideoBackgroundViewStatDelegateImpl.kt */
/* loaded from: classes14.dex */
public final class gzv0 implements com.vk.libvideo.api.promo.stats.a {
    public final sos0 a;

    public gzv0(sos0 sos0Var) {
        this.a = sos0Var;
    }

    @Override // com.vk.libvideo.api.promo.stats.a
    public final void a(String str) {
        this.a.d(str);
        gzp0.a.c(new MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem(MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem.ClickType.CLOSE_EXIT, MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem.TypeRestriction.TYPE_BACKGROUND_WATCHING));
        SchemeStat$TypeDialogItem.DialogItem dialogItem = SchemeStat$TypeDialogItem.DialogItem.NOWHERE;
        SchemeStat$TypeDialogItem.DialogAction dialogAction = SchemeStat$TypeDialogItem.DialogAction.SHOW;
        t1q0 t1q0Var = UiTracker.j;
        UiTrackingScreen b = t1q0Var.b();
        if (b == null || !b.d() || !b.equals(null)) {
            UiTracker.i.g();
            return;
        }
        UiTrackingScreen c = t1q0Var.c();
        if (c != null) {
            t1q0Var.d(c, true);
        }
    }

    @Override // com.vk.libvideo.api.promo.stats.a
    public final void b() {
        gzp0.a.c(new MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem(MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem.ClickType.DOWNLOAD, MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem.TypeRestriction.TYPE_BACKGROUND_WATCHING));
    }

    @Override // com.vk.libvideo.api.promo.stats.a
    public final void c() {
        gzp0.a.c(new MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem(MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem.ClickType.VK_VIDEO_ENTER, MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem.TypeRestriction.TYPE_BACKGROUND_WATCHING));
    }

    @Override // com.vk.libvideo.api.promo.stats.a
    public final void d(String str) {
        this.a.b(str);
        gzp0.a.c(new MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem(MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem.ClickType.CLOSE, MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem.TypeRestriction.TYPE_BACKGROUND_WATCHING));
        SchemeStat$TypeDialogItem.DialogItem dialogItem = SchemeStat$TypeDialogItem.DialogItem.NOWHERE;
        SchemeStat$TypeDialogItem.DialogAction dialogAction = SchemeStat$TypeDialogItem.DialogAction.SHOW;
        t1q0 t1q0Var = UiTracker.j;
        UiTrackingScreen b = t1q0Var.b();
        if (b == null || !b.d() || !b.equals(null)) {
            UiTracker.i.g();
            return;
        }
        UiTrackingScreen c = t1q0Var.c();
        if (c != null) {
            t1q0Var.d(c, true);
        }
    }

    @Override // com.vk.libvideo.api.promo.stats.a
    public final void e(String str) {
        this.a.show(str);
        new y0q0(SchemeStat$TypeDialogItem.DialogItem.VIDEO_BACKGROUND_WATCHING_RESTRICTION, null).d();
    }
}
