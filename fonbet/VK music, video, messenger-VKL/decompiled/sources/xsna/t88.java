package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BottomSheetLayout.kt */
/* loaded from: classes18.dex */
public final class t88 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ t88[] $VALUES;
    public static final t88 CONTENT;
    public static final t88 SHEET;
    public static final t88 SHEET_ABOVE;

    static {
        t88 t88Var = new t88("SHEET", 0);
        SHEET = t88Var;
        t88 t88Var2 = new t88("SHEET_ABOVE", 1);
        SHEET_ABOVE = t88Var2;
        t88 t88Var3 = new t88("CONTENT", 2);
        CONTENT = t88Var3;
        t88[] t88VarArr = {t88Var, t88Var2, t88Var3};
        $VALUES = t88VarArr;
        $ENTRIES = new asp(t88VarArr);
    }

    public t88() {
        throw null;
    }

    public static t88 valueOf(String str) {
        return (t88) Enum.valueOf(t88.class, str);
    }

    public static t88[] values() {
        return (t88[]) $VALUES.clone();
    }
}
