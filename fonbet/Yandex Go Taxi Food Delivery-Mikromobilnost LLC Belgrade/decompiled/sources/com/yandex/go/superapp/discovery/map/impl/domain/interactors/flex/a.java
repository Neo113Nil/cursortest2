package com.yandex.go.superapp.discovery.map.impl.domain.interactors.flex;

import defpackage.evu0;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
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
        SuperAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1 superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof SuperAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1) {
            superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1 = (SuperAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String D1 = ((pv0) obj).a.D1();
                    if (evu0.J(D1)) {
                        D1 = null;
                    }
                    if (D1 != null) {
                        superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.L$0 = null;
                        superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.L$1 = null;
                        superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.L$2 = null;
                        superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.L$3 = null;
                        superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.L$4 = null;
                        superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(D1, superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1 = new SuperAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryFlexAddressInteractor$updateAddress$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
