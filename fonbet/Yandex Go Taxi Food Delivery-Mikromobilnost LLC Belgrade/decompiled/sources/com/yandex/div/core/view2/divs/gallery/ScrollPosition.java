package com.yandex.div.core.view2.divs.gallery;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/ScrollPosition;", "", "DEFAULT", "CENTER", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollPosition {
    private static final /* synthetic */ ScrollPosition[] $VALUES;
    public static final ScrollPosition CENTER;
    public static final ScrollPosition DEFAULT;

    static {
        ScrollPosition scrollPosition = new ScrollPosition("DEFAULT", 0);
        DEFAULT = scrollPosition;
        ScrollPosition scrollPosition2 = new ScrollPosition("CENTER", 1);
        CENTER = scrollPosition2;
        $VALUES = new ScrollPosition[]{scrollPosition, scrollPosition2};
    }

    public static ScrollPosition valueOf(String str) {
        return (ScrollPosition) Enum.valueOf(ScrollPosition.class, str);
    }

    public static ScrollPosition[] values() {
        return (ScrollPosition[]) $VALUES.clone();
    }
}
