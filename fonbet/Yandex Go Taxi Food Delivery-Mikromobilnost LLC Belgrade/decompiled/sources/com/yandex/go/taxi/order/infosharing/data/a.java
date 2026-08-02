package com.yandex.go.taxi.order.infosharing.data;

import android.content.Context;
import android.net.Uri;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.OrderShareSettingsExperiment;
import defpackage.a3y0;
import defpackage.alb1;
import defpackage.cvu0;
import defpackage.d6z;
import defpackage.fef;
import defpackage.gwk0;
import defpackage.ief;
import defpackage.kyh0;
import defpackage.msb1;
import defpackage.q5z;
import defpackage.qn11;
import defpackage.tje;
import defpackage.tse;
import defpackage.w2y0;
import defpackage.w511;
import defpackage.x2y0;
import defpackage.xdf;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes14.dex */
public final class a {
    public final tse a;
    public final Context b;
    public final xdf c;
    public final TaxiOrderSharingApi d;
    public final a3y0 e = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "TaxiOrderInfoSender");

    public a(tse tseVar, Context context, xdf xdfVar, TaxiOrderSharingApi taxiOrderSharingApi) {
        this.a = tseVar;
        this.b = context;
        this.c = xdfVar;
        this.d = taxiOrderSharingApi;
    }

    public final void a(TaxiOrder taxiOrder, x2y0 x2y0Var) {
        String str;
        OrderStatusInfo V = taxiOrder.V();
        V.getClass();
        qn11 qn11Var = OrderShareSettingsExperiment.j;
        qn11 b = V.b(OrderShareSettingsExperiment.class);
        if (b != null) {
            qn11Var = b;
        }
        OrderShareSettingsExperiment orderShareSettingsExperiment = (OrderShareSettingsExperiment) qn11Var;
        if (taxiOrder.b.M == null || taxiOrder.r().a() != PaymentMethod$Type.CASH) {
            str = "";
        } else {
            ief iefVar = taxiOrder.V().K;
            fef h = iefVar != null ? gwk0.h(iefVar) : null;
            String g = taxiOrder.g();
            if (g == null) {
                g = "";
            }
            str = cvu0.v(d6z.Y(orderShareSettingsExperiment, orderShareSettingsExperiment.d.getB()), "$PRICE$", this.c.a(h, g, true, true), false);
        }
        String c = alb1.c(taxiOrder.V().g.c, taxiOrder.V().g.b, taxiOrder.V().g.d);
        OrderShareSettingsExperiment.SharedMessage sharedMessage = orderShareSettingsExperiment.d;
        OrderShareSettingsExperiment.SharedMessage sharedMessage2 = orderShareSettingsExperiment.d;
        String Y = d6z.Y(orderShareSettingsExperiment, sharedMessage.getA());
        String str2 = orderShareSettingsExperiment.e;
        int i = kyh0.app_name;
        Context context = this.b;
        String v = cvu0.v(cvu0.v(cvu0.v(Y, "$APP_NAME$", context.getString(i), false), "$VEHICLE_INFO$", c, false), "$PERFORMER_PHONE_NUMBER$", taxiOrder.V().g.g, false);
        String str3 = taxiOrder.V().B;
        if (str3 == null) {
            str3 = "";
        }
        String v2 = cvu0.v(cvu0.v(v, "$ORDER_LINK$", str3, false), "$FOR_OTHER_WITH_CASH$", str, false);
        if (x2y0Var.equals(msb1.W)) {
            String str4 = taxiOrder.V().B;
            String str5 = str4 != null ? str4 : "";
            if (!orderShareSettingsExperiment.b || !orderShareSettingsExperiment.f || d6z.Y(orderShareSettingsExperiment, sharedMessage2.getA()).length() <= 0 || d6z.Y(orderShareSettingsExperiment, sharedMessage2.getB()).length() <= 0) {
                q5z.c0(str5, context.getString(kyh0.bottom_sheet_share_route), context, 0);
            } else {
                q5z.c0(v2, d6z.Y(orderShareSettingsExperiment, str2), context, 0);
            }
        } else {
            if (!(x2y0Var instanceof w2y0)) {
                w511.b();
                return;
            }
            Uri uri = ((w2y0) x2y0Var).a;
            if (uri != null) {
                q5z.a0(v2, uri, d6z.Y(orderShareSettingsExperiment, str2), context);
            } else {
                q5z.c0(v2, d6z.Y(orderShareSettingsExperiment, str2), context, 0);
            }
        }
        if (orderShareSettingsExperiment.h) {
            tje.N(this.a, null, null, new TaxiOrderInfoSender$orderSharedRequest$1(this, taxiOrder.a, null), 3);
        }
    }

    public final void b(TaxiOrder taxiOrder, Uri uri) {
        tje.N(this.a, null, null, new TaxiOrderInfoSender$tryShareScreenshot$1(this, taxiOrder, uri, null), 3);
    }
}
