package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PopupWindowImpl.kt */
/* loaded from: classes2.dex */
public final class izb0 extends PopupWindow {
    public final Handler a;
    public iwb0 b;

    public izb0(Context context) {
        super(context);
        this.a = new Handler();
        setClippingEnabled(false);
        setFocusable(true);
        setAnimationStyle(0);
        setInputMethodMode(2);
        setBackgroundDrawable(new a());
    }

    public static s3q0 a(izb0 izb0Var) {
        izb0Var.b = null;
        super.dismiss();
        return s3q0.a;
    }

    public final void b() {
        this.a.removeCallbacksAndMessages(null);
        this.b = null;
        super.dismiss();
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        this.a.removeCallbacksAndMessages(null);
        iwb0 iwb0Var = this.b;
        if (iwb0Var != null) {
            iwb0Var.e = new gd70(this, 10);
            iwb0Var.b(true);
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view) {
        iwb0 iwb0Var = new iwb0(getContentView());
        this.b = iwb0Var;
        iwb0Var.b(false);
        super.showAsDropDown(view);
        s3q0 s3q0Var = s3q0.a;
        this.a.post(new qo4(this, 10));
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        iwb0 iwb0Var = new iwb0(getContentView());
        this.b = iwb0Var;
        iwb0Var.b(false);
        super.showAtLocation(view, i, i2, i3);
        s3q0 s3q0Var = s3q0.a;
        this.a.post(new qo4(this, 10));
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        iwb0 iwb0Var = new iwb0(getContentView());
        this.b = iwb0Var;
        iwb0Var.b(false);
        super.showAsDropDown(view, i, i2);
        s3q0 s3q0Var = s3q0.a;
        this.a.post(new qo4(this, 10));
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        iwb0 iwb0Var = new iwb0(getContentView());
        this.b = iwb0Var;
        iwb0Var.b(false);
        super.showAsDropDown(view, i, i2, i3);
        s3q0 s3q0Var = s3q0.a;
        this.a.post(new qo4(this, 10));
    }

    /* compiled from: PopupWindowImpl.kt */
    public static final class a extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
