package com.yandex.go.taxi.order.details.v1.elements.payment;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.q8j;
import defpackage.tpr;
import defpackage.u6j;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.n;

/* loaded from: classes14.dex */
public final class a implements q8j {
    public final u6j a;
    public final tpr b;

    public a(u6j u6jVar) {
        this.a = u6jVar;
        this.b = kotlinx.coroutines.flow.e.t(new f(kotlinx.coroutines.flow.e.X(new n(new d(u6jVar.a.b, u6jVar), new DetailsCardPaymentStateRepository$styleFlow$2(u6jVar, null)), new DetailsCardPaymentStateRepository$special$$inlined$flatMapLatest$1(u6jVar, null)), u6jVar));
    }

    @Override // defpackage.q8j
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        return this.a.d.emit(taxiOrder, continuation);
    }
}
