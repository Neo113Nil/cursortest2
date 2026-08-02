package com.yandex.go.places.models.data.entities.network;

import defpackage.dii;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.iki;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/DeliveryPointTypeDto;", "", "Companion", "iki", "SOURCE", "DESTINATION", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryPointTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryPointTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final iki Companion;
    public static final DeliveryPointTypeDto DESTINATION;
    public static final DeliveryPointTypeDto SOURCE;

    static {
        DeliveryPointTypeDto deliveryPointTypeDto = new DeliveryPointTypeDto("SOURCE", 0);
        SOURCE = deliveryPointTypeDto;
        DeliveryPointTypeDto deliveryPointTypeDto2 = new DeliveryPointTypeDto("DESTINATION", 1);
        DESTINATION = deliveryPointTypeDto2;
        DeliveryPointTypeDto[] deliveryPointTypeDtoArr = {deliveryPointTypeDto, deliveryPointTypeDto2};
        $VALUES = deliveryPointTypeDtoArr;
        $ENTRIES = kotlin.enums.a.a(deliveryPointTypeDtoArr);
        Companion = new iki();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dii(5));
    }

    public static DeliveryPointTypeDto valueOf(String str) {
        return (DeliveryPointTypeDto) Enum.valueOf(DeliveryPointTypeDto.class, str);
    }

    public static DeliveryPointTypeDto[] values() {
        return (DeliveryPointTypeDto[]) $VALUES.clone();
    }
}
