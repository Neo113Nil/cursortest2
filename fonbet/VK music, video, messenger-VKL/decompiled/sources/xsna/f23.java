package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R$styleable;
import java.util.WeakHashMap;

/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: classes.dex */
public final class f23 {

    @NonNull
    public final View a;
    public vyo0 d;
    public vyo0 e;
    public vyo0 f;
    public int c = -1;
    public final d33 b = d33.a();

    public f23(@NonNull View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new vyo0();
                }
                vyo0 vyo0Var = this.f;
                vyo0Var.a = null;
                vyo0Var.d = false;
                vyo0Var.b = null;
                vyo0Var.c = false;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    vyo0Var.d = true;
                    vyo0Var.a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    vyo0Var.c = true;
                    vyo0Var.b = backgroundTintMode;
                }
                if (vyo0Var.d || vyo0Var.c) {
                    d33.e(background, vyo0Var, view.getDrawableState());
                    return;
                }
            }
            vyo0 vyo0Var2 = this.e;
            if (vyo0Var2 != null) {
                d33.e(background, vyo0Var2, view.getDrawableState());
                return;
            }
            vyo0 vyo0Var3 = this.d;
            if (vyo0Var3 != null) {
                d33.e(background, vyo0Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        vyo0 vyo0Var = this.e;
        if (vyo0Var != null) {
            return vyo0Var.a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        vyo0 vyo0Var = this.e;
        if (vyo0Var != null) {
            return vyo0Var.b;
        }
        return null;
    }

    public final void d(@Nullable AttributeSet attributeSet, int i) {
        ColorStateList f;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = R$styleable.z;
        yyo0 e = yyo0.e(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = e.b;
        View view2 = this.a;
        iut0.p(view2, view2.getContext(), iArr, attributeSet, e.b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                d33 d33Var = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (d33Var) {
                    f = d33Var.a.f(i2, context2);
                }
                if (f != null) {
                    g(f);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(e.a(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(rko.c(typedArray.getInt(2, -1), null));
            }
            e.f();
        } catch (Throwable th) {
            e.f();
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
        d33 d33Var = this.b;
        if (d33Var != null) {
            Context context = this.a.getContext();
            synchronized (d33Var) {
                colorStateList = d33Var.a.f(i, context);
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
                this.d = new vyo0();
            }
            vyo0 vyo0Var = this.d;
            vyo0Var.a = colorStateList;
            vyo0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new vyo0();
        }
        vyo0 vyo0Var = this.e;
        vyo0Var.a = colorStateList;
        vyo0Var.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new vyo0();
        }
        vyo0 vyo0Var = this.e;
        vyo0Var.b = mode;
        vyo0Var.c = true;
        a();
    }
}
