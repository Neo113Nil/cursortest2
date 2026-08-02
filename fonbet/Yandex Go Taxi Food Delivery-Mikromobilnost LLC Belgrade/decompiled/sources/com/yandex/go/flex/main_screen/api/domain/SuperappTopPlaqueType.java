package com.yandex.go.flex.main_screen.api.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/api/domain/SuperappTopPlaqueType;", "", "DOCUMENT_SECTION", "HEADER_COMPACT_TOP", "HEADER_BOTTOM", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperappTopPlaqueType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperappTopPlaqueType[] $VALUES;
    public static final SuperappTopPlaqueType DOCUMENT_SECTION;
    public static final SuperappTopPlaqueType HEADER_BOTTOM;
    public static final SuperappTopPlaqueType HEADER_COMPACT_TOP;

    static {
        SuperappTopPlaqueType superappTopPlaqueType = new SuperappTopPlaqueType("DOCUMENT_SECTION", 0);
        DOCUMENT_SECTION = superappTopPlaqueType;
        SuperappTopPlaqueType superappTopPlaqueType2 = new SuperappTopPlaqueType("HEADER_COMPACT_TOP", 1);
        HEADER_COMPACT_TOP = superappTopPlaqueType2;
        SuperappTopPlaqueType superappTopPlaqueType3 = new SuperappTopPlaqueType("HEADER_BOTTOM", 2);
        HEADER_BOTTOM = superappTopPlaqueType3;
        SuperappTopPlaqueType[] superappTopPlaqueTypeArr = {superappTopPlaqueType, superappTopPlaqueType2, superappTopPlaqueType3};
        $VALUES = superappTopPlaqueTypeArr;
        $ENTRIES = a.a(superappTopPlaqueTypeArr);
    }

    public static SuperappTopPlaqueType valueOf(String str) {
        return (SuperappTopPlaqueType) Enum.valueOf(SuperappTopPlaqueType.class, str);
    }

    public static SuperappTopPlaqueType[] values() {
        return (SuperappTopPlaqueType[]) $VALUES.clone();
    }
}
