package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;

/* compiled from: SendTogglesToDevNullTask.kt */
/* loaded from: classes11.dex */
public final class qji0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "SendTogglesToDevNull";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        io.reactivex.rxjava3.internal.operators.observable.y yVar = com.vk.toggle.b.A.g;
        j45 j45Var = new j45(new haj(2), 2);
        yVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.f0 K = new io.reactivex.rxjava3.internal.operators.observable.i0(yVar, j45Var).K();
        final c3w c3wVar = new c3w(this);
        io.reactivex.rxjava3.functions.f fVar = new io.reactivex.rxjava3.functions.f() { // from class: xsna.nji0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                c3w.this.invoke(obj);
            }
        };
        final oji0 oji0Var = new oji0(this, 0);
        ver0.a(K.subscribe(fVar, new io.reactivex.rxjava3.functions.f() { // from class: xsna.pji0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                oji0.this.invoke(obj);
            }
        }));
        return s3q0.a;
    }
}
