package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Scaffold.kt */
/* loaded from: classes11.dex */
public final class b4h0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ b4h0[] $VALUES;
    public static final b4h0 BottomBar;
    public static final b4h0 Fab;
    public static final b4h0 MainContent;
    public static final b4h0 Snackbar;
    public static final b4h0 TopBar;

    static {
        b4h0 b4h0Var = new b4h0("TopBar", 0);
        TopBar = b4h0Var;
        b4h0 b4h0Var2 = new b4h0("MainContent", 1);
        MainContent = b4h0Var2;
        b4h0 b4h0Var3 = new b4h0("Snackbar", 2);
        Snackbar = b4h0Var3;
        b4h0 b4h0Var4 = new b4h0("Fab", 3);
        Fab = b4h0Var4;
        b4h0 b4h0Var5 = new b4h0("BottomBar", 4);
        BottomBar = b4h0Var5;
        b4h0[] b4h0VarArr = {b4h0Var, b4h0Var2, b4h0Var3, b4h0Var4, b4h0Var5};
        $VALUES = b4h0VarArr;
        $ENTRIES = new asp(b4h0VarArr);
    }

    public b4h0() {
        throw null;
    }

    public static b4h0 valueOf(String str) {
        return (b4h0) Enum.valueOf(b4h0.class, str);
    }

    public static b4h0[] values() {
        return (b4h0[]) $VALUES.clone();
    }
}
