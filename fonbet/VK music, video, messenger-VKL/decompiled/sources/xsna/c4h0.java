package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkScaffold.kt */
/* loaded from: classes17.dex */
public final class c4h0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ c4h0[] $VALUES;
    public static final c4h0 BottomBar;
    public static final c4h0 Fab;
    public static final c4h0 MainContent;
    public static final c4h0 Snackbar;
    public static final c4h0 TopBar;

    static {
        c4h0 c4h0Var = new c4h0("TopBar", 0);
        TopBar = c4h0Var;
        c4h0 c4h0Var2 = new c4h0("MainContent", 1);
        MainContent = c4h0Var2;
        c4h0 c4h0Var3 = new c4h0("Snackbar", 2);
        Snackbar = c4h0Var3;
        c4h0 c4h0Var4 = new c4h0("Fab", 3);
        Fab = c4h0Var4;
        c4h0 c4h0Var5 = new c4h0("BottomBar", 4);
        BottomBar = c4h0Var5;
        c4h0[] c4h0VarArr = {c4h0Var, c4h0Var2, c4h0Var3, c4h0Var4, c4h0Var5};
        $VALUES = c4h0VarArr;
        $ENTRIES = new asp(c4h0VarArr);
    }

    public c4h0() {
        throw null;
    }

    public static c4h0 valueOf(String str) {
        return (c4h0) Enum.valueOf(c4h0.class, str);
    }

    public static c4h0[] values() {
        return (c4h0[]) $VALUES.clone();
    }
}
