package com.yandex.messaging.phonecontacts;

import defpackage.hae;
import defpackage.lae;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "q", "Llae;", ClidProvider.STATE, "<anonymous>", "(Ljava/lang/String;Llae;)Llae;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.phonecontacts.ContactListViewModel$uiState$1", f = "ContactListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ContactListViewModel$uiState$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ContactListViewModel$uiState$1 contactListViewModel$uiState$1 = new ContactListViewModel$uiState$1(3, (Continuation) obj3);
        contactListViewModel$uiState$1.L$0 = (String) obj;
        contactListViewModel$uiState$1.L$1 = (lae) obj2;
        return contactListViewModel$uiState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        String str = (String) this.L$0;
        lae laeVar = (lae) this.L$1;
        return laeVar instanceof hae ? new hae(str, ((hae) laeVar).b) : laeVar;
    }
}
