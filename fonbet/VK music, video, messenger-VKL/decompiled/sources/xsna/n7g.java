package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HdrUtils.kt */
/* loaded from: classes8.dex */
public final class n7g {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ n7g[] $VALUES;
    public static final n7g BT2020;
    public static final n7g Unknown;

    static {
        n7g n7gVar = new n7g("BT2020", 0);
        BT2020 = n7gVar;
        n7g n7gVar2 = new n7g(DeviceInfo.STR_TYPE_UNKNOWN, 1);
        Unknown = n7gVar2;
        n7g[] n7gVarArr = {n7gVar, n7gVar2};
        $VALUES = n7gVarArr;
        $ENTRIES = new asp(n7gVarArr);
    }

    public n7g() {
        throw null;
    }

    public static n7g valueOf(String str) {
        return (n7g) Enum.valueOf(n7g.class, str);
    }

    public static n7g[] values() {
        return (n7g[]) $VALUES.clone();
    }
}
