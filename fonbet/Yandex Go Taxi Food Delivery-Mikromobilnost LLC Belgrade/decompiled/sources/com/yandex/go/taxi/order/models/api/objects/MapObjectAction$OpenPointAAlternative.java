package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/objects/MapObjectAction$OpenPointAAlternative", "Lcom/yandex/go/taxi/order/models/api/objects/b0;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/z", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MapObjectAction$OpenPointAAlternative extends b0 {
    public static final z Companion = new z();
    public final AltpinCardInfo a;

    public MapObjectAction$OpenPointAAlternative(int i, AltpinCardInfo altpinCardInfo) {
        if ((i & 1) == 0) {
            this.a = new AltpinCardInfo(0);
        } else {
            this.a = altpinCardInfo;
        }
    }

    public MapObjectAction$OpenPointAAlternative() {
        this.a = new AltpinCardInfo(0);
    }
}
