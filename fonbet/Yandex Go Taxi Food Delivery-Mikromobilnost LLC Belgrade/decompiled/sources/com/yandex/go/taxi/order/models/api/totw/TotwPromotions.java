package com.yandex.go.taxi.order.models.api.totw;

import defpackage.crc;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nhz0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/totw/TotwPromotions;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/totw/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TotwPromotions {
    public static final a Companion = new a();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(14))};
    public final crc a;
    public final crc b;
    public final TotwUpsellResponse c;
    public final Map d;

    public /* synthetic */ TotwPromotions(int i, crc crcVar, crc crcVar2, TotwUpsellResponse totwUpsellResponse, Map map) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = crcVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = crcVar2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = totwUpsellResponse;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = map;
        }
    }

    /* renamed from: a, reason: from getter */
    public final crc getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final TotwUpsellResponse getC() {
        return this.c;
    }

    public TotwPromotions() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
