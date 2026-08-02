package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import java.util.Iterator;
import java.util.List;

/* compiled from: DrawableExt.kt */
/* loaded from: classes.dex */
public final class sjo {
    public static final void a(Drawable drawable, int i, int i2) {
        if ((drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null) != null) {
            ((GradientDrawable) drawable).setStroke(i2, i);
        }
    }

    public static final void b(Drawable drawable, int i, PorterDuff.Mode mode) {
        drawable.mutate();
        drawable.setColorFilter(new PorterDuffColorFilter(i, mode));
    }

    public static void d(Drawable drawable, ColorStateList colorStateList) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.mutate();
        drawable.setColorFilter(null);
        drawable.setTintMode(mode);
        drawable.setTintList(colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.graphics.drawable.LayerDrawable] */
    public static final Drawable e(Drawable drawable, Context context, List<Integer> list, int i) {
        if (drawable instanceof LayerDrawable) {
            int f = e3m.f(i, context);
            drawable = (LayerDrawable) ((LayerDrawable) drawable).mutate();
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                Drawable findDrawableByLayerId = drawable.findDrawableByLayerId(it.next().intValue());
                GradientDrawable gradientDrawable = findDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) findDrawableByLayerId : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(f);
                } else {
                    findDrawableByLayerId.setTint(f);
                }
            }
        }
        return drawable;
    }
}
