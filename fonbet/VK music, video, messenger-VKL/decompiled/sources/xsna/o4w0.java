package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkpnsNotifierMessagesReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.notifier.VkpnsNotifierMessagesReceiver$aliveListener$2", f = "VkpnsNotifierMessagesReceiver.kt", l = {TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class o4w0 extends SuspendLambda implements izs<spj<? super qjx0>, Object> {
    int label;
    final /* synthetic */ s4w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4w0(s4w0 s4w0Var, spj<? super o4w0> spjVar) {
        super(1, spjVar);
        this.this$0 = s4w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new o4w0(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super qjx0> spjVar) {
        return ((o4w0) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        s4w0 s4w0Var = this.this$0;
        this.label = 1;
        Object i2 = s4w0.i(s4w0Var, this);
        return i2 == coroutineSingletons ? coroutineSingletons : i2;
    }
}
