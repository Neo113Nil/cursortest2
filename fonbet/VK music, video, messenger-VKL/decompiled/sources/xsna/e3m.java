package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;

/* compiled from: DesignContextExt.kt */
/* loaded from: classes.dex */
public final class e3m {
    public static final a a = new a();

    /* compiled from: DesignContextExt.kt */
    public static final class a extends ThreadLocal<TypedValue> {
        @Override // java.lang.ThreadLocal
        public final TypedValue initialValue() {
            return new TypedValue();
        }
    }

    public static final int a(int i, Context context) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static final LayoutInflater b(Context context) {
        return (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public static final ColorStateList c(int i, Context context) {
        return ColorStateList.valueOf(f(i, context));
    }

    public static final int d(int i, Context context) {
        if (context.getTheme().resolveAttribute(i, i(), true)) {
            return TypedValue.complexToDimensionPixelSize(i().data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static final Drawable e(int i, Context context) {
        TypedValue i2 = i();
        if (!context.getTheme().resolveAttribute(i, i2, true)) {
            return null;
        }
        int i3 = i2.type;
        return (28 > i3 || i3 >= 32) ? m33.a(i2.resourceId, context) : new ColorDrawable(i2.data);
    }

    public static final int f(int i, Context context) {
        if (context.getTheme().resolveAttribute(i, i(), true)) {
            return i().data;
        }
        return 0;
    }

    public static final int g(int i, Context context) {
        if (context.getTheme().resolveAttribute(i, i(), true)) {
            return i().resourceId;
        }
        return 0;
    }

    public static final Activity h(Context context) {
        boolean z;
        while (true) {
            z = context instanceof Activity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z) {
            return (Activity) context;
        }
        return null;
    }

    public static final TypedValue i() {
        return a.get();
    }
}
