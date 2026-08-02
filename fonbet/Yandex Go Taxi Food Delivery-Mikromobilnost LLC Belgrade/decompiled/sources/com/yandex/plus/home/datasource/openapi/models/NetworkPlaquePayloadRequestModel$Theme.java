package com.yandex.plus.home.datasource.openapi.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/home/datasource/openapi/models/NetworkPlaquePayloadRequestModel$Theme", "", "Lcom/yandex/plus/home/datasource/openapi/models/NetworkPlaquePayloadRequestModel$Theme;", "DARK", "LIGHT", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkPlaquePayloadRequestModel$Theme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkPlaquePayloadRequestModel$Theme[] $VALUES;
    public static final NetworkPlaquePayloadRequestModel$Theme DARK;
    public static final NetworkPlaquePayloadRequestModel$Theme LIGHT;

    static {
        NetworkPlaquePayloadRequestModel$Theme networkPlaquePayloadRequestModel$Theme = new NetworkPlaquePayloadRequestModel$Theme("DARK", 0);
        DARK = networkPlaquePayloadRequestModel$Theme;
        NetworkPlaquePayloadRequestModel$Theme networkPlaquePayloadRequestModel$Theme2 = new NetworkPlaquePayloadRequestModel$Theme("LIGHT", 1);
        LIGHT = networkPlaquePayloadRequestModel$Theme2;
        NetworkPlaquePayloadRequestModel$Theme[] networkPlaquePayloadRequestModel$ThemeArr = {networkPlaquePayloadRequestModel$Theme, networkPlaquePayloadRequestModel$Theme2};
        $VALUES = networkPlaquePayloadRequestModel$ThemeArr;
        $ENTRIES = a.a(networkPlaquePayloadRequestModel$ThemeArr);
    }

    public static NetworkPlaquePayloadRequestModel$Theme valueOf(String str) {
        return (NetworkPlaquePayloadRequestModel$Theme) Enum.valueOf(NetworkPlaquePayloadRequestModel$Theme.class, str);
    }

    public static NetworkPlaquePayloadRequestModel$Theme[] values() {
        return (NetworkPlaquePayloadRequestModel$Theme[]) $VALUES.clone();
    }
}
