package xsna;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.eyx;

/* compiled from: Produce.kt */
/* loaded from: classes11.dex */
public final class phd0 {

    /* compiled from: Produce.kt */
    @b6l(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {302}, m = "awaitClose")
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return phd0.a(null, null, this);
        }
    }

    /* compiled from: Produce.kt */
    public static final class b implements izs<Throwable, s3q0> {
        public final /* synthetic */ lq9 b;

        public b(lq9 lq9Var) {
            this.b = lq9Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            s3q0 s3q0Var = s3q0.a;
            this.b.resumeWith(s3q0Var);
            return s3q0Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(zhd0<?> zhd0Var, gzs<s3q0> gzsVar, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        try {
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
                        if (aVar.getContext().get(eyx.a.b) != zhd0Var) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        aVar.L$0 = zhd0Var;
                        aVar.L$1 = gzsVar;
                        aVar.label = 1;
                        lq9 lq9Var = new lq9(1, s7s0.c(aVar));
                        lq9Var.o();
                        zhd0Var.s(new b(lq9Var));
                        if (lq9Var.n() == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gzsVar = (gzs) aVar.L$1;
                        kotlin.a.a(obj);
                    }
                    gzsVar.invoke();
                    return s3q0.a;
                }
            }
            if (i != 0) {
            }
            gzsVar.invoke();
            return s3q0.a;
        } catch (Throwable th) {
            gzsVar.invoke();
            throw th;
        }
        aVar = new a(spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
    }

    public static whd0 b(yvj yvjVar, int i, wzs wzsVar, int i2) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.b;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        whd0 whd0Var = new whd0(mvj.b(yvjVar, emptyCoroutineContext), w0b.a(i, bufferOverflow, null, 4));
        whd0Var.w0(coroutineStart, whd0Var, wzsVar);
        return whd0Var;
    }
}
