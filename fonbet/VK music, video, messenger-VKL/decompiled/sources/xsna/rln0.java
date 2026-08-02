package xsna;

import android.util.TypedValue;
import android.view.MotionEvent;

/* compiled from: SwipeDetector.kt */
/* loaded from: classes12.dex */
public final class rln0 {
    public final int a;
    public final long b = 400;
    public long c;
    public boolean d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public long j;

    public rln0(ni80 ni80Var) {
        this.a = (int) TypedValue.applyDimension(1, 40, ni80Var.getResources().getDisplayMetrics());
    }

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            b(motionEvent);
            return;
        }
        if (action != 1) {
            if (action == 2) {
                if (!this.d) {
                    b(motionEvent);
                    return;
                }
                if (Math.abs(motionEvent.getX() - this.f) < Math.abs(motionEvent.getY() - this.g)) {
                    this.h = false;
                }
                if (this.h && Math.abs(this.f - this.e) > this.a) {
                    if (motionEvent.getEventTime() - this.c >= this.b) {
                        this.h = false;
                    } else if (!this.i) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - this.j >= 500) {
                            this.i = true;
                            this.j = currentTimeMillis;
                        }
                    }
                }
                this.f = motionEvent.getX();
                this.g = motionEvent.getY();
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.d = false;
        this.h = true;
        this.i = false;
    }

    public final void b(MotionEvent motionEvent) {
        this.c = motionEvent.getEventTime();
        this.d = true;
        this.e = motionEvent.getX();
        motionEvent.getY();
        this.f = motionEvent.getX();
        this.g = motionEvent.getY();
        this.h = true;
        this.i = false;
    }
}
