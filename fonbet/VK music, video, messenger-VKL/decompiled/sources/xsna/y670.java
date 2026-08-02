package xsna;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: NormalGestureDetectorHandler.kt */
/* loaded from: classes2.dex */
public final class y670 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public final a b;
    public final GestureDetector c;
    public boolean d;
    public boolean e;

    public y670(Context context, Handler handler, a aVar) {
        this.b = aVar;
        GestureDetector gestureDetector = new GestureDetector(context, this, handler);
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (!this.e) {
            return false;
        }
        this.b.b();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return this.e;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return this.d || this.e || this.c.isLongpressEnabled();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (this.c.isLongpressEnabled()) {
            this.b.c();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!this.d) {
            return false;
        }
        this.b.a();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.d;
    }

    /* compiled from: NormalGestureDetectorHandler.kt */
    public interface a {
        default void a() {
        }

        default void b() {
        }

        default void c() {
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
