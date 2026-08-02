package com.yandex.go.trusted_contacts.data.repositories;

import com.yandex.go.trusted_contacts.data.entities.network.TrustingContactDto;
import com.yandex.go.trusted_contacts.domain.entities.RenderedContactState;
import defpackage.cyi0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.og11;
import defpackage.tcc;
import defpackage.u7q0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Log11;", "<anonymous>", "(Log11;)Log11;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.data.repositories.TrustedContactsRepository$onDeleteTrustingContactButtonClicked$2", f = "TrustedContactsRepository.kt", l = {128}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrustedContactsRepository$onDeleteTrustingContactButtonClicked$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactsRepository$onDeleteTrustingContactButtonClicked$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrustedContactsRepository$onDeleteTrustingContactButtonClicked$2 trustedContactsRepository$onDeleteTrustingContactButtonClicked$2 = new TrustedContactsRepository$onDeleteTrustingContactButtonClicked$2(this.this$0, this.$id, continuation);
        trustedContactsRepository$onDeleteTrustingContactButtonClicked$2.L$0 = obj;
        return trustedContactsRepository$onDeleteTrustingContactButtonClicked$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrustedContactsRepository$onDeleteTrustingContactButtonClicked$2) create((og11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        og11 og11Var = (og11) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            u7q0 u7q0Var = og11Var.d;
            ArrayList<cyi0> arrayList = u7q0Var.b;
            String str = this.$id;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            for (cyi0 cyi0Var : arrayList) {
                if (jl40.l(((TrustingContactDto) cyi0Var.d).a, str)) {
                    cyi0Var = cyi0.a(cyi0Var, RenderedContactState.DELETED);
                }
                arrayList2.add(cyi0Var);
            }
            og11 a = og11.a(og11Var, null, null, u7q0.a(u7q0Var, arrayList2), null, 119);
            ArrayList arrayList3 = a.c.b;
            if (!arrayList3.isEmpty()) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    if (((cyi0) it.next()).c != RenderedContactState.DELETED) {
                        break;
                    }
                }
            }
            ArrayList arrayList4 = a.d.b;
            if (!arrayList4.isEmpty()) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    if (((cyi0) it2.next()).c != RenderedContactState.DELETED) {
                        return a;
                    }
                }
            }
            a aVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = a.a(aVar, a, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return (og11) obj;
    }
}
