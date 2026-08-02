package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ButtonScreenContent.kt */
/* loaded from: classes18.dex */
public final class qtp0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ qtp0[] $VALUES;
    public static final qtp0 Filled;
    public static final qtp0 Icon;
    public static final qtp0 Loader;
    public static final qtp0 Simple;
    public static final qtp0 SimpleRectangle;
    public static final qtp0 SimpleRound;
    private final String desc;

    static {
        qtp0 qtp0Var = new qtp0("Icon", 0, "");
        Icon = qtp0Var;
        qtp0 qtp0Var2 = new qtp0("Loader", 1, "");
        Loader = qtp0Var2;
        qtp0 qtp0Var3 = new qtp0("Simple", 2, "Simple");
        Simple = qtp0Var3;
        qtp0 qtp0Var4 = new qtp0("SimpleRectangle", 3, "Rect");
        SimpleRectangle = qtp0Var4;
        qtp0 qtp0Var5 = new qtp0("SimpleRound", 4, "Round");
        SimpleRound = qtp0Var5;
        qtp0 qtp0Var6 = new qtp0("Filled", 5, "Filled");
        Filled = qtp0Var6;
        qtp0[] qtp0VarArr = {qtp0Var, qtp0Var2, qtp0Var3, qtp0Var4, qtp0Var5, qtp0Var6};
        $VALUES = qtp0VarArr;
        $ENTRIES = new asp(qtp0VarArr);
    }

    public qtp0(String str, int i, String str2) {
        this.desc = str2;
    }

    public static zrp<qtp0> i() {
        return $ENTRIES;
    }

    public static qtp0 valueOf(String str) {
        return (qtp0) Enum.valueOf(qtp0.class, str);
    }

    public static qtp0[] values() {
        return (qtp0[]) $VALUES.clone();
    }

    public final String h() {
        return this.desc;
    }
}
