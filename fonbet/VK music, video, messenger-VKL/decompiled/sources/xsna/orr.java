package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FloatingBubbleFluidLayout.kt */
/* loaded from: classes2.dex */
public final class orr {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ orr[] $VALUES;
    public static final orr CIRCLE;
    public static final orr NONE;
    public static final orr RECT;
    public static final orr ROUND_RECT;
    private final int value;

    static {
        orr orrVar = new orr("NONE", 0, 0);
        NONE = orrVar;
        orr orrVar2 = new orr("RECT", 1, 1);
        RECT = orrVar2;
        orr orrVar3 = new orr("ROUND_RECT", 2, 2);
        ROUND_RECT = orrVar3;
        orr orrVar4 = new orr("CIRCLE", 3, 3);
        CIRCLE = orrVar4;
        orr[] orrVarArr = {orrVar, orrVar2, orrVar3, orrVar4};
        $VALUES = orrVarArr;
        $ENTRIES = new asp(orrVarArr);
    }

    public orr(String str, int i, int i2) {
        this.value = i2;
    }

    public static orr valueOf(String str) {
        return (orr) Enum.valueOf(orr.class, str);
    }

    public static orr[] values() {
        return (orr[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
