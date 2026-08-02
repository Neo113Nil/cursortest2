package com.yandex.go.scooters.offers.v2.components.bottom.data;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.y5n0;
import defpackage.z2o0;
import defpackage.z5n0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public final class a {
    public final z2o0 a;

    public a(z2o0 z2o0Var) {
        this.a = z2o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, y5n0 y5n0Var, ContinuationImpl continuationImpl) {
        ScootersOfferRefreshEventRepository$waitForOfferRefresh$1 scootersOfferRefreshEventRepository$waitForOfferRefresh$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ScootersOfferRefreshEventRepository$waitForOfferRefresh$1) {
            scootersOfferRefreshEventRepository$waitForOfferRefresh$1 = (ScootersOfferRefreshEventRepository$waitForOfferRefresh$1) continuationImpl;
            int i2 = scootersOfferRefreshEventRepository$waitForOfferRefresh$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOfferRefreshEventRepository$waitForOfferRefresh$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOfferRefreshEventRepository$waitForOfferRefresh$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOfferRefreshEventRepository$waitForOfferRefresh$1.label;
                if (i != 0) {
                    b.b(obj);
                    gci0 d = e.d(aVar.a.a);
                    ScootersOfferRefreshEventRepository$waitForOfferRefresh$new$1 scootersOfferRefreshEventRepository$waitForOfferRefresh$new$1 = new ScootersOfferRefreshEventRepository$waitForOfferRefresh$new$1(y5n0Var, null);
                    scootersOfferRefreshEventRepository$waitForOfferRefresh$1.L$0 = null;
                    scootersOfferRefreshEventRepository$waitForOfferRefresh$1.label = 1;
                    obj = e.x(d, scootersOfferRefreshEventRepository$waitForOfferRefresh$new$1, scootersOfferRefreshEventRepository$waitForOfferRefresh$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return Boolean.valueOf(((z5n0) obj) instanceof y5n0);
            }
        }
        scootersOfferRefreshEventRepository$waitForOfferRefresh$1 = new ScootersOfferRefreshEventRepository$waitForOfferRefresh$1(aVar, continuationImpl);
        Object obj2 = scootersOfferRefreshEventRepository$waitForOfferRefresh$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOfferRefreshEventRepository$waitForOfferRefresh$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((z5n0) obj2) instanceof y5n0);
    }
}
