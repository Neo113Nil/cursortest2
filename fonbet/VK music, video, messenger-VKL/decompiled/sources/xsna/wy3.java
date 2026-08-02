package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.vk.rlottie.RLottieDrawable;
import java.util.concurrent.Callable;

/* compiled from: AsyncRLottieRenderDelegate.kt */
/* loaded from: classes5.dex */
public final class wy3 extends fyf0 {
    public final ez3 c;

    public wy3(ez3 ez3Var, RLottieDrawable rLottieDrawable) {
        super(ez3Var, rLottieDrawable);
        this.c = ez3Var;
    }

    @Override // xsna.fyf0
    public final void a(Canvas canvas, float f, float f2) {
        long currentTimeMillis = System.currentTimeMillis();
        ez3 ez3Var = this.c;
        long j = ez3Var.F;
        if (j > 0) {
            ez3Var.J = currentTimeMillis - j;
        }
        ez3Var.F = currentTimeMillis;
        Bitmap bitmap = ez3Var.f;
        ez3 ez3Var2 = this.c;
        long j2 = ez3Var2.K;
        if ((j2 == 0 || j2 <= currentTimeMillis || Math.abs(j2 - currentTimeMillis) > this.a.B * 7) && !ez3Var2.m && bitmap != null) {
            Bitmap bitmap2 = this.c.E;
            this.c.E = bitmap;
            this.c.f = bitmap2;
            ez3 ez3Var3 = this.c;
            ez3Var3.l = false;
            ez3Var3.m = true;
            if (ez3Var3.G) {
                ez3Var3.G = false;
                ez3Var3.H = System.currentTimeMillis();
                ez3 ez3Var4 = this.c;
                ez3Var4.I = ez3Var4.n;
            }
        }
        Bitmap bitmap3 = this.c.E;
        if (!this.c.l && bitmap3 != null) {
            b(canvas, bitmap3, f, f2);
        }
        ez3 ez3Var5 = this.c;
        if (!ez3Var5.x) {
            ez3Var5.x = true;
            ez3Var5.G = true;
            ez3Var5.K = 0L;
            h(this.a.e.get());
            return;
        }
        if (ez3Var5.s || this.a.h.get() || !this.c.m) {
            return;
        }
        int i = this.a.e.get();
        int f3 = f();
        ez3 ez3Var6 = this.a;
        if (f3 >= ez3Var6.b[1]) {
            g(f3);
        } else {
            ez3Var6.e.set(f3);
        }
        if (i == f3) {
            return;
        }
        e(i, f3);
        h(this.a.e.get());
    }

    @Override // xsna.fyf0
    public final void c() {
        ez3 ez3Var = this.c;
        ez3Var.G = true;
        h(ez3Var.e.get());
    }

    @Override // xsna.fyf0
    public final void d(int i) {
        ez3 ez3Var = this.c;
        ez3Var.D.e();
        ez3Var.h.set(false);
        ez3Var.m = true;
        ez3Var.G = true;
        ez3Var.K = 0L;
        h(i);
    }

    public final void e(int i, int i2) {
        int i3;
        ez3 ez3Var = this.c;
        if (!ez3Var.z || ez3Var.d || ez3Var.p.get() || ez3Var.A != 1 || (i3 = i2 - i) <= 0) {
            return;
        }
        int i4 = ez3Var.C;
        if (i4 >= 0) {
            i3 = (i3 + i4) / 2;
        }
        ez3Var.C = i3;
    }

    public final int f() {
        long currentTimeMillis = System.currentTimeMillis();
        ez3 ez3Var = this.c;
        long j = ez3Var.H;
        long j2 = currentTimeMillis - j;
        long j3 = ez3Var.J;
        ez3 ez3Var2 = this.a;
        if (j3 >= ez3Var2.B * 7 || j3 < 0 || j2 < 0 || j <= 0) {
            ez3Var.G = true;
            ez3Var.K = currentTimeMillis + ez3Var.B;
            return ez3Var2.e.get() + ez3Var.A;
        }
        ez3Var.K = currentTimeMillis;
        return (((int) Math.round(j2 / ez3Var2.B)) * ez3Var.A) + ez3Var.I;
    }

    public final void g(int i) {
        ez3 ez3Var = this.a;
        ez3Var.e.set(((i + 1) % ez3Var.b[1]) - 1);
        ez3 ez3Var2 = this.c;
        ez3Var2.G = true;
        int i2 = ez3Var2.q;
        if (i2 > -1) {
            int i3 = ez3Var2.r + 1;
            ez3Var2.r = i3;
            if (i2 == i3) {
                this.a.e.set(0);
                this.c.s = true;
                ez3 ez3Var3 = this.c;
                ez3Var3.x = true;
                RLottieDrawable.a aVar = ez3Var3.t;
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
    }

    public final void h(final int i) {
        ez3 ez3Var = this.a;
        if (ez3Var.a == 0 || ez3Var.k.get() || ez3Var.j.get() || !ez3Var.m || ez3Var.h.getAndSet(true)) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.ty3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                wy3 wy3Var = wy3.this;
                int i2 = i;
                Bitmap bitmap = wy3Var.a.f;
                if (bitmap == null) {
                    try {
                        bitmap = wy3Var.b.c();
                        wy3Var.a.f = bitmap;
                    } catch (Exception unused) {
                        bitmap = null;
                    }
                }
                if (bitmap != null) {
                    wy3Var.b.f(i2, bitmap);
                    wy3Var.c.n = i2;
                }
                if (wy3Var.c.E == null) {
                    wy3Var.c.E = wy3Var.b.c();
                }
                return bitmap;
            }
        });
        asu0.a.getClass();
        int i2 = 0;
        ez3Var.D.b(new io.reactivex.rxjava3.internal.operators.observable.c0(s0Var.r0((io.reactivex.rxjava3.core.w) asu0.V.getValue()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).G(new uy3(this, i2)), io.reactivex.rxjava3.internal.functions.a.d, new vy3(this, i2)).subscribe(new pv2(new hb(this, 6), 2), new ho1(new go1(this, 7), 1)));
    }
}
