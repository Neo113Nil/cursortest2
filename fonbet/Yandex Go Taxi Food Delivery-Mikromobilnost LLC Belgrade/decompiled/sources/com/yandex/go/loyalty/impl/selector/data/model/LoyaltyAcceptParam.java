package com.yandex.go.loyalty.impl.selector.data.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/loyalty/impl/selector/data/model/LoyaltyAcceptParam;", "", "Companion", "$serializer", "com/yandex/go/loyalty/impl/selector/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltyAcceptParam {
    public static final b Companion = new b();
    public final String a;
    public final GeoState b;

    public /* synthetic */ LoyaltyAcceptParam(int i, String str, GeoState geoState) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, LoyaltyAcceptParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = geoState;
    }

    public LoyaltyAcceptParam(String str, GeoState geoState) {
        this.a = str;
        this.b = geoState;
    }
}
