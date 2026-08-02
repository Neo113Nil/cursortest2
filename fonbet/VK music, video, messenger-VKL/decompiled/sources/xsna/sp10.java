package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LayoutModifier.kt */
/* loaded from: classes11.dex */
public final class sp10 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ sp10[] $VALUES;
    public static final sp10 Height;
    public static final sp10 Width;

    static {
        sp10 sp10Var = new sp10("Width", 0);
        Width = sp10Var;
        sp10 sp10Var2 = new sp10("Height", 1);
        Height = sp10Var2;
        sp10[] sp10VarArr = {sp10Var, sp10Var2};
        $VALUES = sp10VarArr;
        $ENTRIES = new asp(sp10VarArr);
    }

    public sp10() {
        throw null;
    }

    public static sp10 valueOf(String str) {
        return (sp10) Enum.valueOf(sp10.class, str);
    }

    public static sp10[] values() {
        return (sp10[]) $VALUES.clone();
    }
}
