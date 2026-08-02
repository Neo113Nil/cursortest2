package com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors;

import com.yandex.go.zone.repository.r;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c {
    public final r a;

    public c(r rVar) {
        this.a = rVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(2:19|(2:24|(1:26))(1:23))|12|13|14))|29|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        r6 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(ContinuationImpl continuationImpl) {
        PromoCodeZoneInteractor$fetchZoneName$1 promoCodeZoneInteractor$fetchZoneName$1;
        int i;
        if (continuationImpl instanceof PromoCodeZoneInteractor$fetchZoneName$1) {
            promoCodeZoneInteractor$fetchZoneName$1 = (PromoCodeZoneInteractor$fetchZoneName$1) continuationImpl;
            int i2 = promoCodeZoneInteractor$fetchZoneName$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoCodeZoneInteractor$fetchZoneName$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoCodeZoneInteractor$fetchZoneName$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoCodeZoneInteractor$fetchZoneName$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r rVar = this.a;
                    String a = rVar.a();
                    if (a != null && a.length() != 0) {
                        return a;
                    }
                    promoCodeZoneInteractor$fetchZoneName$1.L$0 = null;
                    promoCodeZoneInteractor$fetchZoneName$1.L$1 = null;
                    promoCodeZoneInteractor$fetchZoneName$1.label = 1;
                    obj = rVar.c(promoCodeZoneInteractor$fetchZoneName$1);
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
                Serializable failure = (String) obj;
                return failure;
            }
        }
        promoCodeZoneInteractor$fetchZoneName$1 = new PromoCodeZoneInteractor$fetchZoneName$1(this, continuationImpl);
        Object obj2 = promoCodeZoneInteractor$fetchZoneName$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoCodeZoneInteractor$fetchZoneName$1.label;
        if (i != 0) {
        }
        Serializable failure2 = (String) obj2;
        return failure2;
    }
}
