package com.google.android.material.snackbar;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
class BaseTransientBottomBar$Anchor implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final WeakReference<View> anchorView;
    private final WeakReference<b> transientBottomBar;

    private BaseTransientBottomBar$Anchor(b bVar, View view) {
        this.transientBottomBar = new WeakReference<>(bVar);
        this.anchorView = new WeakReference<>(view);
    }

    public static BaseTransientBottomBar$Anchor anchor(b bVar, View view) {
        BaseTransientBottomBar$Anchor baseTransientBottomBar$Anchor = new BaseTransientBottomBar$Anchor(bVar, view);
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(baseTransientBottomBar$Anchor);
        }
        view.addOnAttachStateChangeListener(baseTransientBottomBar$Anchor);
        return baseTransientBottomBar$Anchor;
    }

    private boolean unanchorIfNoTransientBottomBar() {
        if (this.transientBottomBar.get() != null) {
            return false;
        }
        unanchor();
        return true;
    }

    public View getAnchorView() {
        return this.anchorView.get();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (unanchorIfNoTransientBottomBar()) {
            return;
        }
        b bVar = this.transientBottomBar.get();
        FastOutSlowInInterpolator fastOutSlowInInterpolator = b.t;
        bVar.getClass();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        if (unanchorIfNoTransientBottomBar() || view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        if (unanchorIfNoTransientBottomBar() || view == null) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public void unanchor() {
        if (this.anchorView.get() != null) {
            this.anchorView.get().removeOnAttachStateChangeListener(this);
            View view = this.anchorView.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
        this.anchorView.clear();
        this.transientBottomBar.clear();
    }
}
