package com.yandex.go.sdc.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/sdc/api/SdcRouteSelectionAction$ScreenType", "", "Lcom/yandex/go/sdc/api/SdcRouteSelectionAction$ScreenType;", "SOURCE", "DESTINATION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SdcRouteSelectionAction$ScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SdcRouteSelectionAction$ScreenType[] $VALUES;
    public static final SdcRouteSelectionAction$ScreenType DESTINATION;
    public static final SdcRouteSelectionAction$ScreenType SOURCE;

    static {
        SdcRouteSelectionAction$ScreenType sdcRouteSelectionAction$ScreenType = new SdcRouteSelectionAction$ScreenType("SOURCE", 0);
        SOURCE = sdcRouteSelectionAction$ScreenType;
        SdcRouteSelectionAction$ScreenType sdcRouteSelectionAction$ScreenType2 = new SdcRouteSelectionAction$ScreenType("DESTINATION", 1);
        DESTINATION = sdcRouteSelectionAction$ScreenType2;
        SdcRouteSelectionAction$ScreenType[] sdcRouteSelectionAction$ScreenTypeArr = {sdcRouteSelectionAction$ScreenType, sdcRouteSelectionAction$ScreenType2};
        $VALUES = sdcRouteSelectionAction$ScreenTypeArr;
        $ENTRIES = a.a(sdcRouteSelectionAction$ScreenTypeArr);
    }

    public static SdcRouteSelectionAction$ScreenType valueOf(String str) {
        return (SdcRouteSelectionAction$ScreenType) Enum.valueOf(SdcRouteSelectionAction$ScreenType.class, str);
    }

    public static SdcRouteSelectionAction$ScreenType[] values() {
        return (SdcRouteSelectionAction$ScreenType[]) $VALUES.clone();
    }
}
