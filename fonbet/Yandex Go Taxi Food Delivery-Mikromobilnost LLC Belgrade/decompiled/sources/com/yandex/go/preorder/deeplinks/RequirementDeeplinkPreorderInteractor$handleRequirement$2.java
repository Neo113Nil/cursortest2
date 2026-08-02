package com.yandex.go.preorder.deeplinks;

import defpackage.ffj0;
import defpackage.kma1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.deeplinks.RequirementDeeplinkPreorderInteractor$handleRequirement$2", f = "RequirementDeeplinkPreorderInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RequirementDeeplinkPreorderInteractor$handleRequirement$2 extends SuspendLambda implements wls {
    final /* synthetic */ ffj0 $requirementData;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementDeeplinkPreorderInteractor$handleRequirement$2(b bVar, ffj0 ffj0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$requirementData = ffj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequirementDeeplinkPreorderInteractor$handleRequirement$2(this.this$0, this.$requirementData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RequirementDeeplinkPreorderInteractor$handleRequirement$2 requirementDeeplinkPreorderInteractor$handleRequirement$2 = (RequirementDeeplinkPreorderInteractor$handleRequirement$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        requirementDeeplinkPreorderInteractor$handleRequirement$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.a.m(this.$requirementData.a, null);
        this.this$0.b.a = kma1.f(this.$requirementData.b);
        return zy11.a;
    }
}
