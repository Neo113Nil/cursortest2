package xsna;

import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;

/* compiled from: VideoPromoUxLoader.kt */
/* loaded from: classes7.dex */
public final class w9t0 implements izs {
    public final /* synthetic */ io.reactivex.rxjava3.core.q<Boolean> b;
    public final /* synthetic */ x9t0 c;
    public final /* synthetic */ UxPollEntryPointLocation d;
    public final /* synthetic */ vvs0 e;

    public w9t0(io.reactivex.rxjava3.core.q<Boolean> qVar, x9t0 x9t0Var, UxPollEntryPointLocation uxPollEntryPointLocation, vvs0 vvs0Var) {
        this.b = qVar;
        this.c = x9t0Var;
        this.d = uxPollEntryPointLocation;
        this.e = vvs0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        x9t0 x9t0Var = this.c;
        return io.reactivex.rxjava3.core.q.l(this.b, ((io.reactivex.rxjava3.subjects.d) x9t0Var.c.a().c).U(new si60(new ape0(this.d, 20), 13)), x9t0.a(x9t0Var, this.e), new kxa0(new rcm(1), 14));
    }
}
