package com.yandex.mob.data;

import defpackage.k4o;
import kotlin.Metadata;
import ru.yandex.common.startup.StartupRequest;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/mob/data/MobNetworkTypeChangeTracker$NetworkType", "", "Lcom/yandex/mob/data/MobNetworkTypeChangeTracker$NetworkType;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Cellular", "Wifi", "Other", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MobNetworkTypeChangeTracker$NetworkType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobNetworkTypeChangeTracker$NetworkType[] $VALUES;
    public static final MobNetworkTypeChangeTracker$NetworkType Cellular;
    public static final MobNetworkTypeChangeTracker$NetworkType Other;
    public static final MobNetworkTypeChangeTracker$NetworkType Wifi;
    private final String value;

    static {
        MobNetworkTypeChangeTracker$NetworkType mobNetworkTypeChangeTracker$NetworkType = new MobNetworkTypeChangeTracker$NetworkType("Cellular", 0, "cellular");
        Cellular = mobNetworkTypeChangeTracker$NetworkType;
        MobNetworkTypeChangeTracker$NetworkType mobNetworkTypeChangeTracker$NetworkType2 = new MobNetworkTypeChangeTracker$NetworkType("Wifi", 1, StartupRequest.PARAM_WIFI);
        Wifi = mobNetworkTypeChangeTracker$NetworkType2;
        MobNetworkTypeChangeTracker$NetworkType mobNetworkTypeChangeTracker$NetworkType3 = new MobNetworkTypeChangeTracker$NetworkType("Other", 2, "other");
        Other = mobNetworkTypeChangeTracker$NetworkType3;
        MobNetworkTypeChangeTracker$NetworkType[] mobNetworkTypeChangeTracker$NetworkTypeArr = {mobNetworkTypeChangeTracker$NetworkType, mobNetworkTypeChangeTracker$NetworkType2, mobNetworkTypeChangeTracker$NetworkType3};
        $VALUES = mobNetworkTypeChangeTracker$NetworkTypeArr;
        $ENTRIES = kotlin.enums.a.a(mobNetworkTypeChangeTracker$NetworkTypeArr);
    }

    public MobNetworkTypeChangeTracker$NetworkType(String str, int i, String str2) {
        this.value = str2;
    }

    public static MobNetworkTypeChangeTracker$NetworkType valueOf(String str) {
        return (MobNetworkTypeChangeTracker$NetworkType) Enum.valueOf(MobNetworkTypeChangeTracker$NetworkType.class, str);
    }

    public static MobNetworkTypeChangeTracker$NetworkType[] values() {
        return (MobNetworkTypeChangeTracker$NetworkType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
