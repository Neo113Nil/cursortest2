package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HdrUtils.kt */
/* loaded from: classes8.dex */
public final class a6g {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ a6g[] $VALUES;
    public static final a6g Depth10;
    public static final a6g Depth12;
    public static final a6g Depth8;
    public static final a6g Unknown;

    static {
        a6g a6gVar = new a6g("Depth8", 0);
        Depth8 = a6gVar;
        a6g a6gVar2 = new a6g("Depth10", 1);
        Depth10 = a6gVar2;
        a6g a6gVar3 = new a6g("Depth12", 2);
        Depth12 = a6gVar3;
        a6g a6gVar4 = new a6g(DeviceInfo.STR_TYPE_UNKNOWN, 3);
        Unknown = a6gVar4;
        a6g[] a6gVarArr = {a6gVar, a6gVar2, a6gVar3, a6gVar4};
        $VALUES = a6gVarArr;
        $ENTRIES = new asp(a6gVarArr);
    }

    public a6g() {
        throw null;
    }

    public static a6g valueOf(String str) {
        return (a6g) Enum.valueOf(a6g.class, str);
    }

    public static a6g[] values() {
        return (a6g[]) $VALUES.clone();
    }
}
