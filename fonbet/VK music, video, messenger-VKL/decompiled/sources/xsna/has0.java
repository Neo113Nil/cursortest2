package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAlbumAnalyticsInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClickItem;

/* compiled from: VideoCatalogUIClickTracker.kt */
/* loaded from: classes16.dex */
public final class has0 extends uha {

    /* compiled from: VideoCatalogUIClickTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoAlbumAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr[VideoAlbumAnalyticsInfo.ClickTarget.Open.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public has0() {
        super(new s1v());
    }

    @Override // xsna.uha
    public final void b(UIBlock uIBlock) {
        boolean z = uIBlock instanceof UIBlockActionOpenSection;
        s1v s1vVar = this.a;
        if (z) {
            UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) uIBlock;
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CATALOG_ITEM;
            String str = uIBlockActionOpenSection.B;
            s1vVar.getClass();
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, null, null, s1v.f(uIBlockActionOpenSection), str, null, 38, null), new SchemeStat$TypeClickItem(SchemeStat$TypeClickItem.Subtype.VIDEO_CONTENT_BLOCK_SHOW_ALL_BUTTON), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
            return;
        }
        if (uIBlock instanceof UIBlockGroup) {
            UIBlockGroup uIBlockGroup = (UIBlockGroup) uIBlock;
            SchemeStat$TypeClick a2 = SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, Long.valueOf(tsj.a(uIBlockGroup.y).b.b), null, uIBlockGroup.b, null, 42, null), Integer.valueOf(uIBlockGroup.u), new MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick(MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick.Subtype.AUTHOR_CLICK));
            UiTracker uiTracker2 = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var2 = UiTracker.h;
            uzp0Var2.getClass();
            new bjc(c2, a2, uzp0Var2.a).q();
            return;
        }
        if (!(uIBlock instanceof UIBlockActionSwitchSection)) {
            super.b(uIBlock);
            return;
        }
        UIBlockActionSwitchSection uIBlockActionSwitchSection = (UIBlockActionSwitchSection) uIBlock;
        String str2 = uIBlockActionSwitchSection.F;
        if (str2 != null && !drm0.N(str2)) {
            super.b(uIBlock);
            return;
        }
        SchemeStat$EventItem.Type type2 = SchemeStat$EventItem.Type.CATALOG_ITEM;
        String str3 = uIBlockActionSwitchSection.b;
        s1vVar.getClass();
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type2, null, null, s1v.f(uIBlockActionSwitchSection), str3, null, 38, null), new SchemeStat$TypeClickItem(SchemeStat$TypeClickItem.Subtype.VIDEO_CONTENT_BLOCK_SHOW_ALL_BUTTON), 2);
        UiTracker uiTracker3 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
        uzp0 uzp0Var3 = UiTracker.h;
        uzp0Var3.getClass();
        new bjc(c3, b2, uzp0Var3.a).q();
    }

    @Override // xsna.uha
    public final void c(UIBlock uIBlock, Object obj) {
        if (!(uIBlock instanceof UIBlockVideoAlbum)) {
            b(uIBlock);
            return;
        }
        if (obj instanceof VideoAlbumAnalyticsInfo) {
            if (a.$EnumSwitchMapping$0[((VideoAlbumAnalyticsInfo) obj).a.ordinal()] != 1) {
                b(uIBlock);
                return;
            }
            UIBlockVideoAlbum uIBlockVideoAlbum = (UIBlockVideoAlbum) uIBlock;
            SchemeStat$TypeClick a2 = SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(uIBlockVideoAlbum.y.c.b), null, this.a.e(uIBlockVideoAlbum), null, 42, null), Integer.valueOf(uIBlockVideoAlbum.u), new MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick(MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick.Subtype.PLAYLIST_CLICK));
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, a2, uzp0Var.a).q();
        }
    }
}
