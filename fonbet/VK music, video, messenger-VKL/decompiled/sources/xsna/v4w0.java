package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkpnsNotifierMessagesReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.notifier.VkpnsNotifierMessagesReceiver$subscribeForPushes$2", f = "VkpnsNotifierMessagesReceiver.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class v4w0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $pushToken;
    int label;
    final /* synthetic */ s4w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4w0(s4w0 s4w0Var, String str, spj<? super v4w0> spjVar) {
        super(2, spjVar);
        this.this$0 = s4w0Var;
        this.$pushToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new v4w0(this.this$0, this.$pushToken, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((v4w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            s4w0 s4w0Var = this.this$0;
            String str = this.$pushToken;
            this.label = 1;
            if (s4w0.j(s4w0Var, str, this) == coroutineSingletons) {
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
