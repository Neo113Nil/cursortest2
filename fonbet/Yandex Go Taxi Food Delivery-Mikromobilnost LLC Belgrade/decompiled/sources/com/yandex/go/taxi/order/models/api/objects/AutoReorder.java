package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/AutoReorder;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/f", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutoReorder {
    public static final f Companion = new f();
    public final String a;

    public /* synthetic */ AutoReorder(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public AutoReorder() {
        this.a = "";
    }
}
