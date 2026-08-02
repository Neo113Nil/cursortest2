package androidx.camera.camera2.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class ProcessingCaptureSession$ProcessorState {
    private static final /* synthetic */ ProcessingCaptureSession$ProcessorState[] $VALUES;
    public static final ProcessingCaptureSession$ProcessorState DE_INITIALIZED;
    public static final ProcessingCaptureSession$ProcessorState ON_CAPTURE_SESSION_ENDED;
    public static final ProcessingCaptureSession$ProcessorState ON_CAPTURE_SESSION_STARTED;
    public static final ProcessingCaptureSession$ProcessorState SESSION_INITIALIZED;
    public static final ProcessingCaptureSession$ProcessorState UNINITIALIZED;

    static {
        ProcessingCaptureSession$ProcessorState processingCaptureSession$ProcessorState = new ProcessingCaptureSession$ProcessorState("UNINITIALIZED", 0);
        UNINITIALIZED = processingCaptureSession$ProcessorState;
        ProcessingCaptureSession$ProcessorState processingCaptureSession$ProcessorState2 = new ProcessingCaptureSession$ProcessorState("SESSION_INITIALIZED", 1);
        SESSION_INITIALIZED = processingCaptureSession$ProcessorState2;
        ProcessingCaptureSession$ProcessorState processingCaptureSession$ProcessorState3 = new ProcessingCaptureSession$ProcessorState("ON_CAPTURE_SESSION_STARTED", 2);
        ON_CAPTURE_SESSION_STARTED = processingCaptureSession$ProcessorState3;
        ProcessingCaptureSession$ProcessorState processingCaptureSession$ProcessorState4 = new ProcessingCaptureSession$ProcessorState("ON_CAPTURE_SESSION_ENDED", 3);
        ON_CAPTURE_SESSION_ENDED = processingCaptureSession$ProcessorState4;
        ProcessingCaptureSession$ProcessorState processingCaptureSession$ProcessorState5 = new ProcessingCaptureSession$ProcessorState("DE_INITIALIZED", 4);
        DE_INITIALIZED = processingCaptureSession$ProcessorState5;
        $VALUES = new ProcessingCaptureSession$ProcessorState[]{processingCaptureSession$ProcessorState, processingCaptureSession$ProcessorState2, processingCaptureSession$ProcessorState3, processingCaptureSession$ProcessorState4, processingCaptureSession$ProcessorState5};
    }

    public static ProcessingCaptureSession$ProcessorState valueOf(String str) {
        return (ProcessingCaptureSession$ProcessorState) Enum.valueOf(ProcessingCaptureSession$ProcessorState.class, str);
    }

    public static ProcessingCaptureSession$ProcessorState[] values() {
        return (ProcessingCaptureSession$ProcessorState[]) $VALUES.clone();
    }
}
