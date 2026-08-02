package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/CancelRules;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/s", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CancelRules {
    public static final s Companion = new s();
    public final String a;
    public final String b;
    public final String c;
    public final double d;
    public final ConfirmationNotification e;
    public final DifferentCostPopup f;

    public CancelRules(int i, String str, String str2, String str3, double d, ConfirmationNotification confirmationNotification, DifferentCostPopup differentCostPopup) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = 0.0d;
        } else {
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = ConfirmationNotification.g;
        } else {
            this.e = confirmationNotification;
        }
        if ((i & 32) != 0) {
            this.f = differentCostPopup;
        } else {
            DifferentCostPopup.Companion.getClass();
            this.f = DifferentCostPopup.d;
        }
    }

    public CancelRules() {
        ConfirmationNotification confirmationNotification = ConfirmationNotification.g;
        DifferentCostPopup.Companion.getClass();
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 0.0d;
        this.e = confirmationNotification;
        this.f = DifferentCostPopup.d;
    }
}
