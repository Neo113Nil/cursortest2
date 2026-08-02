package xsna;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: UiTrackerDebugViewer.kt */
/* loaded from: classes17.dex */
public final class k0q0 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ l0q0 b;
    public final /* synthetic */ Context c;

    public k0q0(l0q0 l0q0Var, Context context) {
        this.b = l0q0Var;
        this.c = context;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        l0q0 l0q0Var = this.b;
        e7l e7lVar = l0q0Var.a;
        if (e7lVar != null) {
            l0q0Var.b.removeView(e7lVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Context context = this.c;
        if (!Settings.canDrawOverlays(context)) {
            Snackbar h = Snackbar.h(activity.findViewById(R.id.content), context.getResources().getString(com.vkontakte.android.R.string.give_permission));
            h.i(context.getResources().getString(com.vkontakte.android.R.string.give_permission_btn), new og8(context, 8));
            BaseTransientBottomBar.g gVar = h.i;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
            marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(com.vkontakte.android.R.dimen.debug_view_snackbar_margin) + marginLayoutParams.bottomMargin;
            gVar.setLayoutParams(marginLayoutParams);
            h.j();
            return;
        }
        l0q0 l0q0Var = this.b;
        if (l0q0Var.a == null) {
            l0q0Var.a = new e7l(context);
        }
        e7l e7lVar = l0q0Var.a;
        if (e7lVar != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, 24, -3);
            layoutParams.gravity = 8388659;
            layoutParams.x = 0;
            layoutParams.y = 100;
            l0q0Var.b.addView(e7lVar, layoutParams);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
