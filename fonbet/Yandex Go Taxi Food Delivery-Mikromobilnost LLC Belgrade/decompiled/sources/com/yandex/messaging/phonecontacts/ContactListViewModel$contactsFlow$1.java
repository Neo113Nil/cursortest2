package com.yandex.messaging.phonecontacts;

import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.jl40;
import defpackage.mae;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obt;
import defpackage.pbt;
import defpackage.qbt;
import defpackage.w511;
import defpackage.wls;
import defpackage.x22;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqbt;", TarifficatorScenarioActivity.RESULT_KEY, "<anonymous>", "(Lqbt;)Lqbt;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.phonecontacts.ContactListViewModel$contactsFlow$1", f = "ContactListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ContactListViewModel$contactsFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactListViewModel$contactsFlow$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ContactListViewModel$contactsFlow$1 contactListViewModel$contactsFlow$1 = new ContactListViewModel$contactsFlow$1(this.this$0, continuation);
        contactListViewModel$contactsFlow$1.L$0 = obj;
        return contactListViewModel$contactsFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ContactListViewModel$contactsFlow$1) create((qbt) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        qbt qbtVar = (qbt) this.L$0;
        a aVar = this.this$0;
        x22 x22Var = aVar.w;
        if (jl40.l(qbtVar, obt.a)) {
            x22Var.c("contacts_list", ClidProvider.STATE, BackendConfig.Restrictions.DISABLED);
        } else if (jl40.l(qbtVar, obt.b)) {
            x22Var.c("contacts_list", ClidProvider.STATE, "no_permission");
        } else if (jl40.l(qbtVar, obt.c)) {
            x22Var.c("contacts_list", ClidProvider.STATE, "sync_off");
        } else if (jl40.l(qbtVar, obt.d)) {
            x22Var.c("contacts_list", ClidProvider.STATE, "empty");
        } else {
            if (!(qbtVar instanceof pbt)) {
                w511.b();
                return null;
            }
            aVar.w.f("contacts_list", ClidProvider.STATE, "success", "count", Integer.valueOf(((pbt) qbtVar).a.size()));
        }
        return qbtVar instanceof pbt ? new pbt(kotlin.collections.a.x0(((pbt) qbtVar).a, new mae())) : qbtVar;
    }
}
