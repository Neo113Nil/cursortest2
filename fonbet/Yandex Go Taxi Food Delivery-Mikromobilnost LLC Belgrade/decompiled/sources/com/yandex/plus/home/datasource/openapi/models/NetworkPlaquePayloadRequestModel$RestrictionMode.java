package com.yandex.plus.home.datasource.openapi.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/home/datasource/openapi/models/NetworkPlaquePayloadRequestModel$RestrictionMode", "", "Lcom/yandex/plus/home/datasource/openapi/models/NetworkPlaquePayloadRequestModel$RestrictionMode;", "RESTRICTED", "UNRESTRICTED", "AUTO", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkPlaquePayloadRequestModel$RestrictionMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkPlaquePayloadRequestModel$RestrictionMode[] $VALUES;
    public static final NetworkPlaquePayloadRequestModel$RestrictionMode AUTO;
    public static final NetworkPlaquePayloadRequestModel$RestrictionMode RESTRICTED;
    public static final NetworkPlaquePayloadRequestModel$RestrictionMode UNRESTRICTED;

    static {
        NetworkPlaquePayloadRequestModel$RestrictionMode networkPlaquePayloadRequestModel$RestrictionMode = new NetworkPlaquePayloadRequestModel$RestrictionMode("RESTRICTED", 0);
        RESTRICTED = networkPlaquePayloadRequestModel$RestrictionMode;
        NetworkPlaquePayloadRequestModel$RestrictionMode networkPlaquePayloadRequestModel$RestrictionMode2 = new NetworkPlaquePayloadRequestModel$RestrictionMode("UNRESTRICTED", 1);
        UNRESTRICTED = networkPlaquePayloadRequestModel$RestrictionMode2;
        NetworkPlaquePayloadRequestModel$RestrictionMode networkPlaquePayloadRequestModel$RestrictionMode3 = new NetworkPlaquePayloadRequestModel$RestrictionMode("AUTO", 2);
        AUTO = networkPlaquePayloadRequestModel$RestrictionMode3;
        NetworkPlaquePayloadRequestModel$RestrictionMode[] networkPlaquePayloadRequestModel$RestrictionModeArr = {networkPlaquePayloadRequestModel$RestrictionMode, networkPlaquePayloadRequestModel$RestrictionMode2, networkPlaquePayloadRequestModel$RestrictionMode3};
        $VALUES = networkPlaquePayloadRequestModel$RestrictionModeArr;
        $ENTRIES = a.a(networkPlaquePayloadRequestModel$RestrictionModeArr);
    }

    public static NetworkPlaquePayloadRequestModel$RestrictionMode valueOf(String str) {
        return (NetworkPlaquePayloadRequestModel$RestrictionMode) Enum.valueOf(NetworkPlaquePayloadRequestModel$RestrictionMode.class, str);
    }

    public static NetworkPlaquePayloadRequestModel$RestrictionMode[] values() {
        return (NetworkPlaquePayloadRequestModel$RestrictionMode[]) $VALUES.clone();
    }
}
