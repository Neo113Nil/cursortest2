package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class w1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProductMode$Taxi.SectionType.values().length];
        try {
            iArr[ProductMode$Taxi.SectionType.ITEMS_LINEAR_GRID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductMode$Taxi.SectionType.HEADER_LINEAR_GRID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProductMode$Taxi.SectionType.ITEMS_HORIZONTAL_SCROLLABLE_GRID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProductMode$Taxi.SectionType.HORIZONTAL_STACK_SECTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ProductMode$Taxi.SectionType.BUTTONS_CONTAINER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
