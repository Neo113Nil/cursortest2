package com.yandex.go.chargers.discovery.domain;

import com.yandex.go.shortcuts.dto.response.Mode;
import com.yandex.go.shortcuts.dto.response.ProductMode$Chargers;
import com.yandex.go.shortcuts.dto.response.t1;
import defpackage.hzs;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1 chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof ChargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1) {
            chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1 = (ChargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = ((hzs) obj).b.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((t1) obj2).a() == Mode.CHARGERS) {
                            break;
                        }
                    }
                    ProductMode$Chargers productMode$Chargers = obj2 instanceof ProductMode$Chargers ? (ProductMode$Chargers) obj2 : null;
                    if (productMode$Chargers != null) {
                        chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(productMode$Chargers, chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1 = new ChargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj32 = chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscoveryProductsScreenInteractor$chargersProductModeFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
