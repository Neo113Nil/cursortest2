package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ssn0;

/* compiled from: VkTabItem.kt */
@b6l(c = "com.vk.core.compose.component.tabs.TabItem$Right$Icon$Content$1$1", f = "VkTabItem.kt", l = {Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class rsn0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ if2<l5g, vq2> $iconColor;
    final /* synthetic */ long $iconColorSelected;
    final /* synthetic */ long $iconColorUnselected;
    int label;
    final /* synthetic */ ssn0.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsn0(if2<l5g, vq2> if2Var, long j, long j2, ssn0.a aVar, spj<? super rsn0> spjVar) {
        super(2, spjVar);
        this.$iconColor = if2Var;
        this.$iconColorUnselected = j;
        this.$iconColorSelected = j2;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rsn0(this.$iconColor, this.$iconColorUnselected, this.$iconColorSelected, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rsn0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if2<l5g, vq2> if2Var = this.$iconColor;
            l5g l5gVar = new l5g(f870.D(this.$iconColorUnselected, this.$iconColorSelected, ((Number) ((zak0) this.this$0.a).getValue()).floatValue()));
            this.label = 1;
            if (if2Var.e(l5gVar, this) == coroutineSingletons) {
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
