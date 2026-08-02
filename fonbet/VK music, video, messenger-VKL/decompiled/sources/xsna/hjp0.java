package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HdrUtils.kt */
/* loaded from: classes8.dex */
public final class hjp0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ hjp0[] $VALUES;
    public static final hjp0 HLG;
    public static final hjp0 PQ;
    public static final hjp0 Unknown;

    static {
        hjp0 hjp0Var = new hjp0("PQ", 0);
        PQ = hjp0Var;
        hjp0 hjp0Var2 = new hjp0("HLG", 1);
        HLG = hjp0Var2;
        hjp0 hjp0Var3 = new hjp0(DeviceInfo.STR_TYPE_UNKNOWN, 2);
        Unknown = hjp0Var3;
        hjp0[] hjp0VarArr = {hjp0Var, hjp0Var2, hjp0Var3};
        $VALUES = hjp0VarArr;
        $ENTRIES = new asp(hjp0VarArr);
    }

    public hjp0() {
        throw null;
    }

    public static hjp0 valueOf(String str) {
        return (hjp0) Enum.valueOf(hjp0.class, str);
    }

    public static hjp0[] values() {
        return (hjp0[]) $VALUES.clone();
    }
}
