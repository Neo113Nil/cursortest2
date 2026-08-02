package com.ybsdk.feature.stories.internal.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/ybsdk/feature/stories/internal/domain/VerticalStoriesAnalyticsInteractor$RefererScreenState", "", "Lcom/ybsdk/feature/stories/internal/domain/VerticalStoriesAnalyticsInteractor$RefererScreenState;", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "VIEW_CREATED_FIRST_TIME", "STORY_SELECTED", "CONFIG_CHANGED", "NAVIGATION_BACK", "feature-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VerticalStoriesAnalyticsInteractor$RefererScreenState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VerticalStoriesAnalyticsInteractor$RefererScreenState[] $VALUES;
    public static final VerticalStoriesAnalyticsInteractor$RefererScreenState INITIAL = new VerticalStoriesAnalyticsInteractor$RefererScreenState("INITIAL", 0);
    public static final VerticalStoriesAnalyticsInteractor$RefererScreenState VIEW_CREATED_FIRST_TIME = new VerticalStoriesAnalyticsInteractor$RefererScreenState("VIEW_CREATED_FIRST_TIME", 1);
    public static final VerticalStoriesAnalyticsInteractor$RefererScreenState STORY_SELECTED = new VerticalStoriesAnalyticsInteractor$RefererScreenState("STORY_SELECTED", 2);
    public static final VerticalStoriesAnalyticsInteractor$RefererScreenState CONFIG_CHANGED = new VerticalStoriesAnalyticsInteractor$RefererScreenState("CONFIG_CHANGED", 3);
    public static final VerticalStoriesAnalyticsInteractor$RefererScreenState NAVIGATION_BACK = new VerticalStoriesAnalyticsInteractor$RefererScreenState("NAVIGATION_BACK", 4);

    private static final /* synthetic */ VerticalStoriesAnalyticsInteractor$RefererScreenState[] $values() {
        return new VerticalStoriesAnalyticsInteractor$RefererScreenState[]{INITIAL, VIEW_CREATED_FIRST_TIME, STORY_SELECTED, CONFIG_CHANGED, NAVIGATION_BACK};
    }

    static {
        VerticalStoriesAnalyticsInteractor$RefererScreenState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private VerticalStoriesAnalyticsInteractor$RefererScreenState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static VerticalStoriesAnalyticsInteractor$RefererScreenState valueOf(String str) {
        return (VerticalStoriesAnalyticsInteractor$RefererScreenState) Enum.valueOf(VerticalStoriesAnalyticsInteractor$RefererScreenState.class, str);
    }

    public static VerticalStoriesAnalyticsInteractor$RefererScreenState[] values() {
        return (VerticalStoriesAnalyticsInteractor$RefererScreenState[]) $VALUES.clone();
    }
}
