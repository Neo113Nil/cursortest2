package androidx.camera.video;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class Recorder$AudioState {
    private static final /* synthetic */ Recorder$AudioState[] $VALUES;
    public static final Recorder$AudioState DISABLED;
    public static final Recorder$AudioState ENABLED;
    public static final Recorder$AudioState ERROR_ENCODER;
    public static final Recorder$AudioState ERROR_SOURCE;
    public static final Recorder$AudioState IDLING;
    public static final Recorder$AudioState INITIALIZING;

    static {
        Recorder$AudioState recorder$AudioState = new Recorder$AudioState("INITIALIZING", 0);
        INITIALIZING = recorder$AudioState;
        Recorder$AudioState recorder$AudioState2 = new Recorder$AudioState("IDLING", 1);
        IDLING = recorder$AudioState2;
        Recorder$AudioState recorder$AudioState3 = new Recorder$AudioState("DISABLED", 2);
        DISABLED = recorder$AudioState3;
        Recorder$AudioState recorder$AudioState4 = new Recorder$AudioState("ENABLED", 3);
        ENABLED = recorder$AudioState4;
        Recorder$AudioState recorder$AudioState5 = new Recorder$AudioState("ERROR_ENCODER", 4);
        ERROR_ENCODER = recorder$AudioState5;
        Recorder$AudioState recorder$AudioState6 = new Recorder$AudioState("ERROR_SOURCE", 5);
        ERROR_SOURCE = recorder$AudioState6;
        $VALUES = new Recorder$AudioState[]{recorder$AudioState, recorder$AudioState2, recorder$AudioState3, recorder$AudioState4, recorder$AudioState5, recorder$AudioState6};
    }

    public static Recorder$AudioState valueOf(String str) {
        return (Recorder$AudioState) Enum.valueOf(Recorder$AudioState.class, str);
    }

    public static Recorder$AudioState[] values() {
        return (Recorder$AudioState[]) $VALUES.clone();
    }
}
