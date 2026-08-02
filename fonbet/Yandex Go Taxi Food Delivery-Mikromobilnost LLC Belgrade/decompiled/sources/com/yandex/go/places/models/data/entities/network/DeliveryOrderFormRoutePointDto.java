package com.yandex.go.places.models.data.entities.network;

import defpackage.b9h;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/DeliveryOrderFormRoutePointDto;", "", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/x", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryOrderFormRoutePointDto {
    public static final x Companion = new x();
    public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b9h(21)), null, null, null};
    public final DeliveryPointTypeDto a;
    public final String b;
    public final double[] c;
    public final Integer d;

    public /* synthetic */ DeliveryOrderFormRoutePointDto(int i, DeliveryPointTypeDto deliveryPointTypeDto, Integer num, String str, double[] dArr) {
        this.a = (i & 1) == 0 ? DeliveryPointTypeDto.DESTINATION : deliveryPointTypeDto;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = new double[]{0.0d, 0.0d};
        } else {
            this.c = dArr;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public DeliveryOrderFormRoutePointDto() {
        this.a = DeliveryPointTypeDto.DESTINATION;
        this.b = null;
        this.c = new double[]{0.0d, 0.0d};
        this.d = null;
    }
}
