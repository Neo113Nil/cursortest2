package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MilkshakeNotification.kt */
/* loaded from: classes4.dex */
public final class vh70 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ vh70[] $VALUES;
    public static final vh70 Align;
    public static final vh70 Text;

    static {
        vh70 vh70Var = new vh70("Align", 0);
        Align = vh70Var;
        vh70 vh70Var2 = new vh70("Text", 1);
        Text = vh70Var2;
        vh70[] vh70VarArr = {vh70Var, vh70Var2};
        $VALUES = vh70VarArr;
        $ENTRIES = new asp(vh70VarArr);
    }

    public vh70() {
        throw null;
    }

    public static vh70 valueOf(String str) {
        return (vh70) Enum.valueOf(vh70.class, str);
    }

    public static vh70[] values() {
        return (vh70[]) $VALUES.clone();
    }
}
