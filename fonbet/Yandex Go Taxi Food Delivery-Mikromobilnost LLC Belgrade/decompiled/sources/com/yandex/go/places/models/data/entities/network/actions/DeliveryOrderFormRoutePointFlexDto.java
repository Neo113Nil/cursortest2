package com.yandex.go.places.models.data.entities.network.actions;

import com.yandex.go.places.models.data.entities.network.DeliveryPointTypeDto;
import defpackage.b9h;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/actions/DeliveryOrderFormRoutePointFlexDto;", "", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/actions/d", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryOrderFormRoutePointFlexDto {
    public static final d Companion = new d();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b9h(22)), null, null};
    public final double[] a;
    public final DeliveryPointTypeDto b;
    public final String c;
    public final Integer d;

    public /* synthetic */ DeliveryOrderFormRoutePointFlexDto(int i, DeliveryPointTypeDto deliveryPointTypeDto, Integer num, String str, double[] dArr) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, DeliveryOrderFormRoutePointFlexDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = dArr;
        this.b = (i & 2) == 0 ? DeliveryPointTypeDto.DESTINATION : deliveryPointTypeDto;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }
}
