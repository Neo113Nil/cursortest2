package com.yx360.design.compose.atoms;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yx360/design/compose/atoms/DsBadge$Size", "", "Lcom/yx360/design/compose/atoms/DsBadge$Size;", "Md", "Sm", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsBadge$Size {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsBadge$Size[] $VALUES;
    public static final DsBadge$Size Md;
    public static final DsBadge$Size Sm;

    static {
        DsBadge$Size dsBadge$Size = new DsBadge$Size("Md", 0);
        Md = dsBadge$Size;
        DsBadge$Size dsBadge$Size2 = new DsBadge$Size("Sm", 1);
        Sm = dsBadge$Size2;
        DsBadge$Size[] dsBadge$SizeArr = {dsBadge$Size, dsBadge$Size2};
        $VALUES = dsBadge$SizeArr;
        $ENTRIES = kotlin.enums.a.a(dsBadge$SizeArr);
    }

    public static DsBadge$Size valueOf(String str) {
        return (DsBadge$Size) Enum.valueOf(DsBadge$Size.class, str);
    }

    public static DsBadge$Size[] values() {
        return (DsBadge$Size[]) $VALUES.clone();
    }
}
