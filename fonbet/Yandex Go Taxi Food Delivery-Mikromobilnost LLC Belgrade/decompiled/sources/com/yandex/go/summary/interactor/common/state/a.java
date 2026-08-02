package com.yandex.go.summary.interactor.common.state;

import defpackage.aa1;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.z91;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.address.experiment.r;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ aa1 b;

    public a(vpr vprVar, aa1 aa1Var) {
        this.a = vprVar;
        this.b = aa1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AddressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1 addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1;
        int i;
        z91 z91Var;
        if (continuation instanceof AddressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1) {
            addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1 = (AddressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    r rVar = (r) obj;
                    if (rVar == null) {
                        z91Var = null;
                    } else {
                        ru.yandex.taxi.address.experiment.a aVar = rVar.a;
                        aa1 aa1Var = this.b;
                        z91Var = new z91(aa1.a(aa1Var, aVar, true), aa1.a(aa1Var, rVar.b, false));
                    }
                    addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(z91Var, addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1 = new AddressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
