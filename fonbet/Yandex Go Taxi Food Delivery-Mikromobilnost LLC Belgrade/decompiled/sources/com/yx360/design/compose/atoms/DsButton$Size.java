package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yx360/design/compose/atoms/DsButton$Size", "", "Lcom/yx360/design/compose/atoms/DsButton$Size;", "Lg", "Md", "Sm", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsButton$Size {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsButton$Size[] $VALUES;
    public static final DsButton$Size Lg;
    public static final DsButton$Size Md;
    public static final DsButton$Size Sm;

    static {
        DsButton$Size dsButton$Size = new DsButton$Size("Lg", 0);
        Lg = dsButton$Size;
        DsButton$Size dsButton$Size2 = new DsButton$Size("Md", 1);
        Md = dsButton$Size2;
        DsButton$Size dsButton$Size3 = new DsButton$Size("Sm", 2);
        Sm = dsButton$Size3;
        DsButton$Size[] dsButton$SizeArr = {dsButton$Size, dsButton$Size2, dsButton$Size3};
        $VALUES = dsButton$SizeArr;
        $ENTRIES = kotlin.enums.a.a(dsButton$SizeArr);
    }

    public static DsButton$Size valueOf(String str) {
        return (DsButton$Size) Enum.valueOf(DsButton$Size.class, str);
    }

    public static DsButton$Size[] values() {
        return (DsButton$Size[]) $VALUES.clone();
    }
}
