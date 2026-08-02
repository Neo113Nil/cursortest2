package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutBanner.kt */
/* loaded from: classes18.dex */
public final class et9 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ et9[] $VALUES;
    public static final et9 DOUBLE_CARD;
    public static final et9 SINGLE_CARD;

    static {
        et9 et9Var = new et9("SINGLE_CARD", 0);
        SINGLE_CARD = et9Var;
        et9 et9Var2 = new et9("DOUBLE_CARD", 1);
        DOUBLE_CARD = et9Var2;
        et9[] et9VarArr = {et9Var, et9Var2};
        $VALUES = et9VarArr;
        $ENTRIES = new asp(et9VarArr);
    }

    public et9() {
        throw null;
    }

    public static et9 valueOf(String str) {
        return (et9) Enum.valueOf(et9.class, str);
    }

    public static et9[] values() {
        return (et9[]) $VALUES.clone();
    }
}
