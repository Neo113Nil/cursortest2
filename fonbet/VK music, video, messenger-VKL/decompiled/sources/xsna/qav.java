package xsna;

import com.vk.log.L;
import com.vk.toggle.Features;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.ui.VoipViewModelState;
import kotlin.NoWhenBranchMatchedException;
import xsna.abv;
import xsna.cxi;
import xsna.tav;
import xsna.uav;
import xsna.vav;

/* compiled from: HolidayInteractionFeature.kt */
/* loaded from: classes7.dex */
public final class qav {
    public final pav a;
    public final fr9 b;
    public final io.reactivex.rxjava3.subjects.d<vav> c;
    public final io.reactivex.rxjava3.subjects.f<a> d;
    public final io.reactivex.rxjava3.subjects.f<uav> e;
    public final io.reactivex.rxjava3.disposables.b f;
    public boolean g;
    public vav h;
    public boolean i;
    public boolean j;
    public b k;
    public boolean l;

    /* compiled from: HolidayInteractionFeature.kt */
    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }
    }

    /* compiled from: HolidayInteractionFeature.kt */
    public static final class b {
        public final cxi.b a;
        public final vav.a b;
        public final vav.g c;

        public b(cxi.b bVar, vav.a aVar, vav.g gVar) {
            this.a = bVar;
            this.b = aVar;
            this.c = gVar;
        }
    }

    public qav(pav pavVar, fr9 fr9Var) {
        this.a = pavVar;
        this.b = fr9Var;
        vav.b bVar = vav.b.a;
        this.c = io.reactivex.rxjava3.subjects.d.O0(bVar);
        this.d = new io.reactivex.rxjava3.subjects.f<>();
        this.e = new io.reactivex.rxjava3.subjects.f<>();
        this.f = new io.reactivex.rxjava3.disposables.b();
        this.h = bVar;
        this.i = true;
    }

    public final void a(tav tavVar) {
        cxi.b bVar;
        cxi.b bVar2;
        cxi.b bVar3;
        if (e()) {
            if (tavVar.equals(tav.d.a)) {
                this.i = false;
                if (this.h instanceof vav.c) {
                    i(b());
                    return;
                }
                return;
            }
            if (tavVar.equals(tav.c.a)) {
                this.j = false;
                if (this.h instanceof vav.c) {
                    i(b());
                    return;
                }
                return;
            }
            boolean equals = tavVar.equals(tav.e.a);
            io.reactivex.rxjava3.subjects.f<uav> fVar = this.e;
            if (equals) {
                vav vavVar = this.h;
                vav vavVar2 = vav.b.a;
                if (epx.f(vavVar, vavVar2)) {
                    L.l("Interaction is requested when feature is disabled");
                } else if (vavVar instanceof vav.c) {
                    com.vk.voip.ui.c.b.getClass();
                    if (com.vk.voip.ui.c.z0()) {
                        com.vk.voip.ui.c.j0().E0();
                        b bVar4 = this.k;
                        if (bVar4 != null && (bVar3 = bVar4.a) != null) {
                            vavVar2 = new vav.f(bVar3.i, bVar3.m);
                        }
                        i(vavVar2);
                        com.vk.voip.ui.c.r.T(abv.d.a);
                    } else {
                        b bVar5 = this.k;
                        if (bVar5 == null || (bVar2 = bVar5.a) == null) {
                            return;
                        } else {
                            fVar.onNext(new uav.a(bVar2.z, bVar2.A));
                        }
                    }
                } else if (vavVar instanceof vav.f) {
                    L.G("Interaction is already requested");
                } else if (vavVar instanceof vav.d) {
                    L.G("Interaction is requested when it is already in progress");
                } else {
                    if (!(vavVar instanceof vav.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    L.G("Holiday interaction is requested when interaction request is received from opponent");
                    i(c());
                    com.vk.voip.ui.c.b.getClass();
                    com.vk.voip.ui.c.r.T(abv.a.a);
                }
                s3q0 s3q0Var = s3q0.a;
                return;
            }
            if (!tavVar.equals(tav.b.a)) {
                if (!tavVar.equals(tav.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.vk.voip.ui.c.b.r1();
                vav vavVar3 = this.h;
                if (epx.f(vavVar3, vav.b.a)) {
                    L.l("Interaction is accepted when feature is disabled");
                } else if (vavVar3 instanceof vav.c) {
                    L.G("Interaction is accepted when interaction is in idle");
                } else if (vavVar3 instanceof vav.f) {
                    L.G("Interaction is accepted when request is sent");
                } else if (vavVar3 instanceof vav.e) {
                    i(c());
                    com.vk.voip.ui.c.r.T(abv.a.a);
                } else {
                    if (!(vavVar3 instanceof vav.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    L.G("Interaction is accepted when it is already in progress");
                }
                s3q0 s3q0Var2 = s3q0.a;
                return;
            }
            vav vavVar4 = this.h;
            if (epx.f(vavVar4, vav.b.a)) {
                L.l("Interaction is cancelled when feature is disabled");
            } else if (vavVar4 instanceof vav.c) {
                L.G("Interaction is cancelled when interaction is in idle");
            } else {
                if (!(vavVar4 instanceof vav.f) && !(vavVar4 instanceof vav.d) && !(vavVar4 instanceof vav.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (vavVar4 instanceof vav.d) {
                    b bVar6 = this.k;
                    if (bVar6 == null || (bVar = bVar6.a) == null) {
                        return;
                    } else {
                        fVar.onNext(new uav.d(bVar.l));
                    }
                }
                i(b());
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.r.T(abv.b.a);
            }
            s3q0 s3q0Var3 = s3q0.a;
        }
    }

    public final vav b() {
        cxi.b bVar;
        b bVar2 = this.k;
        return (bVar2 == null || (bVar = bVar2.a) == null) ? vav.b.a : new vav.c(bVar.u, bVar.v, bVar.b, bVar.c, bVar.e, bVar.f, bVar.g, this.j, bVar.h, this.i);
    }

    public final vav c() {
        b bVar = this.k;
        return bVar == null ? vav.b.a : new vav.d(bVar.a.t, bVar.c, bVar.b);
    }

    public final boolean d() {
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        if (((com.vk.voip.call_effects.a) com.vk.voip.ui.c.Q()).i() != CallEffectsDependency.TensorflowMode.GPU) {
            return false;
        }
        cVar.getClass();
        com.vk.voip.ui.c.s0.j.getClass();
        mqw0 mqw0Var = mqw0.a;
        return Boolean.TRUE.booleanValue() && com.vk.voip.ui.c.r0() && com.vk.voip.ui.c.w0() && !cVar.s0() && com.vk.toggle.b.A.a(Features.Type.FEATURE_VOIP_HOLIDAY_INTERACTION);
    }

    public final boolean e() {
        return d() && this.g;
    }

    public final void f() {
        L.e("isInitialized: " + this.g + " isSupported: " + d());
    }

    public final void g() {
        io.reactivex.rxjava3.core.x oVar;
        com.vk.voip.ui.c.b.getClass();
        if (com.vk.voip.ui.c.K0 != VoipViewModelState.InCall || !d()) {
            if (this.g) {
                i(vav.b.a);
                this.k = null;
                this.f.e();
                this.g = false;
                this.l = false;
                return;
            }
            return;
        }
        if (this.g) {
            return;
        }
        pav pavVar = this.a;
        cxi cxiVar = pavVar.b;
        if (cxiVar == null || !(cxiVar instanceof cxi.b)) {
            io.reactivex.rxjava3.internal.operators.single.b bVar = new io.reactivex.rxjava3.internal.operators.single.b(new qca0(new yce(pavVar, 25), 3));
            asu0 asu0Var = asu0.a;
            oVar = new io.reactivex.rxjava3.internal.operators.single.o(bVar.q(asu0Var.c()).m(asu0Var.d()), new p41(new arf(pavVar, 19), 28));
        } else {
            oVar = io.reactivex.rxjava3.core.x.k(cxiVar);
        }
        this.f.b(io.reactivex.rxjava3.kotlin.c.e(io.reactivex.rxjava3.core.x.B(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(oVar, new com.vk.movika.sdk.base.ui.j(new l2k(this, 16), 21)), new is1(new sav(1, this, qav.class, "reportReady", "reportReady(Lcom/vk/voip/ui/holiday_interaction/feature/HolidayInteractionFeature$UserConfig;)V", 0), 29)), this.d.t0(1L).m0(), new yzt(new x76(this, 7), 2)).m(asu0.a.d()), new viu(1), new rav(1, this, qav.class, "onBothClientsReady", "onBothClientsReady(Lcom/vk/voip/ui/holiday_interaction/feature/HolidayInteractionFeature$UserConfig;)V", 0)));
        this.g = true;
    }

    public final void h(b bVar) {
        L.e("report ready");
        f();
        if (e()) {
            com.vk.voip.ui.c.b.getClass();
            com.vk.voip.ui.c.r.T(new abv.c(bVar.a.a));
        }
    }

    public final void i(vav vavVar) {
        L.e("Holiday interaction state: " + vavVar);
        this.h = vavVar;
        this.c.onNext(vavVar);
        if (vavVar instanceof vav.d) {
            this.i = false;
            com.vk.voip.ui.c.b.r1();
        }
    }
}
