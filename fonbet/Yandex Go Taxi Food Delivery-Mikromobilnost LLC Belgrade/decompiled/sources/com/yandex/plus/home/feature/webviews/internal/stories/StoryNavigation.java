package com.yandex.plus.home.feature.webviews.internal.stories;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/stories/StoryNavigation;", "", "SHOW_NEXT_STORY", "SHOW_PREV_STORY", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryNavigation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StoryNavigation[] $VALUES;
    public static final StoryNavigation SHOW_NEXT_STORY;
    public static final StoryNavigation SHOW_PREV_STORY;

    static {
        StoryNavigation storyNavigation = new StoryNavigation("SHOW_NEXT_STORY", 0);
        SHOW_NEXT_STORY = storyNavigation;
        StoryNavigation storyNavigation2 = new StoryNavigation("SHOW_PREV_STORY", 1);
        SHOW_PREV_STORY = storyNavigation2;
        StoryNavigation[] storyNavigationArr = {storyNavigation, storyNavigation2};
        $VALUES = storyNavigationArr;
        $ENTRIES = kotlin.enums.a.a(storyNavigationArr);
    }

    public static StoryNavigation valueOf(String str) {
        return (StoryNavigation) Enum.valueOf(StoryNavigation.class, str);
    }

    public static StoryNavigation[] values() {
        return (StoryNavigation[]) $VALUES.clone();
    }
}
