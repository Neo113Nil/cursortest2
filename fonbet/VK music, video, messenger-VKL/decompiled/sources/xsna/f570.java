package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LayoutModifierNode.kt */
/* loaded from: classes11.dex */
public final class f570 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ f570[] $VALUES;
    public static final f570 Height;
    public static final f570 Width;

    static {
        f570 f570Var = new f570("Width", 0);
        Width = f570Var;
        f570 f570Var2 = new f570("Height", 1);
        Height = f570Var2;
        f570[] f570VarArr = {f570Var, f570Var2};
        $VALUES = f570VarArr;
        $ENTRIES = new asp(f570VarArr);
    }

    public f570() {
        throw null;
    }

    public static f570 valueOf(String str) {
        return (f570) Enum.valueOf(f570.class, str);
    }

    public static f570[] values() {
        return (f570[]) $VALUES.clone();
    }
}
