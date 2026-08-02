package xsna;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.MotionEvent;

/* compiled from: ExternalModifyElementSession.kt */
/* loaded from: classes4.dex */
public final class veq implements tlo<skp0> {
    public static final int k = (int) Math.floor(2 * Resources.getSystem().getDisplayMetrics().density);
    public final skp0 a;
    public final jti0 b;
    public final feq c;
    public final qkp0 d;
    public final qr0 e;
    public final com.vk.movika.sdk.base.logic.processor.actions.e f;
    public long g;
    public float h;
    public float i;
    public boolean j;

    public veq(skp0 skp0Var, jti0 jti0Var, feq feqVar, qkp0 qkp0Var, qr0 qr0Var, com.vk.movika.sdk.base.logic.processor.actions.e eVar) {
        this.a = skp0Var;
        this.b = jti0Var;
        this.c = feqVar;
        this.d = qkp0Var;
        this.e = qr0Var;
        this.f = eVar;
    }

    @Override // xsna.tlo
    public final void a(Canvas canvas) {
        if (this.j) {
            return;
        }
        this.b.g(canvas, this.a);
    }

    @Override // xsna.tlo
    public final boolean d(MotionEvent motionEvent) {
        if (!this.j) {
            feq feqVar = this.c;
            feqVar.getClass();
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Matrix matrix = feqVar.a;
            obtain.transform(matrix);
            feqVar.h.b.onTouchEvent(obtain);
            feqVar.j.a(obtain);
            obtain.recycle();
            motionEvent.transform(feqVar.b);
            motionEvent.transform(matrix);
            feqVar.i.a(motionEvent);
            int action = motionEvent.getAction();
            qkp0 qkp0Var = this.d;
            skp0 skp0Var = this.a;
            if (action != 0) {
                int i = k;
                if (action == 1) {
                    finish();
                    if (System.currentTimeMillis() - this.g < 150) {
                        float f = i;
                        if (Math.abs(this.h - motionEvent.getX()) < f && gq.a(motionEvent, this.i) < f && qkp0Var != null) {
                            qkp0Var.w(skp0Var);
                        }
                    }
                    if (qkp0Var != null) {
                        qkp0Var.z(skp0Var, motionEvent);
                    }
                } else if (action == 2) {
                    float f2 = i;
                    if (Math.abs(this.h - motionEvent.getX()) > f2 && gq.a(motionEvent, this.i) > f2) {
                        feqVar.f = skp0Var;
                        if (qkp0Var != null) {
                            qkp0Var.z(skp0Var, motionEvent);
                            return true;
                        }
                    }
                } else if (action == 3) {
                    this.j = true;
                    feqVar.f = null;
                    this.e.invoke(skp0Var);
                    this.f.invoke();
                    this.b.f();
                    if (qkp0Var != null) {
                        qkp0Var.z(skp0Var, motionEvent);
                        return false;
                    }
                }
            } else {
                this.g = System.currentTimeMillis();
                this.h = motionEvent.getX();
                this.i = motionEvent.getY();
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
        this.j = true;
        this.c.f = null;
        this.e.invoke(this.a);
        this.f.invoke();
        this.b.f();
    }
}
