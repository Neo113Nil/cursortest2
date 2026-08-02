package com.yandex.go.navigator.domain;

import com.yandex.go.address.models.PlainAddress;
import defpackage.avj0;
import defpackage.dpa1;
import defpackage.kyh0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.zuj0;
import defpackage.zzs;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class b {
    public final po21 a;
    public final zuj0 b;

    public b(po21 po21Var, zuj0 zuj0Var) {
        this.a = po21Var;
        this.b = zuj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(ContinuationImpl continuationImpl) {
        CurrentLocationAddressInteractor$getAddress$1 currentLocationAddressInteractor$getAddress$1;
        int i;
        if (continuationImpl instanceof CurrentLocationAddressInteractor$getAddress$1) {
            currentLocationAddressInteractor$getAddress$1 = (CurrentLocationAddressInteractor$getAddress$1) continuationImpl;
            int i2 = currentLocationAddressInteractor$getAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                currentLocationAddressInteractor$getAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = currentLocationAddressInteractor$getAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = currentLocationAddressInteractor$getAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    currentLocationAddressInteractor$getAddress$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.a).g(currentLocationAddressInteractor$getAddress$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                zzs a = ((mo21) obj).a();
                return dpa1.c(PlainAddress.Companion, a, ((avj0) this.b).h(kyh0.navigator_route_selection_current_address));
            }
        }
        currentLocationAddressInteractor$getAddress$1 = new CurrentLocationAddressInteractor$getAddress$1(this, continuationImpl);
        Object obj2 = currentLocationAddressInteractor$getAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = currentLocationAddressInteractor$getAddress$1.label;
        if (i != 0) {
        }
        zzs a2 = ((mo21) obj2).a();
        return dpa1.c(PlainAddress.Companion, a2, ((avj0) this.b).h(kyh0.navigator_route_selection_current_address));
    }
}
