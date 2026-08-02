package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AlbumDetailsPhoto.kt */
/* loaded from: classes4.dex */
public final class baa0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ baa0[] $VALUES;
    public static final baa0 CLICK_LISTENER;
    public static final baa0 IMAGE;
    public static final baa0 SELECTED;

    static {
        baa0 baa0Var = new baa0("IMAGE", 0);
        IMAGE = baa0Var;
        baa0 baa0Var2 = new baa0("CLICK_LISTENER", 1);
        CLICK_LISTENER = baa0Var2;
        baa0 baa0Var3 = new baa0("SELECTED", 2);
        SELECTED = baa0Var3;
        baa0[] baa0VarArr = {baa0Var, baa0Var2, baa0Var3};
        $VALUES = baa0VarArr;
        $ENTRIES = new asp(baa0VarArr);
    }

    public baa0() {
        throw null;
    }

    public static baa0 valueOf(String str) {
        return (baa0) Enum.valueOf(baa0.class, str);
    }

    public static baa0[] values() {
        return (baa0[]) $VALUES.clone();
    }
}
