package com.yandex.go.chargers.station.domain;

import com.yandex.go.chargers.station.data.e;
import defpackage.dra;
import defpackage.gra;
import defpackage.jl40;
import defpackage.ksa;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oma;
import defpackage.qo9;
import defpackage.so9;
import defpackage.tcc;
import defpackage.wls;
import defpackage.yfa;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgra;", "details", "Lksa;", "<anonymous>", "(Lgra;)Lksa;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.station.domain.ChargersStationDetailsInteractor$loadChargersStationDetails$1", f = "ChargersStationDetailsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersStationDetailsInteractor$loadChargersStationDetails$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersStationDetailsInteractor$loadChargersStationDetails$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersStationDetailsInteractor$loadChargersStationDetails$1 chargersStationDetailsInteractor$loadChargersStationDetails$1 = new ChargersStationDetailsInteractor$loadChargersStationDetails$1(this.this$0, continuation);
        chargersStationDetailsInteractor$loadChargersStationDetails$1.L$0 = obj;
        return chargersStationDetailsInteractor$loadChargersStationDetails$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersStationDetailsInteractor$loadChargersStationDetails$1) create((gra) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        gra graVar = (gra) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        oma omaVar = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = graVar.m;
        c cVar = this.this$0;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            dra draVar = (dra) obj2;
            yfa yfaVar = cVar.d;
            String str = draVar.a;
            int i = draVar.b;
            Integer num = (Integer) ((ConcurrentHashMap) ((e) yfaVar.a).c.getValue()).get(str);
            if ((num != null ? num.intValue() : 0) < i) {
                break;
            }
        }
        dra draVar2 = (dra) obj2;
        if (draVar2 != null) {
            List list2 = graVar.h;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((qo9) it2.next()).e);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (next instanceof so9) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((so9) it4.next()).a);
            }
            Iterator it5 = arrayList3.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next2 = it5.next();
                if (jl40.l(((oma) next2).a, draVar2.a)) {
                    omaVar = next2;
                    break;
                }
            }
            omaVar = omaVar;
        }
        return new ksa(graVar, omaVar);
    }
}
