package com.yandex.passport.common.util;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/common/util/LocationType;", "", "DEFAULT", "FI", "KZ", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LocationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LocationType[] $VALUES;
    public static final LocationType DEFAULT;
    public static final LocationType FI;
    public static final LocationType KZ;

    static {
        LocationType locationType = new LocationType("DEFAULT", 0);
        DEFAULT = locationType;
        LocationType locationType2 = new LocationType("FI", 1);
        FI = locationType2;
        LocationType locationType3 = new LocationType("KZ", 2);
        KZ = locationType3;
        LocationType[] locationTypeArr = {locationType, locationType2, locationType3};
        $VALUES = locationTypeArr;
        $ENTRIES = kotlin.enums.a.a(locationTypeArr);
    }

    public static LocationType valueOf(String str) {
        return (LocationType) Enum.valueOf(LocationType.class, str);
    }

    public static LocationType[] values() {
        return (LocationType[]) $VALUES.clone();
    }
}
