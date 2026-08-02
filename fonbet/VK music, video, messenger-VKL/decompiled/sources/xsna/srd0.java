package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductRemoveConfirmationActionSheet.kt */
/* loaded from: classes18.dex */
public final class srd0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ srd0[] $VALUES;
    public static final srd0 MoveToFavorite;
    public static final srd0 Remove;

    static {
        srd0 srd0Var = new srd0("MoveToFavorite", 0);
        MoveToFavorite = srd0Var;
        srd0 srd0Var2 = new srd0("Remove", 1);
        Remove = srd0Var2;
        srd0[] srd0VarArr = {srd0Var, srd0Var2};
        $VALUES = srd0VarArr;
        $ENTRIES = new asp(srd0VarArr);
    }

    public srd0() {
        throw null;
    }

    public static zrp<srd0> h() {
        return $ENTRIES;
    }

    public static srd0 valueOf(String str) {
        return (srd0) Enum.valueOf(srd0.class, str);
    }

    public static srd0[] values() {
        return (srd0[]) $VALUES.clone();
    }
}
