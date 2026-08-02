package com.yandex.go.flex.common.facade.routers.views;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/flex/common/facade/routers/views/SlideableFlexViewSheetGeometryCalculator$ContentHeightSource", "", "Lcom/yandex/go/flex/common/facade/routers/views/SlideableFlexViewSheetGeometryCalculator$ContentHeightSource;", "CARD", "MIN_ANCHOR", "RECYCLER_VIEW", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SlideableFlexViewSheetGeometryCalculator$ContentHeightSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlideableFlexViewSheetGeometryCalculator$ContentHeightSource[] $VALUES;
    public static final SlideableFlexViewSheetGeometryCalculator$ContentHeightSource CARD;
    public static final SlideableFlexViewSheetGeometryCalculator$ContentHeightSource MIN_ANCHOR;
    public static final SlideableFlexViewSheetGeometryCalculator$ContentHeightSource RECYCLER_VIEW;

    static {
        SlideableFlexViewSheetGeometryCalculator$ContentHeightSource slideableFlexViewSheetGeometryCalculator$ContentHeightSource = new SlideableFlexViewSheetGeometryCalculator$ContentHeightSource("CARD", 0);
        CARD = slideableFlexViewSheetGeometryCalculator$ContentHeightSource;
        SlideableFlexViewSheetGeometryCalculator$ContentHeightSource slideableFlexViewSheetGeometryCalculator$ContentHeightSource2 = new SlideableFlexViewSheetGeometryCalculator$ContentHeightSource("MIN_ANCHOR", 1);
        MIN_ANCHOR = slideableFlexViewSheetGeometryCalculator$ContentHeightSource2;
        SlideableFlexViewSheetGeometryCalculator$ContentHeightSource slideableFlexViewSheetGeometryCalculator$ContentHeightSource3 = new SlideableFlexViewSheetGeometryCalculator$ContentHeightSource("RECYCLER_VIEW", 2);
        RECYCLER_VIEW = slideableFlexViewSheetGeometryCalculator$ContentHeightSource3;
        SlideableFlexViewSheetGeometryCalculator$ContentHeightSource[] slideableFlexViewSheetGeometryCalculator$ContentHeightSourceArr = {slideableFlexViewSheetGeometryCalculator$ContentHeightSource, slideableFlexViewSheetGeometryCalculator$ContentHeightSource2, slideableFlexViewSheetGeometryCalculator$ContentHeightSource3};
        $VALUES = slideableFlexViewSheetGeometryCalculator$ContentHeightSourceArr;
        $ENTRIES = a.a(slideableFlexViewSheetGeometryCalculator$ContentHeightSourceArr);
    }

    public static SlideableFlexViewSheetGeometryCalculator$ContentHeightSource valueOf(String str) {
        return (SlideableFlexViewSheetGeometryCalculator$ContentHeightSource) Enum.valueOf(SlideableFlexViewSheetGeometryCalculator$ContentHeightSource.class, str);
    }

    public static SlideableFlexViewSheetGeometryCalculator$ContentHeightSource[] values() {
        return (SlideableFlexViewSheetGeometryCalculator$ContentHeightSource[]) $VALUES.clone();
    }
}
