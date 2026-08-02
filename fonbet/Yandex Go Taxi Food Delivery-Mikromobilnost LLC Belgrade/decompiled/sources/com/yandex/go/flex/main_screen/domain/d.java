package com.yandex.go.flex.main_screen.domain;

import com.yandex.go.address.models.Address;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1 superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1;
        int i;
        String str;
        if (continuation instanceof SuperappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1) {
            superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1 = (SuperappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Address address = (Address) obj;
                    if (address == null || (str = address.D1()) == null || evu0.J(str)) {
                        str = null;
                    }
                    if (str != null) {
                        superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(str, superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1 = new SuperappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappFlexAddressInteractor$addressShortTextFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
