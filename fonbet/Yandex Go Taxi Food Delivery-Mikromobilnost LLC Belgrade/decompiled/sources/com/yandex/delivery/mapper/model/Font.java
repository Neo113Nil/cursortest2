package com.yandex.delivery.mapper.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/delivery/mapper/model/Font;", "", "LIGHT", "LIGHT_ITALIC", "REGULAR", "REGULAR_ITALIC", "MEDIUM", "MEDIUM_ITALIC", "BOLD", "BOLD_ITALIC", "LOGOTYPE_REGULAR", IDialogId.INTENT_EXTRA_IN_HEADER, "HEADER_ITALIC", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Font {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Font[] $VALUES;
    public static final Font BOLD;
    public static final Font BOLD_ITALIC;
    public static final Font HEADER;
    public static final Font HEADER_ITALIC;
    public static final Font LIGHT;
    public static final Font LIGHT_ITALIC;
    public static final Font LOGOTYPE_REGULAR;
    public static final Font MEDIUM;
    public static final Font MEDIUM_ITALIC;
    public static final Font REGULAR;
    public static final Font REGULAR_ITALIC;

    static {
        Font font = new Font("LIGHT", 0);
        LIGHT = font;
        Font font2 = new Font("LIGHT_ITALIC", 1);
        LIGHT_ITALIC = font2;
        Font font3 = new Font("REGULAR", 2);
        REGULAR = font3;
        Font font4 = new Font("REGULAR_ITALIC", 3);
        REGULAR_ITALIC = font4;
        Font font5 = new Font("MEDIUM", 4);
        MEDIUM = font5;
        Font font6 = new Font("MEDIUM_ITALIC", 5);
        MEDIUM_ITALIC = font6;
        Font font7 = new Font("BOLD", 6);
        BOLD = font7;
        Font font8 = new Font("BOLD_ITALIC", 7);
        BOLD_ITALIC = font8;
        Font font9 = new Font("LOGOTYPE_REGULAR", 8);
        LOGOTYPE_REGULAR = font9;
        Font font10 = new Font(IDialogId.INTENT_EXTRA_IN_HEADER, 9);
        HEADER = font10;
        Font font11 = new Font("HEADER_ITALIC", 10);
        HEADER_ITALIC = font11;
        Font[] fontArr = {font, font2, font3, font4, font5, font6, font7, font8, font9, font10, font11};
        $VALUES = fontArr;
        $ENTRIES = a.a(fontArr);
    }

    public static Font valueOf(String str) {
        return (Font) Enum.valueOf(Font.class, str);
    }

    public static Font[] values() {
        return (Font[]) $VALUES.clone();
    }
}
