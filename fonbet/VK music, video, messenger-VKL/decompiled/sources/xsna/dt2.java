package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Savers.kt */
/* loaded from: classes11.dex */
public final class dt2 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ dt2[] $VALUES;
    public static final dt2 Clickable;
    public static final dt2 Link;
    public static final dt2 Paragraph;
    public static final dt2 Span;
    public static final dt2 String;
    public static final dt2 Url;
    public static final dt2 VerbatimTts;

    static {
        dt2 dt2Var = new dt2("Paragraph", 0);
        Paragraph = dt2Var;
        dt2 dt2Var2 = new dt2("Span", 1);
        Span = dt2Var2;
        dt2 dt2Var3 = new dt2("VerbatimTts", 2);
        VerbatimTts = dt2Var3;
        dt2 dt2Var4 = new dt2("Url", 3);
        Url = dt2Var4;
        dt2 dt2Var5 = new dt2("Link", 4);
        Link = dt2Var5;
        dt2 dt2Var6 = new dt2("Clickable", 5);
        Clickable = dt2Var6;
        dt2 dt2Var7 = new dt2("String", 6);
        String = dt2Var7;
        dt2[] dt2VarArr = {dt2Var, dt2Var2, dt2Var3, dt2Var4, dt2Var5, dt2Var6, dt2Var7};
        $VALUES = dt2VarArr;
        $ENTRIES = new asp(dt2VarArr);
    }

    public dt2() {
        throw null;
    }

    public static dt2 valueOf(String str) {
        return (dt2) Enum.valueOf(dt2.class, str);
    }

    public static dt2[] values() {
        return (dt2[]) $VALUES.clone();
    }
}
