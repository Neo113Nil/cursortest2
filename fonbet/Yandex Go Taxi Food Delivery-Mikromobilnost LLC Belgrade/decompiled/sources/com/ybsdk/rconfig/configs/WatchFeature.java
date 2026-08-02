package com.ybsdk.rconfig.configs;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/rconfig/configs/WatchFeature;", "", "<init>", "(Ljava/lang/String;I)V", JCP.RAW_PREFIX, "HW_ENGINE", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class WatchFeature {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WatchFeature[] $VALUES;
    public static final WatchFeature NONE = new WatchFeature(JCP.RAW_PREFIX, 0);
    public static final WatchFeature HW_ENGINE = new WatchFeature("HW_ENGINE", 1);

    private static final /* synthetic */ WatchFeature[] $values() {
        return new WatchFeature[]{NONE, HW_ENGINE};
    }

    static {
        WatchFeature[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private WatchFeature(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static WatchFeature valueOf(String str) {
        return (WatchFeature) Enum.valueOf(WatchFeature.class, str);
    }

    public static WatchFeature[] values() {
        return (WatchFeature[]) $VALUES.clone();
    }
}
