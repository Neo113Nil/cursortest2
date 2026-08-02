package com.caverock.androidsvg;

import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class CSSParser$MediaType {
    private static final /* synthetic */ CSSParser$MediaType[] $VALUES;
    public static final CSSParser$MediaType all;
    public static final CSSParser$MediaType aural;
    public static final CSSParser$MediaType braille;
    public static final CSSParser$MediaType embossed;
    public static final CSSParser$MediaType handheld;
    public static final CSSParser$MediaType print;
    public static final CSSParser$MediaType projection;
    public static final CSSParser$MediaType screen;
    public static final CSSParser$MediaType speech;
    public static final CSSParser$MediaType tty;
    public static final CSSParser$MediaType tv;

    static {
        CSSParser$MediaType cSSParser$MediaType = new CSSParser$MediaType("all", 0);
        all = cSSParser$MediaType;
        CSSParser$MediaType cSSParser$MediaType2 = new CSSParser$MediaType("aural", 1);
        aural = cSSParser$MediaType2;
        CSSParser$MediaType cSSParser$MediaType3 = new CSSParser$MediaType("braille", 2);
        braille = cSSParser$MediaType3;
        CSSParser$MediaType cSSParser$MediaType4 = new CSSParser$MediaType("embossed", 3);
        embossed = cSSParser$MediaType4;
        CSSParser$MediaType cSSParser$MediaType5 = new CSSParser$MediaType("handheld", 4);
        handheld = cSSParser$MediaType5;
        CSSParser$MediaType cSSParser$MediaType6 = new CSSParser$MediaType("print", 5);
        print = cSSParser$MediaType6;
        CSSParser$MediaType cSSParser$MediaType7 = new CSSParser$MediaType("projection", 6);
        projection = cSSParser$MediaType7;
        CSSParser$MediaType cSSParser$MediaType8 = new CSSParser$MediaType(MetaDataField.SCREEN_FIELD, 7);
        screen = cSSParser$MediaType8;
        CSSParser$MediaType cSSParser$MediaType9 = new CSSParser$MediaType("speech", 8);
        speech = cSSParser$MediaType9;
        CSSParser$MediaType cSSParser$MediaType10 = new CSSParser$MediaType("tty", 9);
        tty = cSSParser$MediaType10;
        CSSParser$MediaType cSSParser$MediaType11 = new CSSParser$MediaType("tv", 10);
        tv = cSSParser$MediaType11;
        $VALUES = new CSSParser$MediaType[]{cSSParser$MediaType, cSSParser$MediaType2, cSSParser$MediaType3, cSSParser$MediaType4, cSSParser$MediaType5, cSSParser$MediaType6, cSSParser$MediaType7, cSSParser$MediaType8, cSSParser$MediaType9, cSSParser$MediaType10, cSSParser$MediaType11};
    }

    public static CSSParser$MediaType valueOf(String str) {
        return (CSSParser$MediaType) Enum.valueOf(CSSParser$MediaType.class, str);
    }

    public static CSSParser$MediaType[] values() {
        return (CSSParser$MediaType[]) $VALUES.clone();
    }
}
