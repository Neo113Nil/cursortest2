package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.f6v;
import defpackage.h6v;
import defpackage.ioj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.summary.requirements.list.models.RequirementsDueViewPosition;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "isRedesignEnabled", "Lf6v;", "Lufx0;", "Lioj0;", "dueIdentifiable", "", "Lrcx0;", "<anonymous>", "(ZLf6v;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.GluedDueRequirementUiStateInteractor$uiStateFlow$1", f = "GluedDueRequirementUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class GluedDueRequirementUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GluedDueRequirementUiStateInteractor$uiStateFlow$1(u uVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = uVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        GluedDueRequirementUiStateInteractor$uiStateFlow$1 gluedDueRequirementUiStateInteractor$uiStateFlow$1 = new GluedDueRequirementUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj3);
        gluedDueRequirementUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        gluedDueRequirementUiStateInteractor$uiStateFlow$1.L$0 = (f6v) obj2;
        return gluedDueRequirementUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        f6v f6vVar = (f6v) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        u uVar = this.this$0;
        h6v h6vVar = f6vVar.a;
        ioj0 ioj0Var = (ioj0) f6vVar.b;
        return new f6v(h6vVar, ioj0Var.g == RequirementsDueViewPosition.GLUED ? scc.h(uVar.b.f(ioj0Var, z)) : EmptyList.a);
    }
}
