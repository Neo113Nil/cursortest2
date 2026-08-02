package com.yandex.go.places.impl.ui.filters;

import com.yandex.go.places.impl.domain.interactors.organizations.f;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.um80;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "it", "Ltpr;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.filters.OrganizationsFiltersUiStateInteractor$special$$inlined$flatMapConcat$1", f = "OrganizationsFiltersUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class OrganizationsFiltersUiStateInteractor$special$$inlined$flatMapConcat$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ um80 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsFiltersUiStateInteractor$special$$inlined$flatMapConcat$1(Continuation continuation, um80 um80Var) {
        super(2, continuation);
        this.this$0 = um80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrganizationsFiltersUiStateInteractor$special$$inlined$flatMapConcat$1 organizationsFiltersUiStateInteractor$special$$inlined$flatMapConcat$1 = new OrganizationsFiltersUiStateInteractor$special$$inlined$flatMapConcat$1(continuation, this.this$0);
        organizationsFiltersUiStateInteractor$special$$inlined$flatMapConcat$1.L$0 = obj;
        return organizationsFiltersUiStateInteractor$special$$inlined$flatMapConcat$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsFiltersUiStateInteractor$special$$inlined$flatMapConcat$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return new mth(new f(new com.yandex.go.places.impl.domain.interactors.organizations.d(this.this$0.a.c), (String) obj2), 6);
    }
}
