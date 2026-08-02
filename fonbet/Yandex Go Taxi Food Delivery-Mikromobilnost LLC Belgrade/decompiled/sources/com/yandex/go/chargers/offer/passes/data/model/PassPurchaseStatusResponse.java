package com.yandex.go.chargers.offer.passes.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nk90;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/passes/data/model/PassPurchaseStatusResponse;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/passes/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PassPurchaseStatusResponse {
    public static final e Companion = new e();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(0)), null};
    public final PurchaseStatus a;
    public final PurchaseInfo b;

    public /* synthetic */ PassPurchaseStatusResponse(int i, PurchaseStatus purchaseStatus, PurchaseInfo purchaseInfo) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = purchaseStatus;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = purchaseInfo;
        }
    }

    public PassPurchaseStatusResponse() {
        this.a = null;
        this.b = null;
    }
}
