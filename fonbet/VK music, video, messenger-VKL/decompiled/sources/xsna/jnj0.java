package xsna;

import xsna.hg1;
import xsna.hnj0;

/* compiled from: SilentModeInteractorImpl.kt */
/* loaded from: classes5.dex */
public final class jnj0 implements inj0 {
    public final ysg0<hnj0> a = new ysg0<>();

    @Override // xsna.inj0
    public final void a(boolean z) {
        this.a.a(new hnj0.a(z));
    }

    @Override // xsna.inj0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 b() {
        io.reactivex.rxjava3.subjects.f<hnj0> fVar = this.a.a;
        hg1.s3 s3Var = new hg1.s3();
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, s3Var).U(new hg1.r3()).U(new awi0(new ha40(13), 1)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
