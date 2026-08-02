package com.yandex.go.tariffcard.ui.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/tariffcard/ui/model/CarouselWithPosition$Position", "", "Lcom/yandex/go/tariffcard/ui/model/CarouselWithPosition$Position;", "ABOVE_MULTI_TARIFFS", "ABOVE_REQUIREMENTS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CarouselWithPosition$Position {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CarouselWithPosition$Position[] $VALUES;
    public static final CarouselWithPosition$Position ABOVE_MULTI_TARIFFS;
    public static final CarouselWithPosition$Position ABOVE_REQUIREMENTS;

    static {
        CarouselWithPosition$Position carouselWithPosition$Position = new CarouselWithPosition$Position("ABOVE_MULTI_TARIFFS", 0);
        ABOVE_MULTI_TARIFFS = carouselWithPosition$Position;
        CarouselWithPosition$Position carouselWithPosition$Position2 = new CarouselWithPosition$Position("ABOVE_REQUIREMENTS", 1);
        ABOVE_REQUIREMENTS = carouselWithPosition$Position2;
        CarouselWithPosition$Position[] carouselWithPosition$PositionArr = {carouselWithPosition$Position, carouselWithPosition$Position2};
        $VALUES = carouselWithPosition$PositionArr;
        $ENTRIES = a.a(carouselWithPosition$PositionArr);
    }

    public static CarouselWithPosition$Position valueOf(String str) {
        return (CarouselWithPosition$Position) Enum.valueOf(CarouselWithPosition$Position.class, str);
    }

    public static CarouselWithPosition$Position[] values() {
        return (CarouselWithPosition$Position[]) $VALUES.clone();
    }
}
