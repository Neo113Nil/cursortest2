package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LayoutModifierNode.kt */
/* loaded from: classes11.dex */
public final class e570 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ e570[] $VALUES;
    public static final e570 Max;
    public static final e570 Min;

    static {
        e570 e570Var = new e570("Min", 0);
        Min = e570Var;
        e570 e570Var2 = new e570("Max", 1);
        Max = e570Var2;
        e570[] e570VarArr = {e570Var, e570Var2};
        $VALUES = e570VarArr;
        $ENTRIES = new asp(e570VarArr);
    }

    public e570() {
        throw null;
    }

    public static e570 valueOf(String str) {
        return (e570) Enum.valueOf(e570.class, str);
    }

    public static e570[] values() {
        return (e570[]) $VALUES.clone();
    }
}
