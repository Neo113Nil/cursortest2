package xsna;

import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class lfg0 implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ io.reactivex.rxjava3.core.g b;
    public final /* synthetic */ kfg0 c;
    public final /* synthetic */ io.reactivex.rxjava3.functions.f d;
    public final /* synthetic */ io.reactivex.rxjava3.core.w e;

    public /* synthetic */ lfg0(io.reactivex.rxjava3.core.g gVar, kfg0 kfg0Var, pq60 pq60Var, io.reactivex.rxjava3.core.w wVar) {
        this.b = gVar;
        this.c = kfg0Var;
        this.d = pq60Var;
        this.e = wVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        io.reactivex.rxjava3.core.g gVar = (io.reactivex.rxjava3.core.g) obj;
        io.reactivex.rxjava3.internal.operators.flowable.b0 i = io.reactivex.rxjava3.core.g.i(-1L);
        io.reactivex.rxjava3.core.g gVar2 = this.b;
        gVar2.getClass();
        io.reactivex.rxjava3.internal.operators.flowable.h hVar = new io.reactivex.rxjava3.internal.operators.flowable.h(new ffe0[]{gVar2, i});
        gVar.getClass();
        a.b bVar = new a.b(mfg0.a);
        int i2 = io.reactivex.rxjava3.core.g.b;
        io.reactivex.rxjava3.internal.functions.b.a(i2, "bufferSize");
        io.reactivex.rxjava3.core.g f = new io.reactivex.rxjava3.internal.operators.flowable.d1(new ffe0[]{gVar, hVar}, bVar, i2).f(this.c, i2, i2);
        nex nexVar = new nex(this.d, 19);
        f.getClass();
        return new io.reactivex.rxjava3.internal.operators.flowable.m(f, nexVar, io.reactivex.rxjava3.internal.functions.a.d).f(new z250(this.e, 5), i2, i2);
    }
}
