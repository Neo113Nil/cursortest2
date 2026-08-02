package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import defpackage.n751;
import defpackage.o751;
import defpackage.p751;
import defpackage.q5z;
import defpackage.q751;
import defpackage.va90;
import defpackage.vez0;

/* loaded from: classes11.dex */
public final class d extends BottomSheetBehavior.a {
    public final Boolean a;
    public final n751 b;
    public Window c;
    public boolean d;

    public d(FrameLayout frameLayout, n751 n751Var) {
        this.b = n751Var;
        MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.D(frameLayout).C;
        ColorStateList fillColor = materialShapeDrawable != null ? materialShapeDrawable.getFillColor() : frameLayout.getBackgroundTintList();
        if (fillColor != null) {
            this.a = Boolean.valueOf(vez0.F(fillColor.getDefaultColor()));
            return;
        }
        ColorStateList y = q5z.y(frameLayout.getBackground());
        Integer valueOf = y != null ? Integer.valueOf(y.getDefaultColor()) : null;
        if (valueOf != null) {
            this.a = Boolean.valueOf(vez0.F(valueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    public final void a(View view) {
        int top = view.getTop();
        n751 n751Var = this.b;
        if (top < n751Var.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                boolean booleanValue = bool == null ? this.d : bool.booleanValue();
                va90 va90Var = new va90(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var)).U(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), n751Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                va90 va90Var2 = new va90(window2.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new q751(window2, va90Var2) : i2 >= 30 ? new p751(window2, va90Var2) : new o751(window2, va90Var2)).U(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void b(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            va90 va90Var = new va90(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            this.d = (i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var)).F();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onLayout(View view) {
        a(view);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onSlide(View view, float f) {
        a(view);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onStateChanged(View view, int i) {
        a(view);
    }
}
