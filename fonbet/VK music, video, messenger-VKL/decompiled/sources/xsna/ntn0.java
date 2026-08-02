package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InternalTabs.kt */
/* loaded from: classes17.dex */
public final class ntn0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ntn0[] $VALUES;
    public static final ntn0 Divider;
    public static final ntn0 Indicator;
    public static final ntn0 Tabs;

    static {
        ntn0 ntn0Var = new ntn0("Tabs", 0);
        Tabs = ntn0Var;
        ntn0 ntn0Var2 = new ntn0("Divider", 1);
        Divider = ntn0Var2;
        ntn0 ntn0Var3 = new ntn0("Indicator", 2);
        Indicator = ntn0Var3;
        ntn0[] ntn0VarArr = {ntn0Var, ntn0Var2, ntn0Var3};
        $VALUES = ntn0VarArr;
        $ENTRIES = new asp(ntn0VarArr);
    }

    public ntn0() {
        throw null;
    }

    public static ntn0 valueOf(String str) {
        return (ntn0) Enum.valueOf(ntn0.class, str);
    }

    public static ntn0[] values() {
        return (ntn0[]) $VALUES.clone();
    }
}
