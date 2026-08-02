package com.yandex.go.taxi.experiments;

import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class i {
    public final t1b0 a;

    public i(rqo rqoVar) {
        MarketplaceAltDeeplinkExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(MarketplaceAltDeeplinkExperiment.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MarketplaceAltDeeplinkExperimentProvider$deeplink$1 marketplaceAltDeeplinkExperimentProvider$deeplink$1;
        int i;
        if (continuationImpl instanceof MarketplaceAltDeeplinkExperimentProvider$deeplink$1) {
            marketplaceAltDeeplinkExperimentProvider$deeplink$1 = (MarketplaceAltDeeplinkExperimentProvider$deeplink$1) continuationImpl;
            int i2 = marketplaceAltDeeplinkExperimentProvider$deeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                marketplaceAltDeeplinkExperimentProvider$deeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = marketplaceAltDeeplinkExperimentProvider$deeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = marketplaceAltDeeplinkExperimentProvider$deeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    marketplaceAltDeeplinkExperimentProvider$deeplink$1.label = 1;
                    obj = this.a.b(marketplaceAltDeeplinkExperimentProvider$deeplink$1);
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
                return ((MarketplaceAltDeeplinkExperiment) obj).b;
            }
        }
        marketplaceAltDeeplinkExperimentProvider$deeplink$1 = new MarketplaceAltDeeplinkExperimentProvider$deeplink$1(this, continuationImpl);
        Object obj2 = marketplaceAltDeeplinkExperimentProvider$deeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = marketplaceAltDeeplinkExperimentProvider$deeplink$1.label;
        if (i != 0) {
        }
        return ((MarketplaceAltDeeplinkExperiment) obj2).b;
    }
}
