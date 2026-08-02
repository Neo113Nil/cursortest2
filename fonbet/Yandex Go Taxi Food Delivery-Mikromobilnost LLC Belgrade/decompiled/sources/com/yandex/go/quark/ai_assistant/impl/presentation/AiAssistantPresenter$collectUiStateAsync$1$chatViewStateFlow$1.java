package com.yandex.go.quark.ai_assistant.impl.presentation;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ndb;
import defpackage.ny61;
import defpackage.qdb;
import defpackage.wl1;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqdb;", "viewState", "Lzy11;", "<anonymous>", "(Lqdb;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.quark.ai_assistant.impl.presentation.AiAssistantPresenter$collectUiStateAsync$1$chatViewStateFlow$1", f = "AiAssistantPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AiAssistantPresenter$collectUiStateAsync$1$chatViewStateFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wl1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiAssistantPresenter$collectUiStateAsync$1$chatViewStateFlow$1(wl1 wl1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wl1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AiAssistantPresenter$collectUiStateAsync$1$chatViewStateFlow$1 aiAssistantPresenter$collectUiStateAsync$1$chatViewStateFlow$1 = new AiAssistantPresenter$collectUiStateAsync$1$chatViewStateFlow$1(this.this$0, continuation);
        aiAssistantPresenter$collectUiStateAsync$1$chatViewStateFlow$1.L$0 = obj;
        return aiAssistantPresenter$collectUiStateAsync$1$chatViewStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AiAssistantPresenter$collectUiStateAsync$1$chatViewStateFlow$1 aiAssistantPresenter$collectUiStateAsync$1$chatViewStateFlow$1 = (AiAssistantPresenter$collectUiStateAsync$1$chatViewStateFlow$1) create((qdb) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        aiAssistantPresenter$collectUiStateAsync$1$chatViewStateFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qdb qdbVar = (qdb) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (jl40.l(qdbVar, ndb.a)) {
            wl1 wl1Var = this.this$0;
            wl1Var.z.c(wl1Var.B.a);
        }
        return zy11.a;
    }
}
