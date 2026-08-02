package com.yandex.go.flex.main_screen.data.widgets.tracking;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/flex/main_screen/data/widgets/tracking/TrackingListProperties$Styles", "", "Lcom/yandex/go/flex/main_screen/data/widgets/tracking/TrackingListProperties$Styles;", "LONG", "FOCUS", "OLD_SUPERAPP_MAIN_SCREEN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TrackingListProperties$Styles {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TrackingListProperties$Styles[] $VALUES;
    public static final TrackingListProperties$Styles FOCUS;
    public static final TrackingListProperties$Styles LONG;
    public static final TrackingListProperties$Styles OLD_SUPERAPP_MAIN_SCREEN;

    static {
        TrackingListProperties$Styles trackingListProperties$Styles = new TrackingListProperties$Styles("LONG", 0);
        LONG = trackingListProperties$Styles;
        TrackingListProperties$Styles trackingListProperties$Styles2 = new TrackingListProperties$Styles("FOCUS", 1);
        FOCUS = trackingListProperties$Styles2;
        TrackingListProperties$Styles trackingListProperties$Styles3 = new TrackingListProperties$Styles("OLD_SUPERAPP_MAIN_SCREEN", 2);
        OLD_SUPERAPP_MAIN_SCREEN = trackingListProperties$Styles3;
        TrackingListProperties$Styles[] trackingListProperties$StylesArr = {trackingListProperties$Styles, trackingListProperties$Styles2, trackingListProperties$Styles3};
        $VALUES = trackingListProperties$StylesArr;
        $ENTRIES = kotlin.enums.a.a(trackingListProperties$StylesArr);
    }

    public static TrackingListProperties$Styles valueOf(String str) {
        return (TrackingListProperties$Styles) Enum.valueOf(TrackingListProperties$Styles.class, str);
    }

    public static TrackingListProperties$Styles[] values() {
        return (TrackingListProperties$Styles[]) $VALUES.clone();
    }
}
