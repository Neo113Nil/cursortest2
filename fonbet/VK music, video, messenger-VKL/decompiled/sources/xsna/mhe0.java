package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.core.backoff.ExponentialBackOff;
import com.vk.push.pushsdk.delivery.PushDeliveryComponent$handledMessages$$inlined$filter$1$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.json.JsonToken;

/* compiled from: PushDeliveryComponent.kt */
@b6l(c = "com.vk.push.pushsdk.delivery.PushDeliveryComponent$startDeliverPushesToClient$job$1", f = "PushDeliveryComponent.kt", l = {JsonToken.BOOLEAN}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class mhe0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ AppInfo $appInfo;
    int label;
    final /* synthetic */ nhe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhe0(nhe0 nhe0Var, AppInfo appInfo, spj<? super mhe0> spjVar) {
        super(2, spjVar);
        this.this$0 = nhe0Var;
        this.$appInfo = appInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mhe0(this.this$0, this.$appInfo, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mhe0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            nhe0 nhe0Var = this.this$0;
            AppInfo appInfo = this.$appInfo;
            this.label = 1;
            nhe0Var.getClass();
            Object collect = nhe0Var.g.d(appInfo.getPackageName()).collect(new PushDeliveryComponent$handledMessages$$inlined$filter$1$2(new ghe0(nhe0Var, appInfo, new ExponentialBackOff.Builder().build())), this);
            if (collect != coroutineSingletons) {
                collect = s3q0.a;
            }
            if (collect != coroutineSingletons) {
                collect = s3q0.a;
            }
            if (collect == coroutineSingletons) {
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
