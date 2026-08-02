package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yx360/design/compose/atoms/DsButton$Style", "", "Lcom/yx360/design/compose/atoms/DsButton$Style;", "Brand", "Neutral", "Contrast", "StaticLight", "Danger", "Success", "Warning", "Info", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsButton$Style {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsButton$Style[] $VALUES;
    public static final DsButton$Style Brand;
    public static final DsButton$Style Contrast;
    public static final DsButton$Style Danger;
    public static final DsButton$Style Info;
    public static final DsButton$Style Neutral;
    public static final DsButton$Style StaticLight;
    public static final DsButton$Style Success;
    public static final DsButton$Style Warning;

    static {
        DsButton$Style dsButton$Style = new DsButton$Style("Brand", 0);
        Brand = dsButton$Style;
        DsButton$Style dsButton$Style2 = new DsButton$Style("Neutral", 1);
        Neutral = dsButton$Style2;
        DsButton$Style dsButton$Style3 = new DsButton$Style("Contrast", 2);
        Contrast = dsButton$Style3;
        DsButton$Style dsButton$Style4 = new DsButton$Style("StaticLight", 3);
        StaticLight = dsButton$Style4;
        DsButton$Style dsButton$Style5 = new DsButton$Style("Danger", 4);
        Danger = dsButton$Style5;
        DsButton$Style dsButton$Style6 = new DsButton$Style("Success", 5);
        Success = dsButton$Style6;
        DsButton$Style dsButton$Style7 = new DsButton$Style("Warning", 6);
        Warning = dsButton$Style7;
        DsButton$Style dsButton$Style8 = new DsButton$Style("Info", 7);
        Info = dsButton$Style8;
        DsButton$Style[] dsButton$StyleArr = {dsButton$Style, dsButton$Style2, dsButton$Style3, dsButton$Style4, dsButton$Style5, dsButton$Style6, dsButton$Style7, dsButton$Style8};
        $VALUES = dsButton$StyleArr;
        $ENTRIES = kotlin.enums.a.a(dsButton$StyleArr);
    }

    public static DsButton$Style valueOf(String str) {
        return (DsButton$Style) Enum.valueOf(DsButton$Style.class, str);
    }

    public static DsButton$Style[] values() {
        return (DsButton$Style[]) $VALUES.clone();
    }
}
