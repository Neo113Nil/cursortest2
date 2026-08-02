package com.yandex.go.summary.requirements.list.requirementgroup;

import defpackage.khj0;
import defpackage.lhj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.soj0;
import defpackage.tej0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.requirements.list.requirementgroup.RequirementGroupScreenUiActionInteractor$onSwitcherClick$1$1$1", f = "RequirementGroupScreenUiActionInteractor.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RequirementGroupScreenUiActionInteractor$onSwitcherClick$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ soj0 $action;
    final /* synthetic */ lhj0 $model;
    int label;
    final /* synthetic */ khj0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementGroupScreenUiActionInteractor$onSwitcherClick$1$1$1(khj0 khj0Var, soj0 soj0Var, lhj0 lhj0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = khj0Var;
        this.$action = soj0Var;
        this.$model = lhj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequirementGroupScreenUiActionInteractor$onSwitcherClick$1$1$1(this.this$0, this.$action, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequirementGroupScreenUiActionInteractor$onSwitcherClick$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.summary.requirements.list.router.a aVar = this.this$0.c;
            tej0 tej0Var = this.$action.e;
            String str = this.$model.f;
            this.label = 1;
            if (aVar.a(tej0Var, str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
