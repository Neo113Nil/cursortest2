package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Iterator;

/* compiled from: OverlayComponentsTouchListener.kt */
/* loaded from: classes4.dex */
public final class j290 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ k290 b;

    public j290(k290 k290Var) {
        this.b = k290Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        k290 k290Var = this.b;
        pyp0 o = k290Var.c.o(motionEvent.getX(), motionEvent.getY());
        boolean z = o != null;
        k290Var.d = z;
        if (z) {
            if (o != null) {
                motionEvent.getX();
                motionEvent.getY();
                o.h();
            }
            k290Var.b.requestDisallowInterceptTouchEvent(true);
        }
        return z;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        k290 k290Var = this.b;
        if (!k290Var.d) {
            return false;
        }
        if (motionEvent == null) {
            return true;
        }
        b2r b2rVar = k290Var.c;
        Iterator it = b2rVar.h.values().iterator();
        while (it.hasNext()) {
            if (((pyp0) it.next()).a(f, f2)) {
                b2rVar.n();
                return true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        pyp0 pyp0Var;
        b2r b2rVar = this.b.c;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Iterator it = b2rVar.h.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                pyp0Var = null;
                break;
            }
            pyp0Var = (pyp0) it.next();
            if (pyp0Var.m(x, y)) {
                break;
            }
        }
        return pyp0Var != null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.b.c.o(motionEvent.getX(), motionEvent.getY()) != null;
    }
}
