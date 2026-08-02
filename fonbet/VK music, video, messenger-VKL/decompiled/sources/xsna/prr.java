package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FloatingBubbleFluidLayout.kt */
/* loaded from: classes2.dex */
public final class prr {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ prr[] $VALUES;
    public static final prr Center;
    public static final prr Out;
    private final int value;

    static {
        prr prrVar = new prr("Center", 0, 0);
        Center = prrVar;
        prr prrVar2 = new prr("Out", 1, 1);
        Out = prrVar2;
        prr[] prrVarArr = {prrVar, prrVar2};
        $VALUES = prrVarArr;
        $ENTRIES = new asp(prrVarArr);
    }

    public prr(String str, int i, int i2) {
        this.value = i2;
    }

    public static prr valueOf(String str) {
        return (prr) Enum.valueOf(prr.class, str);
    }

    public static prr[] values() {
        return (prr[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
