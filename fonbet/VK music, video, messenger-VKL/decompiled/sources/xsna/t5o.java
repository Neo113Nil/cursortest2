package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkPaginationDots.kt */
/* loaded from: classes17.dex */
public final class t5o {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ t5o[] $VALUES;
    public static final t5o Active;
    public static final t5o Edge;
    public static final t5o Inactive;
    public static final t5o Outside;

    static {
        t5o t5oVar = new t5o("Active", 0);
        Active = t5oVar;
        t5o t5oVar2 = new t5o("Inactive", 1);
        Inactive = t5oVar2;
        t5o t5oVar3 = new t5o("Edge", 2);
        Edge = t5oVar3;
        t5o t5oVar4 = new t5o("Outside", 3);
        Outside = t5oVar4;
        t5o[] t5oVarArr = {t5oVar, t5oVar2, t5oVar3, t5oVar4};
        $VALUES = t5oVarArr;
        $ENTRIES = new asp(t5oVarArr);
    }

    public t5o() {
        throw null;
    }

    public static t5o valueOf(String str) {
        return (t5o) Enum.valueOf(t5o.class, str);
    }

    public static t5o[] values() {
        return (t5o[]) $VALUES.clone();
    }
}
