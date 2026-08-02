package com.yandex.div.core.view;

import android.annotation.SuppressLint;
import android.view.ViewTreeObserver;

/* compiled from: OnPreDrawListeners.kt */
@SuppressLint({"OnPreDrawListenerIssue"})
/* loaded from: classes7.dex */
public final class OverridableOnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
    private final ViewTreeObserver.OnPreDrawListener delegate;
    private final DrawingPassOverrideStrategy overrideStrategy;

    public OverridableOnPreDrawListener(ViewTreeObserver.OnPreDrawListener onPreDrawListener, DrawingPassOverrideStrategy drawingPassOverrideStrategy) {
        this.delegate = onPreDrawListener;
        this.overrideStrategy = drawingPassOverrideStrategy;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        return this.overrideStrategy.overrideDrawingPass(this.delegate, this.delegate.onPreDraw());
    }
}
