package xsna;

import android.view.MotionEvent;

/* compiled from: PinchGestureDetector.kt */
/* loaded from: classes2.dex */
public final class tna0 {
    public final a a;
    public boolean b;
    public boolean c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public int i;
    public long j;

    /* compiled from: PinchGestureDetector.kt */
    public interface a {
        void W(float f, float f2, float f3, float f4, float f5);

        void a(float f, float f2, float f3, float f4);

        void m();
    }

    public tna0(a aVar) {
        this.a = aVar;
    }

    public final boolean a(MotionEvent motionEvent) {
        boolean z = motionEvent.getActionMasked() == 2 && this.b;
        boolean z2 = motionEvent.getEventTime() - this.j > 100 && (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5);
        boolean z3 = (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.h == motionEvent.getPointerId(0) && this.i == motionEvent.getPointerId(1)) || (this.h == motionEvent.getPointerId(1) && this.i == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.b;
        if (!z2) {
            a aVar = this.a;
            if (z) {
                int pointerCount = motionEvent.getPointerCount();
                int i = -1;
                int i2 = -1;
                for (int i3 = 0; i3 < pointerCount; i3++) {
                    if (this.h == motionEvent.getPointerId(i3)) {
                        i = i3;
                    }
                    if (this.i == motionEvent.getPointerId(i3)) {
                        i2 = i3;
                    }
                }
                if (i == -1 || i2 == -1) {
                    this.b = false;
                    this.c = false;
                    aVar.m();
                    return false;
                }
                float x = motionEvent.getX(0);
                float x2 = motionEvent.getX(1);
                float y = motionEvent.getY(0);
                float y2 = motionEvent.getY(1);
                float hypot = ((float) Math.hypot(x2 - x, y2 - y)) / this.d;
                float f = hypot / this.e;
                this.e = hypot;
                if (Math.abs(1.0f - hypot) > 0.01f && !this.c) {
                    aVar.a(x, y, x2, y2);
                    this.c = true;
                }
                float f2 = (y2 + y) / 2.0f;
                float f3 = this.f;
                float f4 = f3 - ((x2 + x) / 2.0f);
                float f5 = this.g;
                aVar.W(f3, f5, f, -f4, -(f5 - f2));
            } else if (z3) {
                this.j = motionEvent.getEventTime();
                this.b = false;
                this.c = false;
                aVar.m();
            }
        } else if (!this.b && motionEvent.getPointerCount() == 2) {
            float x3 = motionEvent.getX(0);
            float x4 = motionEvent.getX(1);
            float y3 = motionEvent.getY(0);
            float y4 = motionEvent.getY(1);
            this.d = (float) Math.hypot(x4 - x3, y4 - y3);
            this.f = (x4 + x3) / 2.0f;
            this.g = (y4 + y3) / 2.0f;
            this.e = 1.0f;
            this.h = motionEvent.getPointerId(0);
            this.i = motionEvent.getPointerId(1);
            this.b = true;
        }
        return this.b;
    }
}
