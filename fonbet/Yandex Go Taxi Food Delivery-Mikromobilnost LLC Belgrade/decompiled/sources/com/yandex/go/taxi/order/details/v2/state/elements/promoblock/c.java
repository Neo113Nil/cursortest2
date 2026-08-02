package com.yandex.go.taxi.order.details.v2.state.elements.promoblock;

import defpackage.a5r;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.qpf0;
import defpackage.qv10;
import defpackage.rpf0;
import defpackage.t9s0;
import defpackage.z4r;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.communications.model.CommunicationItem;

/* loaded from: classes14.dex */
public final class c {
    public final a a;
    public final ru.yandex.taxi.communications.data.a b;
    public final z4r c;
    public final qpf0 d;

    public c(a aVar, ru.yandex.taxi.communications.data.a aVar2, z4r z4rVar, qpf0 qpf0Var) {
        this.a = aVar;
        this.b = aVar2;
        this.c = z4rVar;
        this.d = qpf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007d -> B:10:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        RideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1 rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1;
        int i;
        Iterator it;
        Collection collection;
        if (continuationImpl instanceof RideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1) {
            rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1 = (RideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1) continuationImpl;
            int i2 = rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    CommunicationItem communicationItem = (CommunicationItem) rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.L$6;
                    Object next = rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.L$5;
                    it = (Iterator) rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.L$4;
                    collection = (Collection) rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.L$3;
                    kotlin.b.b(obj);
                    if (((t9s0) obj).a(communicationItem.h, (Set) this.a.c.a.getValue())) {
                        collection.add(next);
                    }
                    if (it.hasNext()) {
                        next = it.next();
                        communicationItem = (CommunicationItem) next;
                        String str = communicationItem.a;
                        rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.L$0 = null;
                        rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.L$1 = null;
                        rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.L$2 = null;
                        rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.L$3 = collection;
                        rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.L$4 = it;
                        rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.L$5 = next;
                        rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.L$6 = communicationItem;
                        rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.label = 1;
                        obj = this.b.b(str, rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((t9s0) obj).a(communicationItem.h, (Set) this.a.c.a.getValue())) {
                        }
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1 = new RideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1(this, continuationImpl);
        Object obj2 = rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardPromoPlaqueStyleInteractor$filterByShowPolicy$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ArrayList arrayList, o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        RideCardPromoPlaqueStyleInteractor$update$1 rideCardPromoPlaqueStyleInteractor$update$1;
        int i;
        if (continuationImpl instanceof RideCardPromoPlaqueStyleInteractor$update$1) {
            rideCardPromoPlaqueStyleInteractor$update$1 = (RideCardPromoPlaqueStyleInteractor$update$1) continuationImpl;
            int i2 = rideCardPromoPlaqueStyleInteractor$update$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardPromoPlaqueStyleInteractor$update$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardPromoPlaqueStyleInteractor$update$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardPromoPlaqueStyleInteractor$update$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = this.a;
                    aVar.b.l(o2y0Var.b().l.U);
                    qv10.B(o2y0Var.b().V().j().b, aVar.d, null);
                    aVar.f.l(arrayList);
                    List a = ((rpf0) this.d).a(arrayList);
                    rideCardPromoPlaqueStyleInteractor$update$1.L$0 = null;
                    rideCardPromoPlaqueStyleInteractor$update$1.L$1 = null;
                    rideCardPromoPlaqueStyleInteractor$update$1.L$2 = null;
                    rideCardPromoPlaqueStyleInteractor$update$1.L$3 = this;
                    rideCardPromoPlaqueStyleInteractor$update$1.label = 1;
                    obj = a(a, rideCardPromoPlaqueStyleInteractor$update$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (c) rideCardPromoPlaqueStyleInteractor$update$1.L$3;
                    kotlin.b.b(obj);
                }
                return ((a5r) this.c).a((List) obj, ((Boolean) this.a.e.a.getValue()).booleanValue());
            }
        }
        rideCardPromoPlaqueStyleInteractor$update$1 = new RideCardPromoPlaqueStyleInteractor$update$1(this, continuationImpl);
        Object obj2 = rideCardPromoPlaqueStyleInteractor$update$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardPromoPlaqueStyleInteractor$update$1.label;
        if (i != 0) {
        }
        return ((a5r) this.c).a((List) obj2, ((Boolean) this.a.e.a.getValue()).booleanValue());
    }
}
