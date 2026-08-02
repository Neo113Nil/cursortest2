package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class Strictness {
    private static final /* synthetic */ Strictness[] $VALUES;
    public static final Strictness LEGACY_STRICT;
    public static final Strictness LENIENT;
    public static final Strictness STRICT;

    static {
        Strictness strictness = new Strictness("LENIENT", 0);
        LENIENT = strictness;
        Strictness strictness2 = new Strictness("LEGACY_STRICT", 1);
        LEGACY_STRICT = strictness2;
        Strictness strictness3 = new Strictness("STRICT", 2);
        STRICT = strictness3;
        $VALUES = new Strictness[]{strictness, strictness2, strictness3};
    }

    public static Strictness valueOf(String str) {
        return (Strictness) Enum.valueOf(Strictness.class, str);
    }

    public static Strictness[] values() {
        return (Strictness[]) $VALUES.clone();
    }
}
