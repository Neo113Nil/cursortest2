package androidx.lifecycle;

import defpackage.au50;
import defpackage.bvf0;
import defpackage.fdy;
import defpackage.gci0;
import defpackage.k4o;
import defpackage.oey;
import defpackage.vg10;
import defpackage.w511;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public abstract class Lifecycle {
    public final au50 a = new au50(5);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "Companion", "androidx/lifecycle/l", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Event {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;
        public static final l Companion;
        public static final Event ON_ANY;
        public static final Event ON_CREATE;
        public static final Event ON_DESTROY;
        public static final Event ON_PAUSE;
        public static final Event ON_RESUME;
        public static final Event ON_START;
        public static final Event ON_STOP;

        static {
            Event event = new Event("ON_CREATE", 0);
            ON_CREATE = event;
            Event event2 = new Event("ON_START", 1);
            ON_START = event2;
            Event event3 = new Event("ON_RESUME", 2);
            ON_RESUME = event3;
            Event event4 = new Event("ON_PAUSE", 3);
            ON_PAUSE = event4;
            Event event5 = new Event("ON_STOP", 4);
            ON_STOP = event5;
            Event event6 = new Event("ON_DESTROY", 5);
            ON_DESTROY = event6;
            Event event7 = new Event("ON_ANY", 6);
            ON_ANY = event7;
            Event[] eventArr = {event, event2, event3, event4, event5, event6, event7};
            $VALUES = eventArr;
            $ENTRIES = kotlin.enums.a.a(eventArr);
            Companion = new l();
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }

        public final State a() {
            switch (m.a[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                case 7:
                    vg10.e(this, " has no target state");
                    return null;
                default:
                    w511.b();
                    return null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "DESTROYED", "INITIALIZED", "CREATED", "STARTED", "RESUMED", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State CREATED;
        public static final State DESTROYED;
        public static final State INITIALIZED;
        public static final State RESUMED;
        public static final State STARTED;

        static {
            State state = new State("DESTROYED", 0);
            DESTROYED = state;
            State state2 = new State("INITIALIZED", 1);
            INITIALIZED = state2;
            State state3 = new State("CREATED", 2);
            CREATED = state3;
            State state4 = new State("STARTED", 3);
            STARTED = state4;
            State state5 = new State("RESUMED", 4);
            RESUMED = state5;
            State[] stateArr = {state, state2, state3, state4, state5};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final boolean a(State state) {
            return compareTo(state) >= 0;
        }
    }

    public abstract void a(oey oeyVar);

    public abstract State b();

    public gci0 c() {
        r0 c = bvf0.c(b());
        a(new fdy(0, c));
        return kotlinx.coroutines.flow.e.d(c);
    }

    public abstract void d(oey oeyVar);
}
