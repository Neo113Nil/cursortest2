package com.yandex.bricks;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import defpackage.i651;
import defpackage.pey;
import defpackage.vq60;
import defpackage.xq60;
import defpackage.z83;
import defpackage.zq60;

/* loaded from: classes.dex */
class WindowEventsHookView extends View implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
    private final Activity mActivity;
    private boolean mActivityResumed;
    private boolean mActivityStarted;
    private Lifecycle mLifecycle;
    private final zq60 mObserverList;
    private final xq60 mObserverListIterator;

    public WindowEventsHookView(Activity activity) {
        super(activity);
        zq60 zq60Var = new zq60();
        this.mObserverList = zq60Var;
        this.mObserverListIterator = new vq60(zq60Var);
        this.mActivity = activity;
        setWillNotDraw(true);
    }

    private void dispatchResumeChanged() {
        this.mObserverListIterator.rewind();
        while (this.mObserverListIterator.hasNext()) {
            ((i651) this.mObserverListIterator.next()).onActivityResumeChanged(this.mActivityResumed);
        }
    }

    private void dispatchStartChanged() {
        this.mObserverListIterator.rewind();
        while (this.mObserverListIterator.hasNext()) {
            ((i651) this.mObserverListIterator.next()).onActivityStartChanged(this.mActivityStarted);
        }
    }

    public void addListener(i651 i651Var) {
        this.mObserverList.b(i651Var);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    public void dispatchOnActivityResult(String str, int i, int i2, Intent intent) {
        this.mObserverListIterator.rewind();
        while (this.mObserverListIterator.hasNext()) {
            i651 i651Var = (i651) this.mObserverListIterator.next();
            if (str.equals(i651Var.getUniqueInstanceId())) {
                i651Var.onActivityResult(i, i2, intent);
            }
        }
    }

    public void dispatchOnRequestPermissionsResult(String str, int i, String[] strArr, int[] iArr) {
        this.mObserverListIterator.rewind();
        while (this.mObserverListIterator.hasNext()) {
            i651 i651Var = (i651) this.mObserverListIterator.next();
            if (str.equals(i651Var.getUniqueInstanceId())) {
                i651Var.onRequestPermissionsResult(i, strArr, iArr);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public boolean isActivityResumed() {
        z83.d(getParent(), null);
        return this.mActivityResumed;
    }

    public boolean isActivityStarted() {
        z83.d(getParent(), null);
        return this.mActivityStarted;
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        this.mObserverListIterator.rewind();
        while (this.mObserverListIterator.hasNext()) {
            ((i651) this.mObserverListIterator.next()).onLayout();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.mActivity != activity) {
            return;
        }
        this.mActivityResumed = false;
        dispatchResumeChanged();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (this.mActivity != activity) {
            return;
        }
        this.mActivityResumed = true;
        dispatchResumeChanged();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.mActivity != activity) {
            return;
        }
        this.mActivityStarted = true;
        dispatchStartChanged();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.mActivity != activity) {
            return;
        }
        this.mActivityStarted = false;
        dispatchStartChanged();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Activity a = e.a(getContext());
        if (a instanceof FragmentActivity) {
            Lifecycle lifecycle = ((FragmentActivity) a).getLifecycle();
            this.mLifecycle = lifecycle;
            Lifecycle.State b = lifecycle.b();
            this.mActivityStarted = b.a(Lifecycle.State.STARTED);
            this.mActivityResumed = b.a(Lifecycle.State.RESUMED);
            this.mLifecycle.a(this);
            return;
        }
        boolean z = false;
        boolean z2 = getWindowVisibility() == 0;
        this.mActivityStarted = z2;
        if (z2 && this.mActivity.getWindow().isActive()) {
            z = true;
        }
        this.mActivityResumed = z;
        a.getApplication().registerActivityLifecycleCallbacks(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.mObserverListIterator.rewind();
        while (this.mObserverListIterator.hasNext()) {
            ((i651) this.mObserverListIterator.next()).onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onCreate(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onDestroy(pey peyVar) {
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.mActivity.getApplication().unregisterActivityLifecycleCallbacks(this);
        this.mActivityStarted = false;
        this.mActivityResumed = false;
        Lifecycle lifecycle = this.mLifecycle;
        if (lifecycle != null) {
            lifecycle.d(this);
            this.mLifecycle = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(pey peyVar) {
        if (this.mActivityResumed) {
            this.mActivityResumed = false;
            dispatchResumeChanged();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(pey peyVar) {
        if (this.mActivityResumed) {
            return;
        }
        this.mActivityResumed = true;
        dispatchResumeChanged();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(pey peyVar) {
        if (this.mActivityStarted) {
            return;
        }
        this.mActivityStarted = true;
        dispatchStartChanged();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(pey peyVar) {
        if (this.mActivityStarted) {
            this.mActivityStarted = false;
            dispatchStartChanged();
        }
    }

    public void removeListener(i651 i651Var) {
        this.mObserverList.d(i651Var);
    }
}
