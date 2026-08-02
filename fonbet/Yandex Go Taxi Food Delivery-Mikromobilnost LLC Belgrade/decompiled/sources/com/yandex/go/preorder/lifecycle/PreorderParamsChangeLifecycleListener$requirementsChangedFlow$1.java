package com.yandex.go.preorder.lifecycle;

import com.yandex.go.address.models.AddressFinalizeTrigger;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/requirements/repository/RequirementsChangedNotifier$ChangeType;", "it", "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/requirements/repository/RequirementsChangedNotifier$ChangeType;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.lifecycle.PreorderParamsChangeLifecycleListener$requirementsChangedFlow$1", f = "PreorderParamsChangeLifecycleListener.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PreorderParamsChangeLifecycleListener$requirementsChangedFlow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreorderParamsChangeLifecycleListener$requirementsChangedFlow$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreorderParamsChangeLifecycleListener$requirementsChangedFlow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreorderParamsChangeLifecycleListener$requirementsChangedFlow$1) create((RequirementsChangedNotifier.ChangeType) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (((ArrayList) kotlin.collections.a.M(this.this$0.c.a.U)).contains(AddressFinalizeTrigger.REQUIREMENTS_CHANGED)) {
            n0 n0Var = this.this$0.g;
            this.label = 1;
            if (n0Var.emit(zy11Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
