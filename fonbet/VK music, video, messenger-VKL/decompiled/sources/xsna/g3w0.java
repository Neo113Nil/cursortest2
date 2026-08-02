package xsna;

import com.vk.superapp.vkworkout.widget.api.VkWorkoutSmallWidgetUiState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkWorkoutWidgetStore.kt */
@b6l(c = "com.vk.superapp.vkworkout.widget.impl.data.store.VkWorkoutWidgetStore$saveVkWorkoutSmallWidgetUiState$2", f = "VkWorkoutWidgetStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class g3w0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ VkWorkoutSmallWidgetUiState $uiState;
    int label;
    final /* synthetic */ i3w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3w0(i3w0 i3w0Var, VkWorkoutSmallWidgetUiState vkWorkoutSmallWidgetUiState, spj<? super g3w0> spjVar) {
        super(2, spjVar);
        this.this$0 = i3w0Var;
        this.$uiState = vkWorkoutSmallWidgetUiState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new g3w0(this.this$0, this.$uiState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((g3w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        i3w0 i3w0Var = this.this$0;
        String name = this.$uiState.d.name();
        tw8 tw8Var = i3w0Var.c;
        qcy<Object>[] qcyVarArr = i3w0.f;
        qcy<Object> qcyVar = qcyVarArr[2];
        tw8Var.g(name);
        i3w0 i3w0Var2 = this.this$0;
        long j = this.$uiState.c;
        hn70 hn70Var = i3w0Var2.d;
        qcy<Object> qcyVar2 = qcyVarArr[3];
        hn70Var.b(j);
        i3w0 i3w0Var3 = this.this$0;
        long j2 = this.$uiState.b;
        hn70 hn70Var2 = i3w0Var3.e;
        qcy<Object> qcyVar3 = qcyVarArr[4];
        hn70Var2.b(j2);
        xgx0 xgx0Var = xgx0.a;
        String str = "VkWorkoutWidgetStore saveVkWorkoutSmallWidgetUiState ->\nuiState: " + this.$uiState;
        xgx0Var.getClass();
        xgx0.a(str);
        return s3q0.a;
    }
}
