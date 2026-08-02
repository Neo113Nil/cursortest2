package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NoSourceInfo.java */
/* loaded from: classes8.dex */
public final class f470 implements ngk0 {
    private static final /* synthetic */ f470[] $VALUES;
    public static final f470 INSTANCE;

    static {
        f470 f470Var = new f470("INSTANCE", 0);
        INSTANCE = f470Var;
        $VALUES = new f470[]{f470Var};
    }

    public f470() {
        throw null;
    }

    public static f470 valueOf(String str) {
        return (f470) Enum.valueOf(f470.class, str);
    }

    public static f470[] values() {
        return (f470[]) $VALUES.clone();
    }

    @Override // xsna.ngk0
    public final String h() {
        boolean z = p2l.a;
        return "\tat unknown source\n\t\tTo enable better debugging, run your JVM with -Dotel.experimental.sdk.metrics.debug=true";
    }
}
