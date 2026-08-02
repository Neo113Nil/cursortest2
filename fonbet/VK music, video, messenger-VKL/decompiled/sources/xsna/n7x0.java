package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HdrUtils.kt */
/* loaded from: classes8.dex */
public final class n7x0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ n7x0[] $VALUES;
    public static final n7x0 Profile0;
    public static final n7x0 Profile1;
    public static final n7x0 Profile2;
    public static final n7x0 Profile3;
    public static final n7x0 Unknown;

    static {
        n7x0 n7x0Var = new n7x0("Profile0", 0);
        Profile0 = n7x0Var;
        n7x0 n7x0Var2 = new n7x0("Profile1", 1);
        Profile1 = n7x0Var2;
        n7x0 n7x0Var3 = new n7x0("Profile2", 2);
        Profile2 = n7x0Var3;
        n7x0 n7x0Var4 = new n7x0("Profile3", 3);
        Profile3 = n7x0Var4;
        n7x0 n7x0Var5 = new n7x0(DeviceInfo.STR_TYPE_UNKNOWN, 4);
        Unknown = n7x0Var5;
        n7x0[] n7x0VarArr = {n7x0Var, n7x0Var2, n7x0Var3, n7x0Var4, n7x0Var5};
        $VALUES = n7x0VarArr;
        $ENTRIES = new asp(n7x0VarArr);
    }

    public n7x0() {
        throw null;
    }

    public static n7x0 valueOf(String str) {
        return (n7x0) Enum.valueOf(n7x0.class, str);
    }

    public static n7x0[] values() {
        return (n7x0[]) $VALUES.clone();
    }
}
