package com.lightside.slab;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.j651;
import defpackage.lns0;
import defpackage.mmp0;
import defpackage.pdb1;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0016\u0010(\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001c¨\u0006)"}, d2 = {"Lcom/lightside/slab/SlabController;", "Landroid/view/View$OnAttachStateChangeListener;", "Lj651;", "Llns0;", "targetLifecycle", "", "delayAttachToLayout", "<init>", "(Llns0;Z)V", "Lzy11;", "dispatchAttached", "()V", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "onLayout", "resumed", "onActivityResumeChanged", "(Z)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "started", "onActivityStartChanged", "Llns0;", "Z", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Lcom/lightside/slab/WindowEventsHookView;", "windowEventsHookView", "Lcom/lightside/slab/WindowEventsHookView;", "value", "isAttached", "()Z", "isActivityStarted", "isActivityResumed", "isContainerVisible", "slab_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public class SlabController implements View.OnAttachStateChangeListener, j651 {
    private final boolean delayAttachToLayout;
    private boolean isActivityResumed;
    private boolean isActivityStarted;
    private boolean isAttached;
    private boolean isContainerVisible;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final lns0 targetLifecycle;
    private WindowEventsHookView windowEventsHookView;

    public SlabController(lns0 lns0Var, boolean z) {
        this.targetLifecycle = lns0Var;
        this.delayAttachToLayout = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchAttached() {
        this.mainHandler.removeCallbacksAndMessages(null);
        if (this.isAttached) {
            return;
        }
        this.isAttached = true;
        this.targetLifecycle.a();
        if (this.isContainerVisible) {
            if (this.isActivityStarted) {
                this.targetLifecycle.onStart();
            }
            if (this.isActivityResumed) {
                this.targetLifecycle.onResume();
            }
        }
    }

    /* renamed from: isAttached, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    @Override // defpackage.j651
    public void onActivityResumeChanged(boolean resumed) {
        if (this.isActivityResumed == resumed) {
            return;
        }
        this.isActivityResumed = resumed;
        if (this.isAttached && this.isContainerVisible) {
            lns0 lns0Var = this.targetLifecycle;
            if (resumed) {
                lns0Var.onResume();
            } else {
                lns0Var.onPause();
            }
        }
    }

    @Override // defpackage.j651
    public void onActivityStartChanged(boolean started) {
        if (this.isActivityStarted == started) {
            return;
        }
        this.isActivityStarted = started;
        if (this.isAttached) {
            if (this.isContainerVisible) {
                lns0 lns0Var = this.targetLifecycle;
                if (started) {
                    lns0Var.onStart();
                } else {
                    lns0Var.onStop();
                }
            }
            this.isActivityStarted = started;
        }
    }

    @Override // defpackage.j651
    public void onConfigurationChanged(Configuration newConfig) {
        if (this.isContainerVisible && this.isActivityResumed) {
            this.targetLifecycle.getClass();
        }
    }

    @Override // defpackage.j651
    public void onLayout() {
        dispatchAttached();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        WindowEventsHookView windowEventsHookView;
        if (this.windowEventsHookView != null) {
            return;
        }
        Object tag = v.getTag(com.yandex.passport.lightside.slab.a.slab_window_events_hook_view);
        if (tag instanceof WindowEventsHookView) {
            windowEventsHookView = (WindowEventsHookView) tag;
        } else {
            Activity b = pdb1.b(v.getContext());
            WindowEventsHookView windowEventsHookView2 = (WindowEventsHookView) b.findViewById(com.yandex.passport.lightside.slab.a.slab_window_events_hook_view);
            if (windowEventsHookView2 == null) {
                windowEventsHookView2 = new WindowEventsHookView(b);
                windowEventsHookView2.setId(com.yandex.passport.lightside.slab.a.slab_window_events_hook_view);
                b.addContentView(windowEventsHookView2, new FrameLayout.LayoutParams(0, 0));
            }
            windowEventsHookView = windowEventsHookView2;
            v.setTag(com.yandex.passport.lightside.slab.a.slab_window_events_hook_view, windowEventsHookView);
        }
        windowEventsHookView.addListener(this);
        this.isActivityStarted = windowEventsHookView.getIsActivityStarted();
        this.isActivityResumed = windowEventsHookView.getIsActivityResumed();
        this.isContainerVisible = true;
        this.windowEventsHookView = windowEventsHookView;
        if (this.delayAttachToLayout) {
            this.mainHandler.post(new mmp0(22, this));
        } else {
            dispatchAttached();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        this.mainHandler.removeCallbacksAndMessages(null);
        if (this.windowEventsHookView == null) {
            return;
        }
        if (this.isAttached) {
            if (this.isContainerVisible) {
                if (this.isActivityResumed) {
                    this.targetLifecycle.onPause();
                }
                if (this.isActivityStarted) {
                    this.targetLifecycle.onStop();
                }
            }
            this.isActivityResumed = false;
            this.isActivityStarted = false;
        }
        if (this.isAttached) {
            this.targetLifecycle.onDetach();
            this.isAttached = false;
        }
        WindowEventsHookView windowEventsHookView = this.windowEventsHookView;
        if (windowEventsHookView != null) {
            windowEventsHookView.removeListener(this);
        }
        this.windowEventsHookView = null;
    }
}
