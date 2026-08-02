package xsna;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: AuthUtils.kt */
/* loaded from: classes.dex */
public final class t65 {
    public static final bpn0 a = new bpn0(new s65(0));

    /* compiled from: AuthUtils.kt */
    public static final class a implements ViewTreeObserver.OnWindowFocusChangeListener {
        public final /* synthetic */ View b;

        public a(View view) {
            this.b = view;
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z) {
            if (z) {
                bpn0 bpn0Var = t65.a;
                View view = this.b;
                mhy.j(view);
                view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            }
        }
    }

    public static void a(View view) {
        view.requestFocus();
        if (view.hasWindowFocus()) {
            mhy.j(view);
        } else {
            view.getViewTreeObserver().addOnWindowFocusChangeListener(new a(view));
        }
    }
}
