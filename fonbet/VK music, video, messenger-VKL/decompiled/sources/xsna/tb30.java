package xsna;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: MotionUtils.java */
/* loaded from: classes.dex */
public final class tb30 {
    public static float a(int i, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || parseFloat > 1.0f) {
            throw new IllegalArgumentException(n23.a(parseFloat, "Motion easing control point value must be between 0 and 1; instead got: "));
        }
        return parseFloat;
    }

    public static boolean b(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int c(int i, int i2, @NonNull Context context) {
        TypedValue a = jl10.a(i, context);
        return (a == null || a.type != 16) ? i2 : a.data;
    }

    @NonNull
    public static TimeInterpolator d(@NonNull Context context, int i, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!b(valueOf, "cubic-bezier") && !b(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!b(valueOf, "cubic-bezier")) {
            if (b(valueOf, "path")) {
                return rte0.j(rq90.d(valueOf.substring(5, valueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String[] split = valueOf.substring(13, valueOf.length() - 1).split(StringUtils.COMMA);
        if (split.length == 4) {
            return rte0.i(a(0, split), a(1, split), a(2, split), a(3, split));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
    }
}
