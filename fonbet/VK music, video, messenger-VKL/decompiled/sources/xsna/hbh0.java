package xsna;

import android.content.Context;
import android.os.Build;
import android.util.TypedValue;

/* compiled from: ScreenExt.kt */
/* loaded from: classes.dex */
public final class hbh0 {
    public static final float a(Context context, float f) {
        return tj0.a(1, f, context);
    }

    public static final int b(int i, Context context) {
        return an10.b(a(context, i));
    }

    public static final float c(Context context, float f) {
        float deriveDimension;
        if (Build.VERSION.SDK_INT < 34) {
            return f / context.getResources().getDisplayMetrics().density;
        }
        deriveDimension = TypedValue.deriveDimension(1, f, context.getResources().getDisplayMetrics());
        return deriveDimension;
    }

    public static final int d(Context context) {
        return Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
    }
}
