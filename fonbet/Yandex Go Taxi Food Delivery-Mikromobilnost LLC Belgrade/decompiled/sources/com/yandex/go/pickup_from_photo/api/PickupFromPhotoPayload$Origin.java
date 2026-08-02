package com.yandex.go.pickup_from_photo.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/pickup_from_photo/api/PickupFromPhotoPayload$Origin", "", "Lcom/yandex/go/pickup_from_photo/api/PickupFromPhotoPayload$Origin;", "SUGGEST", "CLARIFY", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PickupFromPhotoPayload$Origin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PickupFromPhotoPayload$Origin[] $VALUES;
    public static final PickupFromPhotoPayload$Origin CLARIFY;
    public static final PickupFromPhotoPayload$Origin SUGGEST;

    static {
        PickupFromPhotoPayload$Origin pickupFromPhotoPayload$Origin = new PickupFromPhotoPayload$Origin("SUGGEST", 0);
        SUGGEST = pickupFromPhotoPayload$Origin;
        PickupFromPhotoPayload$Origin pickupFromPhotoPayload$Origin2 = new PickupFromPhotoPayload$Origin("CLARIFY", 1);
        CLARIFY = pickupFromPhotoPayload$Origin2;
        PickupFromPhotoPayload$Origin[] pickupFromPhotoPayload$OriginArr = {pickupFromPhotoPayload$Origin, pickupFromPhotoPayload$Origin2};
        $VALUES = pickupFromPhotoPayload$OriginArr;
        $ENTRIES = a.a(pickupFromPhotoPayload$OriginArr);
    }

    public static PickupFromPhotoPayload$Origin valueOf(String str) {
        return (PickupFromPhotoPayload$Origin) Enum.valueOf(PickupFromPhotoPayload$Origin.class, str);
    }

    public static PickupFromPhotoPayload$Origin[] values() {
        return (PickupFromPhotoPayload$Origin[]) $VALUES.clone();
    }
}
