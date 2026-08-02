package androidx.camera.video;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class VideoEncoderSession$VideoEncoderState {
    private static final /* synthetic */ VideoEncoderSession$VideoEncoderState[] $VALUES;
    public static final VideoEncoderSession$VideoEncoderState INITIALIZING;
    public static final VideoEncoderSession$VideoEncoderState NOT_INITIALIZED;
    public static final VideoEncoderSession$VideoEncoderState PENDING_RELEASE;
    public static final VideoEncoderSession$VideoEncoderState READY;
    public static final VideoEncoderSession$VideoEncoderState RELEASED;

    static {
        VideoEncoderSession$VideoEncoderState videoEncoderSession$VideoEncoderState = new VideoEncoderSession$VideoEncoderState("NOT_INITIALIZED", 0);
        NOT_INITIALIZED = videoEncoderSession$VideoEncoderState;
        VideoEncoderSession$VideoEncoderState videoEncoderSession$VideoEncoderState2 = new VideoEncoderSession$VideoEncoderState("INITIALIZING", 1);
        INITIALIZING = videoEncoderSession$VideoEncoderState2;
        VideoEncoderSession$VideoEncoderState videoEncoderSession$VideoEncoderState3 = new VideoEncoderSession$VideoEncoderState("PENDING_RELEASE", 2);
        PENDING_RELEASE = videoEncoderSession$VideoEncoderState3;
        VideoEncoderSession$VideoEncoderState videoEncoderSession$VideoEncoderState4 = new VideoEncoderSession$VideoEncoderState("READY", 3);
        READY = videoEncoderSession$VideoEncoderState4;
        VideoEncoderSession$VideoEncoderState videoEncoderSession$VideoEncoderState5 = new VideoEncoderSession$VideoEncoderState("RELEASED", 4);
        RELEASED = videoEncoderSession$VideoEncoderState5;
        $VALUES = new VideoEncoderSession$VideoEncoderState[]{videoEncoderSession$VideoEncoderState, videoEncoderSession$VideoEncoderState2, videoEncoderSession$VideoEncoderState3, videoEncoderSession$VideoEncoderState4, videoEncoderSession$VideoEncoderState5};
    }

    public static VideoEncoderSession$VideoEncoderState valueOf(String str) {
        return (VideoEncoderSession$VideoEncoderState) Enum.valueOf(VideoEncoderSession$VideoEncoderState.class, str);
    }

    public static VideoEncoderSession$VideoEncoderState[] values() {
        return (VideoEncoderSession$VideoEncoderState[]) $VALUES.clone();
    }
}
