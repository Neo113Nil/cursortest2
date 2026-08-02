package com.yandex.go.multimodal_route.ui.detailed_card;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/multimodal_route/ui/detailed_card/MultimodalRouteFabState;", "", "FOCUS_ROUTE", "FOCUS_USER_LOCATION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MultimodalRouteFabState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MultimodalRouteFabState[] $VALUES;
    public static final MultimodalRouteFabState FOCUS_ROUTE;
    public static final MultimodalRouteFabState FOCUS_USER_LOCATION;

    static {
        MultimodalRouteFabState multimodalRouteFabState = new MultimodalRouteFabState("FOCUS_ROUTE", 0);
        FOCUS_ROUTE = multimodalRouteFabState;
        MultimodalRouteFabState multimodalRouteFabState2 = new MultimodalRouteFabState("FOCUS_USER_LOCATION", 1);
        FOCUS_USER_LOCATION = multimodalRouteFabState2;
        MultimodalRouteFabState[] multimodalRouteFabStateArr = {multimodalRouteFabState, multimodalRouteFabState2};
        $VALUES = multimodalRouteFabStateArr;
        $ENTRIES = kotlin.enums.a.a(multimodalRouteFabStateArr);
    }

    public static MultimodalRouteFabState valueOf(String str) {
        return (MultimodalRouteFabState) Enum.valueOf(MultimodalRouteFabState.class, str);
    }

    public static MultimodalRouteFabState[] values() {
        return (MultimodalRouteFabState[]) $VALUES.clone();
    }
}
