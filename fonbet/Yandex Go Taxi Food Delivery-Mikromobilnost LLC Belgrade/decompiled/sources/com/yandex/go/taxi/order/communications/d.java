package com.yandex.go.taxi.order.communications;

import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import defpackage.sdq0;

/* loaded from: classes14.dex */
public final class d implements sdq0 {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.sdq0
    public final void a() {
    }

    @Override // defpackage.sdq0
    public final void h() {
        e eVar = this.a;
        OrderStatusParam.OrderContact orderContact = eVar.u0;
        if (orderContact != null) {
            ((CommunicationsAdapter$onCreateViewHolder$5) eVar.l0).invoke(orderContact);
        }
    }
}
