package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
class ObjectAnimatorCompatBase {
    private static final int NUM_POINTS = 201;

    private ObjectAnimatorCompatBase() {
    }

    private static void calculateXYValues(@NonNull Path path, @NonNull float[] fArr, @NonNull float[] fArr2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float[] fArr3 = new float[2];
        for (int i = 0; i < 201; i++) {
            pathMeasure.getPosTan((i * length) / 200.0f, fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
        }
    }

    @NonNull
    public static ObjectAnimator ofArgb(@Nullable Object obj, @NonNull String str, int... iArr) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(obj, str, iArr);
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    @NonNull
    public static ObjectAnimator ofFloat(@Nullable Object obj, @NonNull String str, @NonNull String str2, @NonNull Path path) {
        float[] fArr = new float[201];
        float[] fArr2 = new float[201];
        calculateXYValues(path, fArr, fArr2);
        return ObjectAnimator.ofPropertyValuesHolder(obj, PropertyValuesHolder.ofFloat(str, fArr), PropertyValuesHolder.ofFloat(str2, fArr2));
    }

    @NonNull
    public static ObjectAnimator ofInt(@Nullable Object obj, @NonNull String str, @NonNull String str2, @NonNull Path path) {
        int[] iArr = new int[201];
        int[] iArr2 = new int[201];
        calculateXYValues(path, iArr, iArr2);
        return ObjectAnimator.ofPropertyValuesHolder(obj, PropertyValuesHolder.ofInt(str, iArr), PropertyValuesHolder.ofInt(str2, iArr2));
    }

    @NonNull
    public static <T> ObjectAnimator ofArgb(@Nullable T t, @NonNull Property<T, Integer> property, int... iArr) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(t, property, iArr);
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    private static void calculateXYValues(@NonNull Path path, @NonNull int[] iArr, @NonNull int[] iArr2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float[] fArr = new float[2];
        for (int i = 0; i < 201; i++) {
            pathMeasure.getPosTan((i * length) / 200.0f, fArr, null);
            iArr[i] = Math.round(fArr[0]);
            iArr2[i] = Math.round(fArr[1]);
        }
    }

    @NonNull
    public static <T> ObjectAnimator ofFloat(@Nullable T t, @NonNull Property<T, Float> property, @NonNull Property<T, Float> property2, @NonNull Path path) {
        float[] fArr = new float[201];
        float[] fArr2 = new float[201];
        calculateXYValues(path, fArr, fArr2);
        return ObjectAnimator.ofPropertyValuesHolder(t, PropertyValuesHolder.ofFloat((Property<?, Float>) property, fArr), PropertyValuesHolder.ofFloat((Property<?, Float>) property2, fArr2));
    }

    @NonNull
    public static <T> ObjectAnimator ofInt(@Nullable T t, @NonNull Property<T, Integer> property, @NonNull Property<T, Integer> property2, @NonNull Path path) {
        int[] iArr = new int[201];
        int[] iArr2 = new int[201];
        calculateXYValues(path, iArr, iArr2);
        return ObjectAnimator.ofPropertyValuesHolder(t, PropertyValuesHolder.ofInt((Property<?, Integer>) property, iArr), PropertyValuesHolder.ofInt((Property<?, Integer>) property2, iArr2));
    }
}
