package xsna;

import com.vk.mediastore.system.AlbumEntry;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: MediaStoreLoaderImpl.kt */
/* loaded from: classes3.dex */
public final class yz10 implements hz10 {
    public final rq10 a;
    public final zy10 b;

    public yz10(rq10 rq10Var, zy10 zy10Var) {
        this.a = rq10Var;
        this.b = zy10Var;
    }

    @Override // xsna.hz10
    public final io.reactivex.rxjava3.internal.operators.observable.m1 b(final int i, final String str) {
        io.reactivex.rxjava3.internal.operators.observable.q qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new io.reactivex.rxjava3.core.s() { // from class: xsna.mz10
            @Override // io.reactivex.rxjava3.core.s
            public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
                rq10 rq10Var = yz10.this.a;
                td8 td8Var = new td8(0, rVar, io.reactivex.rxjava3.core.r.class, "isDisposed", "isDisposed()Z", 0, 4);
                ym1 ym1Var = new ym1(1, rVar, io.reactivex.rxjava3.core.r.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 8);
                tr9 tr9Var = new tr9(0, rVar, io.reactivex.rxjava3.core.r.class, "onComplete", "onComplete()V", 0, 1);
                String[] strArr = rq10.e;
                rq10Var.g(i, str, true, td8Var, ym1Var, tr9Var);
            }
        });
        bdz bdzVar = new bdz(new nz10(this, i, 0), 3);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 E = qVar.E(bdzVar, lVar, kVar, kVar);
        asu0 asu0Var = asu0.a;
        return E.r0(asu0Var.c()).a0(asu0Var.d());
    }

    public final ArrayList c() {
        return this.b.a;
    }

    public final io.reactivex.rxjava3.internal.operators.single.b0 d(final int i, final int i2, final int i3, final int i4) {
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.oz10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return yz10.this.a.i(i, i4, i3, i2);
            }
        });
        asu0 asu0Var = asu0.a;
        return vVar.q(asu0Var.c()).m(asu0Var.d());
    }

    public final io.reactivex.rxjava3.internal.operators.single.b0 e(final int i, final AlbumEntry albumEntry, final int i2, final int i3) {
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.pz10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return yz10.this.a.i(i, i3, i2, albumEntry.b);
            }
        });
        asu0 asu0Var = asu0.a;
        return vVar.q(asu0Var.c()).m(asu0Var.d());
    }
}
