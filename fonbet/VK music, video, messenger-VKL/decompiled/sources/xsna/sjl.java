package xsna;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: DefaultOnDoubleTapListener.java */
/* loaded from: classes2.dex */
public final class sjl implements GestureDetector.OnDoubleTapListener {
    public final h64 b;

    public sjl(h64 h64Var) {
        this.b = h64Var;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        h64 h64Var = this.b;
        if (h64Var == null) {
            return false;
        }
        try {
            float h = h64Var.h();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            h64 h64Var2 = this.b;
            float f = h64Var2.f;
            if (h < f) {
                h64Var2.j(f, x, y, true);
            } else {
                if (h >= f) {
                    float f2 = h64Var2.g;
                    if (h < f2) {
                        h64Var2.j(f2, x, y, true);
                    }
                }
                h64Var2.j(h64Var2.e, x, y, true);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        RectF e;
        if (this.b.g() == null) {
            return false;
        }
        h64 h64Var = this.b;
        if (h64Var.t != null && (e = h64Var.e()) != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (e.contains(x, y)) {
                this.b.t.c((x - e.left) / e.width(), (y - e.top) / e.height());
                return true;
            }
        }
        i64 i64Var = this.b.t;
        if (i64Var == null) {
            return false;
        }
        i64Var.b(motionEvent.getX(), motionEvent.getY());
        return true;
    }
}
