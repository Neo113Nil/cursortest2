package ru.ok.segmentation_full.segmentation;

import android.graphics.Bitmap;
import java.io.Closeable;
import ru.ok.FrameConsumer;
import ru.ok.gl.util.FrameHolder;
import ru.ok.gpu.GlThreadWithSharedContext;

/* loaded from: classes9.dex */
public interface ISegmenter extends Closeable, FrameConsumer {
    int getInputHeight();

    int getInputWidth();

    default boolean isGPUInited() {
        return false;
    }

    Bitmap segment(FrameHolder frameHolder);

    default boolean wantRunWithGPUPass() {
        return false;
    }

    default void copyInputGPU(FrameHolder frameHolder) {
    }

    default void startInitGPU(GlThreadWithSharedContext glThreadWithSharedContext) {
    }
}
