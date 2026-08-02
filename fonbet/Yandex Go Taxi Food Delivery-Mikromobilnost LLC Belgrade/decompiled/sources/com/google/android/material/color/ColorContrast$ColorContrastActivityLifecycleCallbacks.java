package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.app.UiModeManager$ContrastChangeListener;
import android.os.Build;
import android.os.Bundle;
import defpackage.odc;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes11.dex */
class ColorContrast$ColorContrastActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private final Set<Activity> activitiesInStack = new LinkedHashSet();
    private final odc colorContrastOptions;
    private UiModeManager$ContrastChangeListener contrastChangeListener;

    public ColorContrast$ColorContrastActivityLifecycleCallbacks(odc odcVar) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.activitiesInStack.remove(activity);
        UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
        if (uiModeManager == null || this.contrastChangeListener == null || !this.activitiesInStack.isEmpty()) {
            return;
        }
        uiModeManager.removeContrastChangeListener(this.contrastChangeListener);
        this.contrastChangeListener = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        int i;
        UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
        if (uiModeManager != null && this.activitiesInStack.isEmpty() && this.contrastChangeListener == null) {
            this.contrastChangeListener = new UiModeManager$ContrastChangeListener() { // from class: com.google.android.material.color.ColorContrast$ColorContrastActivityLifecycleCallbacks.1
                public void onContrastChanged(float f) {
                    Iterator it = ColorContrast$ColorContrastActivityLifecycleCallbacks.this.activitiesInStack.iterator();
                    while (it.hasNext()) {
                        ((Activity) it.next()).recreate();
                    }
                }
            };
            uiModeManager.addContrastChangeListener(activity.getApplicationContext().getMainExecutor(), this.contrastChangeListener);
        }
        this.activitiesInStack.add(activity);
        if (uiModeManager == null || (i = Build.VERSION.SDK_INT) < 34) {
            return;
        }
        UiModeManager uiModeManager2 = (UiModeManager) activity.getSystemService("uimode");
        if (i < 34 || uiModeManager2 == null) {
            return;
        }
        uiModeManager2.getContrast();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
