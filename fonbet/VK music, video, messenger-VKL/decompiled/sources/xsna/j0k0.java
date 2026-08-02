package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Slider.kt */
/* loaded from: classes11.dex */
public final class j0k0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ j0k0[] $VALUES;
    public static final j0k0 THUMB;
    public static final j0k0 TRACK;

    static {
        j0k0 j0k0Var = new j0k0("THUMB", 0);
        THUMB = j0k0Var;
        j0k0 j0k0Var2 = new j0k0("TRACK", 1);
        TRACK = j0k0Var2;
        j0k0[] j0k0VarArr = {j0k0Var, j0k0Var2};
        $VALUES = j0k0VarArr;
        $ENTRIES = new asp(j0k0VarArr);
    }

    public j0k0() {
        throw null;
    }

    public static j0k0 valueOf(String str) {
        return (j0k0) Enum.valueOf(j0k0.class, str);
    }

    public static j0k0[] values() {
        return (j0k0[]) $VALUES.clone();
    }
}
