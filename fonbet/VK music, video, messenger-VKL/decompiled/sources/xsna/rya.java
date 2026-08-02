package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ChannelFlow.kt */
@b6l(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class rya extends SuspendLambda implements wzs<zhd0<Object>, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sya<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rya(sya<Object> syaVar, spj<? super rya> spjVar) {
        super(2, spjVar);
        this.this$0 = syaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        rya ryaVar = new rya(this.this$0, spjVar);
        ryaVar.L$0 = obj;
        return ryaVar;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<Object> zhd0Var, spj<? super s3q0> spjVar) {
        return ((rya) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zhd0<? super Object> zhd0Var = (zhd0) this.L$0;
            sya<Object> syaVar = this.this$0;
            this.label = 1;
            if (syaVar.c(zhd0Var, this) == coroutineSingletons) {
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
