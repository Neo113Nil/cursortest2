package com.yandex.go.chargers.offer.plus_dvizh.data.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/plus_dvizh/data/model/PlusDvizhPurchaseStatusRequest;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/plus_dvizh/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlusDvizhPurchaseStatusRequest {
    public static final d Companion = new d();
    public final String a;
    public final String b;

    public /* synthetic */ PlusDvizhPurchaseStatusRequest(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, PlusDvizhPurchaseStatusRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public PlusDvizhPurchaseStatusRequest(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
