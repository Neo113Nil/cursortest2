package com.yandex.plus.home.plaque.plugin.api.typeface;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/home/plaque/plugin/api/typeface/PlusPlaqueFontStyle;", "", "NORMAL", "ITALIC", "plus-home-plaque-plugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPlaqueFontStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPlaqueFontStyle[] $VALUES;
    public static final PlusPlaqueFontStyle ITALIC;
    public static final PlusPlaqueFontStyle NORMAL;

    static {
        PlusPlaqueFontStyle plusPlaqueFontStyle = new PlusPlaqueFontStyle("NORMAL", 0);
        NORMAL = plusPlaqueFontStyle;
        PlusPlaqueFontStyle plusPlaqueFontStyle2 = new PlusPlaqueFontStyle("ITALIC", 1);
        ITALIC = plusPlaqueFontStyle2;
        PlusPlaqueFontStyle[] plusPlaqueFontStyleArr = {plusPlaqueFontStyle, plusPlaqueFontStyle2};
        $VALUES = plusPlaqueFontStyleArr;
        $ENTRIES = a.a(plusPlaqueFontStyleArr);
    }

    public static PlusPlaqueFontStyle valueOf(String str) {
        return (PlusPlaqueFontStyle) Enum.valueOf(PlusPlaqueFontStyle.class, str);
    }

    public static PlusPlaqueFontStyle[] values() {
        return (PlusPlaqueFontStyle[]) $VALUES.clone();
    }
}
