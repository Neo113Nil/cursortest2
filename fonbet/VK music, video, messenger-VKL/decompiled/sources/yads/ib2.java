package yads;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes10.dex */
public final class ib2 implements gb2 {
    public final Activity a;
    public final w1 b;
    public final OnBackInvokedCallback c = new OnBackInvokedCallback() { // from class: xsna.s0z0
        public final void onBackInvoked() {
            yads.ib2.a(yads.ib2.this);
        }
    };

    public ib2(Activity activity, w1 w1Var) {
        this.a = activity;
        this.b = w1Var;
    }

    public static final void a(ib2 ib2Var) {
        w1 w1Var = ib2Var.b;
        if (w1Var == null || !w1Var.c.d()) {
            return;
        }
        ib2Var.a.finish();
    }

    @Override // yads.gb2
    public final void destroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = this.a.getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.c);
    }

    @Override // yads.gb2
    public final void a() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = this.a.getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.c);
    }
}
