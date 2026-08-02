package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorHeaderHeaderContent.kt */
/* loaded from: classes5.dex */
public final class n95 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ n95[] $VALUES;
    public static final n95 Badge;
    public static final n95 Blur;
    public static final n95 Debug;
    public static final n95 Main;
    public static final n95 Media;

    static {
        n95 n95Var = new n95("Media", 0);
        Media = n95Var;
        n95 n95Var2 = new n95("Blur", 1);
        Blur = n95Var2;
        n95 n95Var3 = new n95("Main", 2);
        Main = n95Var3;
        n95 n95Var4 = new n95("Badge", 3);
        Badge = n95Var4;
        n95 n95Var5 = new n95("Debug", 4);
        Debug = n95Var5;
        n95[] n95VarArr = {n95Var, n95Var2, n95Var3, n95Var4, n95Var5};
        $VALUES = n95VarArr;
        $ENTRIES = new asp(n95VarArr);
    }

    public n95() {
        throw null;
    }

    public static n95 valueOf(String str) {
        return (n95) Enum.valueOf(n95.class, str);
    }

    public static n95[] values() {
        return (n95[]) $VALUES.clone();
    }
}
