package com.yandex.go.taxi.order.models.api.promotions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.oi60;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/promotions/ObjectAppearanceAnalytics;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/promotions/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ObjectAppearanceAnalytics {
    public static final b Companion = new b();
    public static final i3y[] c;
    public final Map a;
    public final Map b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new oi60(4)), kotlin.a.b(lazyThreadSafetyMode, new oi60(5))};
    }

    public /* synthetic */ ObjectAppearanceAnalytics(int i, Map map, Map map2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = map;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map2;
        }
    }

    public ObjectAppearanceAnalytics() {
        this.a = null;
        this.b = null;
    }
}
