package com.yandex.go.pickup_from_photo.domain;

import com.yandex.go.address.models.Address;
import defpackage.atd0;
import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class j {
    public final ru.yandex.taxi.search.suggest.i a;
    public final atd0 b;

    public j(ru.yandex.taxi.search.suggest.i iVar, atd0 atd0Var) {
        this.a = iVar;
        this.b = atd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PorchNumberInteractor$onPorchNumberDone$1 porchNumberInteractor$onPorchNumberDone$1;
        int i;
        Address address;
        String J1;
        if (continuationImpl instanceof PorchNumberInteractor$onPorchNumberDone$1) {
            porchNumberInteractor$onPorchNumberDone$1 = (PorchNumberInteractor$onPorchNumberDone$1) continuationImpl;
            int i2 = porchNumberInteractor$onPorchNumberDone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                porchNumberInteractor$onPorchNumberDone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = porchNumberInteractor$onPorchNumberDone$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = porchNumberInteractor$onPorchNumberDone$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                ru.yandex.taxi.search.suggest.i iVar = this.a;
                if (iVar.i().isPresent() && ((((J1 = (address = ((pv0) iVar.i().get()).a).J1()) != null && !evu0.J(J1)) || !evu0.J(str)) && !cvu0.t(address.J1(), evu0.k0(str).toString(), true))) {
                    PorchNumberInteractor$onPorchNumberDone$2 porchNumberInteractor$onPorchNumberDone$2 = new PorchNumberInteractor$onPorchNumberDone$2(this, address, str, null);
                    porchNumberInteractor$onPorchNumberDone$1.L$0 = null;
                    porchNumberInteractor$onPorchNumberDone$1.L$1 = null;
                    porchNumberInteractor$onPorchNumberDone$1.label = 1;
                    if (bvf0.n(porchNumberInteractor$onPorchNumberDone$2, porchNumberInteractor$onPorchNumberDone$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        porchNumberInteractor$onPorchNumberDone$1 = new PorchNumberInteractor$onPorchNumberDone$1(this, continuationImpl);
        Object obj2 = porchNumberInteractor$onPorchNumberDone$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = porchNumberInteractor$onPorchNumberDone$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
