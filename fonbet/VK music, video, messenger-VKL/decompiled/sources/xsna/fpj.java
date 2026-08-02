package xsna;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import kotlin.Pair;

/* compiled from: ContextMenuWindowImplementation.kt */
/* loaded from: classes17.dex */
public final class fpj extends PopupWindow {
    public final View a;
    public final View b;
    public final View c;
    public final boolean d;
    public final Handler e;
    public lnj f;
    public final int g;
    public final dfc h;

    public fpj(ViewGroup viewGroup, View view, View view2, View view3) {
        super(viewGroup);
        this.a = view;
        this.b = view2;
        this.c = view3;
        this.d = true;
        this.e = new Handler();
        this.g = view.getContext().getResources().getConfiguration().orientation;
        this.h = new dfc(this, 1);
        Pair pair = new Pair(Integer.valueOf(view3.getMeasuredWidth()), Integer.valueOf(view3.getMeasuredHeight()));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        setWidth(intValue);
        setHeight(intValue2);
        setFocusable(true);
        setAnimationStyle(0);
        setBackgroundDrawable(new a());
        setInputMethodMode(2);
    }

    public static s3q0 a(fpj fpjVar) {
        fpjVar.f = null;
        super.dismiss();
        return s3q0.a;
    }

    public static s3q0 b(fpj fpjVar, View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        return s3q0.a;
    }

    public static s3q0 c(fpj fpjVar, View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
        return s3q0.a;
    }

    public static s3q0 d(View view, fpj fpjVar) {
        super.showAsDropDown(view);
        return s3q0.a;
    }

    public static s3q0 e(fpj fpjVar, View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
        return s3q0.a;
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        this.a.removeOnLayoutChangeListener(this.h);
        this.e.removeCallbacksAndMessages(null);
        lnj lnjVar = this.f;
        if (lnjVar == null || !lnjVar.c()) {
            super.dismiss();
        } else {
            lnjVar.g = new v6(this, 29);
            lnjVar.b(true);
        }
    }

    public final void f(gzs<s3q0> gzsVar) {
        Window window;
        View decorView;
        View view = this.a;
        View view2 = this.b;
        View view3 = this.c;
        lnj lnjVar = new lnj(view, view2, view3);
        this.f = lnjVar;
        lnjVar.b(false);
        view.addOnLayoutChangeListener(this.h);
        view.addOnAttachStateChangeListener(new b(view, this));
        Activity h = e3m.h(view.getContext());
        if (h != null && (window = h.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            view3.setSystemUiVisibility(decorView.getSystemUiVisibility());
        }
        gzsVar.invoke();
        this.e.post(new sx3(this, 4));
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view) {
        f(new fk(4, this, view));
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(final View view, final int i, final int i2, final int i3) {
        f(new gzs() { // from class: xsna.dpj
            @Override // xsna.gzs
            public final Object invoke() {
                return fpj.b(fpj.this, view, i, i2, i3);
            }
        });
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(final View view, final int i, final int i2) {
        f(new gzs() { // from class: xsna.epj
            @Override // xsna.gzs
            public final Object invoke() {
                return fpj.c(fpj.this, view, i, i2);
            }
        });
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(final View view, final int i, final int i2, final int i3) {
        f(new gzs() { // from class: xsna.cpj
            @Override // xsna.gzs
            public final Object invoke() {
                return fpj.e(fpj.this, view, i, i2, i3);
            }
        });
    }

    /* compiled from: ContextMenuWindowImplementation.kt */
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

    /* compiled from: ViewExt.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ fpj c;

        public b(View view, fpj fpjVar) {
            this.b = view;
            this.c = fpjVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            this.c.dismiss();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
