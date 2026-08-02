package com.yandex.go.taxi.order.models.api.objects;

import defpackage.fs70;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wh60;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/OrderPushNotification;", "Lwh60;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/p0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderPushNotification implements wh60 {
    public static final p0 Companion = new p0();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fs70(25))};
    public final String a;
    public final Map b;

    public /* synthetic */ OrderPushNotification(int i, String str, Map map) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = kotlin.collections.b.f();
        } else {
            this.b = map;
        }
    }

    public OrderPushNotification() {
        Map f = kotlin.collections.b.f();
        this.a = null;
        this.b = f;
    }
}
