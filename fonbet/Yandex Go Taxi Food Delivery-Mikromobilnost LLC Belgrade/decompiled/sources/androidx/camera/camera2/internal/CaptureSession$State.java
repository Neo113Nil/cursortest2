package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class CaptureSession$State {
    private static final /* synthetic */ CaptureSession$State[] $VALUES;
    public static final CaptureSession$State CLOSED;
    public static final CaptureSession$State GET_SURFACE;
    public static final CaptureSession$State INITIALIZED;
    public static final CaptureSession$State OPENED;
    public static final CaptureSession$State OPENING;
    public static final CaptureSession$State RELEASED;
    public static final CaptureSession$State RELEASING;
    public static final CaptureSession$State UNINITIALIZED;

    static {
        CaptureSession$State captureSession$State = new CaptureSession$State("UNINITIALIZED", 0);
        UNINITIALIZED = captureSession$State;
        CaptureSession$State captureSession$State2 = new CaptureSession$State("RELEASED", 1);
        RELEASED = captureSession$State2;
        CaptureSession$State captureSession$State3 = new CaptureSession$State("INITIALIZED", 2);
        INITIALIZED = captureSession$State3;
        CaptureSession$State captureSession$State4 = new CaptureSession$State("GET_SURFACE", 3);
        GET_SURFACE = captureSession$State4;
        CaptureSession$State captureSession$State5 = new CaptureSession$State("RELEASING", 4);
        RELEASING = captureSession$State5;
        CaptureSession$State captureSession$State6 = new CaptureSession$State("CLOSED", 5);
        CLOSED = captureSession$State6;
        CaptureSession$State captureSession$State7 = new CaptureSession$State("OPENING", 6);
        OPENING = captureSession$State7;
        CaptureSession$State captureSession$State8 = new CaptureSession$State("OPENED", 7);
        OPENED = captureSession$State8;
        $VALUES = new CaptureSession$State[]{captureSession$State, captureSession$State2, captureSession$State3, captureSession$State4, captureSession$State5, captureSession$State6, captureSession$State7, captureSession$State8};
    }

    public static CaptureSession$State valueOf(String str) {
        return (CaptureSession$State) Enum.valueOf(CaptureSession$State.class, str);
    }

    public static CaptureSession$State[] values() {
        return (CaptureSession$State[]) $VALUES.clone();
    }
}
