package com.yandex.bricks;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import defpackage.ak6;
import defpackage.bju;
import defpackage.cju;
import defpackage.egh0;
import defpackage.i651;

/* loaded from: classes11.dex */
class BrickController implements View.OnAttachStateChangeListener, i651, bju {
    private boolean mActivityResumed;
    private boolean mActivityStarted;
    private boolean mAttachDispatched;
    private boolean mContainerVisible;
    private final boolean mDelayAttachToLayout;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private cju mHideableContainer;
    private final ak6 mTargetLifecycle;
    private WindowEventsHookView mWindowEventsHookView;

    public BrickController(ak6 ak6Var, boolean z) {
        this.mTargetLifecycle = ak6Var;
        this.mDelayAttachToLayout = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAttached() {
        this.mHandler.removeCallbacksAndMessages(null);
        if (this.mAttachDispatched) {
            return;
        }
        this.mAttachDispatched = true;
        this.mTargetLifecycle.onBrickAttach();
        if (this.mContainerVisible) {
            if (this.mActivityStarted) {
                this.mTargetLifecycle.onBrickStart();
            }
            if (this.mActivityResumed) {
                this.mTargetLifecycle.onBrickResume();
            }
        }
    }

    private cju findVisibilityContainer(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof cju) {
                return (cju) parent;
            }
        }
        return null;
    }

    public static boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    public String getUniqueInstanceId() {
        return null;
    }

    public boolean isAttached() {
        return this.mAttachDispatched;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        throw new IllegalStateException();
    }

    public void onActivityResumeChanged(boolean z) {
        if (this.mActivityResumed == z) {
            return;
        }
        this.mActivityResumed = z;
        if (this.mAttachDispatched && this.mContainerVisible) {
            ak6 ak6Var = this.mTargetLifecycle;
            if (z) {
                ak6Var.onBrickResume();
            } else {
                ak6Var.onBrickPause();
            }
        }
    }

    public void onActivityStartChanged(boolean z) {
        if (this.mActivityStarted == z) {
            return;
        }
        this.mActivityStarted = z;
        if (this.mAttachDispatched) {
            if (this.mContainerVisible) {
                ak6 ak6Var = this.mTargetLifecycle;
                if (z) {
                    ak6Var.onBrickStart();
                } else {
                    ak6Var.onBrickStop();
                }
            }
            this.mActivityStarted = z;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.mContainerVisible && this.mActivityResumed) {
            this.mTargetLifecycle.onBrickConfigurationChanged(configuration);
        }
    }

    public void onContainerVisibilityChanged(boolean z) {
        if (this.mContainerVisible == z) {
            return;
        }
        this.mContainerVisible = z;
        if (this.mAttachDispatched) {
            if (z) {
                if (this.mActivityStarted) {
                    this.mTargetLifecycle.onBrickStart();
                }
                if (this.mActivityResumed) {
                    this.mTargetLifecycle.onBrickResume();
                    return;
                }
                return;
            }
            if (this.mActivityResumed) {
                this.mTargetLifecycle.onBrickPause();
            }
            if (this.mActivityStarted) {
                this.mTargetLifecycle.onBrickStop();
            }
        }
    }

    public void onLayout() {
        dispatchAttached();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        throw new IllegalStateException();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        WindowEventsHookView c;
        if (this.mWindowEventsHookView != null) {
            return;
        }
        Object tag = view.getTag(egh0.bricks_window_events_hook_view);
        if (tag instanceof WindowEventsHookView) {
            c = (WindowEventsHookView) tag;
        } else {
            c = e.c(e.a(view.getContext()));
            view.setTag(egh0.bricks_window_events_hook_view, c);
        }
        this.mWindowEventsHookView = c;
        c.addListener(this);
        this.mActivityStarted = this.mWindowEventsHookView.isActivityStarted();
        this.mActivityResumed = this.mWindowEventsHookView.isActivityResumed();
        cju findVisibilityContainer = findVisibilityContainer(view);
        this.mHideableContainer = findVisibilityContainer;
        if (findVisibilityContainer != null) {
            findVisibilityContainer.addObserver(this);
            this.mContainerVisible = this.mHideableContainer.isVisibleToUser();
        } else {
            this.mContainerVisible = true;
        }
        if (this.mDelayAttachToLayout) {
            this.mHandler.post(new Runnable() { // from class: com.yandex.bricks.a
                @Override // java.lang.Runnable
                public final void run() {
                    BrickController.this.dispatchAttached();
                }
            });
        } else {
            dispatchAttached();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.mHandler.removeCallbacksAndMessages(null);
        if (this.mWindowEventsHookView == null) {
            return;
        }
        if (this.mAttachDispatched) {
            if (this.mContainerVisible) {
                if (this.mActivityResumed) {
                    this.mTargetLifecycle.onBrickPause();
                }
                if (this.mActivityStarted) {
                    this.mTargetLifecycle.onBrickStop();
                }
            }
            this.mActivityResumed = false;
            this.mActivityStarted = false;
        }
        cju cjuVar = this.mHideableContainer;
        if (cjuVar != null) {
            cjuVar.removeObserver(this);
            this.mHideableContainer = null;
        }
        if (this.mAttachDispatched) {
            this.mTargetLifecycle.onBrickDetach();
            this.mAttachDispatched = false;
        }
        this.mWindowEventsHookView.removeListener(this);
        this.mWindowEventsHookView = null;
    }
}
