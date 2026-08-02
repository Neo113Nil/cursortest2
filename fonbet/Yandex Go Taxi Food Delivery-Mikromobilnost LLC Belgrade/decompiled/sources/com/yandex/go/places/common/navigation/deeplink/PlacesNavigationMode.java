package com.yandex.go.places.common.navigation.deeplink;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/places/common/navigation/deeplink/PlacesNavigationMode;", "", "NATIVE_NAVIGATION", "DEEPLINK_NAVIGATION", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesNavigationMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacesNavigationMode[] $VALUES;
    public static final PlacesNavigationMode DEEPLINK_NAVIGATION;
    public static final PlacesNavigationMode NATIVE_NAVIGATION;

    static {
        PlacesNavigationMode placesNavigationMode = new PlacesNavigationMode("NATIVE_NAVIGATION", 0);
        NATIVE_NAVIGATION = placesNavigationMode;
        PlacesNavigationMode placesNavigationMode2 = new PlacesNavigationMode("DEEPLINK_NAVIGATION", 1);
        DEEPLINK_NAVIGATION = placesNavigationMode2;
        PlacesNavigationMode[] placesNavigationModeArr = {placesNavigationMode, placesNavigationMode2};
        $VALUES = placesNavigationModeArr;
        $ENTRIES = a.a(placesNavigationModeArr);
    }

    public static PlacesNavigationMode valueOf(String str) {
        return (PlacesNavigationMode) Enum.valueOf(PlacesNavigationMode.class, str);
    }

    public static PlacesNavigationMode[] values() {
        return (PlacesNavigationMode[]) $VALUES.clone();
    }
}
