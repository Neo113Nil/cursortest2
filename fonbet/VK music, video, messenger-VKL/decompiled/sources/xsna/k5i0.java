package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkSegmentedControl.kt */
/* loaded from: classes17.dex */
public final class k5i0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ k5i0[] $VALUES;
    public static final k5i0 Indicator;
    public static final k5i0 Segment;

    static {
        k5i0 k5i0Var = new k5i0("Segment", 0);
        Segment = k5i0Var;
        k5i0 k5i0Var2 = new k5i0("Indicator", 1);
        Indicator = k5i0Var2;
        k5i0[] k5i0VarArr = {k5i0Var, k5i0Var2};
        $VALUES = k5i0VarArr;
        $ENTRIES = new asp(k5i0VarArr);
    }

    public k5i0() {
        throw null;
    }

    public static k5i0 valueOf(String str) {
        return (k5i0) Enum.valueOf(k5i0.class, str);
    }

    public static k5i0[] values() {
        return (k5i0[]) $VALUES.clone();
    }
}
