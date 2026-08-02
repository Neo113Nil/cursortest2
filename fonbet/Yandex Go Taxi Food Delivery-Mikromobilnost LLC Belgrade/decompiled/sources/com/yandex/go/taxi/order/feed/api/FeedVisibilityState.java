package com.yandex.go.taxi.order.feed.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/feed/api/FeedVisibilityState;", "", "HIDE", "SHOW", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FeedVisibilityState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FeedVisibilityState[] $VALUES;
    public static final FeedVisibilityState HIDE;
    public static final FeedVisibilityState SHOW;

    static {
        FeedVisibilityState feedVisibilityState = new FeedVisibilityState("HIDE", 0);
        HIDE = feedVisibilityState;
        FeedVisibilityState feedVisibilityState2 = new FeedVisibilityState("SHOW", 1);
        SHOW = feedVisibilityState2;
        FeedVisibilityState[] feedVisibilityStateArr = {feedVisibilityState, feedVisibilityState2};
        $VALUES = feedVisibilityStateArr;
        $ENTRIES = a.a(feedVisibilityStateArr);
    }

    public static FeedVisibilityState valueOf(String str) {
        return (FeedVisibilityState) Enum.valueOf(FeedVisibilityState.class, str);
    }

    public static FeedVisibilityState[] values() {
        return (FeedVisibilityState[]) $VALUES.clone();
    }
}
