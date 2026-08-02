package xsna;

import xsna.q29;

/* compiled from: CallCallDebugMenuInteractorImpl.kt */
/* loaded from: classes7.dex */
public final class p19 implements c29 {
    public final boolean a;
    public final s29 b;
    public final io.reactivex.rxjava3.subjects.d<Boolean> c = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);

    public p19(boolean z, s29 s29Var) {
        this.a = z;
        this.b = s29Var;
    }

    @Override // xsna.c29
    public final io.reactivex.rxjava3.subjects.d a() {
        return this.c;
    }

    @Override // xsna.c29
    public final void b(boolean z) {
        this.c.onNext(Boolean.valueOf(z));
    }

    @Override // xsna.c29
    public final boolean c() {
        return this.a;
    }

    public final q29 d() {
        s29 s29Var = this.b;
        b49 b49Var = s29Var.d;
        q29.a aVar = new q29.a(b49Var.c, b49Var.d, b49Var.e);
        q29.c cVar = new q29.c(s29Var.e.c);
        s29Var.f.getClass();
        return new q29(aVar, cVar);
    }
}
