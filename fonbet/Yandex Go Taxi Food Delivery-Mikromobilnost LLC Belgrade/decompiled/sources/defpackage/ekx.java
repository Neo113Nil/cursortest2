package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.w;

/* loaded from: classes2.dex */
public final class ekx implements oey {
    public final FragmentActivity a;
    public final vfc0 b;
    public bkx c;
    public final o6 w = new o6(7, this);

    public ekx(FragmentActivity fragmentActivity, vfc0 vfc0Var) {
        this.a = fragmentActivity;
        this.b = vfc0Var;
        fragmentActivity.getLifecycle().a(this);
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public final void onLifecyclePause() {
        View decorView;
        ViewTreeObserver viewTreeObserver;
        Window window = this.a.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.w);
        }
        this.c = null;
    }

    @w(Lifecycle.Event.ON_RESUME)
    public final void onLifecycleResume() {
        View decorView;
        ViewTreeObserver viewTreeObserver;
        Window window = this.a.getWindow();
        o6 o6Var = this.w;
        if (window != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(o6Var);
        }
        o6Var.onGlobalLayout();
    }
}
