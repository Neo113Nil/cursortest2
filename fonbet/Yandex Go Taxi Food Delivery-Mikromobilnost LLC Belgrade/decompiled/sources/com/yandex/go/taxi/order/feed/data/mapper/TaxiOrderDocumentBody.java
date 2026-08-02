package com.yandex.go.taxi.order.feed.data.mapper;

import com.yandex.go.feed_common.api.payment.PaymentInfo;
import defpackage.gsq0;
import defpackage.pf10;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/feed/data/mapper/TaxiOrderDocumentBody;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/feed/data/mapper/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderDocumentBody {
    public static final a Companion = new a();
    public final TaxiOrderToDocumentBodyMapper$UserLocations a;
    public final pf10 b;
    public final String c;
    public final PaymentInfo d;
    public final String e;

    public /* synthetic */ TaxiOrderDocumentBody(int i, TaxiOrderToDocumentBodyMapper$UserLocations taxiOrderToDocumentBodyMapper$UserLocations, pf10 pf10Var, String str, PaymentInfo paymentInfo, String str2) {
        if (11 != (i & 11)) {
            qje.Z(i, 11, TaxiOrderDocumentBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = taxiOrderToDocumentBodyMapper$UserLocations;
        this.b = pf10Var;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        this.d = paymentInfo;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public TaxiOrderDocumentBody(TaxiOrderToDocumentBodyMapper$UserLocations taxiOrderToDocumentBodyMapper$UserLocations, pf10 pf10Var, String str, PaymentInfo paymentInfo, String str2) {
        this.a = taxiOrderToDocumentBodyMapper$UserLocations;
        this.b = pf10Var;
        this.c = str;
        this.d = paymentInfo;
        this.e = str2;
    }
}
