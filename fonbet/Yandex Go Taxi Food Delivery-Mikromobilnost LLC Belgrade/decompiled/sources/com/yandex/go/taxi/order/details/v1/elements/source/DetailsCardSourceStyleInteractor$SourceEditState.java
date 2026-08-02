package com.yandex.go.taxi.order.details.v1.elements.source;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/details/v1/elements/source/DetailsCardSourceStyleInteractor$SourceEditState", "", "Lcom/yandex/go/taxi/order/details/v1/elements/source/DetailsCardSourceStyleInteractor$SourceEditState;", "ADDRESS", "ENTRANCE", "UNEDITABLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DetailsCardSourceStyleInteractor$SourceEditState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DetailsCardSourceStyleInteractor$SourceEditState[] $VALUES;
    public static final DetailsCardSourceStyleInteractor$SourceEditState ADDRESS;
    public static final DetailsCardSourceStyleInteractor$SourceEditState ENTRANCE;
    public static final DetailsCardSourceStyleInteractor$SourceEditState UNEDITABLE;

    static {
        DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState = new DetailsCardSourceStyleInteractor$SourceEditState("ADDRESS", 0);
        ADDRESS = detailsCardSourceStyleInteractor$SourceEditState;
        DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState2 = new DetailsCardSourceStyleInteractor$SourceEditState("ENTRANCE", 1);
        ENTRANCE = detailsCardSourceStyleInteractor$SourceEditState2;
        DetailsCardSourceStyleInteractor$SourceEditState detailsCardSourceStyleInteractor$SourceEditState3 = new DetailsCardSourceStyleInteractor$SourceEditState("UNEDITABLE", 2);
        UNEDITABLE = detailsCardSourceStyleInteractor$SourceEditState3;
        DetailsCardSourceStyleInteractor$SourceEditState[] detailsCardSourceStyleInteractor$SourceEditStateArr = {detailsCardSourceStyleInteractor$SourceEditState, detailsCardSourceStyleInteractor$SourceEditState2, detailsCardSourceStyleInteractor$SourceEditState3};
        $VALUES = detailsCardSourceStyleInteractor$SourceEditStateArr;
        $ENTRIES = kotlin.enums.a.a(detailsCardSourceStyleInteractor$SourceEditStateArr);
    }

    public static DetailsCardSourceStyleInteractor$SourceEditState valueOf(String str) {
        return (DetailsCardSourceStyleInteractor$SourceEditState) Enum.valueOf(DetailsCardSourceStyleInteractor$SourceEditState.class, str);
    }

    public static DetailsCardSourceStyleInteractor$SourceEditState[] values() {
        return (DetailsCardSourceStyleInteractor$SourceEditState[]) $VALUES.clone();
    }
}
