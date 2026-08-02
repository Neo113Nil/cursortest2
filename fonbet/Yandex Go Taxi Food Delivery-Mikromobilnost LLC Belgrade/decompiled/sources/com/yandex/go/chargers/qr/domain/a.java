package com.yandex.go.chargers.qr.domain;

import com.yandex.go.chargers.analytics.ChargersError;
import com.yandex.go.chargers.data.model.ChargersStationDto;
import com.yandex.go.chargers.qr.data.ChargersStationSearchApi;
import com.yandex.go.chargers.qr.data.model.ChargersStationSearchParams;
import com.yandex.go.chargers.qr.data.model.ChargersStationSearchResponse;
import com.yandex.go.layers.api.model.params.Mode;
import defpackage.cmt;
import defpackage.cy9;
import defpackage.h3y;
import defpackage.l6a;
import defpackage.m6a;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qsa;
import defpackage.sy9;
import defpackage.tsa;
import defpackage.wd7;
import defpackage.yx9;
import defpackage.zzs;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.go.chargers.error.a a;
    public final qsa b;
    public final com.yandex.go.chargers.error.data.a c;
    public final po21 d;
    public final h3y e;
    public final wd7 f;

    public a(com.yandex.go.chargers.error.a aVar, qsa qsaVar, com.yandex.go.chargers.error.data.a aVar2, po21 po21Var, h3y h3yVar, wd7 wd7Var) {
        this.a = aVar;
        this.b = qsaVar;
        this.c = aVar2;
        this.d = po21Var;
        this.e = h3yVar;
        this.f = wd7Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(2:19|20))(4:23|24|25|26))(2:28|29))(3:33|34|(2:36|22))|30|(2:32|22)|25|26))|42|6|7|(0)(0)|30|(0)|25|26|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0102, code lost:
    
        if (r11 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010d, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 3;
        r11 = r9.c.a(r10, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e4, code lost:
    
        if (r11 != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ChargersNumberVerificationInteractor$verifyStationNumber$1 chargersNumberVerificationInteractor$verifyStationNumber$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        if (continuationImpl instanceof ChargersNumberVerificationInteractor$verifyStationNumber$1) {
            chargersNumberVerificationInteractor$verifyStationNumber$1 = (ChargersNumberVerificationInteractor$verifyStationNumber$1) continuationImpl;
            int i2 = chargersNumberVerificationInteractor$verifyStationNumber$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersNumberVerificationInteractor$verifyStationNumber$1.label = i2 - Integer.MIN_VALUE;
                obj = chargersNumberVerificationInteractor$verifyStationNumber$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersNumberVerificationInteractor$verifyStationNumber$1.label;
                if (i != 0) {
                    b.b(obj);
                    po21 po21Var = this.d;
                    chargersNumberVerificationInteractor$verifyStationNumber$1.L$0 = str;
                    chargersNumberVerificationInteractor$verifyStationNumber$1.label = 1;
                    obj = ((e) po21Var).h(chargersNumberVerificationInteractor$verifyStationNumber$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i == 1) {
                    str = (String) chargersNumberVerificationInteractor$verifyStationNumber$1.L$0;
                    b.b(obj);
                } else {
                    if (i == 2) {
                        b.b(obj);
                        qsa qsaVar = this.b;
                        ChargersStationDto chargersStationDto = ((ChargersStationSearchResponse) obj).a;
                        qsaVar.getClass();
                        return new m6a(new tsa(chargersStationDto.a, chargersStationDto.b, chargersStationDto.c));
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return new l6a((sy9) obj);
                    }
                    b.b(obj);
                    cy9 cy9Var = (cy9) obj;
                    yx9.a(ChargersError.Companion, ChargersError.Qr, cy9Var.a, 4);
                    chargersNumberVerificationInteractor$verifyStationNumber$1.L$0 = null;
                    chargersNumberVerificationInteractor$verifyStationNumber$1.L$1 = null;
                    chargersNumberVerificationInteractor$verifyStationNumber$1.L$2 = null;
                    chargersNumberVerificationInteractor$verifyStationNumber$1.L$3 = null;
                    chargersNumberVerificationInteractor$verifyStationNumber$1.label = 4;
                    obj = this.a.a(cy9Var, chargersNumberVerificationInteractor$verifyStationNumber$1);
                }
                cmt<ChargersStationSearchResponse> a = ((ChargersStationSearchApi) this.e.get()).a(new ChargersStationSearchParams(str, ((mo21) obj).a(), (zzs) this.f.b.get(Mode.CHARGERS.getAnalyticsName())));
                chargersNumberVerificationInteractor$verifyStationNumber$1.L$0 = null;
                chargersNumberVerificationInteractor$verifyStationNumber$1.L$1 = null;
                chargersNumberVerificationInteractor$verifyStationNumber$1.L$2 = null;
                chargersNumberVerificationInteractor$verifyStationNumber$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.d(a, chargersNumberVerificationInteractor$verifyStationNumber$1);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                qsa qsaVar2 = this.b;
                ChargersStationDto chargersStationDto2 = ((ChargersStationSearchResponse) obj).a;
                qsaVar2.getClass();
                return new m6a(new tsa(chargersStationDto2.a, chargersStationDto2.b, chargersStationDto2.c));
            }
        }
        chargersNumberVerificationInteractor$verifyStationNumber$1 = new ChargersNumberVerificationInteractor$verifyStationNumber$1(this, continuationImpl);
        obj = chargersNumberVerificationInteractor$verifyStationNumber$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersNumberVerificationInteractor$verifyStationNumber$1.label;
        if (i != 0) {
        }
        cmt<ChargersStationSearchResponse> a2 = ((ChargersStationSearchApi) this.e.get()).a(new ChargersStationSearchParams(str, ((mo21) obj).a(), (zzs) this.f.b.get(Mode.CHARGERS.getAnalyticsName())));
        chargersNumberVerificationInteractor$verifyStationNumber$1.L$0 = null;
        chargersNumberVerificationInteractor$verifyStationNumber$1.L$1 = null;
        chargersNumberVerificationInteractor$verifyStationNumber$1.L$2 = null;
        chargersNumberVerificationInteractor$verifyStationNumber$1.label = 2;
        obj = ru.yandex.taxi.network.api.a.d(a2, chargersNumberVerificationInteractor$verifyStationNumber$1);
        if (obj == coroutineSingletons) {
        }
        qsa qsaVar22 = this.b;
        ChargersStationDto chargersStationDto22 = ((ChargersStationSearchResponse) obj).a;
        qsaVar22.getClass();
        return new m6a(new tsa(chargersStationDto22.a, chargersStationDto22.b, chargersStationDto22.c));
    }
}
