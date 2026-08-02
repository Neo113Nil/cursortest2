package com.yandex.go.taxi.order.tariff_upgrade.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.tariff_upgrade.domain.TariffUpgradeInteractor", f = "TariffUpgradeInteractor.kt", l = {56, 62}, m = "createTariffUpgrade", v = 2)
/* loaded from: classes14.dex */
final class TariffUpgradeInteractor$createTariffUpgrade$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffUpgradeInteractor$createTariffUpgrade$1(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return l.a(this.this$0, null, this);
    }
}
