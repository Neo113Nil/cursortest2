package xsna;

import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import kotlin.collections.EmptyList;

/* compiled from: VideoDiscoveryItemsLoaderFacade.kt */
/* loaded from: classes7.dex */
public final class fgs0 {
    public final y4r0 a;
    public final sdz b;
    public final b25 c;
    public final l5o d;
    public final d5s0 e;
    public final yat0 f;
    public final x9t0 g;
    public final wes0 h;
    public final pzr0 i;
    public final hht0 j;

    public fgs0(wgs0 wgs0Var, boolean z, boolean z2, y4r0 y4r0Var, pwm0 pwm0Var, sdz sdzVar, b25 b25Var, l5o l5oVar, h7v h7vVar, gus0 gus0Var, d5s0 d5s0Var) {
        this.a = y4r0Var;
        this.b = sdzVar;
        this.c = b25Var;
        this.d = l5oVar;
        this.e = d5s0Var;
        u9t0 u9t0Var = wgs0Var.d;
        lyr0 lyr0Var = wgs0Var.f;
        this.f = new yat0(u9t0Var, lyr0Var, l5oVar, z2);
        this.g = new x9t0(u9t0Var, z2, y4r0Var);
        this.h = new wes0(wgs0Var, z, sdzVar, l5oVar, pwm0Var, h7vVar, gus0Var);
        this.i = new pzr0(wgs0Var.e, lyr0Var.b().s0(new t9c0(6, new f6m0(d5s0Var, 12))));
        this.j = new hht0(b25Var, wgs0Var.h, wgs0Var.i);
    }

    public final void a(String str) {
        io.reactivex.rxjava3.subjects.d<String> dVar = this.f.h;
        if (epx.f(dVar.P0(), str)) {
            return;
        }
        dVar.onNext(str);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.y b(io.reactivex.rxjava3.core.q qVar, vvs0 vvs0Var) {
        x9t0 x9t0Var = this.g;
        x9t0Var.getClass();
        UxPollEntryPointLocation uxPollEntryPointLocation = UxPollEntryPointLocation.Discovery;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = x9t0Var.c.b().e.U(new dnz(new emh0(uxPollEntryPointLocation, 12), 22));
        zy60 zy60Var = new zy60(15);
        qVar.getClass();
        io.reactivex.rxjava3.core.q p0 = new io.reactivex.rxjava3.internal.operators.observable.i0(qVar, zy60Var).K().w().L(new gwn0(new w9t0(U, x9t0Var, uxPollEntryPointLocation, vvs0Var), 7), false).p0(EmptyList.b);
        p0.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(p0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }
}
