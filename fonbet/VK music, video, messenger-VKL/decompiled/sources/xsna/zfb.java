package xsna;

import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.kbb;

/* compiled from: Channels.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class zfb {

    /* compiled from: Channels.kt */
    @b6l(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super kbb<? extends s3q0>>, Object> {
        final /* synthetic */ Object $element;
        final /* synthetic */ ohi0<Object> $this_trySendBlocking;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ohi0<Object> ohi0Var, Object obj, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$this_trySendBlocking = ohi0Var;
            this.$element = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$this_trySendBlocking, this.$element, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super kbb<? extends s3q0>> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object failure;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    ohi0<Object> ohi0Var = this.$this_trySendBlocking;
                    Object obj2 = this.$element;
                    this.label = 1;
                    if (ohi0Var.t(obj2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                failure = s3q0.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            return new kbb(!(failure instanceof Result.Failure) ? s3q0.a : new kbb.a(Result.a(failure)));
        }
    }

    public static final Object a(Object obj, ohi0 ohi0Var) {
        Object f = ohi0Var.f(obj);
        if (f instanceof kbb.b) {
            return ((kbb) myc0.i(EmptyCoroutineContext.b, new a(ohi0Var, obj, null))).a;
        }
        return s3q0.a;
    }
}
