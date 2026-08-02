package com.yx360.design.compose.atoms;

import defpackage.k4o;
import defpackage.qnm;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yx360/design/compose/atoms/DsDivider$VerticalPadding", "", "Lcom/yx360/design/compose/atoms/DsDivider$VerticalPadding;", "Ly7m;", "value", "F", "a", "()F", JCP.RAW_PREFIX, "M4", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsDivider$VerticalPadding {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsDivider$VerticalPadding[] $VALUES;
    public static final DsDivider$VerticalPadding M4;
    public static final DsDivider$VerticalPadding NONE;
    private final float value;

    static {
        DsDivider$VerticalPadding dsDivider$VerticalPadding = new DsDivider$VerticalPadding(JCP.RAW_PREFIX, 0, 0.0f);
        NONE = dsDivider$VerticalPadding;
        qnm.d.getClass();
        DsDivider$VerticalPadding dsDivider$VerticalPadding2 = new DsDivider$VerticalPadding("M4", 1, 8.0f);
        M4 = dsDivider$VerticalPadding2;
        DsDivider$VerticalPadding[] dsDivider$VerticalPaddingArr = {dsDivider$VerticalPadding, dsDivider$VerticalPadding2};
        $VALUES = dsDivider$VerticalPaddingArr;
        $ENTRIES = kotlin.enums.a.a(dsDivider$VerticalPaddingArr);
    }

    public DsDivider$VerticalPadding(String str, int i, float f) {
        this.value = f;
    }

    public static DsDivider$VerticalPadding valueOf(String str) {
        return (DsDivider$VerticalPadding) Enum.valueOf(DsDivider$VerticalPadding.class, str);
    }

    public static DsDivider$VerticalPadding[] values() {
        return (DsDivider$VerticalPadding[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final float getValue() {
        return this.value;
    }
}
