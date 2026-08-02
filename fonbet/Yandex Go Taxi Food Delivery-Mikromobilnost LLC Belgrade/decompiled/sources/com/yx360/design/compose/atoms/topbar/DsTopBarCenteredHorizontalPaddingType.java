package com.yx360.design.compose.atoms.topbar;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yx360/design/compose/atoms/topbar/DsTopBarCenteredHorizontalPaddingType;", "", "Start", "End", "None", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsTopBarCenteredHorizontalPaddingType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsTopBarCenteredHorizontalPaddingType[] $VALUES;
    public static final DsTopBarCenteredHorizontalPaddingType End;
    public static final DsTopBarCenteredHorizontalPaddingType None;
    public static final DsTopBarCenteredHorizontalPaddingType Start;

    static {
        DsTopBarCenteredHorizontalPaddingType dsTopBarCenteredHorizontalPaddingType = new DsTopBarCenteredHorizontalPaddingType("Start", 0);
        Start = dsTopBarCenteredHorizontalPaddingType;
        DsTopBarCenteredHorizontalPaddingType dsTopBarCenteredHorizontalPaddingType2 = new DsTopBarCenteredHorizontalPaddingType("End", 1);
        End = dsTopBarCenteredHorizontalPaddingType2;
        DsTopBarCenteredHorizontalPaddingType dsTopBarCenteredHorizontalPaddingType3 = new DsTopBarCenteredHorizontalPaddingType("None", 2);
        None = dsTopBarCenteredHorizontalPaddingType3;
        DsTopBarCenteredHorizontalPaddingType[] dsTopBarCenteredHorizontalPaddingTypeArr = {dsTopBarCenteredHorizontalPaddingType, dsTopBarCenteredHorizontalPaddingType2, dsTopBarCenteredHorizontalPaddingType3};
        $VALUES = dsTopBarCenteredHorizontalPaddingTypeArr;
        $ENTRIES = kotlin.enums.a.a(dsTopBarCenteredHorizontalPaddingTypeArr);
    }

    public static DsTopBarCenteredHorizontalPaddingType valueOf(String str) {
        return (DsTopBarCenteredHorizontalPaddingType) Enum.valueOf(DsTopBarCenteredHorizontalPaddingType.class, str);
    }

    public static DsTopBarCenteredHorizontalPaddingType[] values() {
        return (DsTopBarCenteredHorizontalPaddingType[]) $VALUES.clone();
    }
}
