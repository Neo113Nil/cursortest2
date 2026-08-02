package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: ChannelProfileGestureListener.kt */
/* loaded from: classes2.dex */
public final class z8b implements GestureDetector.OnGestureListener {
    public final vf0 b;
    public final t9b c;

    public z8b(vf0 vf0Var, t9b t9bVar) {
        this.b = vf0Var;
        this.c = t9bVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.c.invoke();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.b.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
