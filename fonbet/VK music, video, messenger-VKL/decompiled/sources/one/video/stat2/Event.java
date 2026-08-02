package one.video.stat2;

import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Event.kt */
/* loaded from: classes8.dex */
public final class Event {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Event[] $VALUES;
    public static final Event AUDIO_TRACK_SWITCHED;
    public static final Event BUFFER_STARVATION;
    public static final Event ERROR;
    public static final Event FAILOVER;
    public static final Event FIRST_BYTE_MANIFEST;
    public static final Event FIRST_VIDEO_FRAME_DECODED;
    public static final Event MODE_CHANGED;
    public static final Event PAUSE;
    public static final Event PLAY;
    public static final Event PLAYBACK_STARTED;
    public static final Event PLAYING;
    public static final Event QUALITY_CHANGED;
    public static final Event READY;
    public static final Event RESUME;
    public static final Event SEEKED;
    public static final Event SEEKING;
    public static final Event SOUND_CHANGED;
    public static final Event START_SESSION;
    public static final Event STOP;
    public static final Event SUBTITLES_SWITCHED;
    public static final Event TELEMETRY;
    public static final Event VISIBILITY_CHANGED;
    public static final Event WATCHED_N;
    public static final Event WATCH_COVERAGE;
    public static final Event WATCH_COVERAGE_LIVE;
    private final String value;

    static {
        Event event = new Event("START_SESSION", 0, "start_session");
        START_SESSION = event;
        Event event2 = new Event("PLAY", 1, "play");
        PLAY = event2;
        Event event3 = new Event("FIRST_BYTE_MANIFEST", 2, "first_byte_manifest");
        FIRST_BYTE_MANIFEST = event3;
        Event event4 = new Event("FIRST_VIDEO_FRAME_DECODED", 3, "first_video_frame_decoded");
        FIRST_VIDEO_FRAME_DECODED = event4;
        Event event5 = new Event("READY", 4, X3.i.s);
        READY = event5;
        Event event6 = new Event("PAUSE", 5, "pause");
        PAUSE = event6;
        Event event7 = new Event("RESUME", 6, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        RESUME = event7;
        Event event8 = new Event("BUFFER_STARVATION", 7, "buffer_starvation");
        BUFFER_STARVATION = event8;
        Event event9 = new Event("PLAYING", 8, X3.i.f0);
        PLAYING = event9;
        Event event10 = new Event("MODE_CHANGED", 9, "mode_changed");
        MODE_CHANGED = event10;
        Event event11 = new Event("VISIBILITY_CHANGED", 10, "visibility_changed");
        VISIBILITY_CHANGED = event11;
        Event event12 = new Event("PLAYBACK_STARTED", 11, "playback_started");
        PLAYBACK_STARTED = event12;
        Event event13 = new Event("STOP", 12, "stop");
        STOP = event13;
        Event event14 = new Event("WATCH_COVERAGE", 13, "watch_coverage");
        WATCH_COVERAGE = event14;
        Event event15 = new Event("WATCH_COVERAGE_LIVE", 14, "watch_coverage_live");
        WATCH_COVERAGE_LIVE = event15;
        Event event16 = new Event("ERROR", 15, "error");
        ERROR = event16;
        Event event17 = new Event("QUALITY_CHANGED", 16, "quality_changed");
        QUALITY_CHANGED = event17;
        Event event18 = new Event("AUDIO_TRACK_SWITCHED", 17, "audio_track_switched");
        AUDIO_TRACK_SWITCHED = event18;
        Event event19 = new Event("SUBTITLES_SWITCHED", 18, "subtitles_switched");
        SUBTITLES_SWITCHED = event19;
        Event event20 = new Event("SOUND_CHANGED", 19, "sound_changed");
        SOUND_CHANGED = event20;
        Event event21 = new Event("SEEKING", 20, "seeking");
        SEEKING = event21;
        Event event22 = new Event("SEEKED", 21, "seeked");
        SEEKED = event22;
        Event event23 = new Event("WATCHED_N", 22, "watched_n");
        WATCHED_N = event23;
        Event event24 = new Event("TELEMETRY", 23, "telemetry");
        TELEMETRY = event24;
        Event event25 = new Event("FAILOVER", 24, "failover");
        FAILOVER = event25;
        Event[] eventArr = {event, event2, event3, event4, event5, event6, event7, event8, event9, event10, event11, event12, event13, event14, event15, event16, event17, event18, event19, event20, event21, event22, event23, event24, event25};
        $VALUES = eventArr;
        $ENTRIES = new asp(eventArr);
    }

    public Event(String str, int i, String str2) {
        this.value = str2;
    }

    public static Event valueOf(String str) {
        return (Event) Enum.valueOf(Event.class, str);
    }

    public static Event[] values() {
        return (Event[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
