package com.yandex.go.places.impl.data.entities.network.bookings;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/bookings/PlacesUserBookingsRequestParams;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/bookings/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesUserBookingsRequestParams {
    public static final d Companion = new d();
    public final int a;
    public final int b;
    public final boolean c;

    public /* synthetic */ PlacesUserBookingsRequestParams(int i, int i2, int i3, boolean z) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, PlacesUserBookingsRequestParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = z;
    }

    public PlacesUserBookingsRequestParams(int i) {
        this.a = i;
        this.b = 0;
        this.c = false;
    }
}
