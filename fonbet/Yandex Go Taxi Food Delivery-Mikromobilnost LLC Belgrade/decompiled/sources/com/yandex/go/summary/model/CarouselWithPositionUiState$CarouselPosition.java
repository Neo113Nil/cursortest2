package com.yandex.go.summary.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/summary/model/CarouselWithPositionUiState$CarouselPosition", "", "Lcom/yandex/go/summary/model/CarouselWithPositionUiState$CarouselPosition;", "ABOVE_MULTI_OPTIONS", "ABOVE_REQUIREMENTS", "composelogic"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CarouselWithPositionUiState$CarouselPosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CarouselWithPositionUiState$CarouselPosition[] $VALUES;
    public static final CarouselWithPositionUiState$CarouselPosition ABOVE_MULTI_OPTIONS;
    public static final CarouselWithPositionUiState$CarouselPosition ABOVE_REQUIREMENTS;

    static {
        CarouselWithPositionUiState$CarouselPosition carouselWithPositionUiState$CarouselPosition = new CarouselWithPositionUiState$CarouselPosition("ABOVE_MULTI_OPTIONS", 0);
        ABOVE_MULTI_OPTIONS = carouselWithPositionUiState$CarouselPosition;
        CarouselWithPositionUiState$CarouselPosition carouselWithPositionUiState$CarouselPosition2 = new CarouselWithPositionUiState$CarouselPosition("ABOVE_REQUIREMENTS", 1);
        ABOVE_REQUIREMENTS = carouselWithPositionUiState$CarouselPosition2;
        CarouselWithPositionUiState$CarouselPosition[] carouselWithPositionUiState$CarouselPositionArr = {carouselWithPositionUiState$CarouselPosition, carouselWithPositionUiState$CarouselPosition2};
        $VALUES = carouselWithPositionUiState$CarouselPositionArr;
        $ENTRIES = a.a(carouselWithPositionUiState$CarouselPositionArr);
    }

    public static CarouselWithPositionUiState$CarouselPosition valueOf(String str) {
        return (CarouselWithPositionUiState$CarouselPosition) Enum.valueOf(CarouselWithPositionUiState$CarouselPosition.class, str);
    }

    public static CarouselWithPositionUiState$CarouselPosition[] values() {
        return (CarouselWithPositionUiState$CarouselPosition[]) $VALUES.clone();
    }
}
