package xsna;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: ModifyElementDrawingSession.kt */
/* loaded from: classes4.dex */
public final class e730 implements tlo<skp0> {
    public static final int j = (int) Math.floor(2 * Resources.getSystem().getDisplayMetrics().density);
    public final skp0 a;
    public final jti0 b;
    public final wap c;
    public final qkp0 d;
    public final n99 e;
    public long f;
    public float g;
    public float h;
    public boolean i;

    public e730(skp0 skp0Var, hr9 hr9Var, wap wapVar, qkp0 qkp0Var, n99 n99Var) {
        this.a = skp0Var;
        this.b = hr9Var;
        this.c = wapVar;
        this.d = qkp0Var;
        this.e = n99Var;
    }

    @Override // xsna.tlo
    public final void a(Canvas canvas) {
        if (this.i) {
            return;
        }
        this.b.g(canvas, this.a);
    }

    @Override // xsna.tlo
    public final boolean d(MotionEvent motionEvent) {
        if (!this.i) {
            wap wapVar = this.c;
            wapVar.b.b.onTouchEvent(motionEvent);
            wapVar.c.a(motionEvent);
            wapVar.d.a(motionEvent);
            int action = motionEvent.getAction();
            qkp0 qkp0Var = this.d;
            skp0 skp0Var = this.a;
            if (action != 0) {
                int i = j;
                if (action == 1) {
                    finish();
                    if (System.currentTimeMillis() - this.f < 150) {
                        float f = i;
                        if (Math.abs(this.g - motionEvent.getX()) < f && gq.a(motionEvent, this.h) < f && qkp0Var != null) {
                            qkp0Var.w(skp0Var);
                        }
                    }
                } else if (action == 2) {
                    float f2 = i;
                    if (Math.abs(this.g - motionEvent.getX()) > f2 && gq.a(motionEvent, this.h) > f2) {
                        wapVar.a = skp0Var;
                        if (qkp0Var != null) {
                            qkp0Var.z(skp0Var, motionEvent);
                            return true;
                        }
                    }
                } else if (action == 3) {
                    this.i = true;
                    wapVar.a = null;
                    this.e.invoke(skp0Var);
                    this.b.f();
                    if (qkp0Var != null) {
                        qkp0Var.z(skp0Var, motionEvent);
                        return false;
                    }
                }
            } else {
                this.f = System.currentTimeMillis();
                this.g = motionEvent.getX();
                this.h = motionEvent.getY();
                if (qkp0Var != null) {
                    qkp0Var.z(skp0Var, motionEvent);
                }
            }
            return true;
        }
        return false;
    }

    @Override // xsna.tlo
    public final void finish() {
        this.i = true;
        this.c.a = null;
        this.e.invoke(this.a);
        this.b.f();
    }
}
