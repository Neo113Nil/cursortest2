package com.yandex.div.core.view2.spannable;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/view2/spannable/TextVerticalAlignment;", "", "TOP", "CENTER", "BASELINE", "BOTTOM", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextVerticalAlignment {
    private static final /* synthetic */ TextVerticalAlignment[] $VALUES;
    public static final TextVerticalAlignment BASELINE;
    public static final TextVerticalAlignment BOTTOM;
    public static final TextVerticalAlignment CENTER;
    public static final TextVerticalAlignment TOP;

    static {
        TextVerticalAlignment textVerticalAlignment = new TextVerticalAlignment("TOP", 0);
        TOP = textVerticalAlignment;
        TextVerticalAlignment textVerticalAlignment2 = new TextVerticalAlignment("CENTER", 1);
        CENTER = textVerticalAlignment2;
        TextVerticalAlignment textVerticalAlignment3 = new TextVerticalAlignment("BASELINE", 2);
        BASELINE = textVerticalAlignment3;
        TextVerticalAlignment textVerticalAlignment4 = new TextVerticalAlignment("BOTTOM", 3);
        BOTTOM = textVerticalAlignment4;
        $VALUES = new TextVerticalAlignment[]{textVerticalAlignment, textVerticalAlignment2, textVerticalAlignment3, textVerticalAlignment4};
    }

    public static TextVerticalAlignment valueOf(String str) {
        return (TextVerticalAlignment) Enum.valueOf(TextVerticalAlignment.class, str);
    }

    public static TextVerticalAlignment[] values() {
        return (TextVerticalAlignment[]) $VALUES.clone();
    }
}
