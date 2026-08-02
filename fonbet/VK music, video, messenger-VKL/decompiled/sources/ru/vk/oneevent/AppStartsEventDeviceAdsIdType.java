package ru.vk.oneevent;

import com.ironsource.O6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppStartsEventDeviceAdsIdType.kt */
/* loaded from: classes9.dex */
public final class AppStartsEventDeviceAdsIdType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppStartsEventDeviceAdsIdType[] $VALUES;
    public static final AppStartsEventDeviceAdsIdType GAID;
    public static final AppStartsEventDeviceAdsIdType IDFA;
    public static final AppStartsEventDeviceAdsIdType OAID;
    private final String wireValue;

    static {
        AppStartsEventDeviceAdsIdType appStartsEventDeviceAdsIdType = new AppStartsEventDeviceAdsIdType("IDFA", 0, "idfa");
        IDFA = appStartsEventDeviceAdsIdType;
        AppStartsEventDeviceAdsIdType appStartsEventDeviceAdsIdType2 = new AppStartsEventDeviceAdsIdType(IronSourceConstants.TYPE_GAID, 1, O6.X0);
        GAID = appStartsEventDeviceAdsIdType2;
        AppStartsEventDeviceAdsIdType appStartsEventDeviceAdsIdType3 = new AppStartsEventDeviceAdsIdType("OAID", 2, CommonUrlParts.HUAWEI_OAID);
        OAID = appStartsEventDeviceAdsIdType3;
        AppStartsEventDeviceAdsIdType[] appStartsEventDeviceAdsIdTypeArr = {appStartsEventDeviceAdsIdType, appStartsEventDeviceAdsIdType2, appStartsEventDeviceAdsIdType3};
        $VALUES = appStartsEventDeviceAdsIdTypeArr;
        $ENTRIES = new asp(appStartsEventDeviceAdsIdTypeArr);
    }

    public AppStartsEventDeviceAdsIdType(String str, int i, String str2) {
        this.wireValue = str2;
    }

    public static AppStartsEventDeviceAdsIdType valueOf(String str) {
        return (AppStartsEventDeviceAdsIdType) Enum.valueOf(AppStartsEventDeviceAdsIdType.class, str);
    }

    public static AppStartsEventDeviceAdsIdType[] values() {
        return (AppStartsEventDeviceAdsIdType[]) $VALUES.clone();
    }

    public final String h() {
        return this.wireValue;
    }
}
