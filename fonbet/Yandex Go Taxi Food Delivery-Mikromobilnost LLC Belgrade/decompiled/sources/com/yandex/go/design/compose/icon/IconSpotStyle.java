package com.yandex.go.design.compose.icon;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/design/compose/icon/IconSpotStyle;", "", "Fill", "Outline", "Transparent", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IconSpotStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IconSpotStyle[] $VALUES;
    public static final IconSpotStyle Fill;
    public static final IconSpotStyle Outline;
    public static final IconSpotStyle Transparent;

    static {
        IconSpotStyle iconSpotStyle = new IconSpotStyle("Fill", 0);
        Fill = iconSpotStyle;
        IconSpotStyle iconSpotStyle2 = new IconSpotStyle("Outline", 1);
        Outline = iconSpotStyle2;
        IconSpotStyle iconSpotStyle3 = new IconSpotStyle("Transparent", 2);
        Transparent = iconSpotStyle3;
        IconSpotStyle[] iconSpotStyleArr = {iconSpotStyle, iconSpotStyle2, iconSpotStyle3};
        $VALUES = iconSpotStyleArr;
        $ENTRIES = a.a(iconSpotStyleArr);
    }

    public static IconSpotStyle valueOf(String str) {
        return (IconSpotStyle) Enum.valueOf(IconSpotStyle.class, str);
    }

    public static IconSpotStyle[] values() {
        return (IconSpotStyle[]) $VALUES.clone();
    }
}
