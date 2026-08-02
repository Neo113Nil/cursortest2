package com.yandex.go.taxi.order.recalculation.ui;

import defpackage.sls;
import defpackage.tje;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class PriceRecalculationPresenter$bindNewPriceLoadedSuccessState$state$1 extends FunctionReferenceImpl implements sls {
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m204invoke() {
        b bVar = (b) this.receiver;
        tje.N(bVar.Jg(), null, null, new PriceRecalculationPresenter$onPriceAcceptPressed$1(bVar, null), 3);
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m204invoke();
        return zy11.a;
    }
}
