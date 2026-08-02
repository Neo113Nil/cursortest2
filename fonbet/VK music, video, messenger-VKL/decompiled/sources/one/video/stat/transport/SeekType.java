package one.video.stat.transport;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Param.kt */
/* loaded from: classes8.dex */
public final class SeekType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SeekType[] $VALUES;
    public static final SeekType DOUBLE_TAP;
    public static final SeekType EPISODE;
    public static final SeekType SLIDER;
    public static final SeekType TIME_CODE;
    public static final SeekType UNKNOWN;
    private final String value;

    static {
        SeekType seekType = new SeekType("DOUBLE_TAP", 0, "double_tap");
        DOUBLE_TAP = seekType;
        SeekType seekType2 = new SeekType("SLIDER", 1, "slider");
        SLIDER = seekType2;
        SeekType seekType3 = new SeekType("TIME_CODE", 2, "time_code");
        TIME_CODE = seekType3;
        SeekType seekType4 = new SeekType("EPISODE", 3, "episode");
        EPISODE = seekType4;
        SeekType seekType5 = new SeekType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4, "unknown");
        UNKNOWN = seekType5;
        SeekType[] seekTypeArr = {seekType, seekType2, seekType3, seekType4, seekType5};
        $VALUES = seekTypeArr;
        $ENTRIES = new asp(seekTypeArr);
    }

    public SeekType(String str, int i, String str2) {
        this.value = str2;
    }

    public static SeekType valueOf(String str) {
        return (SeekType) Enum.valueOf(SeekType.class, str);
    }

    public static SeekType[] values() {
        return (SeekType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
