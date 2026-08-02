package xsna;

import com.vk.clips.download.api.ClipsDownloadLauncher$ClipsDownloadQuality;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.api.domain.subs.ClipsSubsSetting;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsMoreMenuItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;

/* compiled from: ClipsMoreMenuActionsAnalyticsHelper.kt */
/* loaded from: classes17.dex */
public final class ile {
    public final SchemeStat$TypeClipViewerItem.ScreenType a;

    /* compiled from: ClipsMoreMenuActionsAnalyticsHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClipsSubsSetting.values().length];
            try {
                iArr[ClipsSubsSetting.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsSubsSetting.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsSubsSetting.SOUND_OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipsDownloadLauncher$ClipsDownloadQuality.values().length];
            try {
                iArr2[ClipsDownloadLauncher$ClipsDownloadQuality.FULLHD.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ClipsDownloadLauncher$ClipsDownloadQuality.HD.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ClipsDownloadLauncher$ClipsDownloadQuality.SD.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ile(SchemeStat$TypeClipViewerItem.ScreenType screenType) {
        this.a = screenType;
    }

    public static void b(SdkVideoFile sdkVideoFile, SchemeStat$TypeClipViewerItem.EventType eventType, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype eventSubtype, SchemeStat$TypeClipViewerItem.ScreenType screenType, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.ObjectType objectType) {
        new iof(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS, new SchemeStat$TypeClipViewerItem(screenType, eventType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$ClipsMoreMenuItem(eventSubtype, objectType, new MobileOfficialAppsClipsStat$TypeClipsClipItem(sdkVideoFile.o0(), sdkVideoFile.I0().b, sdkVideoFile.r())), null, null, null, null, null, 1056964604, null)).q();
    }

    public final void a(SdkVideoFile sdkVideoFile) {
        b(sdkVideoFile, SchemeStat$TypeClipViewerItem.EventType.CLICK_MORE, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.REMOVE, this.a, null);
    }
}
