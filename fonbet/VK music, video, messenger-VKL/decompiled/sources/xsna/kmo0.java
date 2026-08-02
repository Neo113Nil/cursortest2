package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextStickerDialogImpl.kt */
/* loaded from: classes16.dex */
public final class kmo0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ kmo0[] $VALUES;
    public static final kmo0 CHOOSE_COLOR;
    public static final kmo0 CHOOSE_FONTS;
    public static final kmo0 CHOOSE_PIPETTE;

    static {
        kmo0 kmo0Var = new kmo0("CHOOSE_FONTS", 0);
        CHOOSE_FONTS = kmo0Var;
        kmo0 kmo0Var2 = new kmo0("CHOOSE_COLOR", 1);
        CHOOSE_COLOR = kmo0Var2;
        kmo0 kmo0Var3 = new kmo0("CHOOSE_PIPETTE", 2);
        CHOOSE_PIPETTE = kmo0Var3;
        kmo0[] kmo0VarArr = {kmo0Var, kmo0Var2, kmo0Var3};
        $VALUES = kmo0VarArr;
        $ENTRIES = new asp(kmo0VarArr);
    }

    public kmo0() {
        throw null;
    }

    public static kmo0 valueOf(String str) {
        return (kmo0) Enum.valueOf(kmo0.class, str);
    }

    public static kmo0[] values() {
        return (kmo0[]) $VALUES.clone();
    }
}
