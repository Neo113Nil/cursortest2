package com.yx360.design.compose.atoms;

import defpackage.k4o;
import defpackage.qnm;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/yx360/design/compose/atoms/DsAvatar$Size", "", "Lcom/yx360/design/compose/atoms/DsAvatar$Size;", "Ly7m;", "value", "F", "a", "()F", "M12", "M13", "M16", "M20", "M24", "M28", "M36", "M40", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsAvatar$Size {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsAvatar$Size[] $VALUES;
    public static final DsAvatar$Size M12;
    public static final DsAvatar$Size M13;
    public static final DsAvatar$Size M16;
    public static final DsAvatar$Size M20;
    public static final DsAvatar$Size M24;
    public static final DsAvatar$Size M28;
    public static final DsAvatar$Size M36;
    public static final DsAvatar$Size M40;
    private final float value;

    static {
        qnm.c.getClass();
        DsAvatar$Size dsAvatar$Size = new DsAvatar$Size("M12", 0, 24.0f);
        M12 = dsAvatar$Size;
        DsAvatar$Size dsAvatar$Size2 = new DsAvatar$Size("M13", 1, 26.0f);
        M13 = dsAvatar$Size2;
        DsAvatar$Size dsAvatar$Size3 = new DsAvatar$Size("M16", 2, 32.0f);
        M16 = dsAvatar$Size3;
        DsAvatar$Size dsAvatar$Size4 = new DsAvatar$Size("M20", 3, 40.0f);
        M20 = dsAvatar$Size4;
        DsAvatar$Size dsAvatar$Size5 = new DsAvatar$Size("M24", 4, 48.0f);
        M24 = dsAvatar$Size5;
        DsAvatar$Size dsAvatar$Size6 = new DsAvatar$Size("M28", 5, 56.0f);
        M28 = dsAvatar$Size6;
        DsAvatar$Size dsAvatar$Size7 = new DsAvatar$Size("M36", 6, 72.0f);
        M36 = dsAvatar$Size7;
        DsAvatar$Size dsAvatar$Size8 = new DsAvatar$Size("M40", 7, 80.0f);
        M40 = dsAvatar$Size8;
        DsAvatar$Size[] dsAvatar$SizeArr = {dsAvatar$Size, dsAvatar$Size2, dsAvatar$Size3, dsAvatar$Size4, dsAvatar$Size5, dsAvatar$Size6, dsAvatar$Size7, dsAvatar$Size8};
        $VALUES = dsAvatar$SizeArr;
        $ENTRIES = kotlin.enums.a.a(dsAvatar$SizeArr);
    }

    public DsAvatar$Size(String str, int i, float f) {
        this.value = f;
    }

    public static DsAvatar$Size valueOf(String str) {
        return (DsAvatar$Size) Enum.valueOf(DsAvatar$Size.class, str);
    }

    public static DsAvatar$Size[] values() {
        return (DsAvatar$Size[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final float getValue() {
        return this.value;
    }
}
