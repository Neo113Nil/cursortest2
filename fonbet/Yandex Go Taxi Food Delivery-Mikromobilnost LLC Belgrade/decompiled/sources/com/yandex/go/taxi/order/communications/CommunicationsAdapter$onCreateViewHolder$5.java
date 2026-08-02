package com.yandex.go.taxi.order.communications;

import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import defpackage.o2y0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class CommunicationsAdapter$onCreateViewHolder$5 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        OrderStatusParam.OrderContact orderContact = (OrderStatusParam.OrderContact) obj;
        g gVar = (g) this.receiver;
        o2y0 o2y0Var = gVar.Q;
        if (o2y0Var != null) {
            o2y0Var.b().f = orderContact;
            gVar.z.g(o2y0Var.b());
            gVar.y.j(0L, o2y0Var.b().a);
        }
        return zy11.a;
    }
}
