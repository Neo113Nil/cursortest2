package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductButtonsBinderCallbackImpl.kt */
/* loaded from: classes18.dex */
public final class by9 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ by9[] $VALUES;
    public static final by9 Add;
    public static final by9 Remove;

    static {
        by9 by9Var = new by9("Add", 0);
        Add = by9Var;
        by9 by9Var2 = new by9("Remove", 1);
        Remove = by9Var2;
        by9[] by9VarArr = {by9Var, by9Var2};
        $VALUES = by9VarArr;
        $ENTRIES = new asp(by9VarArr);
    }

    public by9() {
        throw null;
    }

    public static by9 valueOf(String str) {
        return (by9) Enum.valueOf(by9.class, str);
    }

    public static by9[] values() {
        return (by9[]) $VALUES.clone();
    }
}
