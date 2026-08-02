package defpackage;

import android.util.AndroidRuntimeException;

/* loaded from: classes.dex */
public final class nwt0 extends y4n {
    public owt0 u;
    public float v;
    public boolean w;

    public nwt0(Object obj, float f) {
        super(obj, y4n.m);
        this.u = null;
        this.v = Float.MAX_VALUE;
        this.w = false;
        this.u = new owt0(f);
    }

    @Override // defpackage.y4n
    public final void c() {
        if (!yh2.b().c()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.f) {
            d(true);
        }
        float f = this.v;
        if (f != Float.MAX_VALUE) {
            owt0 owt0Var = this.u;
            if (owt0Var == null) {
                this.u = new owt0(f);
            } else {
                owt0Var.i = f;
            }
            this.v = Float.MAX_VALUE;
        }
    }

    @Override // defpackage.y4n
    public final void h() {
        owt0 owt0Var = this.u;
        if (owt0Var == null) {
            w511.x("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
            return;
        }
        double d = (float) owt0Var.i;
        if (d > this.g) {
            w511.x("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d < this.h) {
            w511.x("Final position of the spring cannot be less than the min value.");
            return;
        }
        double abs = Math.abs(this.j * 0.75f);
        owt0Var.d = abs;
        owt0Var.e = abs * 62.5d;
        if (!yh2.b().c()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.a(this.d);
        }
        float f = this.b;
        if (f > this.g || f < this.h) {
            ny61.g("Starting value need to be in between min value and max value");
        } else {
            yh2.b().a(this);
        }
    }

    public final void i(float f) {
        if (this.f) {
            this.v = f;
            return;
        }
        if (this.u == null) {
            this.u = new owt0(f);
        }
        this.u.i = f;
        h();
    }

    public final void j() {
        if (this.u.b <= 0.0d) {
            w511.x("Spring animations can only come to an end when there is damping");
        } else {
            if (!yh2.b().c()) {
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            }
            if (this.f) {
                this.w = true;
            }
        }
    }

    public nwt0(Object obj, mor morVar) {
        super(obj, morVar);
        this.u = null;
        this.v = Float.MAX_VALUE;
        this.w = false;
    }

    public nwt0(sor sorVar) {
        super(sorVar);
        this.u = null;
        this.v = Float.MAX_VALUE;
        this.w = false;
    }
}
