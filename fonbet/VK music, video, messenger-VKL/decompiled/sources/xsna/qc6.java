package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BaseDeliveryComponent.kt */
@b6l(c = "com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$4", f = "BaseDeliveryComponent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class qc6 extends SuspendLambda implements wzs<e790, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ rc6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc6(rc6 rc6Var, spj<? super qc6> spjVar) {
        super(2, spjVar);
        this.this$0 = rc6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        qc6 qc6Var = new qc6(this.this$0, spjVar);
        qc6Var.L$0 = obj;
        return qc6Var;
    }

    @Override // xsna.wzs
    public final Object invoke(e790 e790Var, spj<? super s3q0> spjVar) {
        return ((qc6) create(e790Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.this$0.c.add(((e790) this.L$0).b);
        return s3q0.a;
    }
}
