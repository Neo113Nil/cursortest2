package com.yandex.go.trusted_contacts.data.repositories;

import com.yandex.go.trusted_contacts.domain.entities.RenderedContactState;
import com.yandex.go.trusted_contacts.domain.entities.TrustedContactsMode;
import defpackage.cyi0;
import defpackage.gsh;
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
@mvg(c = "com.yandex.go.trusted_contacts.data.repositories.TrustedContactsRepository$cancelDeleteMode$2", f = "TrustedContactsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrustedContactsRepository$cancelDeleteMode$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrustedContactsRepository$cancelDeleteMode$2 trustedContactsRepository$cancelDeleteMode$2 = new TrustedContactsRepository$cancelDeleteMode$2(2, continuation);
        trustedContactsRepository$cancelDeleteMode$2.L$0 = obj;
        return trustedContactsRepository$cancelDeleteMode$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrustedContactsRepository$cancelDeleteMode$2) create((og11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        og11 og11Var = (og11) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        TrustedContactsMode trustedContactsMode = TrustedContactsMode.DEFAULT;
        u7q0 u7q0Var = og11Var.c;
        ArrayList arrayList = u7q0Var.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cyi0.a((cyi0) it.next(), RenderedContactState.DEFAULT));
        }
        u7q0 a = u7q0.a(u7q0Var, arrayList2);
        u7q0 u7q0Var2 = og11Var.d;
        ArrayList arrayList3 = u7q0Var2.b;
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(cyi0.a((cyi0) it2.next(), RenderedContactState.DEFAULT));
        }
        return og11.a(og11Var, trustedContactsMode, a, u7q0.a(u7q0Var2, arrayList4), new gsh(0), 50);
    }
}
