package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TooltipScreenContent.kt */
/* loaded from: classes18.dex */
public final class l6p0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ l6p0[] $VALUES;
    public static final l6p0 Lego;
    public static final l6p0 Milkshake;

    static {
        l6p0 l6p0Var = new l6p0("Milkshake", 0);
        Milkshake = l6p0Var;
        l6p0 l6p0Var2 = new l6p0("Lego", 1);
        Lego = l6p0Var2;
        l6p0[] l6p0VarArr = {l6p0Var, l6p0Var2};
        $VALUES = l6p0VarArr;
        $ENTRIES = new asp(l6p0VarArr);
    }

    public l6p0() {
        throw null;
    }

    public static zrp<l6p0> h() {
        return $ENTRIES;
    }

    public static l6p0 valueOf(String str) {
        return (l6p0) Enum.valueOf(l6p0.class, str);
    }

    public static l6p0[] values() {
        return (l6p0[]) $VALUES.clone();
    }
}
