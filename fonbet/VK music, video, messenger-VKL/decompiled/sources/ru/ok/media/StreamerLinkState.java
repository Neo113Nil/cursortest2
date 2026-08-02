package ru.ok.media;

import com.ironsource.X3;
import xsna.asp;
import xsna.zcl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StreamerLinkState.kt */
/* loaded from: classes9.dex */
public final class StreamerLinkState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StreamerLinkState[] $VALUES;
    public static final Companion Companion;
    public static final StreamerLinkState paused = new StreamerLinkState(X3.i.e0, 0);
    public static final StreamerLinkState stable = new StreamerLinkState("stable", 1);
    public static final StreamerLinkState unstable = new StreamerLinkState("unstable", 2);
    public static final StreamerLinkState stalled = new StreamerLinkState("stalled", 3);
    public static final StreamerLinkState disconnected = new StreamerLinkState("disconnected", 4);

    /* compiled from: StreamerLinkState.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final StreamerLinkState combine(StreamerLinkState streamerLinkState, StreamerLinkState streamerLinkState2) {
            return streamerLinkState.ordinal() > streamerLinkState2.ordinal() ? streamerLinkState : streamerLinkState2;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ StreamerLinkState[] $values() {
        return new StreamerLinkState[]{paused, stable, unstable, stalled, disconnected};
    }

    static {
        StreamerLinkState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
        Companion = new Companion(null);
    }

    private StreamerLinkState(String str, int i) {
    }

    public static zrp<StreamerLinkState> getEntries() {
        return $ENTRIES;
    }

    public static StreamerLinkState valueOf(String str) {
        return (StreamerLinkState) Enum.valueOf(StreamerLinkState.class, str);
    }

    public static StreamerLinkState[] values() {
        return (StreamerLinkState[]) $VALUES.clone();
    }
}
