package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class or2 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static or2 c;
    public kuj0 a;

    public static synchronized or2 a() {
        or2 or2Var;
        synchronized (or2.class) {
            try {
                if (c == null) {
                    d();
                }
                or2Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return or2Var;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter f;
        synchronized (or2.class) {
            f = kuj0.f(i, mode);
        }
        return f;
    }

    public static synchronized void d() {
        synchronized (or2.class) {
            if (c == null) {
                or2 or2Var = new or2();
                c = or2Var;
                or2Var.a = kuj0.c();
                kuj0 kuj0Var = c.a;
                yuf0 yuf0Var = new yuf0(3);
                synchronized (kuj0Var) {
                    kuj0Var.e = yuf0Var;
                }
            }
        }
    }

    public static void e(Drawable drawable, cfz0 cfz0Var, int[] iArr) {
        PorterDuff.Mode mode = kuj0.f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = cfz0Var.d;
            if (!z && !cfz0Var.c) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z ? cfz0Var.a : null;
            PorterDuff.Mode mode2 = cfz0Var.c ? cfz0Var.b : kuj0.f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = kuj0.f(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
    }

    public final synchronized Drawable b(int i, Context context) {
        return this.a.d(i, context);
    }
}
