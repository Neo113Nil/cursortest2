package com.yandex.go.scooters.discovery;

import com.yandex.go.shortcuts.dto.response.Mode;
import com.yandex.go.shortcuts.dto.response.ProductMode$Scooters;
import com.yandex.go.shortcuts.dto.response.t1;
import defpackage.hzs;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1 scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof ScootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1) {
            scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1 = (ScootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = ((hzs) obj).b.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((t1) obj2).a() == Mode.SCOOTERS) {
                            break;
                        }
                    }
                    ProductMode$Scooters productMode$Scooters = obj2 instanceof ProductMode$Scooters ? (ProductMode$Scooters) obj2 : null;
                    if (productMode$Scooters != null) {
                        scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1.L$0 = null;
                        scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1.L$1 = null;
                        scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1.L$2 = null;
                        scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1.L$3 = null;
                        scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1.L$4 = null;
                        scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(productMode$Scooters, scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1 = new ScootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj32 = scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDiscoveryPresenter$listenAttention$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
