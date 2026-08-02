package androidx.camera.video;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class Recorder$State {
    private static final /* synthetic */ Recorder$State[] $VALUES;
    public static final Recorder$State CONFIGURING;
    public static final Recorder$State ERROR;
    public static final Recorder$State IDLING;
    public static final Recorder$State PAUSED;
    public static final Recorder$State PENDING_PAUSED;
    public static final Recorder$State PENDING_RECORDING;
    public static final Recorder$State RECORDING;
    public static final Recorder$State RESETTING;
    public static final Recorder$State STOPPING;

    static {
        Recorder$State recorder$State = new Recorder$State("CONFIGURING", 0);
        CONFIGURING = recorder$State;
        Recorder$State recorder$State2 = new Recorder$State("PENDING_RECORDING", 1);
        PENDING_RECORDING = recorder$State2;
        Recorder$State recorder$State3 = new Recorder$State("PENDING_PAUSED", 2);
        PENDING_PAUSED = recorder$State3;
        Recorder$State recorder$State4 = new Recorder$State("IDLING", 3);
        IDLING = recorder$State4;
        Recorder$State recorder$State5 = new Recorder$State("RECORDING", 4);
        RECORDING = recorder$State5;
        Recorder$State recorder$State6 = new Recorder$State("PAUSED", 5);
        PAUSED = recorder$State6;
        Recorder$State recorder$State7 = new Recorder$State("STOPPING", 6);
        STOPPING = recorder$State7;
        Recorder$State recorder$State8 = new Recorder$State("RESETTING", 7);
        RESETTING = recorder$State8;
        Recorder$State recorder$State9 = new Recorder$State("ERROR", 8);
        ERROR = recorder$State9;
        $VALUES = new Recorder$State[]{recorder$State, recorder$State2, recorder$State3, recorder$State4, recorder$State5, recorder$State6, recorder$State7, recorder$State8, recorder$State9};
    }

    public static Recorder$State valueOf(String str) {
        return (Recorder$State) Enum.valueOf(Recorder$State.class, str);
    }

    public static Recorder$State[] values() {
        return (Recorder$State[]) $VALUES.clone();
    }
}
