package com.yandex.go.flex.main_screen.presentation.feed;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/presentation/feed/FeedState;", "", "CACHE", "LOADING", "LOADING_FINISHED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FeedState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FeedState[] $VALUES;
    public static final FeedState CACHE;
    public static final FeedState LOADING;
    public static final FeedState LOADING_FINISHED;

    static {
        FeedState feedState = new FeedState("CACHE", 0);
        CACHE = feedState;
        FeedState feedState2 = new FeedState("LOADING", 1);
        LOADING = feedState2;
        FeedState feedState3 = new FeedState("LOADING_FINISHED", 2);
        LOADING_FINISHED = feedState3;
        FeedState[] feedStateArr = {feedState, feedState2, feedState3};
        $VALUES = feedStateArr;
        $ENTRIES = kotlin.enums.a.a(feedStateArr);
    }

    public static FeedState valueOf(String str) {
        return (FeedState) Enum.valueOf(FeedState.class, str);
    }

    public static FeedState[] values() {
        return (FeedState[]) $VALUES.clone();
    }
}
