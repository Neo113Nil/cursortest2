package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class CSSParser$Source {
    private static final /* synthetic */ CSSParser$Source[] $VALUES;
    public static final CSSParser$Source Document;
    public static final CSSParser$Source RenderOptions;

    static {
        CSSParser$Source cSSParser$Source = new CSSParser$Source("Document", 0);
        Document = cSSParser$Source;
        CSSParser$Source cSSParser$Source2 = new CSSParser$Source("RenderOptions", 1);
        RenderOptions = cSSParser$Source2;
        $VALUES = new CSSParser$Source[]{cSSParser$Source, cSSParser$Source2};
    }

    public static CSSParser$Source valueOf(String str) {
        return (CSSParser$Source) Enum.valueOf(CSSParser$Source.class, str);
    }

    public static CSSParser$Source[] values() {
        return (CSSParser$Source[]) $VALUES.clone();
    }
}
