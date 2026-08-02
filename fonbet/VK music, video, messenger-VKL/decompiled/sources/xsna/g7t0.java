package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.List;

/* compiled from: VideoProfileCatalogReorderingPresenter.kt */
/* loaded from: classes6.dex */
public final class g7t0 extends vd7 {
    @Override // xsna.vd7
    public final xsg0 f(String str, List<ozf0> list, UIBlock uIBlock) {
        ozf0 ozf0Var = list.size() == 1 ? (ozf0) j5g.Y(list) : null;
        if (!(uIBlock instanceof UIBlockVideoAlbum) || ozf0Var == null) {
            return super.f(str, list, uIBlock);
        }
        String str2 = ozf0Var.a;
        Integer m = arm0.m(10, drm0.g0(str2, BundleUtil.UNDERLINE_TAG, str2));
        Long valueOf = arm0.m(10, drm0.k0(str2, BundleUtil.UNDERLINE_TAG, str2)) != null ? Long.valueOf(r8.intValue()) : null;
        if (m != null && valueOf != null) {
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(uIBlock.g.b), null, null, null, 58, null), new MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder(MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder.EventType.CHANGE_ORDER, m.intValue(), valueOf.longValue(), MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder.VideoPlaylistType.SIMPLE_PLAYLIST, null, 16, null), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
        }
        String str3 = ozf0Var.d;
        Integer m2 = arm0.m(10, drm0.g0(str2, BundleUtil.UNDERLINE_TAG, str2));
        int i = ozf0Var.e;
        Integer m3 = i == -1 ? arm0.m(10, drm0.g0(str3, BundleUtil.UNDERLINE_TAG, str3)) : null;
        Integer m4 = i == 1 ? arm0.m(10, drm0.g0(str3, BundleUtil.UNDERLINE_TAG, str3)) : null;
        long j = uIBlock.g.b;
        fos fosVar = new fos("video.reorderAlbums");
        fosVar.D(j, "owner_id");
        if (m2 != null) {
            fosVar.C(m2.intValue(), "album_id");
        }
        if (m3 != null) {
            fosVar.C(m3.intValue(), "before");
        }
        if (m4 != null) {
            fosVar.C(m4.intValue(), "after");
        }
        ahn.D(fosVar);
        return fosVar;
    }
}
