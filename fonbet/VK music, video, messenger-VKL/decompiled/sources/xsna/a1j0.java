package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SettingsCacheBehavior.java */
/* loaded from: classes.dex */
public final class a1j0 {
    private static final /* synthetic */ a1j0[] $VALUES;
    public static final a1j0 IGNORE_CACHE_EXPIRATION;
    public static final a1j0 SKIP_CACHE_LOOKUP;
    public static final a1j0 USE_CACHE;

    static {
        a1j0 a1j0Var = new a1j0("USE_CACHE", 0);
        USE_CACHE = a1j0Var;
        a1j0 a1j0Var2 = new a1j0("SKIP_CACHE_LOOKUP", 1);
        SKIP_CACHE_LOOKUP = a1j0Var2;
        a1j0 a1j0Var3 = new a1j0("IGNORE_CACHE_EXPIRATION", 2);
        IGNORE_CACHE_EXPIRATION = a1j0Var3;
        $VALUES = new a1j0[]{a1j0Var, a1j0Var2, a1j0Var3};
    }

    public a1j0() {
        throw null;
    }

    public static a1j0 valueOf(String str) {
        return (a1j0) Enum.valueOf(a1j0.class, str);
    }

    public static a1j0[] values() {
        return (a1j0[]) $VALUES.clone();
    }
}
