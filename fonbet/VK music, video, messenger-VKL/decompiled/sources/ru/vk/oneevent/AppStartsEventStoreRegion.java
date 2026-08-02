package ru.vk.oneevent;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppStartsEventStoreRegion.kt */
/* loaded from: classes9.dex */
public final class AppStartsEventStoreRegion {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppStartsEventStoreRegion[] $VALUES;
    public static final AppStartsEventStoreRegion BY;
    public static final AppStartsEventStoreRegion KZ;
    public static final AppStartsEventStoreRegion RU;
    public static final AppStartsEventStoreRegion UNKNOWN;
    private final String wireValue;

    static {
        AppStartsEventStoreRegion appStartsEventStoreRegion = new AppStartsEventStoreRegion(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "unknown");
        UNKNOWN = appStartsEventStoreRegion;
        AppStartsEventStoreRegion appStartsEventStoreRegion2 = new AppStartsEventStoreRegion("RU", 1, "ru");
        RU = appStartsEventStoreRegion2;
        AppStartsEventStoreRegion appStartsEventStoreRegion3 = new AppStartsEventStoreRegion("BY", 2, "by");
        BY = appStartsEventStoreRegion3;
        AppStartsEventStoreRegion appStartsEventStoreRegion4 = new AppStartsEventStoreRegion("KZ", 3, "kz");
        KZ = appStartsEventStoreRegion4;
        AppStartsEventStoreRegion[] appStartsEventStoreRegionArr = {appStartsEventStoreRegion, appStartsEventStoreRegion2, appStartsEventStoreRegion3, appStartsEventStoreRegion4};
        $VALUES = appStartsEventStoreRegionArr;
        $ENTRIES = new asp(appStartsEventStoreRegionArr);
    }

    public AppStartsEventStoreRegion(String str, int i, String str2) {
        this.wireValue = str2;
    }

    public static AppStartsEventStoreRegion valueOf(String str) {
        return (AppStartsEventStoreRegion) Enum.valueOf(AppStartsEventStoreRegion.class, str);
    }

    public static AppStartsEventStoreRegion[] values() {
        return (AppStartsEventStoreRegion[]) $VALUES.clone();
    }

    public final String h() {
        return this.wireValue;
    }
}
