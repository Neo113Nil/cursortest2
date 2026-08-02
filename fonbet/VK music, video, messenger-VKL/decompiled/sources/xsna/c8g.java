package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HdrUtils.kt */
/* loaded from: classes8.dex */
public final class c8g {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ c8g[] $VALUES;
    public static final c8g BT2020NC;
    public static final c8g Unknown;

    static {
        c8g c8gVar = new c8g("BT2020NC", 0);
        BT2020NC = c8gVar;
        c8g c8gVar2 = new c8g(DeviceInfo.STR_TYPE_UNKNOWN, 1);
        Unknown = c8gVar2;
        c8g[] c8gVarArr = {c8gVar, c8gVar2};
        $VALUES = c8gVarArr;
        $ENTRIES = new asp(c8gVarArr);
    }

    public c8g() {
        throw null;
    }

    public static c8g valueOf(String str) {
        return (c8g) Enum.valueOf(c8g.class, str);
    }

    public static c8g[] values() {
        return (c8g[]) $VALUES.clone();
    }
}
