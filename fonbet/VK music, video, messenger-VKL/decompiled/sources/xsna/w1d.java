package xsna;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: ClipItemOnGestureListener.kt */
/* loaded from: classes17.dex */
public final class w1d extends GestureDetector.SimpleOnGestureListener implements GestureDetector.OnGestureListener {
    public final u6d b;
    public final View c;

    public w1d(j1d j1dVar, View view) {
        this.b = j1dVar;
        this.c = view;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.b.a(new z4d(motionEvent));
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        Rect rect = new Rect();
        this.c.getGlobalVisibleRect(rect);
        s3q0 s3q0Var = s3q0.a;
        this.b.a(new a5d(motionEvent, rect));
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.b.a(new b5d(motionEvent));
        return true;
    }
}
