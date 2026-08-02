package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class l8v0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ mi1 c;

    /* compiled from: ViewExt.kt */
    public static final class a implements Runnable {
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;
        public final /* synthetic */ l8v0 d;
        public final /* synthetic */ mi1 e;

        public a(View view, View view2, l8v0 l8v0Var, mi1 mi1Var) {
            this.b = view;
            this.c = view2;
            this.d = l8v0Var;
            this.e = mi1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b.isAttachedToWindow()) {
                return;
            }
            this.c.removeOnAttachStateChangeListener(this.d);
            this.e.invoke();
        }
    }

    public l8v0(View view, mi1 mi1Var) {
        this.b = view;
        this.c = mi1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.post(new a(view, this.b, this, this.c));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
