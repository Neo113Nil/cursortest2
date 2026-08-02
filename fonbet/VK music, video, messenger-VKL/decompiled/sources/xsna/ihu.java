package xsna;

/* compiled from: GroupCallCardTipFeatureDelegate.kt */
/* loaded from: classes11.dex */
public final class ihu {
    public final com.vk.voip.b a;
    public final miu b;
    public final io.reactivex.rxjava3.internal.operators.observable.z0 c;

    public ihu(com.vk.voip.b bVar, io.reactivex.rxjava3.internal.operators.observable.i0 i0Var, eu2 eu2Var) {
        this.a = bVar;
        miu miuVar = new miu(new sx2(this, 2), eu2Var);
        this.b = miuVar;
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = i0Var.a0(asu0.a.d());
        final la4 la4Var = new la4(this, 2);
        a0.subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.hhu
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                la4.this.invoke(obj);
            }
        });
        io.reactivex.rxjava3.subjects.f<oiu> fVar = miuVar.e;
        fVar.getClass();
        this.c = new io.reactivex.rxjava3.internal.operators.observable.z0(fVar);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.y a() {
        return new io.reactivex.rxjava3.internal.operators.observable.y(this.b.d.U(new rj4(new af2(25), 16)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }
}
