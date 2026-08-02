package com.yandex.go.places.impl.data.entities.network.bookings;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/bookings/PriceDto;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/bookings/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceDto {
    public static final g Companion = new g();
    public final Double a;
    public final Double b;
    public final String c;
    public final String d;

    public /* synthetic */ PriceDto(int i, Double d, Double d2, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
    }

    public PriceDto() {
        this.a = null;
        this.b = null;
        this.c = "";
        this.d = "";
    }
}
