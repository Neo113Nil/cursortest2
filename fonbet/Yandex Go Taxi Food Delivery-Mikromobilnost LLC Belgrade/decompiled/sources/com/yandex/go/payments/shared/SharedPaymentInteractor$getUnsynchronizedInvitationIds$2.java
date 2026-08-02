package com.yandex.go.payments.shared;

import com.yandex.go.payments.data.model.response.SharedAccount;
import defpackage.fga0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.SharedPaymentInteractor$getUnsynchronizedInvitationIds$2", f = "SharedPaymentInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SharedPaymentInteractor$getUnsynchronizedInvitationIds$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentInteractor$getUnsynchronizedInvitationIds$2(v vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedPaymentInteractor$getUnsynchronizedInvitationIds$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPaymentInteractor$getUnsynchronizedInvitationIds$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = this.this$0.b.b.g().f.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!((SharedAccount) obj2).getG()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SharedAccount) it.next()).i());
        }
        fga0 fga0Var = this.this$0.b;
        Set n = fga0Var.a.n(fga0Var.x);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!n.contains((String) next)) {
                arrayList3.add(next);
            }
        }
        return kotlin.collections.a.J0(arrayList3);
    }
}
