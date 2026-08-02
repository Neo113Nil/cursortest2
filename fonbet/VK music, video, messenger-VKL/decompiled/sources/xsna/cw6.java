package xsna;

import com.vk.log.L;
import com.vk.voip.call_effects.beauty.BeautyFilterIntensity;
import kotlin.NoWhenBranchMatchedException;
import xsna.aw6;
import xsna.dw6;
import xsna.ew6;

/* compiled from: BeautyFeature.kt */
/* loaded from: classes7.dex */
public final class cw6 {
    public final ofy0 a;
    public final hw6 b;
    public final e0a c;
    public final io.reactivex.rxjava3.subjects.f<ew6> d = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.subjects.d<dw6> e = io.reactivex.rxjava3.subjects.d.O0(dw6.a.a);
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();
    public boolean g;
    public boolean h;

    public cw6(ofy0 ofy0Var, hw6 hw6Var, e0a e0aVar) {
        this.a = ofy0Var;
        this.b = hw6Var;
        this.c = e0aVar;
    }

    public final void a(aw6 aw6Var) {
        ofy0 ofy0Var = this.a;
        hw6 hw6Var = this.b;
        if (this.g) {
            return;
        }
        if (aw6Var.equals(aw6.a.a)) {
            Object obj = (dw6) this.e.P0();
            if (obj == null) {
                obj = dw6.a.a;
            }
            if (obj instanceof dw6.b) {
                hw6Var.a(((dw6.b) obj).a);
            }
            if (!this.g) {
                this.g = true;
                this.f.dispose();
                this.d.onNext(ew6.a.a);
            }
        } else if (aw6Var instanceof aw6.d) {
            BeautyFilterIntensity beautyFilterIntensity = ((aw6.d) aw6Var).a;
            synchronized (this) {
                dw6 P0 = this.e.P0();
                if (P0 == null) {
                    P0 = dw6.a.a;
                }
                dw6 dw6Var = dw6.a.a;
                if (!P0.equals(dw6Var)) {
                    if (!(P0 instanceof dw6.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.b.a(beautyFilterIntensity);
                    dw6Var = new dw6.b(((dw6.b) P0).a, beautyFilterIntensity);
                }
                this.e.onNext(dw6Var);
                s3q0 s3q0Var = s3q0.a;
            }
        } else if (aw6Var.equals(aw6.b.a)) {
            if (!this.h) {
                this.h = true;
                int i = 6;
                this.f.b(ofy0Var.h().m(asu0.a.d()).subscribe(new c40(new lz0(this, 7), i), new m5(new bw6(L.a, 0), i)));
            }
        } else {
            if (!aw6Var.equals(aw6.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            Object obj2 = (dw6) this.e.P0();
            if (obj2 == null) {
                obj2 = dw6.a.a;
            }
            if (obj2 instanceof dw6.b) {
                e0a e0aVar = this.c;
                BeautyFilterIntensity beautyFilterIntensity2 = ((dw6.b) obj2).b;
                pvw0 pvw0Var = (pvw0) e0aVar.b;
                if (beautyFilterIntensity2 == BeautyFilterIntensity.DISABLED) {
                    pvw0Var.I();
                } else {
                    pvw0Var.M0(Integer.valueOf(beautyFilterIntensity2.j()));
                }
                hw6Var.a(beautyFilterIntensity2);
                asu0.a.getClass();
                asu0.n().submit(new kw6(0, ofy0Var, beautyFilterIntensity2));
            }
            if (!this.g) {
                this.g = true;
                this.f.dispose();
                this.d.onNext(ew6.a.a);
            }
        }
        s3q0 s3q0Var2 = s3q0.a;
    }
}
