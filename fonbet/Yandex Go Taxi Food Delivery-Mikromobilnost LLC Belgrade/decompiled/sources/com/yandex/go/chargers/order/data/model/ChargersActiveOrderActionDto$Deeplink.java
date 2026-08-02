package com.yandex.go.chargers.order.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/order/data/model/ChargersActiveOrderActionDto$Deeplink", "Lcom/yandex/go/chargers/order/data/model/o;", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersActiveOrderActionDto$Deeplink extends o {
    public static final d Companion = new d();
    public final String a;

    public ChargersActiveOrderActionDto$Deeplink(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public ChargersActiveOrderActionDto$Deeplink() {
        this.a = "";
    }
}
