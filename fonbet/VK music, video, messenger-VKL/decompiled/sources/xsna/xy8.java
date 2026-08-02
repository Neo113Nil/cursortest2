package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CachingPushMessagesReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.receiver.CachingPushMessagesReceiver$receiveAndSaveMessages$3", f = "CachingPushMessagesReceiver.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class xy8 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ bz8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy8(bz8 bz8Var, spj<? super xy8> spjVar) {
        super(2, spjVar);
        this.this$0 = bz8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xy8(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xy8) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            bz8 bz8Var = this.this$0;
            this.label = 1;
            if (bz8.k(bz8Var, this) == coroutineSingletons) {
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
