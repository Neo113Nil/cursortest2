package com.yandex.go.yb.domain;

import com.ybsdk.api.YBSdk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qqy;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.yy51;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.domain.SelectYbCardInteractor$initSnapshot$1", f = "SelectYbCardInteractor.kt", l = {72}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class SelectYbCardInteractor$initSnapshot$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectYbCardInteractor$initSnapshot$1(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SelectYbCardInteractor$initSnapshot$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectYbCardInteractor$initSnapshot$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l lVar = new l(YBSdk.INSTANCE.observeStateChanges());
            this.label = 1;
            if (kotlinx.coroutines.flow.e.y(lVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        n nVar = this.this$0;
        ListBuilder h = ((com.yandex.go.payments.paymentlist.data.c) nVar.g).h();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = h.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            }
            Object next = qqyVar.next();
            if (next instanceof yy51) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((yy51) it.next()).a);
        }
        nVar.n = n.a(arrayList2);
        n.e(this.this$0.n);
        return zy11.a;
    }
}
