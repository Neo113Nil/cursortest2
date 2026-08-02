package xsna;

import xsna.kcl0;

/* compiled from: PopupSettingsInteractor.kt */
/* loaded from: classes6.dex */
public final class nxb0 {
    public final io.reactivex.rxjava3.subjects.d<nyb0> a = io.reactivex.rxjava3.subjects.d.N0();
    public nyb0 b = new nyb0(new zp2(true, true), new yp2(true, true), false);
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final kcl0.a d;

    public nxb0() {
        t6g0 t6g0Var = t6g0.b;
        this.d = t6g0.d().I0();
    }

    public final void a(io.reactivex.rxjava3.internal.operators.single.l lVar) {
        this.c.b(lVar.l(new ac20(new q8w(14), 11)).subscribe(new f5y(new fju(this, 24), 16), new nex(new ulz(13), 13)));
    }

    public final void b(nyb0 nyb0Var) {
        synchronized (this) {
            this.b = nyb0Var;
            this.a.onNext(nyb0Var);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
