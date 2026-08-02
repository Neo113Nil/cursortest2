package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkTabItem.kt */
@b6l(c = "com.vk.core.compose.component.tabs.VkTabItemKt$VKTabItem$1$1", f = "VkTabItem.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class hpv0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ osn0 $left;
    final /* synthetic */ psn0 $middle;
    final /* synthetic */ ssn0 $right;
    final /* synthetic */ mtk0<Float> $selectedProgress;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpv0(psn0 psn0Var, mtk0<Float> mtk0Var, osn0 osn0Var, ssn0 ssn0Var, spj<? super hpv0> spjVar) {
        super(2, spjVar);
        this.$middle = psn0Var;
        this.$selectedProgress = mtk0Var;
        this.$left = osn0Var;
        this.$right = ssn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new hpv0(this.$middle, this.$selectedProgress, this.$left, this.$right, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hpv0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wh50<Float> wh50Var;
        wh50<Float> wh50Var2;
        wh50<Float> wh50Var3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        psn0 psn0Var = this.$middle;
        if (psn0Var != null && (wh50Var3 = psn0Var.a) != null) {
            ((zak0) wh50Var3).setValue(this.$selectedProgress.getValue());
        }
        osn0 osn0Var = this.$left;
        if (osn0Var != null && (wh50Var2 = osn0Var.a) != null) {
            ((zak0) wh50Var2).setValue(this.$selectedProgress.getValue());
        }
        ssn0 ssn0Var = this.$right;
        if (ssn0Var != null && (wh50Var = ssn0Var.a) != null) {
            ((zak0) wh50Var).setValue(this.$selectedProgress.getValue());
        }
        return s3q0.a;
    }
}
