package com.yandex.go.chargers.order.active;

import defpackage.bhb1;
import defpackage.el9;
import defpackage.gl9;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;

    public k(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1 chargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1) {
            chargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1 = (ChargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1) continuation;
            int i2 = chargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = ((gl9) obj).b;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Map a = bhb1.a((el9) it.next());
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                    chargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1.L$0 = null;
                    chargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1.L$1 = null;
                    chargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1.L$2 = null;
                    chargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1.L$3 = null;
                    chargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, chargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1) == coroutineSingletons) {
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
        chargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1 = new ChargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderPresenter$observePromoReceived$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
