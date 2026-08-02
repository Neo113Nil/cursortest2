package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class CSSParser$Combinator {
    private static final /* synthetic */ CSSParser$Combinator[] $VALUES;
    public static final CSSParser$Combinator CHILD;
    public static final CSSParser$Combinator DESCENDANT;
    public static final CSSParser$Combinator FOLLOWS;

    static {
        CSSParser$Combinator cSSParser$Combinator = new CSSParser$Combinator("DESCENDANT", 0);
        DESCENDANT = cSSParser$Combinator;
        CSSParser$Combinator cSSParser$Combinator2 = new CSSParser$Combinator("CHILD", 1);
        CHILD = cSSParser$Combinator2;
        CSSParser$Combinator cSSParser$Combinator3 = new CSSParser$Combinator("FOLLOWS", 2);
        FOLLOWS = cSSParser$Combinator3;
        $VALUES = new CSSParser$Combinator[]{cSSParser$Combinator, cSSParser$Combinator2, cSSParser$Combinator3};
    }

    public static CSSParser$Combinator valueOf(String str) {
        return (CSSParser$Combinator) Enum.valueOf(CSSParser$Combinator.class, str);
    }

    public static CSSParser$Combinator[] values() {
        return (CSSParser$Combinator[]) $VALUES.clone();
    }
}
