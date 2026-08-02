package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Scaffold.kt */
/* loaded from: classes11.dex */
public final class d4h0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ d4h0[] $VALUES;
    public static final d4h0 BottomBar;
    public static final d4h0 Fab;
    public static final d4h0 MainContent;
    public static final d4h0 Snackbar;
    public static final d4h0 TopBar;

    static {
        d4h0 d4h0Var = new d4h0("TopBar", 0);
        TopBar = d4h0Var;
        d4h0 d4h0Var2 = new d4h0("MainContent", 1);
        MainContent = d4h0Var2;
        d4h0 d4h0Var3 = new d4h0("Snackbar", 2);
        Snackbar = d4h0Var3;
        d4h0 d4h0Var4 = new d4h0("Fab", 3);
        Fab = d4h0Var4;
        d4h0 d4h0Var5 = new d4h0("BottomBar", 4);
        BottomBar = d4h0Var5;
        d4h0[] d4h0VarArr = {d4h0Var, d4h0Var2, d4h0Var3, d4h0Var4, d4h0Var5};
        $VALUES = d4h0VarArr;
        $ENTRIES = new asp(d4h0VarArr);
    }

    public d4h0() {
        throw null;
    }

    public static d4h0 valueOf(String str) {
        return (d4h0) Enum.valueOf(d4h0.class, str);
    }

    public static d4h0[] values() {
        return (d4h0[]) $VALUES.clone();
    }
}
