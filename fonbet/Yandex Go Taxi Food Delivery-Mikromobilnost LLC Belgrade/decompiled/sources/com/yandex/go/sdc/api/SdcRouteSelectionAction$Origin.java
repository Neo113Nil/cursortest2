package com.yandex.go.sdc.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/sdc/api/SdcRouteSelectionAction$Origin", "", "Lcom/yandex/go/sdc/api/SdcRouteSelectionAction$Origin;", "SuperappMain", "Undefined", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SdcRouteSelectionAction$Origin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SdcRouteSelectionAction$Origin[] $VALUES;
    public static final SdcRouteSelectionAction$Origin SuperappMain;
    public static final SdcRouteSelectionAction$Origin Undefined;

    static {
        SdcRouteSelectionAction$Origin sdcRouteSelectionAction$Origin = new SdcRouteSelectionAction$Origin("SuperappMain", 0);
        SuperappMain = sdcRouteSelectionAction$Origin;
        SdcRouteSelectionAction$Origin sdcRouteSelectionAction$Origin2 = new SdcRouteSelectionAction$Origin("Undefined", 1);
        Undefined = sdcRouteSelectionAction$Origin2;
        SdcRouteSelectionAction$Origin[] sdcRouteSelectionAction$OriginArr = {sdcRouteSelectionAction$Origin, sdcRouteSelectionAction$Origin2};
        $VALUES = sdcRouteSelectionAction$OriginArr;
        $ENTRIES = a.a(sdcRouteSelectionAction$OriginArr);
    }

    public static SdcRouteSelectionAction$Origin valueOf(String str) {
        return (SdcRouteSelectionAction$Origin) Enum.valueOf(SdcRouteSelectionAction$Origin.class, str);
    }

    public static SdcRouteSelectionAction$Origin[] values() {
        return (SdcRouteSelectionAction$Origin[]) $VALUES.clone();
    }
}
