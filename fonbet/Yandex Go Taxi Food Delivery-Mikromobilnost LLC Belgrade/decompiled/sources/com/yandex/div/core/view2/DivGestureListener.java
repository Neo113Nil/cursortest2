package com.yandex.div.core.view2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/view2/DivGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "", "awaitLongClick", "<init>", "(Z)V", "Landroid/view/MotionEvent;", "e", "onSingleTapConfirmed", "(Landroid/view/MotionEvent;)Z", "onSingleTapUp", "onDoubleTap", "onDown", "Z", "Lkotlin/Function0;", "Lzy11;", "onSingleTapListener", "Lsls;", "getOnSingleTapListener", "()Lsls;", "setOnSingleTapListener", "(Lsls;)V", "onDoubleTapListener", "getOnDoubleTapListener", "setOnDoubleTapListener", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivGestureListener extends GestureDetector.SimpleOnGestureListener {
    private final boolean awaitLongClick;
    private sls onDoubleTapListener;
    private sls onSingleTapListener;

    public DivGestureListener(boolean z) {
        this.awaitLongClick = z;
    }

    public final sls getOnDoubleTapListener() {
        return this.onDoubleTapListener;
    }

    public final sls getOnSingleTapListener() {
        return this.onSingleTapListener;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent e) {
        sls slsVar = this.onDoubleTapListener;
        if (slsVar == null) {
            return false;
        }
        slsVar.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e) {
        if (this.awaitLongClick) {
            return false;
        }
        return (this.onDoubleTapListener == null && this.onSingleTapListener == null) ? false : true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent e) {
        sls slsVar;
        if (this.onDoubleTapListener == null || (slsVar = this.onSingleTapListener) == null) {
            return false;
        }
        if (slsVar == null) {
            return true;
        }
        slsVar.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e) {
        sls slsVar;
        if (this.onDoubleTapListener != null || (slsVar = this.onSingleTapListener) == null) {
            return false;
        }
        if (slsVar == null) {
            return true;
        }
        slsVar.invoke();
        return true;
    }

    public final void setOnDoubleTapListener(sls slsVar) {
        this.onDoubleTapListener = slsVar;
    }

    public final void setOnSingleTapListener(sls slsVar) {
        this.onSingleTapListener = slsVar;
    }
}
