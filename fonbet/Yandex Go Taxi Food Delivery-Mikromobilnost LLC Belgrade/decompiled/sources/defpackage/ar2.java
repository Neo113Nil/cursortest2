package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ar2 {
    public final View a;
    public cfz0 d;
    public cfz0 e;
    public cfz0 f;
    public int c = -1;
    public final or2 b = or2.a();

    public ar2(View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new cfz0();
                }
                cfz0 cfz0Var = this.f;
                cfz0Var.a = null;
                cfz0Var.d = false;
                cfz0Var.b = null;
                cfz0Var.c = false;
                WeakHashMap weakHashMap = b.a;
                ColorStateList d = ViewCompat$Api21Impl.d(view);
                if (d != null) {
                    cfz0Var.d = true;
                    cfz0Var.a = d;
                }
                PorterDuff.Mode e = ViewCompat$Api21Impl.e(view);
                if (e != null) {
                    cfz0Var.c = true;
                    cfz0Var.b = e;
                }
                if (cfz0Var.d || cfz0Var.c) {
                    or2.e(background, cfz0Var, view.getDrawableState());
                    return;
                }
            }
            cfz0 cfz0Var2 = this.e;
            if (cfz0Var2 != null) {
                or2.e(background, cfz0Var2, view.getDrawableState());
                return;
            }
            cfz0 cfz0Var3 = this.d;
            if (cfz0Var3 != null) {
                or2.e(background, cfz0Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        cfz0 cfz0Var = this.e;
        if (cfz0Var != null) {
            return cfz0Var.a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        cfz0 cfz0Var = this.e;
        if (cfz0Var != null) {
            return cfz0Var.b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList g;
        View view = this.a;
        dfz0 e = dfz0.e(i, 0, view.getContext(), attributeSet, n4i0.ViewBackgroundHelper);
        TypedArray typedArray = e.b;
        View view2 = this.a;
        Context context = view2.getContext();
        int[] iArr = n4i0.ViewBackgroundHelper;
        TypedArray typedArray2 = e.b;
        WeakHashMap weakHashMap = b.a;
        sp31.b(view2, context, iArr, attributeSet, typedArray2, i, 0);
        try {
            if (typedArray.hasValue(n4i0.ViewBackgroundHelper_android_background)) {
                this.c = typedArray.getResourceId(n4i0.ViewBackgroundHelper_android_background, -1);
                or2 or2Var = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (or2Var) {
                    g = or2Var.a.g(i2, context2);
                }
                if (g != null) {
                    g(g);
                }
            }
            if (typedArray.hasValue(n4i0.ViewBackgroundHelper_backgroundTint)) {
                ViewCompat$Api21Impl.k(view, e.a(n4i0.ViewBackgroundHelper_backgroundTint));
            }
            if (typedArray.hasValue(n4i0.ViewBackgroundHelper_backgroundTintMode)) {
                ViewCompat$Api21Impl.l(view, vbm.c(typedArray.getInt(n4i0.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            e.g();
        } catch (Throwable th) {
            e.g();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.c = i;
        or2 or2Var = this.b;
        if (or2Var != null) {
            Context context = this.a.getContext();
            synchronized (or2Var) {
                colorStateList = or2Var.a.g(i, context);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new cfz0();
            }
            cfz0 cfz0Var = this.d;
            cfz0Var.a = colorStateList;
            cfz0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new cfz0();
        }
        cfz0 cfz0Var = this.e;
        cfz0Var.a = colorStateList;
        cfz0Var.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new cfz0();
        }
        cfz0 cfz0Var = this.e;
        cfz0Var.b = mode;
        cfz0Var.c = true;
        a();
    }
}
