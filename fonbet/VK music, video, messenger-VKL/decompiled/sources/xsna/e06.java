package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkOnboardingTooltip.kt */
/* loaded from: classes17.dex */
public final class e06 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ e06[] $VALUES;
    public static final e06 Far;
    public static final e06 ForVerticalBalloons;
    public static final e06 Near;
    private final float value;

    static {
        e06 e06Var = new e06("Near", 0, 8);
        Near = e06Var;
        e06 e06Var2 = new e06("Far", 1, 14);
        Far = e06Var2;
        e06 e06Var3 = new e06("ForVerticalBalloons", 2, 10);
        ForVerticalBalloons = e06Var3;
        e06[] e06VarArr = {e06Var, e06Var2, e06Var3};
        $VALUES = e06VarArr;
        $ENTRIES = new asp(e06VarArr);
    }

    public e06(String str, int i, float f) {
        this.value = f;
    }

    public static e06 valueOf(String str) {
        return (e06) Enum.valueOf(e06.class, str);
    }

    public static e06[] values() {
        return (e06[]) $VALUES.clone();
    }

    public final float h() {
        return this.value;
    }
}
