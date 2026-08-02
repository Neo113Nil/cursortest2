package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoAlbumType;
import com.vk.libvideo.api.minimizable.DiscoveryAction;
import com.vk.libvideo.api.minimizable.TypeScreen;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoLikeClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoWatchLater;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$VideoEventSource;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.VideoFeatures;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.vk.oneevent.EventItemType;
import ru.vk.oneevent.VideoWatchLaterEventSource;
import ru.vk.oneevent.VideoWatchLaterEventType;
import ru.vk.oneevent.VideoWatchLaterScreenMode;

/* compiled from: VideoDiscoveryActionsTrackerImpl.kt */
/* loaded from: classes7.dex */
public final class ifs0 implements hfs0 {

    /* compiled from: VideoDiscoveryActionsTrackerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DiscoveryAction.EventSource.values().length];
            try {
                iArr[DiscoveryAction.EventSource.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiscoveryAction.EventSource.ACTION_MENU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DiscoveryAction.EventSource.SETTINGS_MENU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TypeScreen.values().length];
            try {
                iArr2[TypeScreen.DISCOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TypeScreen.MINIMIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TypeScreen.FULLSCREEN_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TypeScreen.FULLSCREEN_LANDSCAPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[TypeScreen.PIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[TypeScreen.PREVIEW.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[TypeScreen.INVISIBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[VideoAlbumType.values().length];
            try {
                iArr3[VideoAlbumType.SimplePlaylist.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[VideoAlbumType.Serial.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[VideoAlbumType.Season.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick b(acb0 acb0Var, MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.EventType eventType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.VideoPlaylistType videoPlaylistType;
        int i = a.$EnumSwitchMapping$2[acb0Var.c.ordinal()];
        if (i == 1) {
            videoPlaylistType = MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.VideoPlaylistType.SIMPLE_PLAYLIST;
        } else if (i == 2) {
            videoPlaylistType = MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.VideoPlaylistType.SERIAL;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            videoPlaylistType = MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.VideoPlaylistType.SEASON;
        }
        return new MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick(eventType, mobileOfficialAppsVideoStat$TypeScreenMode, acb0Var.b, videoPlaylistType, acb0Var.a.b, acb0Var.d);
    }

    public static MobileOfficialAppsVideoStat$VideoEventSource c(DiscoveryAction.EventSource eventSource) {
        int i = a.$EnumSwitchMapping$0[eventSource.ordinal()];
        if (i == 1) {
            return MobileOfficialAppsVideoStat$VideoEventSource.BUTTON;
        }
        if (i == 2) {
            return MobileOfficialAppsVideoStat$VideoEventSource.ACTION_MENU;
        }
        if (i == 3) {
            return MobileOfficialAppsVideoStat$VideoEventSource.SETTINGS;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.hfs0
    public final void a(DiscoveryAction discoveryAction, ai90 ai90Var) {
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode;
        String str;
        Object obj;
        Object b;
        Object obj2;
        VideoWatchLaterScreenMode videoWatchLaterScreenMode;
        VideoWatchLaterEventSource videoWatchLaterEventSource;
        slv0 slv0Var;
        VideoWatchLaterEventSource videoWatchLaterEventSource2;
        boolean z;
        TypeScreen typeScreen = ai90Var.b;
        if (typeScreen == null) {
            return;
        }
        switch (a.$EnumSwitchMapping$1[typeScreen.ordinal()]) {
            case 1:
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.DISCOVERY;
                break;
            case 2:
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.MINIMIZED;
                break;
            case 3:
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_PORTRAIT;
                break;
            case 4:
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_LANDSCAPE;
                break;
            case 5:
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.PIP;
                break;
            case 6:
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.PREVIEW;
                break;
            case 7:
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.INVISIBLE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode2 = mobileOfficialAppsVideoStat$TypeScreenMode;
        Iterator<E> it = MobileOfficialAppsCoreNavStat$EventScreen.i().iterator();
        while (true) {
            str = null;
            z = false;
            if (it.hasNext()) {
                obj = it.next();
                if (epx.f(((MobileOfficialAppsCoreNavStat$EventScreen) obj).name(), ai90Var.c.toUpperCase(Locale.ROOT))) {
                }
            } else {
                obj = null;
            }
        }
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) obj;
        if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
            return;
        }
        int i = 1;
        if (epx.f(discoveryAction, DiscoveryAction.f.a)) {
            b = new MobileOfficialAppsVideoStat$TypeVideoLikeClick(ai90Var.a.O9() ? MobileOfficialAppsVideoStat$TypeVideoLikeClick.EventType.UNLIKE : MobileOfficialAppsVideoStat$TypeVideoLikeClick.EventType.LIKE, mobileOfficialAppsVideoStat$TypeScreenMode2);
        } else if (discoveryAction instanceof DiscoveryAction.m) {
            b = new MobileOfficialAppsVideoStat$TypeVideoWatchLater(ai90Var.a.X() ? MobileOfficialAppsVideoStat$TypeVideoWatchLater.EventType.REMOVE : MobileOfficialAppsVideoStat$TypeVideoWatchLater.EventType.ADD, mobileOfficialAppsVideoStat$TypeScreenMode2, c(((DiscoveryAction.m) discoveryAction).a), Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis())));
        } else if (discoveryAction instanceof DiscoveryAction.a) {
            b = new MobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick(ai90Var.a.j0() || o25.a().a(ai90Var.a.I0()) ? MobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick.EventType.DELETE : MobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick.EventType.ADD, c(((DiscoveryAction.a) discoveryAction).a), mobileOfficialAppsVideoStat$TypeScreenMode2, Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis())));
        } else if (epx.f(discoveryAction, DiscoveryAction.c.a)) {
            b = new MobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick(mobileOfficialAppsVideoStat$TypeScreenMode2, Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis())));
        } else if (epx.f(discoveryAction, DiscoveryAction.e.a)) {
            b = new MobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick(str, mobileOfficialAppsVideoStat$TypeScreenMode2, i, z ? 1 : 0);
        } else {
            if (discoveryAction instanceof DiscoveryAction.g) {
                DiscoveryAction.g gVar = (DiscoveryAction.g) discoveryAction;
                obj2 = new MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick(gVar.a ? MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.ButtonClickType.AUTOPLAY_TURN_ON : MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.ButtonClickType.AUTOPLAY_TURN_OFF, null, mobileOfficialAppsVideoStat$TypeScreenMode2, c(gVar.b), null, 18, null);
            } else if (discoveryAction instanceof DiscoveryAction.i) {
                obj2 = new MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick(((DiscoveryAction.i) discoveryAction).a ? MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.ButtonClickType.UNDO_EXPAND_VIDEO : MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.ButtonClickType.EXPAND_VIDEO, null, mobileOfficialAppsVideoStat$TypeScreenMode2, null, null, 26, null);
            } else if (discoveryAction instanceof DiscoveryAction.b) {
                Integer num = ((DiscoveryAction.b) discoveryAction).a;
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                yg5 e = b.C1208b.a().e(ai90Var.a, null);
                VideoAutoPlay videoAutoPlay = e instanceof VideoAutoPlay ? (VideoAutoPlay) e : null;
                obj2 = new MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick(MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.ButtonClickType.CLICK_TO_EXTERNAL_DEVICE_SHARE_BUTTON, videoAutoPlay != null ? videoAutoPlay.K : null, mobileOfficialAppsVideoStat$TypeScreenMode2, MobileOfficialAppsVideoStat$VideoEventSource.PLAYER, num);
            } else if (epx.f(discoveryAction, DiscoveryAction.j.a)) {
                obj2 = new MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick(MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.ButtonClickType.CLICK_TO_PLAYER_SETTINGS_BUTTON, null, mobileOfficialAppsVideoStat$TypeScreenMode2, null, null, 26, null);
            } else if (epx.f(discoveryAction, DiscoveryAction.d.a)) {
                b = new MobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick(mobileOfficialAppsVideoStat$TypeScreenMode2);
            } else if (discoveryAction instanceof DiscoveryAction.l) {
                obj2 = new MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction(MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction.EventType.SHOW_TAB, new CommonStat$TypeTrackCodeItem(((DiscoveryAction.l) discoveryAction).a), mobileOfficialAppsVideoStat$TypeScreenMode2, null, 8, null);
            } else if (discoveryAction instanceof DiscoveryAction.k) {
                obj2 = new MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction(MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction.EventType.CLICK_TAB, new CommonStat$TypeTrackCodeItem(((DiscoveryAction.k) discoveryAction).a), mobileOfficialAppsVideoStat$TypeScreenMode2, null, 8, null);
            } else {
                if (!(discoveryAction instanceof DiscoveryAction.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                DiscoveryAction.h hVar = (DiscoveryAction.h) discoveryAction;
                if (hVar instanceof DiscoveryAction.h.a) {
                    b = b(((DiscoveryAction.h.a) hVar).a, MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.EventType.OPEN_BY_TAB_CLICK, mobileOfficialAppsVideoStat$TypeScreenMode2);
                } else {
                    if (!(hVar instanceof DiscoveryAction.h.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b = b(((DiscoveryAction.h.b) hVar).a, MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.EventType.OPEN, mobileOfficialAppsVideoStat$TypeScreenMode2);
                }
            }
            b = obj2;
        }
        if (!(b instanceof SchemeStat$TypeClick.b)) {
            if (b instanceof SchemeStat$TypeAction.b) {
                VideoFile videoFile = ai90Var.a;
                UiTracker uiTracker = UiTracker.a;
                new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, videoFile.r(), null, 40, null), null, (SchemeStat$TypeAction.b) b, 2)).q();
                return;
            }
            return;
        }
        if (discoveryAction instanceof DiscoveryAction.m) {
            DiscoveryAction.m mVar = (DiscoveryAction.m) discoveryAction;
            VideoFeatures videoFeatures = VideoFeatures.ONE_EVENT_TEST;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                EventItemType eventItemType = EventItemType.VIDEO;
                long o0 = ai90Var.a.o0();
                long j = ai90Var.a.I0().b;
                String r = ai90Var.a.r();
                if (r != null && r.length() > 512) {
                    throw new IllegalArgumentException("track_code must not exceed 512 characters.");
                }
                VideoWatchLaterEventType videoWatchLaterEventType = ai90Var.a.X() ? VideoWatchLaterEventType.REMOVE : VideoWatchLaterEventType.ADD;
                switch (a.$EnumSwitchMapping$1[typeScreen.ordinal()]) {
                    case 1:
                        videoWatchLaterScreenMode = VideoWatchLaterScreenMode.DISCOVERY;
                        break;
                    case 2:
                        videoWatchLaterScreenMode = VideoWatchLaterScreenMode.MINIMIZED;
                        break;
                    case 3:
                        videoWatchLaterScreenMode = VideoWatchLaterScreenMode.FULLSCREEN_PORTRAIT;
                        break;
                    case 4:
                        videoWatchLaterScreenMode = VideoWatchLaterScreenMode.FULLSCREEN_LANDSCAPE;
                        break;
                    case 5:
                        videoWatchLaterScreenMode = VideoWatchLaterScreenMode.PIP;
                        break;
                    case 6:
                        videoWatchLaterScreenMode = VideoWatchLaterScreenMode.PREVIEW;
                        break;
                    case 7:
                        videoWatchLaterScreenMode = VideoWatchLaterScreenMode.INVISIBLE;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
                int i2 = a.$EnumSwitchMapping$0[mVar.a.ordinal()];
                if (i2 == 1) {
                    videoWatchLaterEventSource = VideoWatchLaterEventSource.BUTTON;
                } else if (i2 == 2) {
                    videoWatchLaterEventSource = VideoWatchLaterEventSource.ACTION_MENU;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    videoWatchLaterEventSource = VideoWatchLaterEventSource.SETTINGS;
                }
                synchronized (slv0.f) {
                    try {
                        slv0Var = slv0.h;
                        if (slv0Var != null) {
                            videoWatchLaterEventSource2 = videoWatchLaterEventSource;
                            slv0.h = slv0Var.d;
                            slv0Var.d = null;
                            slv0.g--;
                        } else {
                            videoWatchLaterEventSource2 = videoWatchLaterEventSource;
                            slv0Var = new slv0();
                        }
                        slv0Var.a = "oneevent.events.event.click_watch_later.flow";
                        slv0Var.b = "2.0.0";
                        slv0Var.e = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("type", eventItemType.h());
                linkedHashMap.put("id", Long.valueOf(o0));
                linkedHashMap.put("owner_id", Long.valueOf(j));
                if (r != null) {
                    linkedHashMap.put("track_code", r);
                }
                slv0Var.a(linkedHashMap, DatabaseHelper.ITEM_COLUMN_NAME);
                slv0Var.a("type_video_watch_later", "type");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("event_type", videoWatchLaterEventType.h());
                linkedHashMap2.put("screen_mode", videoWatchLaterScreenMode.h());
                linkedHashMap2.put("client_time", Long.valueOf(micros));
                linkedHashMap2.put("event_source", videoWatchLaterEventSource2.h());
                slv0Var.a(linkedHashMap2, "type_video_watch_later");
                ulv0.a.a(slv0Var);
            }
        }
        VideoFile videoFile2 = ai90Var.a;
        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFile2.o0()), Long.valueOf(videoFile2.I0().b), null, videoFile2.r(), null, 40, null), (SchemeStat$TypeClick.b) b, 2)).q();
    }
}
