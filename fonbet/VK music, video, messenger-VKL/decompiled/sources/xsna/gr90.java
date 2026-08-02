package xsna;

import java.util.ArrayList;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PausableMonotonicFrameClock.kt */
/* loaded from: classes11.dex */
public final class gr90 implements g830 {
    public final g830 b;
    public final imy c = new imy();

    /* compiled from: PausableMonotonicFrameClock.kt */
    @b6l(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {61, 62}, m = "withFrameNanos", v = 1)
    public static final class a<R> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(spj<? super a> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return gr90.this.k(null, this);
        }
    }

    public gr90(g830 g830Var) {
        this.b = g830Var;
    }

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.a(this, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // xsna.g830
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> Object k(izs<? super Long, ? extends R> izsVar, spj<? super R> spjVar) {
        a aVar;
        int i;
        boolean z;
        Object n;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    imy imyVar = this.c;
                    aVar.L$0 = izsVar;
                    aVar.label = 1;
                    synchronized (imyVar.b) {
                        z = imyVar.a;
                    }
                    if (z) {
                        n = s3q0.a;
                    } else {
                        lq9 lq9Var = new lq9(1, s7s0.c(aVar));
                        lq9Var.o();
                        synchronized (imyVar.b) {
                            ((ArrayList) imyVar.c).add(lq9Var);
                        }
                        lq9Var.r(new hmy(imyVar, lq9Var));
                        n = lq9Var.n();
                        if (n != coroutineSingletons) {
                            n = s3q0.a;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return obj;
                    }
                    izsVar = (izs) aVar.L$0;
                    kotlin.a.a(obj);
                }
                g830 g830Var = this.b;
                aVar.L$0 = null;
                aVar.label = 2;
                Object k = g830Var.k(izsVar, aVar);
                return k != coroutineSingletons ? coroutineSingletons : k;
            }
        }
        aVar = new a(spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        g830 g830Var2 = this.b;
        aVar.L$0 = null;
        aVar.label = 2;
        Object k2 = g830Var2.k(izsVar, aVar);
        if (k2 != coroutineSingletons2) {
        }
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
