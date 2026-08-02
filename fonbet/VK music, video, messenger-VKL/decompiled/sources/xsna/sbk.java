package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CreationOnBoardingTasksScreen.kt */
@b6l(c = "com.vk.profile.community.creationonboarding.impl.tasks.presentation.compose.CreationOnBoardingTasksScreenKt$CreationOnBoardingTasksScreen$2$1", f = "CreationOnBoardingTasksScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class sbk extends SuspendLambda implements yzs<z37<cck>, tck, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<tck, s3q0> $onEvent;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sbk(izs<? super tck, s3q0> izsVar, spj<? super sbk> spjVar) {
        super(3, spjVar);
        this.$onEvent = izsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(z37<cck> z37Var, tck tckVar, spj<? super s3q0> spjVar) {
        sbk sbkVar = new sbk(this.$onEvent, spjVar);
        sbkVar.L$0 = tckVar;
        return sbkVar.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tck tckVar = (tck) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onEvent.invoke(tckVar);
        return s3q0.a;
    }
}
