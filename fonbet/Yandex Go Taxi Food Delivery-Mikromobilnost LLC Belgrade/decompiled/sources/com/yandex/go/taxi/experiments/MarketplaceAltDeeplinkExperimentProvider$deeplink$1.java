package com.yandex.go.taxi.experiments;

import com.adjust.sdk.Constants;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.experiments.MarketplaceAltDeeplinkExperimentProvider", f = "MarketplaceAltDeeplinkExperimentProvider.kt", l = {13}, m = Constants.DEEPLINK, v = 2)
/* loaded from: classes14.dex */
final class MarketplaceAltDeeplinkExperimentProvider$deeplink$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceAltDeeplinkExperimentProvider$deeplink$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
