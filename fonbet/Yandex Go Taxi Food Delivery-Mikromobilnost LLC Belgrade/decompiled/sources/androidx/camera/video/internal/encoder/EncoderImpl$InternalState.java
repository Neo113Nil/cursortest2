package androidx.camera.video.internal.encoder;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class EncoderImpl$InternalState {
    private static final /* synthetic */ EncoderImpl$InternalState[] $VALUES;
    public static final EncoderImpl$InternalState CONFIGURED;
    public static final EncoderImpl$InternalState ERROR;
    public static final EncoderImpl$InternalState PAUSED;
    public static final EncoderImpl$InternalState PENDING_RELEASE;
    public static final EncoderImpl$InternalState PENDING_START;
    public static final EncoderImpl$InternalState PENDING_START_PAUSED;
    public static final EncoderImpl$InternalState RELEASED;
    public static final EncoderImpl$InternalState STARTED;
    public static final EncoderImpl$InternalState STOPPING;

    static {
        EncoderImpl$InternalState encoderImpl$InternalState = new EncoderImpl$InternalState("CONFIGURED", 0);
        CONFIGURED = encoderImpl$InternalState;
        EncoderImpl$InternalState encoderImpl$InternalState2 = new EncoderImpl$InternalState("STARTED", 1);
        STARTED = encoderImpl$InternalState2;
        EncoderImpl$InternalState encoderImpl$InternalState3 = new EncoderImpl$InternalState("PAUSED", 2);
        PAUSED = encoderImpl$InternalState3;
        EncoderImpl$InternalState encoderImpl$InternalState4 = new EncoderImpl$InternalState("STOPPING", 3);
        STOPPING = encoderImpl$InternalState4;
        EncoderImpl$InternalState encoderImpl$InternalState5 = new EncoderImpl$InternalState("PENDING_START", 4);
        PENDING_START = encoderImpl$InternalState5;
        EncoderImpl$InternalState encoderImpl$InternalState6 = new EncoderImpl$InternalState("PENDING_START_PAUSED", 5);
        PENDING_START_PAUSED = encoderImpl$InternalState6;
        EncoderImpl$InternalState encoderImpl$InternalState7 = new EncoderImpl$InternalState("PENDING_RELEASE", 6);
        PENDING_RELEASE = encoderImpl$InternalState7;
        EncoderImpl$InternalState encoderImpl$InternalState8 = new EncoderImpl$InternalState("ERROR", 7);
        ERROR = encoderImpl$InternalState8;
        EncoderImpl$InternalState encoderImpl$InternalState9 = new EncoderImpl$InternalState("RELEASED", 8);
        RELEASED = encoderImpl$InternalState9;
        $VALUES = new EncoderImpl$InternalState[]{encoderImpl$InternalState, encoderImpl$InternalState2, encoderImpl$InternalState3, encoderImpl$InternalState4, encoderImpl$InternalState5, encoderImpl$InternalState6, encoderImpl$InternalState7, encoderImpl$InternalState8, encoderImpl$InternalState9};
    }

    public static EncoderImpl$InternalState valueOf(String str) {
        return (EncoderImpl$InternalState) Enum.valueOf(EncoderImpl$InternalState.class, str);
    }

    public static EncoderImpl$InternalState[] values() {
        return (EncoderImpl$InternalState[]) $VALUES.clone();
    }
}
