package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StartPushServiceInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.domain.interactor.StartPushServiceInteractor$invoke$1", f = "StartPushServiceInteractor.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class mqk0 extends SuspendLambda implements yzs<Integer, Boolean, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<spj<? super s3q0>, Object> $onStartPushService;
    /* synthetic */ int I$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ oqk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mqk0(oqk0 oqk0Var, izs<? super spj<? super s3q0>, ? extends Object> izsVar, spj<? super mqk0> spjVar) {
        super(3, spjVar);
        this.this$0 = oqk0Var;
        this.$onStartPushService = izsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Integer num, Boolean bool, spj<? super s3q0> spjVar) {
        int intValue = num.intValue();
        boolean booleanValue = bool.booleanValue();
        mqk0 mqk0Var = new mqk0(this.this$0, this.$onStartPushService, spjVar);
        mqk0Var.I$0 = intValue;
        mqk0Var.Z$0 = booleanValue;
        return mqk0Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            int i2 = this.I$0;
            boolean z = this.Z$0;
            oqk0 oqk0Var = this.this$0;
            izs<spj<? super s3q0>, Object> izsVar = this.$onStartPushService;
            this.label = 1;
            if (oqk0.a(oqk0Var, i2, z, izsVar, this) == coroutineSingletons) {
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
