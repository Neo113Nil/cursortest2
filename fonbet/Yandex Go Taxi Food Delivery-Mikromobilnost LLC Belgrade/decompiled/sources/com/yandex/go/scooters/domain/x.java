package com.yandex.go.scooters.domain;

import defpackage.d4o0;
import defpackage.hfa0;
import defpackage.ny61;
import defpackage.q3o0;
import defpackage.vbn0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class x {
    public final r a;
    public final com.yandex.go.scooters.payments.data.c b;

    public x(r rVar, com.yandex.go.scooters.payments.data.c cVar) {
        this.a = rVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersOfferLoadResultFactory$onLoading$1 scootersOfferLoadResultFactory$onLoading$1;
        int i;
        if (continuationImpl instanceof ScootersOfferLoadResultFactory$onLoading$1) {
            scootersOfferLoadResultFactory$onLoading$1 = (ScootersOfferLoadResultFactory$onLoading$1) continuationImpl;
            int i2 = scootersOfferLoadResultFactory$onLoading$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOfferLoadResultFactory$onLoading$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOfferLoadResultFactory$onLoading$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOfferLoadResultFactory$onLoading$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersOfferLoadResultFactory$onLoading$1.label = 1;
                    obj = this.a.e(scootersOfferLoadResultFactory$onLoading$1);
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
                return new q3o0(((Boolean) obj).booleanValue());
            }
        }
        scootersOfferLoadResultFactory$onLoading$1 = new ScootersOfferLoadResultFactory$onLoading$1(this, continuationImpl);
        Object obj2 = scootersOfferLoadResultFactory$onLoading$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOfferLoadResultFactory$onLoading$1.label;
        if (i != 0) {
        }
        return new q3o0(((Boolean) obj2).booleanValue());
    }

    public final d4o0 b(vbn0 vbn0Var, boolean z) {
        hfa0 b = this.b.b();
        this.a.d();
        return new d4o0(b, z, vbn0Var);
    }
}
