package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: XmlAnimatorParser.android.kt */
/* loaded from: classes11.dex */
public final class ckr0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ckr0[] $VALUES;
    public static final ckr0 Color;
    public static final ckr0 Float;
    public static final ckr0 Int;
    public static final ckr0 Path;

    static {
        ckr0 ckr0Var = new ckr0("Float", 0);
        Float = ckr0Var;
        ckr0 ckr0Var2 = new ckr0("Int", 1);
        Int = ckr0Var2;
        ckr0 ckr0Var3 = new ckr0("Color", 2);
        Color = ckr0Var3;
        ckr0 ckr0Var4 = new ckr0("Path", 3);
        Path = ckr0Var4;
        ckr0[] ckr0VarArr = {ckr0Var, ckr0Var2, ckr0Var3, ckr0Var4};
        $VALUES = ckr0VarArr;
        $ENTRIES = new asp(ckr0VarArr);
    }

    public ckr0() {
        throw null;
    }

    public static ckr0 valueOf(String str) {
        return (ckr0) Enum.valueOf(ckr0.class, str);
    }

    public static ckr0[] values() {
        return (ckr0[]) $VALUES.clone();
    }
}
