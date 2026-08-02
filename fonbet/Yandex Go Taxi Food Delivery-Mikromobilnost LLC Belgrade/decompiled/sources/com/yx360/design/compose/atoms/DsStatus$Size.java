package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yx360/design/compose/atoms/DsStatus$Size", "", "Lcom/yx360/design/compose/atoms/DsStatus$Size;", "Xs", "Sm", "Md", "Lg", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsStatus$Size {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsStatus$Size[] $VALUES;
    public static final DsStatus$Size Lg;
    public static final DsStatus$Size Md;
    public static final DsStatus$Size Sm;
    public static final DsStatus$Size Xs;

    static {
        DsStatus$Size dsStatus$Size = new DsStatus$Size("Xs", 0);
        Xs = dsStatus$Size;
        DsStatus$Size dsStatus$Size2 = new DsStatus$Size("Sm", 1);
        Sm = dsStatus$Size2;
        DsStatus$Size dsStatus$Size3 = new DsStatus$Size("Md", 2);
        Md = dsStatus$Size3;
        DsStatus$Size dsStatus$Size4 = new DsStatus$Size("Lg", 3);
        Lg = dsStatus$Size4;
        DsStatus$Size[] dsStatus$SizeArr = {dsStatus$Size, dsStatus$Size2, dsStatus$Size3, dsStatus$Size4};
        $VALUES = dsStatus$SizeArr;
        $ENTRIES = kotlin.enums.a.a(dsStatus$SizeArr);
    }

    public static DsStatus$Size valueOf(String str) {
        return (DsStatus$Size) Enum.valueOf(DsStatus$Size.class, str);
    }

    public static DsStatus$Size[] values() {
        return (DsStatus$Size[]) $VALUES.clone();
    }
}
