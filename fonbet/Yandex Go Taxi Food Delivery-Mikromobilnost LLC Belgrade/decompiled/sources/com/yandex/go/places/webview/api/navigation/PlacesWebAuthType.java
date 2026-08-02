package com.yandex.go.places.webview.api.navigation;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/places/webview/api/navigation/PlacesWebAuthType;", "", "COOKIES", "OAUTH", "go-client-android.features.places.webview:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesWebAuthType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacesWebAuthType[] $VALUES;
    public static final PlacesWebAuthType COOKIES;
    public static final PlacesWebAuthType OAUTH;

    static {
        PlacesWebAuthType placesWebAuthType = new PlacesWebAuthType("COOKIES", 0);
        COOKIES = placesWebAuthType;
        PlacesWebAuthType placesWebAuthType2 = new PlacesWebAuthType("OAUTH", 1);
        OAUTH = placesWebAuthType2;
        PlacesWebAuthType[] placesWebAuthTypeArr = {placesWebAuthType, placesWebAuthType2};
        $VALUES = placesWebAuthTypeArr;
        $ENTRIES = a.a(placesWebAuthTypeArr);
    }

    public static PlacesWebAuthType valueOf(String str) {
        return (PlacesWebAuthType) Enum.valueOf(PlacesWebAuthType.class, str);
    }

    public static PlacesWebAuthType[] values() {
        return (PlacesWebAuthType[]) $VALUES.clone();
    }
}
