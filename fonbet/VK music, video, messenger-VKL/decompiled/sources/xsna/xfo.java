package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: DragGestureDetector.kt */
/* loaded from: classes4.dex */
public final class xfo {
    public final emy a;
    public final rlb0 b;
    public final float c;
    public VelocityTracker d;
    public boolean e;
    public sot f;

    public xfo(Context context, emy emyVar, rlb0 rlb0Var) {
        this.a = emyVar;
        this.b = rlb0Var;
        ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.c = (int) Math.floor(1 * Resources.getSystem().getDisplayMetrics().density);
    }

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        emy emyVar = this.a;
        rlb0 rlb0Var = this.b;
        if (action == 0) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            emyVar.a = rlb0Var.a(motionEvent);
            emyVar.b = rlb0Var.b(motionEvent);
            this.e = false;
            return;
        }
        if (action == 1) {
            VelocityTracker velocityTracker = this.d;
            if (this.e && velocityTracker != null) {
                emyVar.a = rlb0Var.a(motionEvent);
                emyVar.b = rlb0Var.b(motionEvent);
                velocityTracker.addMovement(motionEvent);
                velocityTracker.computeCurrentVelocity(1000);
                float xVelocity = velocityTracker.getXVelocity();
                float yVelocity = velocityTracker.getYVelocity();
                Math.abs(xVelocity);
                Math.abs(yVelocity);
            }
            if (velocityTracker != null) {
                velocityTracker.recycle();
                return;
            }
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            VelocityTracker velocityTracker2 = this.d;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.d = null;
            return;
        }
        float a = rlb0Var.a(motionEvent);
        float b = rlb0Var.b(motionEvent);
        float f = a - emyVar.a;
        float f2 = b - emyVar.b;
        if (!this.e) {
            this.e = ((float) Math.sqrt((double) ((f2 * f2) + (f * f)))) >= this.c;
        }
        if (this.e) {
            sot sotVar = this.f;
            if (sotVar != null && ((!sotVar.d.b.isInProgress() || sotVar.h) && sotVar.j)) {
                sotVar.b.a(f, f2);
            }
            emyVar.a = a;
            emyVar.b = b;
            VelocityTracker velocityTracker3 = this.d;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
