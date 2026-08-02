package androidx.camera.video;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class VideoOutput$SourceState {
    private static final /* synthetic */ VideoOutput$SourceState[] $VALUES;
    public static final VideoOutput$SourceState ACTIVE_NON_STREAMING;
    public static final VideoOutput$SourceState ACTIVE_STREAMING;
    public static final VideoOutput$SourceState INACTIVE;

    static {
        VideoOutput$SourceState videoOutput$SourceState = new VideoOutput$SourceState("ACTIVE_STREAMING", 0);
        ACTIVE_STREAMING = videoOutput$SourceState;
        VideoOutput$SourceState videoOutput$SourceState2 = new VideoOutput$SourceState("ACTIVE_NON_STREAMING", 1);
        ACTIVE_NON_STREAMING = videoOutput$SourceState2;
        VideoOutput$SourceState videoOutput$SourceState3 = new VideoOutput$SourceState("INACTIVE", 2);
        INACTIVE = videoOutput$SourceState3;
        $VALUES = new VideoOutput$SourceState[]{videoOutput$SourceState, videoOutput$SourceState2, videoOutput$SourceState3};
    }

    public static VideoOutput$SourceState valueOf(String str) {
        return (VideoOutput$SourceState) Enum.valueOf(VideoOutput$SourceState.class, str);
    }

    public static VideoOutput$SourceState[] values() {
        return (VideoOutput$SourceState[]) $VALUES.clone();
    }
}
