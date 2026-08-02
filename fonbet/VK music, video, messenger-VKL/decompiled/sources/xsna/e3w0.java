package xsna;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.superapp.vkworkout.widget.api.VkWorkoutSmallWidgetUiState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkWorkoutWidgetStore.kt */
@b6l(c = "com.vk.superapp.vkworkout.widget.impl.data.store.VkWorkoutWidgetStore$getVkWorkoutSmallWidgetUiState$2", f = "VkWorkoutWidgetStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class e3w0 extends SuspendLambda implements wzs<yvj, spj<? super VkWorkoutSmallWidgetUiState>, Object> {
    int label;
    final /* synthetic */ i3w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3w0(i3w0 i3w0Var, spj<? super e3w0> spjVar) {
        super(2, spjVar);
        this.this$0 = i3w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e3w0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super VkWorkoutSmallWidgetUiState> spjVar) {
        return ((e3w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        tw8 tw8Var = this.this$0.c;
        qcy<Object>[] qcyVarArr = i3w0.f;
        qcy<Object> qcyVar = qcyVarArr[2];
        String b = tw8Var.b();
        if (drm0.N(b)) {
            b = null;
        }
        if (b == null) {
            b = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        hn70 hn70Var = this.this$0.d;
        qcy<Object> qcyVar2 = qcyVarArr[3];
        int longValue = (int) hn70Var.a().longValue();
        hn70 hn70Var2 = this.this$0.e;
        qcy<Object> qcyVar3 = qcyVarArr[4];
        VkWorkoutSmallWidgetUiState vkWorkoutSmallWidgetUiState = new VkWorkoutSmallWidgetUiState((int) hn70Var2.a().longValue(), longValue, VkWorkoutSmallWidgetUiState.State.valueOf(b));
        xgx0.a.getClass();
        xgx0.a("VkWorkoutWidgetStore saveVkWorkoutSmallWidgetUiState ->\nuiState: " + vkWorkoutSmallWidgetUiState);
        return vkWorkoutSmallWidgetUiState;
    }
}
