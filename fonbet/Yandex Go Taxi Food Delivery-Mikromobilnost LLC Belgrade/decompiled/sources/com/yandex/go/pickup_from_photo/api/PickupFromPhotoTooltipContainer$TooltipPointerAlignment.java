package com.yandex.go.pickup_from_photo.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/pickup_from_photo/api/PickupFromPhotoTooltipContainer$TooltipPointerAlignment", "", "Lcom/yandex/go/pickup_from_photo/api/PickupFromPhotoTooltipContainer$TooltipPointerAlignment;", "START", "END", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PickupFromPhotoTooltipContainer$TooltipPointerAlignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PickupFromPhotoTooltipContainer$TooltipPointerAlignment[] $VALUES;
    public static final PickupFromPhotoTooltipContainer$TooltipPointerAlignment END;
    public static final PickupFromPhotoTooltipContainer$TooltipPointerAlignment START;

    static {
        PickupFromPhotoTooltipContainer$TooltipPointerAlignment pickupFromPhotoTooltipContainer$TooltipPointerAlignment = new PickupFromPhotoTooltipContainer$TooltipPointerAlignment("START", 0);
        START = pickupFromPhotoTooltipContainer$TooltipPointerAlignment;
        PickupFromPhotoTooltipContainer$TooltipPointerAlignment pickupFromPhotoTooltipContainer$TooltipPointerAlignment2 = new PickupFromPhotoTooltipContainer$TooltipPointerAlignment("END", 1);
        END = pickupFromPhotoTooltipContainer$TooltipPointerAlignment2;
        PickupFromPhotoTooltipContainer$TooltipPointerAlignment[] pickupFromPhotoTooltipContainer$TooltipPointerAlignmentArr = {pickupFromPhotoTooltipContainer$TooltipPointerAlignment, pickupFromPhotoTooltipContainer$TooltipPointerAlignment2};
        $VALUES = pickupFromPhotoTooltipContainer$TooltipPointerAlignmentArr;
        $ENTRIES = a.a(pickupFromPhotoTooltipContainer$TooltipPointerAlignmentArr);
    }

    public static PickupFromPhotoTooltipContainer$TooltipPointerAlignment valueOf(String str) {
        return (PickupFromPhotoTooltipContainer$TooltipPointerAlignment) Enum.valueOf(PickupFromPhotoTooltipContainer$TooltipPointerAlignment.class, str);
    }

    public static PickupFromPhotoTooltipContainer$TooltipPointerAlignment[] values() {
        return (PickupFromPhotoTooltipContainer$TooltipPointerAlignment[]) $VALUES.clone();
    }
}
