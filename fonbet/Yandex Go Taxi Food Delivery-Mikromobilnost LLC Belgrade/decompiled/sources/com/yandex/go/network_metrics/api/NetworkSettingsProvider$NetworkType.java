package com.yandex.go.network_metrics.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.common.startup.StartupRequest;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/network_metrics/api/NetworkSettingsProvider$NetworkType", "", "Lcom/yandex/go/network_metrics/api/NetworkSettingsProvider$NetworkType;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Cellular", "Wifi", "Other", "go-client-android.features.network_metrics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NetworkSettingsProvider$NetworkType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkSettingsProvider$NetworkType[] $VALUES;
    public static final NetworkSettingsProvider$NetworkType Cellular;
    public static final NetworkSettingsProvider$NetworkType Other;
    public static final NetworkSettingsProvider$NetworkType Wifi;
    private final String value;

    static {
        NetworkSettingsProvider$NetworkType networkSettingsProvider$NetworkType = new NetworkSettingsProvider$NetworkType("Cellular", 0, "cellular");
        Cellular = networkSettingsProvider$NetworkType;
        NetworkSettingsProvider$NetworkType networkSettingsProvider$NetworkType2 = new NetworkSettingsProvider$NetworkType("Wifi", 1, StartupRequest.PARAM_WIFI);
        Wifi = networkSettingsProvider$NetworkType2;
        NetworkSettingsProvider$NetworkType networkSettingsProvider$NetworkType3 = new NetworkSettingsProvider$NetworkType("Other", 2, "other");
        Other = networkSettingsProvider$NetworkType3;
        NetworkSettingsProvider$NetworkType[] networkSettingsProvider$NetworkTypeArr = {networkSettingsProvider$NetworkType, networkSettingsProvider$NetworkType2, networkSettingsProvider$NetworkType3};
        $VALUES = networkSettingsProvider$NetworkTypeArr;
        $ENTRIES = a.a(networkSettingsProvider$NetworkTypeArr);
    }

    public NetworkSettingsProvider$NetworkType(String str, int i, String str2) {
        this.value = str2;
    }

    public static NetworkSettingsProvider$NetworkType valueOf(String str) {
        return (NetworkSettingsProvider$NetworkType) Enum.valueOf(NetworkSettingsProvider$NetworkType.class, str);
    }

    public static NetworkSettingsProvider$NetworkType[] values() {
        return (NetworkSettingsProvider$NetworkType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
