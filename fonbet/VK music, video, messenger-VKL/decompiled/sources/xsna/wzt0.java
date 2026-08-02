package xsna;

import android.view.View;

/* compiled from: ViewPostDelayedJob.kt */
/* loaded from: classes8.dex */
public final class wzt0 {
    public final View a;
    public final Runnable b;
    public final boolean c;
    public final a d;
    public boolean e;

    public wzt0(View view, Runnable runnable, long j, boolean z) {
        this.a = view;
        this.b = runnable;
        this.c = z;
        a aVar = new a();
        this.d = aVar;
        boolean postDelayed = view.postDelayed(runnable, j);
        this.e = postDelayed;
        if (postDelayed) {
            view.addOnAttachStateChangeListener(aVar);
        }
    }

    public final void a() {
        if (this.e) {
            Runnable runnable = this.b;
            View view = this.a;
            view.removeCallbacks(runnable);
            view.removeOnAttachStateChangeListener(this.d);
            this.e = false;
        }
    }

    /* compiled from: ViewPostDelayedJob.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            wzt0 wzt0Var = wzt0.this;
            if (wzt0Var.c) {
                wzt0Var.b.run();
            }
            wzt0Var.a();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
