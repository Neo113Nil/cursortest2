package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LayoutModifier.kt */
/* loaded from: classes11.dex */
public final class rp10 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ rp10[] $VALUES;
    public static final rp10 Max;
    public static final rp10 Min;

    static {
        rp10 rp10Var = new rp10("Min", 0);
        Min = rp10Var;
        rp10 rp10Var2 = new rp10("Max", 1);
        Max = rp10Var2;
        rp10[] rp10VarArr = {rp10Var, rp10Var2};
        $VALUES = rp10VarArr;
        $ENTRIES = new asp(rp10VarArr);
    }

    public rp10() {
        throw null;
    }

    public static rp10 valueOf(String str) {
        return (rp10) Enum.valueOf(rp10.class, str);
    }

    public static rp10[] values() {
        return (rp10[]) $VALUES.clone();
    }
}
