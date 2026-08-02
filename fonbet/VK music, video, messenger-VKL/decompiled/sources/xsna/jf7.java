package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkProfileFriendsAndFollowersInfo.kt */
/* loaded from: classes5.dex */
public final class jf7 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ jf7[] $VALUES;
    public static final jf7 Large;
    public static final jf7 Medium;
    public static final jf7 Small;

    static {
        jf7 jf7Var = new jf7("Small", 0);
        Small = jf7Var;
        jf7 jf7Var2 = new jf7("Medium", 1);
        Medium = jf7Var2;
        jf7 jf7Var3 = new jf7("Large", 2);
        Large = jf7Var3;
        jf7[] jf7VarArr = {jf7Var, jf7Var2, jf7Var3};
        $VALUES = jf7VarArr;
        $ENTRIES = new asp(jf7VarArr);
    }

    public jf7() {
        throw null;
    }

    public static jf7 valueOf(String str) {
        return (jf7) Enum.valueOf(jf7.class, str);
    }

    public static jf7[] values() {
        return (jf7[]) $VALUES.clone();
    }
}
