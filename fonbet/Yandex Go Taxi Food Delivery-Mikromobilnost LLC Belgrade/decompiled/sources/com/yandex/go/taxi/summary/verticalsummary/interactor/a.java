package com.yandex.go.taxi.summary.verticalsummary.interactor;

import defpackage.gw00;
import defpackage.ik31;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.ycc;
import defpackage.za31;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1 tariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1) {
            tariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1 = (TariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1) continuation;
            int i2 = tariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = ((ik31) obj).a.a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ycc.r(((za31) it.next()).b, arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((mi31) it2.next()).a);
                    }
                    int d = gw00.d(tcc.n(arrayList2, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        linkedHashMap.put(((pex0) next).b, next);
                    }
                    tariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1.L$0 = null;
                    tariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1.L$1 = null;
                    tariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1.L$2 = null;
                    tariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1.L$3 = null;
                    tariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(linkedHashMap, tariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        tariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1 = new TariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffsUiStateInteractor$tariffsDescriptionsMapFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
