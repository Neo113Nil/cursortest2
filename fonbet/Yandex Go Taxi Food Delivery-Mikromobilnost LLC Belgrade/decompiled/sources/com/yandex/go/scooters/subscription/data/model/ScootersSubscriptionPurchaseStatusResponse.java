package com.yandex.go.scooters.subscription.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/subscription/data/model/ScootersSubscriptionPurchaseStatusResponse;", "", "Companion", "$serializer", "com/yandex/go/scooters/subscription/data/model/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersSubscriptionPurchaseStatusResponse {
    public static final g Companion = new g();
    public final String a;
    public final ScootersSubscriptionPurchaseSuccessWindowDto b;

    public /* synthetic */ ScootersSubscriptionPurchaseStatusResponse(int i, String str, ScootersSubscriptionPurchaseSuccessWindowDto scootersSubscriptionPurchaseSuccessWindowDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = scootersSubscriptionPurchaseSuccessWindowDto;
        }
    }

    public ScootersSubscriptionPurchaseStatusResponse() {
        this.a = "";
        this.b = null;
    }
}
