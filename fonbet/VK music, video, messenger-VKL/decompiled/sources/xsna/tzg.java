package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CommunityCreationOnboardingFinishScreen.kt */
@b6l(c = "com.vk.profile.community.creationonboarding.impl.finish.presentation.compose.CommunityCreationOnboardingFinishScreenKt$CommunityCreationOnboardingFinishScreen$2$1", f = "CommunityCreationOnboardingFinishScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class tzg extends SuspendLambda implements yzs<z37<com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a>, pzg, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<pzg, s3q0> $onEvent;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tzg(izs<? super pzg, s3q0> izsVar, spj<? super tzg> spjVar) {
        super(3, spjVar);
        this.$onEvent = izsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(z37<com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a> z37Var, pzg pzgVar, spj<? super s3q0> spjVar) {
        tzg tzgVar = new tzg(this.$onEvent, spjVar);
        tzgVar.L$0 = pzgVar;
        return tzgVar.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pzg pzgVar = (pzg) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onEvent.invoke(pzgVar);
        return s3q0.a;
    }
}
