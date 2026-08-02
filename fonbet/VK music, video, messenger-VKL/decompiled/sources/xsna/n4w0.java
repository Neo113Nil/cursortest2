package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.push.pushsdk.notifier.model.NotifierRequest;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

/* compiled from: VkpnsNotifierMessagesReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.notifier.VkpnsNotifierMessagesReceiver$aliveListener$1", f = "VkpnsNotifierMessagesReceiver.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class n4w0 extends SuspendLambda implements izs<spj<? super Boolean>, Object> {
    int label;
    final /* synthetic */ s4w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4w0(s4w0 s4w0Var, spj<? super n4w0> spjVar) {
        super(1, spjVar);
        this.this$0 = s4w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new n4w0(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super Boolean> spjVar) {
        return ((n4w0) create(spjVar)).invokeSuspend(s3q0.a);
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
        h18 h18Var = this.this$0.d;
        this.label = 1;
        Boolean valueOf = Boolean.valueOf(((l4w0) ((bbu) h18Var.b).a).e(new JSONObject().put("id", ((AtomicInteger) ((pwi) h18Var.c).b).incrementAndGet()).put("method", NotifierRequest.CHECK_ALIVE.h()).toString()));
        return valueOf == coroutineSingletons ? coroutineSingletons : valueOf;
    }
}
