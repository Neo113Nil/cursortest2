package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yx360/design/compose/atoms/DsHeading$Size", "", "Lcom/yx360/design/compose/atoms/DsHeading$Size;", "Xl", "Lg", "Md", "Sm", "Xs", "Xxs", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsHeading$Size {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsHeading$Size[] $VALUES;
    public static final DsHeading$Size Lg;
    public static final DsHeading$Size Md;
    public static final DsHeading$Size Sm;
    public static final DsHeading$Size Xl;
    public static final DsHeading$Size Xs;
    public static final DsHeading$Size Xxs;

    static {
        DsHeading$Size dsHeading$Size = new DsHeading$Size("Xl", 0);
        Xl = dsHeading$Size;
        DsHeading$Size dsHeading$Size2 = new DsHeading$Size("Lg", 1);
        Lg = dsHeading$Size2;
        DsHeading$Size dsHeading$Size3 = new DsHeading$Size("Md", 2);
        Md = dsHeading$Size3;
        DsHeading$Size dsHeading$Size4 = new DsHeading$Size("Sm", 3);
        Sm = dsHeading$Size4;
        DsHeading$Size dsHeading$Size5 = new DsHeading$Size("Xs", 4);
        Xs = dsHeading$Size5;
        DsHeading$Size dsHeading$Size6 = new DsHeading$Size("Xxs", 5);
        Xxs = dsHeading$Size6;
        DsHeading$Size[] dsHeading$SizeArr = {dsHeading$Size, dsHeading$Size2, dsHeading$Size3, dsHeading$Size4, dsHeading$Size5, dsHeading$Size6};
        $VALUES = dsHeading$SizeArr;
        $ENTRIES = kotlin.enums.a.a(dsHeading$SizeArr);
    }

    public static DsHeading$Size valueOf(String str) {
        return (DsHeading$Size) Enum.valueOf(DsHeading$Size.class, str);
    }

    public static DsHeading$Size[] values() {
        return (DsHeading$Size[]) $VALUES.clone();
    }
}
