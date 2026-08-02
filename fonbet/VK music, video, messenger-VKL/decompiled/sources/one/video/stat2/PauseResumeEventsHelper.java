package one.video.stat2;

import one.video.player.OneVideoPlayer;
import xsna.asp;
import xsna.zrp;

/* compiled from: PauseResumeEventsHelper.kt */
/* loaded from: classes8.dex */
public final class PauseResumeEventsHelper {
    public OneVideoPlayer.State a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PauseResumeEventsHelper.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;
        public static final Event PAUSE;
        public static final Event RESUME;

        static {
            Event event = new Event("PAUSE", 0);
            PAUSE = event;
            Event event2 = new Event("RESUME", 1);
            RESUME = event2;
            Event[] eventArr = {event, event2};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        public Event() {
            throw null;
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }
}
