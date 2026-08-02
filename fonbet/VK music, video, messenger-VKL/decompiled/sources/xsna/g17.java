package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BigPlayerScaffold.kt */
/* loaded from: classes3.dex */
public final class g17 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ g17[] $VALUES;
    public static final g17 ActionsPanel;
    public static final g17 ControlPanel;
    public static final g17 Image;
    public static final g17 Sheet;
    public static final g17 Snackbar;
    public static final g17 TopBar;

    static {
        g17 g17Var = new g17("TopBar", 0);
        TopBar = g17Var;
        g17 g17Var2 = new g17("Image", 1);
        Image = g17Var2;
        g17 g17Var3 = new g17("ActionsPanel", 2);
        ActionsPanel = g17Var3;
        g17 g17Var4 = new g17("ControlPanel", 3);
        ControlPanel = g17Var4;
        g17 g17Var5 = new g17("Sheet", 4);
        Sheet = g17Var5;
        g17 g17Var6 = new g17("Snackbar", 5);
        Snackbar = g17Var6;
        g17[] g17VarArr = {g17Var, g17Var2, g17Var3, g17Var4, g17Var5, g17Var6};
        $VALUES = g17VarArr;
        $ENTRIES = new asp(g17VarArr);
    }

    public g17() {
        throw null;
    }

    public static g17 valueOf(String str) {
        return (g17) Enum.valueOf(g17.class, str);
    }

    public static g17[] values() {
        return (g17[]) $VALUES.clone();
    }
}
