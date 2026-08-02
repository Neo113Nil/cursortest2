package com.yandex.go.scooters.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/Subscription;", "", "Companion", "$serializer", "com/yandex/go/scooters/data/model/k0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Subscription {
    public static final k0 Companion = new k0();
    public final SubscriptionPromoblock a;
    public final ScootersSubscriptionUpsaleWindowDto b;

    public /* synthetic */ Subscription(int i, SubscriptionPromoblock subscriptionPromoblock, ScootersSubscriptionUpsaleWindowDto scootersSubscriptionUpsaleWindowDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = subscriptionPromoblock;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = scootersSubscriptionUpsaleWindowDto;
        }
    }

    public Subscription() {
        this.a = null;
        this.b = null;
    }
}
