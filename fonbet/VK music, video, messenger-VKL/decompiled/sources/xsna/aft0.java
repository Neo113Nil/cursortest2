package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventScreenMode;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoSeekEventsTrackerImpl.kt */
/* loaded from: classes3.dex */
public final class aft0 implements zet0 {

    /* compiled from: VideoSeekEventsTrackerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoSeekEventSource.values().length];
            try {
                iArr[VideoSeekEventSource.Slider.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoSeekEventSource.PreciseSlider.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoSeekEventSource.DoubleTap.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoSeekEventSource.Episode.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoSeekEventSource.Live.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoSeekEventSource.FastSeek.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoSeekEventScreenMode.values().length];
            try {
                iArr2[VideoSeekEventScreenMode.Preview.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VideoSeekEventScreenMode.Discovery.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VideoSeekEventScreenMode.Fullscreen.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VideoSeekEventScreenMode.FullscreenPortrait.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[VideoSeekEventScreenMode.FullscreenLandscape.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[VideoSeekEventScreenMode.Invisible.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // xsna.zet0
    public final void a(yet0 yet0Var, VideoSeekEventSource videoSeekEventSource, VideoSeekEventScreenMode videoSeekEventScreenMode, long j) {
        MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick.Source source;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode;
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CLICK_ITEM;
        Long l = yet0Var.a;
        UserId userId = yet0Var.b;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(type, l, userId != null ? Long.valueOf(userId.b) : null, null, yet0Var.c, null, 40, null);
        switch (a.$EnumSwitchMapping$0[videoSeekEventSource.ordinal()]) {
            case 1:
                source = MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick.Source.SLIDER;
                break;
            case 2:
                source = MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick.Source.PRECISE_SLIDER;
                break;
            case 3:
                source = MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick.Source.DOUBLE_TAP;
                break;
            case 4:
                source = MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick.Source.EPISODE;
                break;
            case 5:
                source = MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick.Source.LIVE;
                break;
            case 6:
                source = MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick.Source.FAST_SEEK;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String valueOf = String.valueOf(j);
        switch (a.$EnumSwitchMapping$1[videoSeekEventScreenMode.ordinal()]) {
            case 1:
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.PREVIEW;
                break;
            case 2:
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.DISCOVERY;
                break;
            case 3:
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN;
                break;
            case 4:
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_PORTRAIT;
                break;
            case 5:
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_LANDSCAPE;
                break;
            case 6:
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.INVISIBLE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        new bjc(c, SchemeStat$TypeClick.a.b(schemeStat$EventItem, new MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick(source, valueOf, mobileOfficialAppsVideoStat$TypeScreenMode), 2)).q();
    }
}
