package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: SubscriberExt.kt */
@b6l(c = "com.vk.mvi.flow.SubscriberExtKt$asFlow$1", f = "SubscriberExt.kt", l = {12}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class cxm0 extends SuspendLambda implements wzs<zhd0<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ fn50<Object> $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: SubscriberExt.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Object obj) {
            zfb.a(obj, (zhd0) this.receiver);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxm0(fn50<Object> fn50Var, spj<? super cxm0> spjVar) {
        super(2, spjVar);
        this.$this_asFlow = fn50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        cxm0 cxm0Var = new cxm0(this.$this_asFlow, spjVar);
        cxm0Var.L$0 = obj;
        return cxm0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<Object> zhd0Var, spj<? super s3q0> spjVar) {
        return ((cxm0) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zhd0 zhd0Var = (zhd0) this.L$0;
            y3l0 y3l0Var = new y3l0(this.$this_asFlow.b().invoke(new a(1, zhd0Var, yfb.class, "trySendBlocking", "trySendBlocking(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Ljava/lang/Object;", 9)), 6);
            this.label = 1;
            if (phd0.a(zhd0Var, y3l0Var, this) == coroutineSingletons) {
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
