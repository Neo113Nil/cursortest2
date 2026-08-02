package xsna;

import xsna.q29;

/* compiled from: CallDebugOptionsInteractorImpl.kt */
/* loaded from: classes7.dex */
public final class s29 implements r29 {
    public final io.reactivex.rxjava3.subjects.d<q29.a> a;
    public final io.reactivex.rxjava3.subjects.d<q29.c> b;
    public final io.reactivex.rxjava3.subjects.d<q29.b> c;
    public final b49 d;
    public final oa9 e;
    public final ia9 f;

    public s29(t29 t29Var) {
        io.reactivex.rxjava3.subjects.d<q29.a> N0 = io.reactivex.rxjava3.subjects.d.N0();
        this.a = N0;
        io.reactivex.rxjava3.subjects.d<q29.c> N02 = io.reactivex.rxjava3.subjects.d.N0();
        this.b = N02;
        io.reactivex.rxjava3.subjects.d<q29.b> N03 = io.reactivex.rxjava3.subjects.d.N0();
        this.c = N03;
        this.d = new b49(t29Var, N0);
        this.e = new oa9(t29Var, N02);
        this.f = new ia9(t29Var, N03);
    }

    @Override // xsna.r29
    public final oa9 a() {
        return this.e;
    }

    @Override // xsna.r29
    public final io.reactivex.rxjava3.subjects.d b() {
        return this.c;
    }

    @Override // xsna.r29
    public final io.reactivex.rxjava3.subjects.d c() {
        return this.a;
    }

    @Override // xsna.r29
    public final b49 d() {
        return this.d;
    }

    @Override // xsna.r29
    public final ia9 e() {
        return this.f;
    }

    @Override // xsna.r29
    public final io.reactivex.rxjava3.subjects.d f() {
        return this.b;
    }
}
