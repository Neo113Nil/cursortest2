package com.yandex.go.mainscreen.superapp.impl.foundation.domain;

import com.yandex.go.address.models.Address;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pv0;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class f {
    public final po21 a;
    public final ru.yandex.taxi.search.suggest.i b;

    public f(po21 po21Var, ru.yandex.taxi.search.suggest.i iVar) {
        this.a = po21Var;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        GetLastGeoPointInteractorImpl$execute$1 getLastGeoPointInteractorImpl$execute$1;
        int i;
        zzs B;
        if (continuationImpl instanceof GetLastGeoPointInteractorImpl$execute$1) {
            getLastGeoPointInteractorImpl$execute$1 = (GetLastGeoPointInteractorImpl$execute$1) continuationImpl;
            int i2 = getLastGeoPointInteractorImpl$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getLastGeoPointInteractorImpl$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getLastGeoPointInteractorImpl$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getLastGeoPointInteractorImpl$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pv0 pv0Var = (pv0) this.b.i().orElse(null);
                    Address address = pv0Var != null ? pv0Var.a : null;
                    if (address != null && (B = address.B()) != null) {
                        return B;
                    }
                    getLastGeoPointInteractorImpl$execute$1.L$0 = null;
                    getLastGeoPointInteractorImpl$execute$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.a).h(getLastGeoPointInteractorImpl$execute$1);
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
                return ((mo21) obj).a();
            }
        }
        getLastGeoPointInteractorImpl$execute$1 = new GetLastGeoPointInteractorImpl$execute$1(this, continuationImpl);
        Object obj2 = getLastGeoPointInteractorImpl$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getLastGeoPointInteractorImpl$execute$1.label;
        if (i != 0) {
        }
        return ((mo21) obj2).a();
    }
}
