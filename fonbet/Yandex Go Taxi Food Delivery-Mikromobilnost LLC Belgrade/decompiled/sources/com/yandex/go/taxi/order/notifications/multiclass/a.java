package com.yandex.go.taxi.order.notifications.multiclass;

import android.content.Context;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.zone.dto.objects.Notification;
import defpackage.ag60;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.ief;
import defpackage.kub1;
import defpackage.lh7;
import defpackage.tj60;
import defpackage.xdf;
import defpackage.xh60;
import defpackage.xl10;
import defpackage.yf60;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final Context a;
    public final tj60 b;
    public final xl10 c;
    public final r0 d;
    public final gci0 e;
    public OrderTrackingMulticlassNotificationRouter$MulticlassNotificationComponent f;

    public a(Context context, tj60 tj60Var, xl10 xl10Var) {
        this.a = context;
        this.b = tj60Var;
        this.c = xl10Var;
        r0 c = bvf0.c(Boolean.FALSE);
        this.d = c;
        this.e = e.d(c);
    }

    public final void a(TaxiOrder taxiOrder, boolean z) {
        xh60 b = taxiOrder.V().P.b("multiclass_assign");
        if (b == null) {
            if (z) {
                this.f = null;
                this.b.c("MulticlassNotification");
                r0 r0Var = this.d;
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool);
                return;
            }
            return;
        }
        if (taxiOrder.l.i || z) {
            return;
        }
        xl10 xl10Var = this.c;
        Notification notification = (Notification) b.b;
        ief iefVar = taxiOrder.V().K;
        xl10Var.getClass();
        String str = (String) notification.d.get("title");
        if (str != null && iefVar != null) {
            str = kub1.d((xdf) xl10Var.a, iefVar, str);
        }
        yf60 yf60Var = new yf60();
        yf60Var.a = str;
        ag60 ag60Var = new ag60(yf60Var);
        OrderTrackingMulticlassNotificationRouter$MulticlassNotificationComponent orderTrackingMulticlassNotificationRouter$MulticlassNotificationComponent = this.f;
        if (orderTrackingMulticlassNotificationRouter$MulticlassNotificationComponent == null) {
            orderTrackingMulticlassNotificationRouter$MulticlassNotificationComponent = new OrderTrackingMulticlassNotificationRouter$MulticlassNotificationComponent(this.a, "MulticlassNotification", new lh7(taxiOrder, 3));
            this.f = orderTrackingMulticlassNotificationRouter$MulticlassNotificationComponent;
        }
        orderTrackingMulticlassNotificationRouter$MulticlassNotificationComponent.update(ag60Var);
        this.b.e(orderTrackingMulticlassNotificationRouter$MulticlassNotificationComponent);
        this.b.f();
        r0 r0Var2 = this.d;
        Boolean bool2 = Boolean.TRUE;
        r0Var2.getClass();
        r0Var2.m(null, bool2);
    }
}
