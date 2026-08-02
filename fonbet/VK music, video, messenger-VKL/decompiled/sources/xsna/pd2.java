package xsna;

import android.view.Choreographer;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidUiFrameClock.android.kt */
/* loaded from: classes11.dex */
public final class pd2 implements g830 {
    public final Choreographer b;
    public final od2 c;

    /* compiled from: AndroidUiFrameClock.android.kt */
    public static final class a extends Lambda implements izs<Throwable, s3q0> {
        final /* synthetic */ Choreographer.FrameCallback $callback;
        final /* synthetic */ od2 $uiDispatcher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(od2 od2Var, c cVar) {
            super(1);
            this.$uiDispatcher = od2Var;
            this.$callback = cVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            od2 od2Var = this.$uiDispatcher;
            Choreographer.FrameCallback frameCallback = this.$callback;
            synchronized (od2Var.e) {
                od2Var.g.remove(frameCallback);
            }
            return s3q0.a;
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    public static final class b extends Lambda implements izs<Throwable, s3q0> {
        final /* synthetic */ Choreographer.FrameCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(1);
            this.$callback = cVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            pd2.this.b.removeFrameCallback(this.$callback);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    public static final class c implements Choreographer.FrameCallback {
        public final /* synthetic */ lq9 b;
        public final /* synthetic */ izs<Long, R> c;

        public c(lq9 lq9Var, pd2 pd2Var, izs izsVar) {
            this.b = lq9Var;
            this.c = izsVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object failure;
            try {
                failure = this.c.invoke(Long.valueOf(j));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            this.b.resumeWith(failure);
        }
    }

    public pd2(Choreographer choreographer, od2 od2Var) {
        this.b = choreographer;
        this.c = od2Var;
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
        od2 od2Var = this.c;
        lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        c cVar = new c(lq9Var, this, izsVar);
        if (epx.f(od2Var.c, this.b)) {
            synchronized (od2Var.e) {
                try {
                    od2Var.g.add(cVar);
                    if (!od2Var.j) {
                        od2Var.j = true;
                        od2Var.c.postFrameCallback(od2Var.k);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            lq9Var.r(new a(od2Var, cVar));
        } else {
            this.b.postFrameCallback(cVar);
            lq9Var.r(new b(cVar));
        }
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
