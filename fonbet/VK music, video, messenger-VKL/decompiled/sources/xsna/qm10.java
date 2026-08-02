package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: MaterialResources.java */
/* loaded from: classes.dex */
public final class qm10 {
    @Nullable
    public static ColorStateList a(@NonNull Context context, @NonNull TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = anj.b(resourceId, context)) == null) ? typedArray.getColorStateList(i) : b;
    }

    @Nullable
    public static ColorStateList b(@NonNull Context context, @NonNull yyo0 yyo0Var, int i) {
        int resourceId;
        ColorStateList b;
        TypedArray typedArray = yyo0Var.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = anj.b(resourceId, context)) == null) ? yyo0Var.a(i) : b;
    }

    public static int c(@NonNull Context context, @NonNull TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @Nullable
    public static Drawable d(@NonNull Context context, @NonNull TypedArray typedArray, int i) {
        int resourceId;
        Drawable a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = m33.a(resourceId, context)) == null) ? typedArray.getDrawable(i) : a;
    }

    public static boolean e(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
