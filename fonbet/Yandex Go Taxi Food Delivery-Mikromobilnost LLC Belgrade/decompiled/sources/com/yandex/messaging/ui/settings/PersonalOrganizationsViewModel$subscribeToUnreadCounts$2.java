package com.yandex.messaging.ui.settings;

import defpackage.fzw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rk80;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrk80;", "organization", "Ltpr;", "Lkotlin/Pair;", "", "", "<anonymous>", "(Lrk80;)Ltpr;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.PersonalOrganizationsViewModel$subscribeToUnreadCounts$2", f = "PersonalOrganizationsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PersonalOrganizationsViewModel$subscribeToUnreadCounts$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalOrganizationsViewModel$subscribeToUnreadCounts$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PersonalOrganizationsViewModel$subscribeToUnreadCounts$2 personalOrganizationsViewModel$subscribeToUnreadCounts$2 = new PersonalOrganizationsViewModel$subscribeToUnreadCounts$2(this.this$0, continuation);
        personalOrganizationsViewModel$subscribeToUnreadCounts$2.L$0 = obj;
        return personalOrganizationsViewModel$subscribeToUnreadCounts$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalOrganizationsViewModel$subscribeToUnreadCounts$2) create((rk80) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        rk80 rk80Var = (rk80) this.L$0;
        return new fzw(18, com.yandex.messaging.domain.unreadcount.d.d(this.this$0.y, new Long(rk80Var.a), null, 6), rk80Var);
    }
}
