package xsna;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppForegroundNotifier.kt */
/* loaded from: classes6.dex */
public final class i43 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ i43[] $VALUES;
    public static final i43 BACKGROUND;
    public static final i43 FOREGROUND;
    public static final i43 OPENED;
    public static final i43 UNKNOWN;

    static {
        i43 i43Var = new i43(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = i43Var;
        i43 i43Var2 = new i43("OPENED", 1);
        OPENED = i43Var2;
        i43 i43Var3 = new i43("BACKGROUND", 2);
        BACKGROUND = i43Var3;
        i43 i43Var4 = new i43("FOREGROUND", 3);
        FOREGROUND = i43Var4;
        i43[] i43VarArr = {i43Var, i43Var2, i43Var3, i43Var4};
        $VALUES = i43VarArr;
        $ENTRIES = new asp(i43VarArr);
    }

    public i43() {
        throw null;
    }

    public static i43 valueOf(String str) {
        return (i43) Enum.valueOf(i43.class, str);
    }

    public static i43[] values() {
        return (i43[]) $VALUES.clone();
    }
}
