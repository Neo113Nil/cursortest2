package com.yandex.go.payments.shared.family.invites.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.owx;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lowx$c;", "invite", "", "Lru/yandex/taxi/gopayments/family/repository/FamilyUiStateRepository$Screen;", "screens", "<anonymous>", "(Lowx$c;Ljava/util/List;)Lowx$c;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.family.invites.data.FamilyInvitesRepository$invitesFlow$1", f = "FamilyInvitesRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class FamilyInvitesRepository$invitesFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FamilyInvitesRepository$invitesFlow$1 familyInvitesRepository$invitesFlow$1 = new FamilyInvitesRepository$invitesFlow$1(3, (Continuation) obj3);
        familyInvitesRepository$invitesFlow$1.L$0 = (owx.c) obj;
        familyInvitesRepository$invitesFlow$1.L$1 = (List) obj2;
        return familyInvitesRepository$invitesFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        owx.c cVar = (owx.c) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (list.isEmpty()) {
            return cVar;
        }
        owx.c.Companion.getClass();
        return owx.c.g;
    }
}
