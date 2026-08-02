package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RxAwait.kt */
/* loaded from: classes8.dex */
public final class q230 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ q230[] $VALUES;
    public static final q230 FIRST;
    public static final q230 FIRST_OR_DEFAULT;
    public static final q230 LAST;
    public static final q230 SINGLE;
    public final String s;

    static {
        q230 q230Var = new q230("FIRST", 0, "awaitFirst");
        FIRST = q230Var;
        q230 q230Var2 = new q230("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
        FIRST_OR_DEFAULT = q230Var2;
        q230 q230Var3 = new q230("LAST", 2, "awaitLast");
        LAST = q230Var3;
        q230 q230Var4 = new q230("SINGLE", 3, "awaitSingle");
        SINGLE = q230Var4;
        q230[] q230VarArr = {q230Var, q230Var2, q230Var3, q230Var4};
        $VALUES = q230VarArr;
        $ENTRIES = new asp(q230VarArr);
    }

    public q230(String str, int i, String str2) {
        this.s = str2;
    }

    public static q230 valueOf(String str) {
        return (q230) Enum.valueOf(q230.class, str);
    }

    public static q230[] values() {
        return (q230[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.s;
    }
}
