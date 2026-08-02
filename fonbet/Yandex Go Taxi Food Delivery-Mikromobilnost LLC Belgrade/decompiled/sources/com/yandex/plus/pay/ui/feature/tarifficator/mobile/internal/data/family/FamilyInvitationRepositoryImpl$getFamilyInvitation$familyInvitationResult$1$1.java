package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/plus/pay/internal/model/PlusPayWebFamilyInviteResult;", "<anonymous>", "(Ltse;)Lcom/yandex/plus/pay/internal/model/PlusPayWebFamilyInviteResult;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.FamilyInvitationRepositoryImpl$getFamilyInvitation$familyInvitationResult$1$1", f = "FamilyInvitationRepositoryImpl.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FamilyInvitationRepositoryImpl$getFamilyInvitation$familyInvitationResult$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ a $this_runSuspendCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyInvitationRepositoryImpl$getFamilyInvitation$familyInvitationResult$1$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.$this_runSuspendCatching = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FamilyInvitationRepositoryImpl$getFamilyInvitation$familyInvitationResult$1$1(this.$this_runSuspendCatching, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FamilyInvitationRepositoryImpl$getFamilyInvitation$familyInvitationResult$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        com.yandex.plus.pay.internal.feature.family.b bVar = (com.yandex.plus.pay.internal.feature.family.b) ((com.yandex.plus.pay.internal.b) this.$this_runSuspendCatching.a).j.getValue();
        this.label = 1;
        Object a = bVar.a(this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
