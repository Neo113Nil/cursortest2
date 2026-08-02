package xsna;

import java.util.List;
import xsna.yrl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class dej implements io.reactivex.rxjava3.core.s, yrl.a, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ Object b;

    public /* synthetic */ dej(Object obj) {
        this.b = obj;
    }

    @Override // xsna.yrl.a
    public void a(f9e0 f9e0Var) {
        ((h5k) this.b).b.set((f5k) f9e0Var.get());
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (List) ((ipo) this.b).invoke(obj);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        final g5u0 g5u0Var = (g5u0) this.b;
        final eej eejVar = new eej(rVar, 0);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.fej
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                g5u0.this.c.remove(eejVar);
            }
        });
        g5u0Var.c.add(eejVar);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((v1w) this.b).invoke(obj)).booleanValue();
    }
}
