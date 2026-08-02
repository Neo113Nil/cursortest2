package com.yandex.go.places.impl.data.entities.network.bookings;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.sfc0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/bookings/PlacesUserBookingsResponse;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/bookings/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesUserBookingsResponse {
    public static final e Companion = new e();
    public static final i3y[] e;
    public final List a;
    public final String b;
    public final boolean c;
    public final Integer d;

    static {
        a aVar = BookingDto.Companion;
        e = new i3y[]{kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sfc0(25)), null, null, null};
    }

    public /* synthetic */ PlacesUserBookingsResponse(int i, List list, String str, boolean z, Integer num) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public PlacesUserBookingsResponse() {
        this.a = EmptyList.a;
        this.b = "";
        this.c = false;
        this.d = null;
    }
}
