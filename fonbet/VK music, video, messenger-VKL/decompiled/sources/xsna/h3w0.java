package xsna;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkWorkoutWidgetStore.kt */
@b6l(c = "com.vk.superapp.vkworkout.widget.impl.data.store.VkWorkoutWidgetStore$saveVkWorkoutWidgetSyncBackgroundConfig$2", f = "VkWorkoutWidgetStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class h3w0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ List<String> $schedule;
    int label;
    final /* synthetic */ i3w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3w0(i3w0 i3w0Var, boolean z, List<String> list, spj<? super h3w0> spjVar) {
        super(2, spjVar);
        this.this$0 = i3w0Var;
        this.$isEnabled = z;
        this.$schedule = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new h3w0(this.this$0, this.$isEnabled, this.$schedule, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((h3w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        i3w0 i3w0Var = this.this$0;
        boolean z = this.$isEnabled;
        f18 f18Var = i3w0Var.a;
        qcy<Object>[] qcyVarArr = i3w0.f;
        qcy<Object> qcyVar = qcyVarArr[0];
        f18Var.b(z);
        i3w0 i3w0Var2 = this.this$0;
        String k = p4g.k(this.$schedule, ";", null);
        tw8 tw8Var = i3w0Var2.b;
        qcy<Object> qcyVar2 = qcyVarArr[1];
        tw8Var.g(k);
        xgx0 xgx0Var = xgx0.a;
        String str = "VkWorkoutWidgetStore saveVkWorkoutWidgetSyncBackgroundConfig ->\nisEnabled: " + this.$isEnabled + ",\nschedule: " + this.$schedule;
        xgx0Var.getClass();
        xgx0.a(str);
        return s3q0.a;
    }
}
