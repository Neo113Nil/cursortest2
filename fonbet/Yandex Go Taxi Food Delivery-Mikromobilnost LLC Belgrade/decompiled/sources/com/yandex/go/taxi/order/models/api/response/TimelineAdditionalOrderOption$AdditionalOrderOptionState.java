package com.yandex.go.taxi.order.models.api.response;

import defpackage.b9z0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.x1z0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/order/models/api/response/TimelineAdditionalOrderOption$AdditionalOrderOptionState", "", "Lcom/yandex/go/taxi/order/models/api/response/TimelineAdditionalOrderOption$AdditionalOrderOptionState;", "Companion", "b9z0", "SELECTED", "UNSELECTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TimelineAdditionalOrderOption$AdditionalOrderOptionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TimelineAdditionalOrderOption$AdditionalOrderOptionState[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final b9z0 Companion;
    public static final TimelineAdditionalOrderOption$AdditionalOrderOptionState SELECTED;
    public static final TimelineAdditionalOrderOption$AdditionalOrderOptionState UNSELECTED;

    static {
        TimelineAdditionalOrderOption$AdditionalOrderOptionState timelineAdditionalOrderOption$AdditionalOrderOptionState = new TimelineAdditionalOrderOption$AdditionalOrderOptionState("SELECTED", 0);
        SELECTED = timelineAdditionalOrderOption$AdditionalOrderOptionState;
        TimelineAdditionalOrderOption$AdditionalOrderOptionState timelineAdditionalOrderOption$AdditionalOrderOptionState2 = new TimelineAdditionalOrderOption$AdditionalOrderOptionState("UNSELECTED", 1);
        UNSELECTED = timelineAdditionalOrderOption$AdditionalOrderOptionState2;
        TimelineAdditionalOrderOption$AdditionalOrderOptionState[] timelineAdditionalOrderOption$AdditionalOrderOptionStateArr = {timelineAdditionalOrderOption$AdditionalOrderOptionState, timelineAdditionalOrderOption$AdditionalOrderOptionState2};
        $VALUES = timelineAdditionalOrderOption$AdditionalOrderOptionStateArr;
        $ENTRIES = kotlin.enums.a.a(timelineAdditionalOrderOption$AdditionalOrderOptionStateArr);
        Companion = new b9z0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(12));
    }

    public static TimelineAdditionalOrderOption$AdditionalOrderOptionState valueOf(String str) {
        return (TimelineAdditionalOrderOption$AdditionalOrderOptionState) Enum.valueOf(TimelineAdditionalOrderOption$AdditionalOrderOptionState.class, str);
    }

    public static TimelineAdditionalOrderOption$AdditionalOrderOptionState[] values() {
        return (TimelineAdditionalOrderOption$AdditionalOrderOptionState[]) $VALUES.clone();
    }
}
