package ru.ok.call_effects.internal;

import android.graphics.Matrix;
import android.util.Size;
import ru.ok.call_effects.CallEffects;

/* compiled from: call_effects_frame_extensions.kt */
/* loaded from: classes9.dex */
public final class Call_effects_frame_extensionsKt {
    public static final Size getRotatedSize(CallEffects.Frame frame) {
        return frame.getRotationAngle() % 180 == 0 ? frame.getSize() : new Size(frame.getSize().getHeight(), frame.getSize().getWidth());
    }

    public static final float[] getRotatedTransformMatrix(CallEffects.Frame frame) {
        Matrix matrix = new Matrix(frame.getTransformationMatrix());
        if (frame.getRotationAngle() != 0) {
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preRotate(frame.getRotationAngle());
            matrix.preTranslate(-0.5f, -0.5f);
        }
        return MatrixUtils.convertMatrixFromAndroidGraphicsMatrix(matrix);
    }
}
