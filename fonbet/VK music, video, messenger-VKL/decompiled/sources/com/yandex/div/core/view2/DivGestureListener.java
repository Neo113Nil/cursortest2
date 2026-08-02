package com.yandex.div.core.view2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: DivGestureListener.kt */
/* loaded from: classes7.dex */
public final class DivGestureListener extends GestureDetector.SimpleOnGestureListener {
    private final boolean awaitLongClick;
    private gzs<s3q0> onDoubleTapListener;
    private gzs<s3q0> onSingleTapListener;

    public DivGestureListener(boolean z) {
        this.awaitLongClick = z;
    }

    public final gzs<s3q0> getOnDoubleTapListener() {
        return this.onDoubleTapListener;
    }

    public final gzs<s3q0> getOnSingleTapListener() {
        return this.onSingleTapListener;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        gzs<s3q0> gzsVar = this.onDoubleTapListener;
        if (gzsVar == null) {
            return false;
        }
        gzsVar.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (this.awaitLongClick) {
            return false;
        }
        return (this.onDoubleTapListener == null && this.onSingleTapListener == null) ? false : true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        gzs<s3q0> gzsVar;
        if (this.onDoubleTapListener == null || (gzsVar = this.onSingleTapListener) == null) {
            return false;
        }
        if (gzsVar == null) {
            return true;
        }
        gzsVar.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        gzs<s3q0> gzsVar;
        if (this.onDoubleTapListener != null || (gzsVar = this.onSingleTapListener) == null) {
            return false;
        }
        if (gzsVar == null) {
            return true;
        }
        gzsVar.invoke();
        return true;
    }

    public final void setOnDoubleTapListener(gzs<s3q0> gzsVar) {
        this.onDoubleTapListener = gzsVar;
    }

    public final void setOnSingleTapListener(gzs<s3q0> gzsVar) {
        this.onSingleTapListener = gzsVar;
    }
}
