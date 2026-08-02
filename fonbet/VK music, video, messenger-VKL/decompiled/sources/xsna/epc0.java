package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewPostingFragmentBuilder.kt */
/* loaded from: classes4.dex */
public final class epc0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ epc0[] $VALUES;
    public static final epc0 EditLocalDraft;
    public static final epc0 EditPost;
    public static final epc0 EditRemoteDraft;
    public static final epc0 NewPost;

    static {
        epc0 epc0Var = new epc0("NewPost", 0);
        NewPost = epc0Var;
        epc0 epc0Var2 = new epc0("EditPost", 1);
        EditPost = epc0Var2;
        epc0 epc0Var3 = new epc0("EditLocalDraft", 2);
        EditLocalDraft = epc0Var3;
        epc0 epc0Var4 = new epc0("EditRemoteDraft", 3);
        EditRemoteDraft = epc0Var4;
        epc0[] epc0VarArr = {epc0Var, epc0Var2, epc0Var3, epc0Var4};
        $VALUES = epc0VarArr;
        $ENTRIES = new asp(epc0VarArr);
    }

    public epc0() {
        throw null;
    }

    public static epc0 valueOf(String str) {
        return (epc0) Enum.valueOf(epc0.class, str);
    }

    public static epc0[] values() {
        return (epc0[]) $VALUES.clone();
    }
}
