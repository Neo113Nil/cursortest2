package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ChannelFlow.kt */
@b6l(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class uya extends SuspendLambda implements wzs<lsr<Object>, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ vya<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uya(vya<Object, Object> vyaVar, spj<? super uya> spjVar) {
        super(2, spjVar);
        this.this$0 = vyaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        uya uyaVar = new uya(this.this$0, spjVar);
        uyaVar.L$0 = obj;
        return uyaVar;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<Object> lsrVar, spj<? super s3q0> spjVar) {
        return ((uya) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            lsr<? super Object> lsrVar = (lsr) this.L$0;
            vya<Object, Object> vyaVar = this.this$0;
            this.label = 1;
            if (vyaVar.j(lsrVar, this) == coroutineSingletons) {
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
