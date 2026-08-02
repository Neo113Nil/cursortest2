package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dak0;

/* compiled from: TimePicker.kt */
/* loaded from: classes11.dex */
public final class qw1 implements tuo0 {
    public final tuo0 a;
    public final cpf0<Boolean> b;
    public float d;
    public float e;
    public if2<Float, sq2> f;
    public final wh50 c = cq.f(0);
    public final ni50 g = new ni50();

    public qw1(tuo0 tuo0Var, cpf0<Boolean> cpf0Var) {
        this.a = tuo0Var;
        this.b = cpf0Var;
        this.d = ((tuo0Var.c() % 12) * 0.5235988f) - 1.5707964f;
        this.e = (tuo0Var.b() * 0.10471976f) - 1.5707964f;
        this.f = qf2.a(this.d);
    }

    public static float j(float f) {
        double d = f % 6.283185307179586d;
        if (d < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            d += 6.283185307179586d;
        }
        return (float) d;
    }

    @Override // xsna.tuo0
    public final int a() {
        return this.a.a();
    }

    @Override // xsna.tuo0
    public final int b() {
        return this.a.b();
    }

    @Override // xsna.tuo0
    public final int c() {
        return this.a.c();
    }

    @Override // xsna.tuo0
    public final void d(int i) {
        this.a.d(i);
    }

    @Override // xsna.tuo0
    public final void e(int i) {
        this.d = ((i % 12) * 0.5235988f) - 1.5707964f;
        tuo0 tuo0Var = this.a;
        tuo0Var.e(i);
        if (tuo0Var.a() == 0) {
            this.f = qf2.a(this.d);
        }
    }

    @Override // xsna.tuo0
    public final void f(int i) {
        this.e = (i * 0.10471976f) - 1.5707964f;
        tuo0 tuo0Var = this.a;
        tuo0Var.f(i);
        if (tuo0Var.a() == 1) {
            this.f = qf2.a(this.e);
        }
        dak0 a = dak0.a.a();
        izs<Object, s3q0> e = a != null ? a.e() : null;
        dak0 b = dak0.a.b(a);
        try {
            tuo0Var.f(tuo0Var.b());
            s3q0 s3q0Var = s3q0.a;
        } finally {
            dak0.a.d(a, b, e);
        }
    }

    @Override // xsna.tuo0
    public final boolean g() {
        return this.a.g();
    }

    public final float h(float f) {
        float floatValue = this.f.d().floatValue() - f;
        while (floatValue > 3.1415927f) {
            floatValue -= 6.2831855f;
        }
        while (floatValue <= -3.1415927f) {
            floatValue += 6.2831855f;
        }
        return this.f.d().floatValue() - floatValue;
    }

    public final float i() {
        return ((pco) ((zak0) this.c).getValue()).b;
    }
}
