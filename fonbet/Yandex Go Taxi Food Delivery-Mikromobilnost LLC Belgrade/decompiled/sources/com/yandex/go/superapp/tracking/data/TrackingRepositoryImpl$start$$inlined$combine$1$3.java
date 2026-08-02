package com.yandex.go.superapp.tracking.data;

import defpackage.bjz;
import defpackage.d3p;
import defpackage.j73;
import defpackage.jem;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o601;
import defpackage.pu6;
import defpackage.q6o0;
import defpackage.q6y0;
import defpackage.qg50;
import defpackage.v7y0;
import defpackage.vpr;
import defpackage.w201;
import defpackage.w511;
import defpackage.xda;
import defpackage.y2y0;
import defpackage.z4y0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.tracking.data.TrackingRepositoryImpl$start$$inlined$combine$1$3", f = "TrackingRepositoryImpl.kt", l = {288}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class TrackingRepositoryImpl$start$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingRepositoryImpl$start$$inlined$combine$1$3(Continuation continuation, e eVar) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TrackingRepositoryImpl$start$$inlined$combine$1$3 trackingRepositoryImpl$start$$inlined$combine$1$3 = new TrackingRepositoryImpl$start$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        trackingRepositoryImpl$start$$inlined$combine$1$3.L$0 = (vpr) obj;
        trackingRepositoryImpl$start$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return trackingRepositoryImpl$start$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String id;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o601 o601Var = this.this$0.a;
            List d0 = j73.d0((List[]) objArr);
            o601Var.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            Iterator it = d0.iterator();
            while (it.hasNext()) {
                for (w201 w201Var : (List) it.next()) {
                    if (w201Var instanceof bjz) {
                        id = ((bjz) w201Var).c;
                    } else {
                        if (!(w201Var instanceof q6y0) && !(w201Var instanceof z4y0) && !(w201Var instanceof v7y0) && !(w201Var instanceof y2y0) && !(w201Var instanceof jem) && !(w201Var instanceof q6o0) && !(w201Var instanceof xda) && !(w201Var instanceof d3p) && !(w201Var instanceof qg50) && !(w201Var instanceof pu6)) {
                            w511.b();
                            return null;
                        }
                        id = w201Var.getId();
                    }
                    if (id != null) {
                        w201 w201Var2 = (w201) linkedHashMap.get(id);
                        if (w201Var2 != null) {
                            boolean b = o601.b(w201Var2);
                            if (b == o601.b(w201Var)) {
                                if (o601.a(w201Var2) >= o601.a(w201Var)) {
                                }
                            } else if (b) {
                            }
                        }
                        linkedHashMap.put(id, w201Var);
                    } else {
                        arrayList.add(w201Var);
                    }
                }
            }
            ArrayList m0 = kotlin.collections.a.m0(arrayList, linkedHashMap.values());
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(m0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
