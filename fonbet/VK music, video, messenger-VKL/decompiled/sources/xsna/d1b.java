package xsna;

import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: Merge.kt */
/* loaded from: classes11.dex */
public final class d1b<T> extends sya<T> {
    public final Iterable<ksr<T>> e;

    /* compiled from: Merge.kt */
    @b6l(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", l = {92}, m = "invokeSuspend")
    /* loaded from: classes8.dex */
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ aki0<T> $collector;
        final /* synthetic */ ksr<T> $flow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ksr<? extends T> ksrVar, aki0<T> aki0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$flow = ksrVar;
            this.$collector = aki0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$flow, this.$collector, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ksr<T> ksrVar = this.$flow;
                aki0<T> aki0Var = this.$collector;
                this.label = 1;
                if (ksrVar.collect(aki0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d1b(Iterable<? extends ksr<? extends T>> iterable, kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        super(dVar, i, bufferOverflow);
        this.e = iterable;
    }

    @Override // xsna.sya
    public final Object c(zhd0<? super T> zhd0Var, spj<? super s3q0> spjVar) {
        aki0 aki0Var = new aki0(zhd0Var);
        Iterator<ksr<T>> it = this.e.iterator();
        while (it.hasNext()) {
            myc0.h(zhd0Var, null, null, new a(it.next(), aki0Var, null), 3);
        }
        return s3q0.a;
    }

    @Override // xsna.sya
    public final sya<T> f(kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        return new d1b(this.e, dVar, i, bufferOverflow);
    }

    @Override // xsna.sya
    public final b9f0<T> i(yvj yvjVar) {
        wzs ryaVar = new rya(this, null);
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        whd0 whd0Var = new whd0(mvj.b(yvjVar, this.b), w0b.a(this.c, bufferOverflow, null, 4));
        whd0Var.w0(coroutineStart, whd0Var, ryaVar);
        return whd0Var;
    }
}
