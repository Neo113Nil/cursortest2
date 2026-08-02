package com.yandex.go.payments.api.shared.model;

import defpackage.f9a0;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/api/shared/model/PaymentSummaryEntryPoints;", "", "Companion", "$serializer", "com/yandex/go/payments/api/shared/model/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentSummaryEntryPoints {
    public static final d Companion = new d();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new f9a0(22))};
    public final Boolean a;
    public final List b;

    public /* synthetic */ PaymentSummaryEntryPoints(int i, Boolean bool, List list) {
        this.a = (i & 1) == 0 ? null : bool;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public PaymentSummaryEntryPoints(int i) {
        this.a = null;
        this.b = EmptyList.a;
    }

    public PaymentSummaryEntryPoints() {
        this(0);
    }
}
