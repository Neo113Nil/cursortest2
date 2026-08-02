package ru.ok.media.api;

import com.ironsource.X3;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StreamerState.kt */
/* loaded from: classes9.dex */
public final class StreamerState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StreamerState[] $VALUES;
    public static final StreamerState waiting = new StreamerState("waiting", 0);
    public static final StreamerState preparing = new StreamerState("preparing", 1);
    public static final StreamerState starting = new StreamerState("starting", 2);
    public static final StreamerState started = new StreamerState(X3.i.d0, 3);
    public static final StreamerState paused = new StreamerState(X3.i.e0, 4);
    public static final StreamerState finished = new StreamerState("finished", 5);
    public static final StreamerState failed = new StreamerState("failed", 6);
    public static final StreamerState unrecoverableFailure = new StreamerState("unrecoverableFailure", 7);

    private static final /* synthetic */ StreamerState[] $values() {
        return new StreamerState[]{waiting, preparing, starting, started, paused, finished, failed, unrecoverableFailure};
    }

    static {
        StreamerState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private StreamerState(String str, int i) {
    }

    public static zrp<StreamerState> getEntries() {
        return $ENTRIES;
    }

    public static StreamerState valueOf(String str) {
        return (StreamerState) Enum.valueOf(StreamerState.class, str);
    }

    public static StreamerState[] values() {
        return (StreamerState[]) $VALUES.clone();
    }

    public final String idNameString() {
        return this + " " + ordinal();
    }

    public final boolean isFinal() {
        return this == finished || this == failed || this == unrecoverableFailure;
    }

    public final boolean isStartingFinished() {
        return (this == waiting || this == preparing || this == starting) ? false : true;
    }

    public final boolean isUnrecoverableFailure() {
        return this == unrecoverableFailure;
    }

    public final String nameIdString() {
        return idNameString();
    }
}
