package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$SharingInternalVideo;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$SharingItemType;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeModalSharingOpen;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoModalSharingClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.video.ui.share.api.ScreenMode;
import com.vk.video.ui.share.api.ShareItemType;
import com.vk.video.ui.share.api.ShareSource;
import com.vk.video.ui.share.api.StatsArguments;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ShareStatsTracker.kt */
/* loaded from: classes7.dex */
public final class v7j0 {
    public final StatsArguments a;
    public final int b;

    /* compiled from: ShareStatsTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenMode.values().length];
            try {
                iArr[ScreenMode.DISCOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenMode.FULLSCREEN_PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenMode.FULLSCREEN_LANDSCAPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScreenMode.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v7j0(StatsArguments statsArguments, int i) {
        MobileOfficialAppsSharingStat$TypeModalSharingOpen.ScreenMode screenMode;
        ShareSource shareSource;
        MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource;
        this.a = statsArguments;
        this.b = i;
        MobileOfficialAppsSharingStat$TypeModalSharingOpen.Event event = MobileOfficialAppsSharingStat$TypeModalSharingOpen.Event.MODAL_SHARING_OPEN;
        ShareItemType shareItemType = statsArguments.b;
        MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource2 = null;
        MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType = shareItemType == ShareItemType.EPISODE ? MobileOfficialAppsSharingStat$SharingItemType.EPISODE : null;
        if (shareItemType == ShareItemType.VIDEO) {
            ScreenMode screenMode2 = statsArguments.f;
            int i2 = screenMode2 == null ? -1 : a.$EnumSwitchMapping$0[screenMode2.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    screenMode = MobileOfficialAppsSharingStat$TypeModalSharingOpen.ScreenMode.DISCOVERY;
                } else if (i2 == 2) {
                    screenMode = MobileOfficialAppsSharingStat$TypeModalSharingOpen.ScreenMode.FULLSCREEN_PORTRAIT;
                } else if (i2 == 3) {
                    screenMode = MobileOfficialAppsSharingStat$TypeModalSharingOpen.ScreenMode.FULLSCREEN_LANDSCAPE;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    screenMode = MobileOfficialAppsSharingStat$TypeModalSharingOpen.ScreenMode.PREVIEW;
                }
                shareSource = statsArguments.g;
                if (shareSource != null) {
                    int i3 = w7j0.$EnumSwitchMapping$1[shareSource.ordinal()];
                    if (i3 == 1) {
                        mobileOfficialAppsSharingStat$TypeEventSource = MobileOfficialAppsSharingStat$TypeEventSource.ACTION_MENU;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mobileOfficialAppsSharingStat$TypeEventSource = MobileOfficialAppsSharingStat$TypeEventSource.BUTTON;
                    }
                    mobileOfficialAppsSharingStat$TypeEventSource2 = mobileOfficialAppsSharingStat$TypeEventSource;
                }
                c(new MobileOfficialAppsSharingStat$TypeModalSharingOpen(event, mobileOfficialAppsSharingStat$SharingItemType, screenMode, mobileOfficialAppsSharingStat$TypeEventSource2));
            }
        }
        screenMode = null;
        shareSource = statsArguments.g;
        if (shareSource != null) {
        }
        c(new MobileOfficialAppsSharingStat$TypeModalSharingOpen(event, mobileOfficialAppsSharingStat$SharingItemType, screenMode, mobileOfficialAppsSharingStat$TypeEventSource2));
    }

    public final MobileOfficialAppsVideoStat$TypeVideoModalSharingClick a(MobileOfficialAppsVideoStat$TypeVideoModalSharingClick.EventSubtype eventSubtype, boolean z) {
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode2;
        int i = z ? this.b : 0;
        StatsArguments statsArguments = this.a;
        MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType = statsArguments.b == ShareItemType.EPISODE ? MobileOfficialAppsSharingStat$SharingItemType.EPISODE : null;
        MobileOfficialAppsVideoStat$TypeVideoModalSharingClick.Event event = MobileOfficialAppsVideoStat$TypeVideoModalSharingClick.Event.MODAL_SHARING_CLICK;
        ScreenMode screenMode = statsArguments.f;
        int i2 = screenMode == null ? -1 : a.$EnumSwitchMapping$0[screenMode.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                mobileOfficialAppsVideoStat$TypeScreenMode2 = MobileOfficialAppsVideoStat$TypeScreenMode.DISCOVERY;
            } else if (i2 == 2) {
                mobileOfficialAppsVideoStat$TypeScreenMode2 = MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_PORTRAIT;
            } else if (i2 == 3) {
                mobileOfficialAppsVideoStat$TypeScreenMode2 = MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_LANDSCAPE;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                mobileOfficialAppsVideoStat$TypeScreenMode2 = MobileOfficialAppsVideoStat$TypeScreenMode.PREVIEW;
            }
            mobileOfficialAppsVideoStat$TypeScreenMode = mobileOfficialAppsVideoStat$TypeScreenMode2;
        } else {
            mobileOfficialAppsVideoStat$TypeScreenMode = null;
        }
        return MobileOfficialAppsVideoStat$TypeVideoModalSharingClick.a.a(event, eventSubtype, mobileOfficialAppsSharingStat$SharingItemType, mobileOfficialAppsVideoStat$TypeScreenMode, new MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem(MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem.Type.SHARING_INTERNAL_VIDEO, new MobileOfficialAppsSharingStat$SharingInternalVideo(i), null), 76);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public final void b(String str, boolean z) {
        switch (str.hashCode()) {
            case -1938583537:
                if (str.equals("com.vkontakte.android")) {
                    c(a(MobileOfficialAppsVideoStat$TypeVideoModalSharingClick.EventSubtype.SEND_VK, z));
                    break;
                }
                break;
            case -1897170512:
                if (str.equals("org.telegram.messenger")) {
                    c(a(MobileOfficialAppsVideoStat$TypeVideoModalSharingClick.EventSubtype.SEND_TELEGRAM, z));
                    break;
                }
                break;
            case -1547699361:
                if (str.equals("com.whatsapp")) {
                    c(a(MobileOfficialAppsVideoStat$TypeVideoModalSharingClick.EventSubtype.SEND_WHATSAPP, z));
                    break;
                }
                break;
            case -373532474:
                if (str.equals("ru.oneme.app")) {
                    c(a(MobileOfficialAppsVideoStat$TypeVideoModalSharingClick.EventSubtype.SEND_MAX, z));
                    break;
                }
                break;
        }
    }

    public final void c(SchemeStat$TypeClick.b bVar) {
        SchemeStat$EventItem.Type type;
        StatsArguments statsArguments = this.a;
        int i = w7j0.$EnumSwitchMapping$0[statsArguments.b.ordinal()];
        if (i == 1 || i == 2) {
            type = SchemeStat$EventItem.Type.VIDEO;
        } else if (i == 3) {
            type = SchemeStat$EventItem.Type.CLIP;
        } else if (i == 4) {
            type = SchemeStat$EventItem.Type.VIDEO_PLAYLIST;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            type = SchemeStat$EventItem.Type.LINK;
        }
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, Long.valueOf(statsArguments.d), Long.valueOf(statsArguments.c), null, statsArguments.e, null, 40, null), bVar, 2);
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), b).q();
    }
}
