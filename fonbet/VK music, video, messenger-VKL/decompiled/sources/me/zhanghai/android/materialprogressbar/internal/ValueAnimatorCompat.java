package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public class ValueAnimatorCompat {

    @Nullable
    private static Method sValueAnimatorGetDurationScaleMethod;
    private static boolean sValueAnimatorGetDurationScaleMethodInitialized;

    @Nullable
    private static Field sValueAnimatorSDurationScaleField;
    private static boolean sValueAnimatorSDurationScaleFieldInitialized;

    @NonNull
    private static final Object sValueAnimatorGetDurationScaleMethodLock = new Object();

    @NonNull
    private static final Object sValueAnimatorSDurationScaleFieldLock = new Object();

    private ValueAnimatorCompat() {
    }

    public static boolean areAnimatorsEnabled() {
        return ValueAnimator.areAnimatorsEnabled();
    }

    @Nullable
    @SuppressLint({"PrivateApi"})
    private static Method getValueAnimatorGetDurationScaleMethod() {
        Method method;
        synchronized (sValueAnimatorGetDurationScaleMethodLock) {
            if (!sValueAnimatorGetDurationScaleMethodInitialized) {
                try {
                    Method declaredMethod = ValueAnimator.class.getDeclaredMethod("getDurationScale", null);
                    sValueAnimatorGetDurationScaleMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                sValueAnimatorGetDurationScaleMethodInitialized = true;
            }
            method = sValueAnimatorGetDurationScaleMethod;
        }
        return method;
    }

    @Nullable
    private static Field getValueAnimatorSDurationScaleField() {
        Field field;
        synchronized (sValueAnimatorSDurationScaleFieldLock) {
            if (!sValueAnimatorSDurationScaleFieldInitialized) {
                try {
                    Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
                    sValueAnimatorSDurationScaleField = declaredField;
                    declaredField.setAccessible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                sValueAnimatorSDurationScaleFieldInitialized = true;
            }
            field = sValueAnimatorSDurationScaleField;
        }
        return field;
    }
}
