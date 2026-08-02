package xsna;

import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.gu5;

/* compiled from: BroadcastFrameClock.kt */
/* loaded from: classes11.dex */
public final class ag8 implements g830 {
    public final f880 b;
    public final gu5<a<?>> c = new gu5<>();

    /* compiled from: BroadcastFrameClock.kt */
    public static final class a<R> extends gu5.a {
        public lq9 a;
        public izs<? super Long, ? extends R> b;

        public a() {
            throw null;
        }

        @Override // xsna.gu5.a
        public final void a() {
            this.b = null;
            this.a = null;
        }

        @Override // xsna.gu5.a
        public final void b(Throwable th) {
            lq9 lq9Var = this.a;
            if (lq9Var != null) {
                lq9Var.resumeWith(new Result.Failure(th));
            }
        }
    }

    /* compiled from: BroadcastFrameClock.kt */
    public static final class b implements izs<Throwable, s3q0> {
        public final /* synthetic */ qq9 b;

        public b(qq9 qq9Var) {
            this.b = qq9Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            this.b.cancel();
            return s3q0.a;
        }
    }

    public ag8(f880 f880Var) {
        this.b = f880Var;
    }

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.a(this, cVar);
    }

    @Override // xsna.g830
    public final <R> Object k(izs<? super Long, ? extends R> izsVar, spj<? super R> spjVar) {
        lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        a<?> aVar = new a<>();
        aVar.a = lq9Var;
        aVar.b = izsVar;
        lq9Var.r(new b(this.c.a(aVar, this.b)));
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(d.c<?> cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return d.a.a(this, dVar);
    }
}
