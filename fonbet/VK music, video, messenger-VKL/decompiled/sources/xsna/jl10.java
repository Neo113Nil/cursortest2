package xsna;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: MaterialAttributes.java */
/* loaded from: classes.dex */
public final class jl10 {
    @Nullable
    public static TypedValue a(int i, @NonNull Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(int i, @NonNull Context context, boolean z) {
        TypedValue a = a(i, context);
        return (a == null || a.type != 18) ? z : a.data != 0;
    }

    @NonNull
    public static TypedValue c(@NonNull Context context, int i, @NonNull String str) {
        TypedValue a = a(i, context);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}
