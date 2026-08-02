package xsna;

import com.vk.push.common.AppInfo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

/* compiled from: PushDeliveryComponent.kt */
@b6l(c = "com.vk.push.pushsdk.delivery.PushDeliveryComponent$startDeliverInvalidateToClient$job$1", f = "PushDeliveryComponent.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class lhe0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ AppInfo $appInfo;
    int label;
    final /* synthetic */ nhe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhe0(nhe0 nhe0Var, AppInfo appInfo, spj<? super lhe0> spjVar) {
        super(2, spjVar);
        this.this$0 = nhe0Var;
        this.$appInfo = appInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lhe0(this.this$0, this.$appInfo, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lhe0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
            Object collect = nhe0Var.h.l(appInfo.getPackageName()).collect(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2(new ihe0(nhe0Var, appInfo)), this);
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
