package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.ck31;
import defpackage.ny61;
import defpackage.sls;
import defpackage.xur;
import defpackage.zvr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class l {
    public final String a;
    public final ck31 b;
    public final com.yandex.go.taxi.tariffs.interactor.g c;

    public l(String str, ck31 ck31Var, com.yandex.go.taxi.tariffs.interactor.g gVar) {
        this.a = str;
        this.b = ck31Var;
        this.c = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r6.c.a(r0) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v3, types: [sls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zvr zvrVar, ContinuationImpl continuationImpl) {
        MobilityHubTrackVerticalInteractor$trackVertical$1 mobilityHubTrackVerticalInteractor$trackVertical$1;
        int i;
        zvr zvrVar2;
        if (continuationImpl instanceof MobilityHubTrackVerticalInteractor$trackVertical$1) {
            mobilityHubTrackVerticalInteractor$trackVertical$1 = (MobilityHubTrackVerticalInteractor$trackVertical$1) continuationImpl;
            int i2 = mobilityHubTrackVerticalInteractor$trackVertical$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubTrackVerticalInteractor$trackVertical$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilityHubTrackVerticalInteractor$trackVertical$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubTrackVerticalInteractor$trackVertical$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobilityHubTrackVerticalInteractor$trackVertical$1.L$0 = zvrVar;
                    mobilityHubTrackVerticalInteractor$trackVertical$1.label = 1;
                    zvrVar2 = zvrVar;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ?? r7 = (sls) mobilityHubTrackVerticalInteractor$trackVertical$1.L$0;
                    kotlin.b.b(obj);
                    zvrVar2 = r7;
                }
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(((com.yandex.go.taxi.tariffs.internal.repository.k) this.b).i(), new MobilityHubTrackVerticalInteractor$trackVertical$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                xur xurVar = new xur(zvrVar2, this);
                mobilityHubTrackVerticalInteractor$trackVertical$1.L$0 = null;
                mobilityHubTrackVerticalInteractor$trackVertical$1.L$1 = null;
                mobilityHubTrackVerticalInteractor$trackVertical$1.L$2 = null;
                mobilityHubTrackVerticalInteractor$trackVertical$1.L$3 = null;
                mobilityHubTrackVerticalInteractor$trackVertical$1.label = 2;
                Object collect = oVar.collect(xurVar, mobilityHubTrackVerticalInteractor$trackVertical$1);
                return collect != coroutineSingletons ? coroutineSingletons : collect;
            }
        }
        mobilityHubTrackVerticalInteractor$trackVertical$1 = new MobilityHubTrackVerticalInteractor$trackVertical$1(this, continuationImpl);
        Object obj2 = mobilityHubTrackVerticalInteractor$trackVertical$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubTrackVerticalInteractor$trackVertical$1.label;
        if (i != 0) {
        }
        kotlinx.coroutines.flow.o oVar2 = new kotlinx.coroutines.flow.o(((com.yandex.go.taxi.tariffs.internal.repository.k) this.b).i(), new MobilityHubTrackVerticalInteractor$trackVertical$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
        xur xurVar2 = new xur(zvrVar2, this);
        mobilityHubTrackVerticalInteractor$trackVertical$1.L$0 = null;
        mobilityHubTrackVerticalInteractor$trackVertical$1.L$1 = null;
        mobilityHubTrackVerticalInteractor$trackVertical$1.L$2 = null;
        mobilityHubTrackVerticalInteractor$trackVertical$1.L$3 = null;
        mobilityHubTrackVerticalInteractor$trackVertical$1.label = 2;
        Object collect2 = oVar2.collect(xurVar2, mobilityHubTrackVerticalInteractor$trackVertical$1);
        if (collect2 != coroutineSingletons2) {
        }
    }
}
