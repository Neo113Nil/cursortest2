package xsna;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.m0l0;

/* compiled from: VkStepsStore.kt */
@b6l(c = "com.vk.superapp.vksteps.data.store.VkStepsStore$setMonthlySteps$2", f = "VkStepsStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class anv0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ List<m0l0> $steps;
    int label;
    final /* synthetic */ xmv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anv0(xmv0 xmv0Var, List<m0l0> list, spj<? super anv0> spjVar) {
        super(2, spjVar);
        this.this$0 = xmv0Var;
        this.$steps = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new anv0(this.this$0, this.$steps, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((anv0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        xmv0 xmv0Var = this.this$0;
        ArrayList a = xmv0.a(xmv0Var, this.$steps);
        SimpleDateFormat simpleDateFormat = m0l0.h;
        String jSONArray = m0l0.a.b(a, false).toString();
        tw8 tw8Var = xmv0Var.a;
        qcy<Object> qcyVar = xmv0.b[0];
        tw8Var.g(jSONArray);
        return s3q0.a;
    }
}
