package com.yandex.go.taxi.order.models.api.response;

import defpackage.e9z0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.x1z0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle", "", "Lcom/yandex/go/taxi/order/models/api/response/TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle;", "Companion", "e9z0", "MAIN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final e9z0 Companion;
    public static final TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle MAIN;

    static {
        TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle timelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle = new TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle("MAIN", 0);
        MAIN = timelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle;
        TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle[] timelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyleArr = {timelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle};
        $VALUES = timelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyleArr;
        $ENTRIES = kotlin.enums.a.a(timelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyleArr);
        Companion = new e9z0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(16));
    }

    public static TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle valueOf(String str) {
        return (TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle) Enum.valueOf(TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle.class, str);
    }

    public static TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle[] values() {
        return (TimelineAdditionalOrderOptionButtons$AdditionalOrderOptionButtonStyle[]) $VALUES.clone();
    }
}
