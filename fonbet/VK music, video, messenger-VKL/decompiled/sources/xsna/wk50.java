package xsna;

import com.vk.mvi.core.internal.executors.ThreadType;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import xsna.a7f0;
import xsna.ao50;
import xsna.kj50;
import xsna.km50;
import xsna.xl50;

/* compiled from: MviFeatureBase.kt */
/* loaded from: classes3.dex */
public abstract class wk50<VS extends ao50, S extends km50, A extends kj50, P extends xl50> implements vk50<VS, A>, zyw, a7f0 {
    public A b;
    public final cm50<VS, P, S> c;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: MviFeatureBase.kt */
    public static final class a extends nj50<A, P> {
        public final io.reactivex.rxjava3.disposables.b b;
        public final /* synthetic */ wk50<VS, S, A, P> c;

        public a(wk50<VS, S, A, P> wk50Var) {
            this.c = wk50Var;
            this.b = wk50Var.e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.nj50
        public final void a(A... aArr) {
            this.c.C((kj50[]) Arrays.copyOf(aArr, aArr.length));
        }

        @Override // xsna.nj50
        public final void b(P p) {
            this.c.T(p);
        }
    }

    public wk50(A a2, cm50<VS, P, S> cm50Var) {
        this.b = a2;
        this.c = cm50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.zyw
    public final void A() {
        ThreadType.a aVar = ThreadType.Companion;
        ThreadType[] threadTypeArr = {ThreadType.MAIN};
        aVar.getClass();
        ThreadType.a.a(threadTypeArr);
        A a2 = this.b;
        if (a2 != null) {
            C(a2);
        }
        this.b = null;
    }

    @Override // xsna.vk50
    public final void C(A... aArr) {
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        com.vk.mvi.core.internal.executors.a.b(new qg1(16, aArr, this));
    }

    @Override // xsna.a7f0
    public final <T> io.reactivex.rxjava3.disposables.c I(io.reactivex.rxjava3.core.q<T> qVar, io.reactivex.rxjava3.core.w wVar, izs<? super T, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2, gzs<s3q0> gzsVar) {
        return a7f0.a.b(this, qVar, wVar, izsVar, izsVar2, gzsVar);
    }

    public abstract void N(S s, A a2);

    public final mj50<S, A, P> O(oj50<S, A, P> oj50Var) {
        this.d.b(new io.reactivex.rxjava3.disposables.a(new fa(oj50Var, 7)));
        return new mj50<>(oj50Var, new a(this));
    }

    public final io.reactivex.rxjava3.disposables.b P() {
        return this.e;
    }

    public List<A> Q(S s, S s2, P p) {
        ThreadType.a aVar = ThreadType.Companion;
        ThreadType[] threadTypeArr = {ThreadType.STATE};
        aVar.getClass();
        ThreadType.a.a(threadTypeArr);
        return null;
    }

    public final io.reactivex.rxjava3.internal.operators.completable.u R(io.reactivex.rxjava3.core.a aVar) {
        return aVar.o(yiz.f(com.vk.mvi.core.internal.executors.a.a));
    }

    public final io.reactivex.rxjava3.internal.operators.completable.y S(io.reactivex.rxjava3.core.a aVar) {
        return aVar.q(io.reactivex.rxjava3.schedulers.a.b());
    }

    public final void T(P p) {
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        com.vk.mvi.core.internal.executors.a.b(new com.vk.movika.sdk.base.ui.z(9, this, p));
    }

    @Override // xsna.vk50
    public final VS g() {
        return this.c.g();
    }

    @Override // xsna.a7f0
    public final io.reactivex.rxjava3.disposables.c l(io.reactivex.rxjava3.disposables.c cVar) {
        this.e.b(cVar);
        return cVar;
    }

    @Override // xsna.g4z
    public void onDestroy() {
        ThreadType.a aVar = ThreadType.Companion;
        ThreadType[] threadTypeArr = {ThreadType.MAIN};
        aVar.getClass();
        ThreadType.a.a(threadTypeArr);
        this.c.destroy();
        this.e.dispose();
        this.d.dispose();
    }

    @Override // xsna.a7f0
    public final io.reactivex.rxjava3.disposables.c s(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.core.w wVar, izs<? super Throwable, s3q0> izsVar, gzs<s3q0> gzsVar) {
        return a7f0.a.a(this, aVar, wVar, izsVar, gzsVar);
    }

    @Override // xsna.a7f0
    public final <T> io.reactivex.rxjava3.disposables.c w(io.reactivex.rxjava3.core.x<T> xVar, io.reactivex.rxjava3.core.w wVar, izs<? super T, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        return a7f0.a.c(this, xVar, wVar, izsVar, izsVar2);
    }

    @Override // xsna.a7f0
    public final io.reactivex.rxjava3.core.w y() {
        return io.reactivex.rxjava3.schedulers.a.b();
    }

    @Override // xsna.a7f0
    public final io.reactivex.rxjava3.core.w z() {
        return yiz.f(com.vk.mvi.core.internal.executors.a.a);
    }
}
