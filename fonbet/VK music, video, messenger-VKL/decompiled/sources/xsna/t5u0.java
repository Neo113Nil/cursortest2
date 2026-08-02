package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SoundCaptchaViewDelegate.kt */
/* loaded from: classes15.dex */
public final class t5u0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ t5u0[] $VALUES;
    public static final t5u0 PLAYER;
    public static final t5u0 PROGRESS_BAR;
    public static final t5u0 RETRY;

    static {
        t5u0 t5u0Var = new t5u0("PROGRESS_BAR", 0);
        PROGRESS_BAR = t5u0Var;
        t5u0 t5u0Var2 = new t5u0("RETRY", 1);
        RETRY = t5u0Var2;
        t5u0 t5u0Var3 = new t5u0("PLAYER", 2);
        PLAYER = t5u0Var3;
        t5u0[] t5u0VarArr = {t5u0Var, t5u0Var2, t5u0Var3};
        $VALUES = t5u0VarArr;
        $ENTRIES = new asp(t5u0VarArr);
    }

    public t5u0() {
        throw null;
    }

    public static t5u0 valueOf(String str) {
        return (t5u0) Enum.valueOf(t5u0.class, str);
    }

    public static t5u0[] values() {
        return (t5u0[]) $VALUES.clone();
    }
}
