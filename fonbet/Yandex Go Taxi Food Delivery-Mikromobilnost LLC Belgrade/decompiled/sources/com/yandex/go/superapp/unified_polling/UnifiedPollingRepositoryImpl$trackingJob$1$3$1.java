package com.yandex.go.superapp.unified_polling;

import defpackage.fnt;
import defpackage.hfi;
import defpackage.i7a0;
import defpackage.mvg;
import defpackage.my11;
import defpackage.ny11;
import defpackage.ny61;
import defpackage.oy11;
import defpackage.pw7;
import defpackage.py11;
import defpackage.qy11;
import defpackage.ren;
import defpackage.ry11;
import defpackage.taa;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.ycw0;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.unified_polling.UnifiedPollingRepositoryImpl$trackingJob$1$3$1", f = "UnifiedPollingRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UnifiedPollingRepositoryImpl$trackingJob$1$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ ycw0 $response;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPollingRepositoryImpl$trackingJob$1$3$1(k kVar, ycw0 ycw0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$response = ycw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnifiedPollingRepositoryImpl$trackingJob$1$3$1(this.this$0, this.$response, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UnifiedPollingRepositoryImpl$trackingJob$1$3$1 unifiedPollingRepositoryImpl$trackingJob$1$3$1 = (UnifiedPollingRepositoryImpl$trackingJob$1$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        unifiedPollingRepositoryImpl$trackingJob$1$3$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k kVar = this.this$0;
        ycw0 ycw0Var = this.$response;
        LinkedHashMap linkedHashMap = kVar.l;
        if (!linkedHashMap.isEmpty()) {
            for (ry11 ry11Var : kotlin.collections.a.N0(linkedHashMap.keySet())) {
                if (ry11Var instanceof py11) {
                    List list = ycw0Var.a;
                    arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ren) it.next()).a);
                    }
                } else if (ry11Var instanceof my11) {
                    List list2 = ycw0Var.b;
                    arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((taa) it2.next()).a());
                    }
                } else if (ry11Var instanceof qy11) {
                    List list3 = ycw0Var.c;
                    arrayList = new ArrayList(tcc.n(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((zuo0) it3.next()).getSessionId());
                    }
                } else if (ry11Var instanceof oy11) {
                    List list4 = ycw0Var.d;
                    arrayList = new ArrayList(tcc.n(list4, 10));
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((fnt) it4.next()).a);
                    }
                } else {
                    if (!(ry11Var instanceof ny11)) {
                        w511.b();
                        return null;
                    }
                    List list5 = ycw0Var.e;
                    arrayList = new ArrayList(tcc.n(list5, 10));
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(((hfi) it5.next()).a);
                    }
                }
                linkedHashMap.compute(ry11Var, new pw7(15, new i7a0(arrayList)));
            }
            kVar.g(false);
        }
        kVar.m.l(ycw0Var);
        return zy11.a;
    }
}
