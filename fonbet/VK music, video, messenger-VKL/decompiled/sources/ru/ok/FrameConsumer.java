package ru.ok;

/* loaded from: classes9.dex */
public interface FrameConsumer {
    public static final int USE_FRAME_CPU = 1;
    public static final int USE_FRAME_GPU = 2;
    public static final int USE_FRAME_NONE = 0;

    default boolean isFrameRequired(TFFrameType tFFrameType) {
        return useFrame(tFFrameType) != 0;
    }

    default int useFrame(TFFrameType tFFrameType) {
        return 1;
    }
}
