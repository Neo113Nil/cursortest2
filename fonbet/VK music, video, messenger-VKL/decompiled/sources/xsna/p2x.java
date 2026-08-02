package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextFieldImpl.kt */
/* loaded from: classes11.dex */
public final class p2x {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ p2x[] $VALUES;
    public static final p2x Focused;
    public static final p2x UnfocusedEmpty;
    public static final p2x UnfocusedNotEmpty;

    static {
        p2x p2xVar = new p2x("Focused", 0);
        Focused = p2xVar;
        p2x p2xVar2 = new p2x("UnfocusedEmpty", 1);
        UnfocusedEmpty = p2xVar2;
        p2x p2xVar3 = new p2x("UnfocusedNotEmpty", 2);
        UnfocusedNotEmpty = p2xVar3;
        p2x[] p2xVarArr = {p2xVar, p2xVar2, p2xVar3};
        $VALUES = p2xVarArr;
        $ENTRIES = new asp(p2xVarArr);
    }

    public p2x() {
        throw null;
    }

    public static p2x valueOf(String str) {
        return (p2x) Enum.valueOf(p2x.class, str);
    }

    public static p2x[] values() {
        return (p2x[]) $VALUES.clone();
    }
}
