package com.lightside.slab;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import defpackage.cr60;
import defpackage.j651;
import defpackage.pdb1;
import defpackage.pey;
import defpackage.yq60;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0011\u0010\nJ\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\bH\u0014¢\u0006\u0004\b\"\u0010\nJ!\u0010%\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010*J\u0017\u0010-\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b-\u0010*J\u0017\u0010.\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010\u0007J\u0017\u0010/\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u0010\u0007J\u0017\u00100\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u0010\u0007J\u0017\u00101\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u0010\u0007J\u001f\u00103\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u00020#H\u0016¢\u0006\u0004\b3\u0010&J\u0017\u00104\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u0010\u0007J\u0017\u00107\u001a\u00020\b2\u0006\u00106\u001a\u000205H\u0014¢\u0006\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\f0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R8\u0010?\u001a&\u0012\f\u0012\n >*\u0004\u0018\u00010\f0\f >*\u0012\u0012\f\u0012\n >*\u0004\u0018\u00010\f0\f\u0018\u00010=0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR$\u0010F\u001a\u00020D2\u0006\u0010E\u001a\u00020D8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010HR$\u0010I\u001a\u00020D2\u0006\u0010E\u001a\u00020D8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\bI\u0010H¨\u0006J"}, d2 = {"Lcom/lightside/slab/WindowEventsHookView;", "Landroid/view/View;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Lzy11;", "dispatchResumeChanged", "()V", "dispatchStartChanged", "Lj651;", "listener", "addListener", "(Lj651;)V", "removeListener", "onAttachedToWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "l", "t", "r", "b", "layout", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "dispatchDraw", "onDetachedFromWindow", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "Lpey;", "owner", "onStart", "(Lpey;)V", "onResume", "onPause", "onStop", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/app/Activity;", "Lcr60;", "observerList", "Lcr60;", "Lyq60;", "kotlin.jvm.PlatformType", "observerListIterator", "Lyq60;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "", "value", "isActivityStarted", "Z", "()Z", "isActivityResumed", "slab_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowEventsHookView extends View implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
    private final Activity activity;
    private boolean isActivityResumed;
    private boolean isActivityStarted;
    private Lifecycle lifecycle;
    private final cr60 observerList;
    private final yq60 observerListIterator;

    public WindowEventsHookView(Activity activity) {
        super(activity);
        this.activity = activity;
        cr60 cr60Var = new cr60();
        this.observerList = cr60Var;
        this.observerListIterator = cr60Var.e();
        setWillNotDraw(true);
    }

    private final void dispatchResumeChanged() {
        this.observerListIterator.rewind();
        while (this.observerListIterator.hasNext()) {
            ((j651) this.observerListIterator.next()).onActivityResumeChanged(this.isActivityResumed);
        }
    }

    private final void dispatchStartChanged() {
        this.observerListIterator.rewind();
        while (this.observerListIterator.hasNext()) {
            ((j651) this.observerListIterator.next()).onActivityStartChanged(this.isActivityStarted);
        }
    }

    public final void addListener(j651 listener) {
        this.observerList.b(listener);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    /* renamed from: isActivityResumed, reason: from getter */
    public final boolean getIsActivityResumed() {
        return this.isActivityResumed;
    }

    /* renamed from: isActivityStarted, reason: from getter */
    public final boolean getIsActivityStarted() {
        return this.isActivityStarted;
    }

    @Override // android.view.View
    public void layout(int l, int t, int r, int b) {
        super.layout(l, t, r, b);
        this.observerListIterator.rewind();
        while (this.observerListIterator.hasNext()) {
            ((j651) this.observerListIterator.next()).onLayout();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.activity != activity) {
            return;
        }
        this.isActivityResumed = false;
        dispatchResumeChanged();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (this.activity != activity) {
            return;
        }
        this.isActivityResumed = true;
        dispatchResumeChanged();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.activity != activity) {
            return;
        }
        this.isActivityStarted = true;
        dispatchStartChanged();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.activity != activity) {
            return;
        }
        this.isActivityStarted = false;
        dispatchStartChanged();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Activity b = pdb1.b(getContext());
        if (b instanceof FragmentActivity) {
            Lifecycle lifecycle = ((FragmentActivity) b).getLifecycle();
            this.lifecycle = lifecycle;
            Lifecycle.State b2 = lifecycle.b();
            this.isActivityStarted = b2.a(Lifecycle.State.STARTED);
            this.isActivityResumed = b2.a(Lifecycle.State.RESUMED);
            this.lifecycle.a(this);
            return;
        }
        boolean z = false;
        boolean z2 = getWindowVisibility() == 0;
        this.isActivityStarted = z2;
        if (z2 && this.activity.getWindow().isActive()) {
            z = true;
        }
        this.isActivityResumed = z;
        b.getApplication().registerActivityLifecycleCallbacks(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        this.observerListIterator.rewind();
        while (this.observerListIterator.hasNext()) {
            ((j651) this.observerListIterator.next()).onConfigurationChanged(newConfig);
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
        this.activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        this.isActivityStarted = false;
        this.isActivityResumed = false;
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            lifecycle.d(this);
            this.lifecycle = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(pey owner) {
        if (this.isActivityResumed) {
            this.isActivityResumed = false;
            dispatchResumeChanged();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(pey owner) {
        if (this.isActivityResumed) {
            return;
        }
        this.isActivityResumed = true;
        dispatchResumeChanged();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(pey owner) {
        if (this.isActivityStarted) {
            return;
        }
        this.isActivityStarted = true;
        dispatchStartChanged();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(pey owner) {
        if (this.isActivityStarted) {
            this.isActivityStarted = false;
            dispatchStartChanged();
        }
    }

    public final void removeListener(j651 listener) {
        this.observerList.d(listener);
    }
}
