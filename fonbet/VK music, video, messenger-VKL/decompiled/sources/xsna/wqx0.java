package xsna;

import android.view.View;

/* compiled from: WindowInsetsExt.kt */
/* loaded from: classes17.dex */
public final class wqx0 {
    public static final int a(bqx0 bqx0Var) {
        return bqx0Var.a.i(9).b;
    }

    public static final void b(View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new a());
        }
    }

    public static final h4x c(bqx0 bqx0Var) {
        return bqx0Var.a.i(9);
    }

    /* compiled from: WindowInsetsExt.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
