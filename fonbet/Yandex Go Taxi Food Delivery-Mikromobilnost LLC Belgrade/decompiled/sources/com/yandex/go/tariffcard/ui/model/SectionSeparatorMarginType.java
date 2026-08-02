package com.yandex.go.tariffcard.ui.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/tariffcard/ui/model/SectionSeparatorMarginType;", "", JCP.RAW_PREFIX, "TOP", "BOTTOM", "VERTICAL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SectionSeparatorMarginType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SectionSeparatorMarginType[] $VALUES;
    public static final SectionSeparatorMarginType BOTTOM;
    public static final SectionSeparatorMarginType NONE;
    public static final SectionSeparatorMarginType TOP;
    public static final SectionSeparatorMarginType VERTICAL;

    static {
        SectionSeparatorMarginType sectionSeparatorMarginType = new SectionSeparatorMarginType(JCP.RAW_PREFIX, 0);
        NONE = sectionSeparatorMarginType;
        SectionSeparatorMarginType sectionSeparatorMarginType2 = new SectionSeparatorMarginType("TOP", 1);
        TOP = sectionSeparatorMarginType2;
        SectionSeparatorMarginType sectionSeparatorMarginType3 = new SectionSeparatorMarginType("BOTTOM", 2);
        BOTTOM = sectionSeparatorMarginType3;
        SectionSeparatorMarginType sectionSeparatorMarginType4 = new SectionSeparatorMarginType("VERTICAL", 3);
        VERTICAL = sectionSeparatorMarginType4;
        SectionSeparatorMarginType[] sectionSeparatorMarginTypeArr = {sectionSeparatorMarginType, sectionSeparatorMarginType2, sectionSeparatorMarginType3, sectionSeparatorMarginType4};
        $VALUES = sectionSeparatorMarginTypeArr;
        $ENTRIES = a.a(sectionSeparatorMarginTypeArr);
    }

    public static SectionSeparatorMarginType valueOf(String str) {
        return (SectionSeparatorMarginType) Enum.valueOf(SectionSeparatorMarginType.class, str);
    }

    public static SectionSeparatorMarginType[] values() {
        return (SectionSeparatorMarginType[]) $VALUES.clone();
    }
}
