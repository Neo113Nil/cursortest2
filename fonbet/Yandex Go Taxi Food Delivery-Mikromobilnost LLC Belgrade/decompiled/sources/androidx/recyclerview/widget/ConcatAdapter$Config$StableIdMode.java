package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class ConcatAdapter$Config$StableIdMode {
    private static final /* synthetic */ ConcatAdapter$Config$StableIdMode[] $VALUES;
    public static final ConcatAdapter$Config$StableIdMode ISOLATED_STABLE_IDS;
    public static final ConcatAdapter$Config$StableIdMode NO_STABLE_IDS;
    public static final ConcatAdapter$Config$StableIdMode SHARED_STABLE_IDS;

    static {
        ConcatAdapter$Config$StableIdMode concatAdapter$Config$StableIdMode = new ConcatAdapter$Config$StableIdMode("NO_STABLE_IDS", 0);
        NO_STABLE_IDS = concatAdapter$Config$StableIdMode;
        ConcatAdapter$Config$StableIdMode concatAdapter$Config$StableIdMode2 = new ConcatAdapter$Config$StableIdMode("ISOLATED_STABLE_IDS", 1);
        ISOLATED_STABLE_IDS = concatAdapter$Config$StableIdMode2;
        ConcatAdapter$Config$StableIdMode concatAdapter$Config$StableIdMode3 = new ConcatAdapter$Config$StableIdMode("SHARED_STABLE_IDS", 2);
        SHARED_STABLE_IDS = concatAdapter$Config$StableIdMode3;
        $VALUES = new ConcatAdapter$Config$StableIdMode[]{concatAdapter$Config$StableIdMode, concatAdapter$Config$StableIdMode2, concatAdapter$Config$StableIdMode3};
    }

    public static ConcatAdapter$Config$StableIdMode valueOf(String str) {
        return (ConcatAdapter$Config$StableIdMode) Enum.valueOf(ConcatAdapter$Config$StableIdMode.class, str);
    }

    public static ConcatAdapter$Config$StableIdMode[] values() {
        return (ConcatAdapter$Config$StableIdMode[]) $VALUES.clone();
    }
}
