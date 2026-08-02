package com.yandex.go.shortcuts.view.adapter.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/shortcuts/view/adapter/model/BadgeModel$BadgePlace", "", "Lcom/yandex/go/shortcuts/view/adapter/model/BadgeModel$BadgePlace;", "SINGLE_RIGHT", "SINGLE_BOTTOM", "SINGLE_BOTTOM_LEFT", "SINGLE_BOTTOM_RIGHT", "SINGLE_TOP_LEFT", "SINGLE_TOP_RIGHT", "MULTY_RIGHT", "MULTY_TOP_RIGHT", "MULTY_BOTTOM_LEFT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeModel$BadgePlace {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BadgeModel$BadgePlace[] $VALUES;
    public static final BadgeModel$BadgePlace MULTY_BOTTOM_LEFT;
    public static final BadgeModel$BadgePlace MULTY_RIGHT;
    public static final BadgeModel$BadgePlace MULTY_TOP_RIGHT;
    public static final BadgeModel$BadgePlace SINGLE_BOTTOM;
    public static final BadgeModel$BadgePlace SINGLE_BOTTOM_LEFT;
    public static final BadgeModel$BadgePlace SINGLE_BOTTOM_RIGHT;
    public static final BadgeModel$BadgePlace SINGLE_RIGHT;
    public static final BadgeModel$BadgePlace SINGLE_TOP_LEFT;
    public static final BadgeModel$BadgePlace SINGLE_TOP_RIGHT;

    static {
        BadgeModel$BadgePlace badgeModel$BadgePlace = new BadgeModel$BadgePlace("SINGLE_RIGHT", 0);
        SINGLE_RIGHT = badgeModel$BadgePlace;
        BadgeModel$BadgePlace badgeModel$BadgePlace2 = new BadgeModel$BadgePlace("SINGLE_BOTTOM", 1);
        SINGLE_BOTTOM = badgeModel$BadgePlace2;
        BadgeModel$BadgePlace badgeModel$BadgePlace3 = new BadgeModel$BadgePlace("SINGLE_BOTTOM_LEFT", 2);
        SINGLE_BOTTOM_LEFT = badgeModel$BadgePlace3;
        BadgeModel$BadgePlace badgeModel$BadgePlace4 = new BadgeModel$BadgePlace("SINGLE_BOTTOM_RIGHT", 3);
        SINGLE_BOTTOM_RIGHT = badgeModel$BadgePlace4;
        BadgeModel$BadgePlace badgeModel$BadgePlace5 = new BadgeModel$BadgePlace("SINGLE_TOP_LEFT", 4);
        SINGLE_TOP_LEFT = badgeModel$BadgePlace5;
        BadgeModel$BadgePlace badgeModel$BadgePlace6 = new BadgeModel$BadgePlace("SINGLE_TOP_RIGHT", 5);
        SINGLE_TOP_RIGHT = badgeModel$BadgePlace6;
        BadgeModel$BadgePlace badgeModel$BadgePlace7 = new BadgeModel$BadgePlace("MULTY_RIGHT", 6);
        MULTY_RIGHT = badgeModel$BadgePlace7;
        BadgeModel$BadgePlace badgeModel$BadgePlace8 = new BadgeModel$BadgePlace("MULTY_TOP_RIGHT", 7);
        MULTY_TOP_RIGHT = badgeModel$BadgePlace8;
        BadgeModel$BadgePlace badgeModel$BadgePlace9 = new BadgeModel$BadgePlace("MULTY_BOTTOM_LEFT", 8);
        MULTY_BOTTOM_LEFT = badgeModel$BadgePlace9;
        BadgeModel$BadgePlace[] badgeModel$BadgePlaceArr = {badgeModel$BadgePlace, badgeModel$BadgePlace2, badgeModel$BadgePlace3, badgeModel$BadgePlace4, badgeModel$BadgePlace5, badgeModel$BadgePlace6, badgeModel$BadgePlace7, badgeModel$BadgePlace8, badgeModel$BadgePlace9};
        $VALUES = badgeModel$BadgePlaceArr;
        $ENTRIES = a.a(badgeModel$BadgePlaceArr);
    }

    public static BadgeModel$BadgePlace valueOf(String str) {
        return (BadgeModel$BadgePlace) Enum.valueOf(BadgeModel$BadgePlace.class, str);
    }

    public static BadgeModel$BadgePlace[] values() {
        return (BadgeModel$BadgePlace[]) $VALUES.clone();
    }
}
