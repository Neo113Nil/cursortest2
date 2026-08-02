package com.yx360.design;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yx360/design/BrandTheme;", "", "Mail", "Messenger", "Calendar", "Disk", "Telemost", "Tables", "Docs", "Pres", "Magic", "Concept", "YangoPhoto", "YaGpt", "yx360-design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BrandTheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BrandTheme[] $VALUES;
    public static final BrandTheme Calendar;
    public static final BrandTheme Concept;
    public static final BrandTheme Disk;
    public static final BrandTheme Docs;
    public static final BrandTheme Magic;
    public static final BrandTheme Mail;
    public static final BrandTheme Messenger;
    public static final BrandTheme Pres;
    public static final BrandTheme Tables;
    public static final BrandTheme Telemost;
    public static final BrandTheme YaGpt;
    public static final BrandTheme YangoPhoto;

    static {
        BrandTheme brandTheme = new BrandTheme("Mail", 0);
        Mail = brandTheme;
        BrandTheme brandTheme2 = new BrandTheme("Messenger", 1);
        Messenger = brandTheme2;
        BrandTheme brandTheme3 = new BrandTheme("Calendar", 2);
        Calendar = brandTheme3;
        BrandTheme brandTheme4 = new BrandTheme("Disk", 3);
        Disk = brandTheme4;
        BrandTheme brandTheme5 = new BrandTheme("Telemost", 4);
        Telemost = brandTheme5;
        BrandTheme brandTheme6 = new BrandTheme("Tables", 5);
        Tables = brandTheme6;
        BrandTheme brandTheme7 = new BrandTheme("Docs", 6);
        Docs = brandTheme7;
        BrandTheme brandTheme8 = new BrandTheme("Pres", 7);
        Pres = brandTheme8;
        BrandTheme brandTheme9 = new BrandTheme("Magic", 8);
        Magic = brandTheme9;
        BrandTheme brandTheme10 = new BrandTheme("Concept", 9);
        Concept = brandTheme10;
        BrandTheme brandTheme11 = new BrandTheme("YangoPhoto", 10);
        YangoPhoto = brandTheme11;
        BrandTheme brandTheme12 = new BrandTheme("YaGpt", 11);
        YaGpt = brandTheme12;
        BrandTheme[] brandThemeArr = {brandTheme, brandTheme2, brandTheme3, brandTheme4, brandTheme5, brandTheme6, brandTheme7, brandTheme8, brandTheme9, brandTheme10, brandTheme11, brandTheme12};
        $VALUES = brandThemeArr;
        $ENTRIES = a.a(brandThemeArr);
    }

    public static BrandTheme valueOf(String str) {
        return (BrandTheme) Enum.valueOf(BrandTheme.class, str);
    }

    public static BrandTheme[] values() {
        return (BrandTheme[]) $VALUES.clone();
    }
}
