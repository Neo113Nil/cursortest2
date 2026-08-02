package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.navigation.NavigationBarView;
import defpackage.n4i0;
import defpackage.vw;

/* loaded from: classes10.dex */
public abstract class ActionBar {

    public static abstract class a {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public void c(boolean z) {
    }

    public abstract int d();

    public Context e() {
        return null;
    }

    public abstract void f();

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public void i() {
    }

    public void j() {
    }

    public boolean k(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean l(KeyEvent keyEvent) {
        return false;
    }

    public boolean m() {
        return false;
    }

    public abstract void n(ColorDrawable colorDrawable);

    public void o(boolean z) {
    }

    public abstract void p(boolean z);

    public abstract void q(boolean z);

    public void r(Drawable drawable) {
    }

    public void s(boolean z) {
    }

    public abstract void t(CharSequence charSequence);

    public void u(CharSequence charSequence) {
    }

    public abstract void v();

    public vw w(h hVar) {
        return null;
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int gravity;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4i0.ActionBarLayout);
            this.gravity = obtainStyledAttributes.getInt(n4i0.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = NavigationBarView.ITEM_GRAVITY_START_CENTER;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.gravity = i3;
        }

        public LayoutParams(int i) {
            this(-2, -1, i);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.gravity = 0;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }
    }
}
