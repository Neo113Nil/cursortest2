package ru.ok.gl.tf.gestures.processor;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.entity.Recognition;

@SuppressLint({"NewApi"})
/* loaded from: classes9.dex */
final class Calculator {
    private Calculator() {
    }

    public static float getMaxRadius(@NonNull RectF rectF) {
        if (rectF.isEmpty()) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return (Math.min(rectF.width() * 0.5f, rectF.height() * 0.5f) + ((float) Math.sqrt((r5 * r5) + (r0 * r0)))) * 0.5f;
    }

    public static float getRotation(@NonNull Recognition recognition, Matrix matrix, @NonNull float[] fArr, int i) {
        if (matrix == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float[] fArr2 = recognition.detection.location;
        matrix.mapPoints(fArr, 0, fArr2, 0, fArr2.length / 2);
        return Detection.getRotationDegrees(i, fArr, false);
    }
}
