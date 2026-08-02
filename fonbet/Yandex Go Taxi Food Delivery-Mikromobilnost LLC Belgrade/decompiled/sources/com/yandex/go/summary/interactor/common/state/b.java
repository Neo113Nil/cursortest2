package com.yandex.go.summary.interactor.common.state;

import defpackage.aa1;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ aa1 b;

    public b(kotlinx.coroutines.flow.internal.g gVar, aa1 aa1Var) {
        this.a = gVar;
        this.b = aa1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AddressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1 addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof AddressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1) {
            addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1 = (AddressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1) continuation;
            int i2 = addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1.L$0 = null;
                    addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1.L$1 = null;
                    addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1.L$2 = null;
                    addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1 = new AddressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressesUiStateInteractor$addressesUiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
