package com.yandex.go.payments.api.shared.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/api/shared/model/EntryPoints;", "", "Companion", "$serializer", "com/yandex/go/payments/api/shared/model/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EntryPoints {
    public static final a Companion = new a();
    public final PaymentMenuEntryPoints a;
    public final PaymentSummaryEntryPoints b;
    public final MenuEntryPoints c;

    public /* synthetic */ EntryPoints(int i, PaymentMenuEntryPoints paymentMenuEntryPoints, PaymentSummaryEntryPoints paymentSummaryEntryPoints, MenuEntryPoints menuEntryPoints) {
        this.a = (i & 1) == 0 ? new PaymentMenuEntryPoints(0) : paymentMenuEntryPoints;
        if ((i & 2) == 0) {
            this.b = new PaymentSummaryEntryPoints(0);
        } else {
            this.b = paymentSummaryEntryPoints;
        }
        if ((i & 4) == 0) {
            this.c = new MenuEntryPoints(0);
        } else {
            this.c = menuEntryPoints;
        }
    }

    public EntryPoints() {
        PaymentMenuEntryPoints paymentMenuEntryPoints = new PaymentMenuEntryPoints(0);
        PaymentSummaryEntryPoints paymentSummaryEntryPoints = new PaymentSummaryEntryPoints(0);
        MenuEntryPoints menuEntryPoints = new MenuEntryPoints(0);
        this.a = paymentMenuEntryPoints;
        this.b = paymentSummaryEntryPoints;
        this.c = menuEntryPoints;
    }
}
