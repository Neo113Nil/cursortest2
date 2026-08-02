package xsna;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import java.util.HashSet;
import java.util.WeakHashMap;
import xsna.iut0;

/* compiled from: VideoCommentReplyOverlay.kt */
/* loaded from: classes4.dex */
public final class sbs0 {
    public final int a = -16777216;
    public final float b = 0.4f;
    public final View c;
    public final gzs<s3q0> d;
    public u390 e;
    public io.reactivex.rxjava3.disposables.c f;
    public io.reactivex.rxjava3.disposables.c g;

    public sbs0(View view, gzs gzsVar) {
        this.c = view;
        this.d = gzsVar;
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new rbs0(view, this));
        } else {
            b();
        }
    }

    public final void a(View view) {
        int i = f4m.e(view).top;
        u390 u390Var = this.e;
        if (u390Var != null) {
            Context context = view.getContext();
            HashSet hashSet = iah0.a;
            u390Var.e = new jzb0(14, Integer.valueOf(i - fnj.a(context)), null);
            u390Var.f();
        }
    }

    public final void b() {
        v1q0 v1q0Var;
        u390 u390Var;
        u390 u390Var2 = this.e;
        if (u390Var2 != null && (v1q0Var = u390Var2.i) != null && v1q0Var.isShowing() && (u390Var = this.e) != null) {
            u390Var.dismiss();
        }
        this.e = null;
    }

    public final void c() {
        b();
        final View view = this.c;
        if (view.getVisibility() == 0) {
            View view2 = new View(view.getContext());
            view2.setOnClickListener(new p01(this, 13));
            view2.setBackgroundColor(this.a);
            view2.setAlpha(this.b);
            u390 u390Var = new u390(view2, null);
            u390Var.f = 48;
            u390Var.c = true;
            u390Var.f();
            v1q0 v1q0Var = u390Var.i;
            v1q0Var.setOutsideTouchable(false);
            v1q0Var.setFocusable(false);
            v1q0Var.setInputMethodMode(1);
            v1q0Var.setWindowLayoutType(1003);
            final d4n d4nVar = new d4n(this, u390Var);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.h.a(view, d4nVar);
            Object parent = view.getParent();
            View view3 = parent instanceof View ? (View) parent : null;
            int width = view3 != null ? view3.getWidth() : 0;
            int i = f4m.e(view).top;
            Context context = view.getContext();
            HashSet hashSet = iah0.a;
            u390Var.e = new jzb0(6, Integer.valueOf(i - fnj.a(context)), Integer.valueOf(width + (view3 != null ? bwt0.N(view3) : 0)));
            u390Var.f();
            u390Var.d = new PopupWindow.OnDismissListener() { // from class: xsna.obs0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                    iut0.h.e(view, d4nVar);
                    sbs0 sbs0Var = this;
                    io.reactivex.rxjava3.disposables.c cVar = sbs0Var.f;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    sbs0Var.f = null;
                    io.reactivex.rxjava3.disposables.c cVar2 = sbs0Var.g;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    sbs0Var.g = null;
                    int i2 = ify.a;
                    if (ify.e(ify.c)) {
                        Context context2 = sbs0Var.c.getContext();
                        mhy.b(context2 != null ? e3m.h(context2) : null);
                    }
                }
            };
            this.e = u390Var;
            a(view);
            io.reactivex.rxjava3.core.q N = io.reactivex.rxjava3.core.q.N(new io.reactivex.rxjava3.internal.operators.observable.q(new q9f0(view, 5)), new io.reactivex.rxjava3.internal.operators.observable.q(new wcl0(3)));
            N.getClass();
            this.f = hg1.h(N.M(io.reactivex.rxjava3.internal.functions.a.a, false, 2, io.reactivex.rxjava3.core.g.b), new vfo0(2, this, view));
            this.g = hg1.h(new io.reactivex.rxjava3.internal.operators.observable.q(new n5j0(view, 8)), new b8e0(this, 19));
            u390 u390Var2 = this.e;
            if (u390Var2 != null) {
                u390Var2.e(view);
            }
        }
    }
}
