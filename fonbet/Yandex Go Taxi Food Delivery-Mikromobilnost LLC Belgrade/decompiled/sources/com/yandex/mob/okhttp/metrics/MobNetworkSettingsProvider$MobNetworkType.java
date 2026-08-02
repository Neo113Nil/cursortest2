package com.yandex.mob.okhttp.metrics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.common.startup.StartupRequest;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/mob/okhttp/metrics/MobNetworkSettingsProvider$MobNetworkType", "", "Lcom/yandex/mob/okhttp/metrics/MobNetworkSettingsProvider$MobNetworkType;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Cellular", "Wifi", "Other", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MobNetworkSettingsProvider$MobNetworkType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobNetworkSettingsProvider$MobNetworkType[] $VALUES;
    public static final MobNetworkSettingsProvider$MobNetworkType Cellular;
    public static final MobNetworkSettingsProvider$MobNetworkType Other;
    public static final MobNetworkSettingsProvider$MobNetworkType Wifi;
    private final String value;

    static {
        MobNetworkSettingsProvider$MobNetworkType mobNetworkSettingsProvider$MobNetworkType = new MobNetworkSettingsProvider$MobNetworkType("Cellular", 0, "cellular");
        Cellular = mobNetworkSettingsProvider$MobNetworkType;
        MobNetworkSettingsProvider$MobNetworkType mobNetworkSettingsProvider$MobNetworkType2 = new MobNetworkSettingsProvider$MobNetworkType("Wifi", 1, StartupRequest.PARAM_WIFI);
        Wifi = mobNetworkSettingsProvider$MobNetworkType2;
        MobNetworkSettingsProvider$MobNetworkType mobNetworkSettingsProvider$MobNetworkType3 = new MobNetworkSettingsProvider$MobNetworkType("Other", 2, "other");
        Other = mobNetworkSettingsProvider$MobNetworkType3;
        MobNetworkSettingsProvider$MobNetworkType[] mobNetworkSettingsProvider$MobNetworkTypeArr = {mobNetworkSettingsProvider$MobNetworkType, mobNetworkSettingsProvider$MobNetworkType2, mobNetworkSettingsProvider$MobNetworkType3};
        $VALUES = mobNetworkSettingsProvider$MobNetworkTypeArr;
        $ENTRIES = a.a(mobNetworkSettingsProvider$MobNetworkTypeArr);
    }

    public MobNetworkSettingsProvider$MobNetworkType(String str, int i, String str2) {
        this.value = str2;
    }

    public static MobNetworkSettingsProvider$MobNetworkType valueOf(String str) {
        return (MobNetworkSettingsProvider$MobNetworkType) Enum.valueOf(MobNetworkSettingsProvider$MobNetworkType.class, str);
    }

    public static MobNetworkSettingsProvider$MobNetworkType[] values() {
        return (MobNetworkSettingsProvider$MobNetworkType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
