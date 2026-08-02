package xsna;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import xsna.oqx0;

/* compiled from: FullscreenDelegate.kt */
/* loaded from: classes18.dex */
public final class xxs implements wxs {
    public final Activity a;
    public dgm b;

    public xxs(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
    }

    @Override // xsna.wxs
    public final void a(View view) {
        Window window;
        Window window2;
        Activity activity = this.a;
        View decorView = (activity == null || (window2 = activity.getWindow()) == null) ? null : window2.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return;
        }
        this.b = null;
        viewGroup.removeView(view);
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        oek0 oek0Var = new oek0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var)).h(519);
    }

    @Override // xsna.wxs
    public final void b(View view, dgm dgmVar) {
        Window window;
        Window window2;
        Activity activity = this.a;
        View decorView = (activity == null || (window2 = activity.getWindow()) == null) ? null : window2.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return;
        }
        this.b = dgmVar;
        viewGroup.addView(view);
        if (activity != null) {
            activity.setRequestedOrientation(0);
        }
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        oek0 oek0Var = new oek0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        oqx0.g fVar = i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var);
        fVar.b(519);
        fVar.g(2);
    }
}
