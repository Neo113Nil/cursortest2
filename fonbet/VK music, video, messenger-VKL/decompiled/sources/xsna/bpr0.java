package xsna;

import android.view.MotionEvent;
import android.view.ViewParent;
import xsna.jaf;

/* compiled from: VerticalScrollPriorityTouchDelegate.kt */
/* loaded from: classes17.dex */
public final class bpr0 implements jaf.a {
    public final int a;
    public final int b;
    public final f5 c;
    public boolean d;
    public boolean e;
    public float f;
    public float g;

    public bpr0(int i, int i2, f5 f5Var) {
        this.a = i;
        this.b = i2;
        this.c = f5Var;
    }

    @Override // xsna.jaf.a
    public final void a(boolean z) {
        this.d = z;
        c();
    }

    @Override // xsna.jaf.a
    public final void b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f = motionEvent.getRawX();
            this.g = motionEvent.getRawY();
            this.e = true;
            c();
            return;
        }
        if (action != 1) {
            if (action == 2) {
                float abs = Math.abs(motionEvent.getRawX() - this.f);
                float abs2 = Math.abs(motionEvent.getRawY() - this.g);
                if (abs2 >= abs || abs <= this.b || abs2 >= this.a) {
                    return;
                }
                this.e = false;
                c();
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.d = false;
        this.e = false;
        c();
    }

    public final void c() {
        ((ViewParent) this.c.invoke()).requestDisallowInterceptTouchEvent(this.d || this.e);
    }
}
