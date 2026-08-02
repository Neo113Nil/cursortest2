package xsna;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.vk.log.L;
import com.vk.toggle.Features;

/* compiled from: DebugOverlayViewer.kt */
/* loaded from: classes11.dex */
public final class t6l implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ Context b;

    public t6l(Context context) {
        this.b = context;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        try {
            if (com.vk.toggle.b.A.a(Features.Type.FEATURE_DEBUG_PANEL)) {
                ViewGroup viewGroup = (ViewGroup) u6l.c.getValue();
                if (viewGroup.getParent() == null) {
                    return;
                }
                WindowManager windowManager = u6l.b;
                if (windowManager == null) {
                    windowManager = null;
                }
                windowManager.removeView(viewGroup);
            }
        } catch (Exception e) {
            L.i(e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Context context = this.b;
        try {
            if (com.vk.toggle.b.A.a(Features.Type.FEATURE_DEBUG_PANEL)) {
                Application application = u6l.a;
                if (!Settings.canDrawOverlays(context)) {
                    u6l.a(activity, context);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) u6l.c.getValue();
                WindowManager windowManager = null;
                if (viewGroup.getParent() != null) {
                    WindowManager windowManager2 = u6l.b;
                    if (windowManager2 == null) {
                        windowManager2 = null;
                    }
                    windowManager2.removeView(viewGroup);
                }
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, 24, -3);
                layoutParams.gravity = 8388659;
                layoutParams.x = 0;
                layoutParams.y = 100;
                WindowManager windowManager3 = u6l.b;
                if (windowManager3 != null) {
                    windowManager = windowManager3;
                }
                windowManager.addView(viewGroup, layoutParams);
            }
        } catch (Exception e) {
            L.i(e);
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
