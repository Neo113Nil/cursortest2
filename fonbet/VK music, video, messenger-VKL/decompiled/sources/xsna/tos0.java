package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeInstallVkvideoModal;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vk.video.growth.api.CommunityGrowthTrapEvent;
import com.vk.video.growth.api.CommunityGrowthTrapScreen;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoGrowthStatsTrackerImpl.kt */
/* loaded from: classes6.dex */
public final class tos0 implements sos0 {

    /* compiled from: VideoGrowthStatsTrackerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CommunityGrowthTrapScreen.values().length];
            try {
                iArr[CommunityGrowthTrapScreen.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityGrowthTrapScreen.VIDEO_GROUP_MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CommunityGrowthTrapEvent.values().length];
            try {
                iArr2[CommunityGrowthTrapEvent.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CommunityGrowthTrapEvent.BOTTOM_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CommunityGrowthTrapEvent.MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static void g(MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick.EventType eventType, String str) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick(eventType, str, Long.valueOf(System.currentTimeMillis())), 2)).q();
    }

    @Override // xsna.sos0
    public final void a(String str) {
        g(MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick.EventType.OPEN_CLICK, str);
    }

    @Override // xsna.sos0
    public final void b(String str) {
        g(MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick.EventType.CLOSE_ANYWHERE, str);
    }

    @Override // xsna.sos0
    public final void c(String str) {
        g(MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick.EventType.DOWNLOAD_CLICK, str);
    }

    @Override // xsna.sos0
    public final void d(String str) {
        g(MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick.EventType.CLOSE_CROSS, str);
    }

    @Override // xsna.sos0
    public final void e(CommunityGrowthTrapScreen communityGrowthTrapScreen, CommunityGrowthTrapEvent communityGrowthTrapEvent) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        SchemeStat$TypeClick.b mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner;
        int i = a.$EnumSwitchMapping$0[communityGrowthTrapScreen.ordinal()];
        if (i == 1) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GROUP;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_GROUP_MAIN;
        }
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null);
        int i2 = a.$EnumSwitchMapping$1[communityGrowthTrapEvent.ordinal()];
        if (i2 == 1) {
            mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner = new MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner(MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner.EventType.OPEN_IN_VKVIDEO_BANNER_CLICK);
        } else if (i2 == 2) {
            mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner = new MobileOfficialAppsVideoStat$TypeInstallVkvideoModal(MobileOfficialAppsVideoStat$TypeInstallVkvideoModal.EventType.OPEN_IN_VKVIDEO_BOTTOM_BANNER_CLICK);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner = new MobileOfficialAppsVideoStat$TypeInstallVkvideoModal(MobileOfficialAppsVideoStat$TypeInstallVkvideoModal.EventType.INSTALL_VKVIDEO_MODAL_CLOSE);
        }
        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(schemeStat$EventItem, mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner, 2)).q();
    }

    @Override // xsna.sos0
    public final void f(CommunityGrowthTrapScreen communityGrowthTrapScreen, CommunityGrowthTrapEvent communityGrowthTrapEvent) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        SchemeStat$TypeView.b mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner;
        int i = a.$EnumSwitchMapping$0[communityGrowthTrapScreen.ordinal()];
        if (i == 1) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GROUP;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_GROUP_MAIN;
        }
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null);
        int i2 = a.$EnumSwitchMapping$1[communityGrowthTrapEvent.ordinal()];
        if (i2 == 1) {
            mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner = new MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner(MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner.EventType.OPEN_IN_VKVIDEO_BANNER_SHOW);
        } else if (i2 == 2) {
            mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner = new MobileOfficialAppsVideoStat$TypeInstallVkvideoModal(MobileOfficialAppsVideoStat$TypeInstallVkvideoModal.EventType.OPEN_IN_VKVIDEO_BOTTOM_BANNER_SHOW);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner = new MobileOfficialAppsVideoStat$TypeInstallVkvideoModal(MobileOfficialAppsVideoStat$TypeInstallVkvideoModal.EventType.INSTALL_VKVIDEO_MODAL_SHOW);
        }
        new bvt0(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeView.a.b(schemeStat$EventItem, "", "", null, mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner, 8)).q();
    }

    @Override // xsna.sos0
    public final void show(String str) {
        g(MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick.EventType.SHOW, str);
    }
}
