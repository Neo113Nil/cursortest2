package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/home/plaque/repository/graphql/cache/dto/WidgetDto$Group$Line$Orientation", "", "Lcom/yandex/plus/home/plaque/repository/graphql/cache/dto/WidgetDto$Group$Line$Orientation;", "HORIZONTAL", "VERTICAL", "plus-home-plaque-repository-graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WidgetDto$Group$Line$Orientation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WidgetDto$Group$Line$Orientation[] $VALUES;
    public static final WidgetDto$Group$Line$Orientation HORIZONTAL;
    public static final WidgetDto$Group$Line$Orientation VERTICAL;

    static {
        WidgetDto$Group$Line$Orientation widgetDto$Group$Line$Orientation = new WidgetDto$Group$Line$Orientation("HORIZONTAL", 0);
        HORIZONTAL = widgetDto$Group$Line$Orientation;
        WidgetDto$Group$Line$Orientation widgetDto$Group$Line$Orientation2 = new WidgetDto$Group$Line$Orientation("VERTICAL", 1);
        VERTICAL = widgetDto$Group$Line$Orientation2;
        WidgetDto$Group$Line$Orientation[] widgetDto$Group$Line$OrientationArr = {widgetDto$Group$Line$Orientation, widgetDto$Group$Line$Orientation2};
        $VALUES = widgetDto$Group$Line$OrientationArr;
        $ENTRIES = a.a(widgetDto$Group$Line$OrientationArr);
    }

    public static WidgetDto$Group$Line$Orientation valueOf(String str) {
        return (WidgetDto$Group$Line$Orientation) Enum.valueOf(WidgetDto$Group$Line$Orientation.class, str);
    }

    public static WidgetDto$Group$Line$Orientation[] values() {
        return (WidgetDto$Group$Line$Orientation[]) $VALUES.clone();
    }
}
