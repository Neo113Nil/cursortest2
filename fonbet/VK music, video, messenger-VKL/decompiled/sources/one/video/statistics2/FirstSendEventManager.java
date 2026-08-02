package one.video.statistics2;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import xsna.asp;
import xsna.zrp;

/* compiled from: FirstSendEventManager.kt */
/* loaded from: classes8.dex */
public final class FirstSendEventManager {
    public final Set<Event> a = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FirstSendEventManager.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;
        public static final Event FIRST_FRAME_DECODED;
        public static final Event FIRST_FRAME_RENDERED;
        public static final Event PLAY;
        public static final Event PLAYING;
        public static final Event READY;

        static {
            Event event = new Event("FIRST_FRAME_DECODED", 0);
            FIRST_FRAME_DECODED = event;
            Event event2 = new Event("FIRST_FRAME_RENDERED", 1);
            FIRST_FRAME_RENDERED = event2;
            Event event3 = new Event("PLAYING", 2);
            PLAYING = event3;
            Event event4 = new Event("READY", 3);
            READY = event4;
            Event event5 = new Event("PLAY", 4);
            PLAY = event5;
            Event[] eventArr = {event, event2, event3, event4, event5};
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
