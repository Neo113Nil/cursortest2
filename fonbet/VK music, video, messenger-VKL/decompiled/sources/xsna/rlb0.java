package xsna;

import android.view.MotionEvent;
import kotlin.Result;

/* compiled from: PointerGestureDetector.kt */
/* loaded from: classes4.dex */
public final class rlb0 {
    public final emy a;
    public int b = -1;
    public int c;

    public rlb0(emy emyVar) {
        this.a = emyVar;
    }

    public final float a(MotionEvent motionEvent) {
        Object failure;
        try {
            failure = Float.valueOf(motionEvent.getX(this.c));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Float f = (Float) failure;
        return f != null ? f.floatValue() : motionEvent.getX();
    }

    public final float b(MotionEvent motionEvent) {
        Object failure;
        try {
            failure = Float.valueOf(motionEvent.getY(this.c));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Float f = (Float) failure;
        return f != null ? f.floatValue() : motionEvent.getY();
    }

    public final void c(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.b = -1;
            } else if (actionMasked == 6) {
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == this.b) {
                    int i = actionIndex != 0 ? 0 : 1;
                    this.b = motionEvent.getPointerId(i);
                    float x = motionEvent.getX(i);
                    emy emyVar = this.a;
                    emyVar.a = x;
                    emyVar.b = motionEvent.getY(i);
                }
            }
        } else {
            this.b = motionEvent.getPointerId(0);
        }
        int i2 = this.b;
        this.c = motionEvent.findPointerIndex(i2 != -1 ? i2 : 0);
    }
}
