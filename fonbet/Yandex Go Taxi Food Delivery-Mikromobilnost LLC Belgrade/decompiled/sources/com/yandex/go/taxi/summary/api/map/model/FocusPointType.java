package com.yandex.go.taxi.summary.api.map.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/summary/api/map/model/FocusPointType;", "", "POINT_A", "POINT_B", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FocusPointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FocusPointType[] $VALUES;
    public static final FocusPointType POINT_A;
    public static final FocusPointType POINT_B;

    static {
        FocusPointType focusPointType = new FocusPointType("POINT_A", 0);
        POINT_A = focusPointType;
        FocusPointType focusPointType2 = new FocusPointType("POINT_B", 1);
        POINT_B = focusPointType2;
        FocusPointType[] focusPointTypeArr = {focusPointType, focusPointType2};
        $VALUES = focusPointTypeArr;
        $ENTRIES = a.a(focusPointTypeArr);
    }

    public static FocusPointType valueOf(String str) {
        return (FocusPointType) Enum.valueOf(FocusPointType.class, str);
    }

    public static FocusPointType[] values() {
        return (FocusPointType[]) $VALUES.clone();
    }
}
