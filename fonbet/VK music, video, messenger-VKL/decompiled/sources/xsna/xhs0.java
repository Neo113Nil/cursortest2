package xsna;

import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.offline.settings.api.domain.objects.QualityOptionTypeDo;
import com.vk.stat.scheme.MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDownloadClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDownloadItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.gzp0;

/* compiled from: VideoDownloadStatsTracker.kt */
/* loaded from: classes.dex */
public final class xhs0 {
    public final ows0 a;

    /* compiled from: VideoDownloadStatsTracker.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[QualityOptionTypeDo.values().length];
            try {
                iArr[QualityOptionTypeDo.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QualityOptionTypeDo.AVG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QualityOptionTypeDo.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QualityOptionTypeDo.AUDIO_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[QualityOptionTypeDo.ALWAYS_ASK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoScreenMode.values().length];
            try {
                iArr2[VideoScreenMode.DISCOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VideoScreenMode.FULLSCREEN_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VideoScreenMode.FULLSCREEN_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VideoScreenMode.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VideoScreenMode.INVISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public xhs0(ows0 ows0Var) {
        this.a = ows0Var;
    }

    public static void d(Long l, Long l2, String str, MobileOfficialAppsVideoStat$TypeVideoDownloadItem.EventType eventType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem) {
        Long l3 = null;
        gzp0.a.b(SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, l, l2, null, str, null, 40, null), new MobileOfficialAppsVideoStat$TypeVideoDownloadItem(mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem, eventType, mobileOfficialAppsVideoStat$TypeScreenMode, l3, null, 24, null), 2));
    }

    public final MobileOfficialAppsVideoStat$TypeScreenMode a(VideoScreenMode videoScreenMode) {
        VideoMinimizableState P0;
        int i = videoScreenMode == null ? -1 : a.$EnumSwitchMapping$1[videoScreenMode.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1 || i == 2 || i == 3) {
            io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b3 = this.a.b3();
            if (b3 == null || (P0 = b3.P0()) == null) {
                return null;
            }
            return sp.y(P0);
        }
        if (i == 4) {
            return MobileOfficialAppsVideoStat$TypeScreenMode.PREVIEW;
        }
        if (i == 5) {
            return MobileOfficialAppsVideoStat$TypeScreenMode.INVISIBLE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(Long l, Long l2, String str, VideoScreenMode videoScreenMode) {
        String str2 = null;
        gzp0.a.b(SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, l, l2, null, str, null, 40, null), new MobileOfficialAppsVideoStat$TypeVideoDownloadClick(str2, a(videoScreenMode), null, null, 13, null), 2));
    }

    public final void c(Long l, Long l2, String str, VideoScreenMode videoScreenMode, QualityOptionTypeDo qualityOptionTypeDo) {
        MobileOfficialAppsVideoStat$TypeVideoDownloadItem.EventType eventType = MobileOfficialAppsVideoStat$TypeVideoDownloadItem.EventType.STARTED;
        MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem = null;
        if (qualityOptionTypeDo != null) {
            int i = a.$EnumSwitchMapping$0[qualityOptionTypeDo.ordinal()];
            if (i == 1) {
                mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem = MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem.HIGH;
            } else if (i == 2) {
                mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem = MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem.MEDIUM;
            } else if (i == 3) {
                mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem = MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem.LOW;
            } else if (i == 4) {
                mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem = MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem.SOUND_ONLY;
            } else if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        d(l, l2, str, eventType, a(videoScreenMode), mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem);
    }
}
