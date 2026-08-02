package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExpandableTextContent.kt */
/* loaded from: classes18.dex */
public final class ibo0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ibo0[] $VALUES;
    public static final ibo0 EmptyLine;
    public static final ibo0 Long;
    public static final ibo0 Medium;
    public static final ibo0 MediumWithLinebreak;
    public static final ibo0 Short;
    public static final ibo0 SingleLine;

    static {
        ibo0 ibo0Var = new ibo0("SingleLine", 0);
        SingleLine = ibo0Var;
        ibo0 ibo0Var2 = new ibo0("Short", 1);
        Short = ibo0Var2;
        ibo0 ibo0Var3 = new ibo0("Medium", 2);
        Medium = ibo0Var3;
        ibo0 ibo0Var4 = new ibo0("MediumWithLinebreak", 3);
        MediumWithLinebreak = ibo0Var4;
        ibo0 ibo0Var5 = new ibo0("EmptyLine", 4);
        EmptyLine = ibo0Var5;
        ibo0 ibo0Var6 = new ibo0("Long", 5);
        Long = ibo0Var6;
        ibo0[] ibo0VarArr = {ibo0Var, ibo0Var2, ibo0Var3, ibo0Var4, ibo0Var5, ibo0Var6};
        $VALUES = ibo0VarArr;
        $ENTRIES = new asp(ibo0VarArr);
    }

    public ibo0() {
        throw null;
    }

    public static zrp<ibo0> h() {
        return $ENTRIES;
    }

    public static ibo0 valueOf(String str) {
        return (ibo0) Enum.valueOf(ibo0.class, str);
    }

    public static ibo0[] values() {
        return (ibo0[]) $VALUES.clone();
    }
}
