package xsna;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* compiled from: MotionSpec.java */
/* loaded from: classes13.dex */
public final class mb30 {
    public final dpj0<String, rb30> a = new dpj0<>();
    public final dpj0<String, PropertyValuesHolder[]> b = new dpj0<>();

    @Nullable
    public static mb30 a(@NonNull Context context, @NonNull TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return b(resourceId, context);
    }

    @Nullable
    public static mb30 b(int i, @NonNull Context context) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    @NonNull
    public static mb30 c(@NonNull ArrayList arrayList) {
        mb30 mb30Var = new mb30();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            mb30Var.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = rq2.b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = rq2.c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = rq2.d;
            }
            rb30 rb30Var = new rb30();
            rb30Var.d = 0;
            rb30Var.e = 1;
            rb30Var.a = startDelay;
            rb30Var.b = duration;
            rb30Var.c = interpolator;
            rb30Var.d = objectAnimator.getRepeatCount();
            rb30Var.e = objectAnimator.getRepeatMode();
            mb30Var.a.put(propertyName, rb30Var);
        }
        return mb30Var;
    }

    public final rb30 d(String str) {
        dpj0<String, rb30> dpj0Var = this.a;
        if (dpj0Var.get(str) != null) {
            return dpj0Var.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mb30) {
            return this.a.equals(((mb30) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NonNull
    public final String toString() {
        return "\n" + mb30.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
