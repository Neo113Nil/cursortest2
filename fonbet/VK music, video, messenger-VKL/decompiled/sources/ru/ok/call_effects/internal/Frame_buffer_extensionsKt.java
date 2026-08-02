package ru.ok.call_effects.internal;

import android.util.Size;
import ru.ok.gl.objects.FrameBuffer;

/* compiled from: frame_buffer_extensions.kt */
/* loaded from: classes9.dex */
public final class Frame_buffer_extensionsKt {
    public static final FrameBuffer createNewIfSizeNotMatched(FrameBuffer frameBuffer, Size size) {
        if (frameBuffer != null && frameBuffer.getWidth() == size.getWidth() && frameBuffer.getHeight() == size.getHeight()) {
            return frameBuffer;
        }
        if (frameBuffer != null) {
            frameBuffer.release();
        }
        if (size.getWidth() <= 0 || size.getHeight() <= 0) {
            throw new IllegalArgumentException("Size width and height must be more or equal than zero");
        }
        return new FrameBuffer(size.getWidth(), size.getHeight());
    }
}
