package one.video.stat2;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceType.kt */
/* loaded from: classes8.dex */
public final class DeviceType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DeviceType[] $VALUES;
    public static final DeviceType CAR;
    public static final DeviceType PHONE;
    public static final DeviceType TABLET;
    public static final DeviceType TV;
    public static final DeviceType UNKNOWN;
    private final String value;

    static {
        DeviceType deviceType = new DeviceType("PHONE", 0, "phone");
        PHONE = deviceType;
        DeviceType deviceType2 = new DeviceType("TABLET", 1, "tablet");
        TABLET = deviceType2;
        DeviceType deviceType3 = new DeviceType("TV", 2, "tv");
        TV = deviceType3;
        DeviceType deviceType4 = new DeviceType("CAR", 3, "car");
        CAR = deviceType4;
        DeviceType deviceType5 = new DeviceType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4, "unknown");
        UNKNOWN = deviceType5;
        DeviceType[] deviceTypeArr = {deviceType, deviceType2, deviceType3, deviceType4, deviceType5};
        $VALUES = deviceTypeArr;
        $ENTRIES = new asp(deviceTypeArr);
    }

    public DeviceType(String str, int i, String str2) {
        this.value = str2;
    }

    public static DeviceType valueOf(String str) {
        return (DeviceType) Enum.valueOf(DeviceType.class, str);
    }

    public static DeviceType[] values() {
        return (DeviceType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
