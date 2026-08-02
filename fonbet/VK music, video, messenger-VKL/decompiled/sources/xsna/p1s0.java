package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.video.VideoAlbumType;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: VideoAnalytics.kt */
/* loaded from: classes16.dex */
public final class p1s0 {
    public static final s1v a = new s1v();

    /* compiled from: VideoAnalytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoAlbumType.values().length];
            try {
                iArr[VideoAlbumType.SimplePlaylist.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoAlbumType.Serial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoAlbumType.Season.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(UIBlockGroupFilter uIBlockGroupFilter) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, a.e(uIBlockGroupFilter), null, 46, null), new com.vk.stat.scheme.l0(), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public static void b(MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction.EventType eventType, int i, String str) {
        UiTracker uiTracker = UiTracker.a;
        new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction(eventType, new CommonStat$TypeTrackCodeItem(str), MobileOfficialAppsVideoStat$TypeScreenMode.PREVIEW, Integer.valueOf(i)), 3)).q();
    }

    public static void c(UIBlock uIBlock, SchemeStat$TypeClick.b bVar) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, a.e(uIBlock), null, 46, null), bVar, 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
