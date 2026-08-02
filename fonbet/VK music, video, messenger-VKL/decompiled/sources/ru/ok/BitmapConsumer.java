package ru.ok;

import android.graphics.Matrix;
import java.util.Map;
import ru.ok.gl.util.Consumer2;
import ru.ok.gl.util.FrameHolder;

/* loaded from: classes9.dex */
public interface BitmapConsumer extends Consumer2<FrameHolder, Matrix>, FrameConsumer {
    default boolean isReady() {
        return true;
    }

    default void tryStartInitGpu() {
    }

    default void acceptTens(Map<TFFrameType, FrameHolder> map) {
    }
}
