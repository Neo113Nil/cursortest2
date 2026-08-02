package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import com.vkontakte.android.R;
import xsna.lrv0;

/* compiled from: OverlayWindow.kt */
/* loaded from: classes6.dex */
public final class u390 implements fcn, lrv0.a {
    public final View b;
    public boolean c;
    public PopupWindow.OnDismissListener d;
    public jzb0 e;
    public int f = 48;
    public final s390 g = new s390(this, 0);
    public final Context h;
    public final v1q0 i;
    public int j;
    public boolean k;

    public u390(View view, n0q0 n0q0Var) {
        this.b = view;
        this.h = view.getContext();
        v1q0 v1q0Var = new v1q0(n0q0Var, view, c(), a());
        this.i = v1q0Var;
        v1q0Var.setAnimationStyle(-1);
        v1q0Var.setBackgroundDrawable(new ColorDrawable(0));
        v1q0Var.setOutsideTouchable(true);
        v1q0Var.setFocusable(true);
        v1q0Var.setInputMethodMode(2);
        v1q0Var.setWindowLayoutType(1002);
        dhr0.a.a(this);
        v1q0Var.c = new PopupWindow.OnDismissListener() { // from class: xsna.t390
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                Window window;
                u390 u390Var = u390.this;
                Context context = u390Var.h;
                PopupWindow.OnDismissListener onDismissListener = u390Var.d;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss();
                }
                u390Var.b.removeOnLayoutChangeListener(u390Var.g);
                if (u390Var.k) {
                    Activity h = e3m.h(context);
                    if (h != null && (window = h.getWindow()) != null) {
                        window.setStatusBarColor(u390Var.j);
                    }
                    u390Var.k = false;
                }
                if (context instanceof ey50) {
                    ((ey50) context).Y().H(u390Var);
                }
            }
        };
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    public final int a() {
        Context context;
        Activity h;
        if (!this.c || (h = e3m.h((context = this.h))) == null || p90.f(h)) {
            return -1;
        }
        Integer num = null;
        if (iah0.s(context)) {
            jzb0 jzb0Var = this.e;
            if (jzb0Var != null) {
                num = jzb0Var.a;
            }
        } else {
            jzb0 jzb0Var2 = this.e;
            if (jzb0Var2 != null) {
                num = jzb0Var2.c;
            }
        }
        return num != null ? num.intValue() : iah0.f().heightPixels;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        dismiss();
    }

    public final int c() {
        Context context;
        Activity h;
        if (this.c && (h = e3m.h((context = this.h))) != null && !p90.f(h)) {
            Integer num = null;
            if (iah0.s(context)) {
                jzb0 jzb0Var = this.e;
                if (jzb0Var != null) {
                    num = jzb0Var.b;
                }
            } else {
                jzb0 jzb0Var2 = this.e;
                if (jzb0Var2 != null) {
                    num = jzb0Var2.d;
                }
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return -1;
    }

    public final void d() {
        Window window;
        Context context = this.h;
        Activity h = e3m.h(context);
        if (h == null || (window = h.getWindow()) == null) {
            return;
        }
        this.j = window.getStatusBarColor();
        window.setStatusBarColor(dhr0.Y(R.attr.vk_ui_background, context));
        this.k = true;
    }

    @Override // xsna.fcn
    public final void dismiss() {
        Window window;
        if (this.k) {
            Activity h = e3m.h(this.h);
            if (h != null && (window = h.getWindow()) != null) {
                window.setStatusBarColor(this.j);
            }
            this.k = false;
        }
        this.i.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(View view) {
        Window window;
        d();
        Context context = this.h;
        if (view == null) {
            Activity h = e3m.h(context);
            view = (h == null || (window = h.getWindow()) == null) ? null : window.getDecorView();
            if (view == null) {
                return;
            }
        }
        this.b.addOnLayoutChangeListener(this.g);
        f();
        this.i.showAtLocation(view, this.f, 0, 0);
        if (context instanceof ey50) {
            ((ey50) context).Y().S(this);
        }
    }

    public final void f() {
        int a = a();
        v1q0 v1q0Var = this.i;
        v1q0Var.setHeight(a);
        v1q0Var.setWidth(c());
        if (v1q0Var.isShowing()) {
            v1q0Var.update(c(), a());
        }
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // xsna.lrv0.a
    public final void xb() {
        d();
        dhr0.W(this.b);
    }
}
