package com.ybsdk.core.stories;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/core/stories/ChangeStoryReason;", "", "<init>", "(Ljava/lang/String;I)V", "STORIES_NEXT_CLICK", "STORIES_PREVIEW_CLICK", "STORIES_NEXT_TIME", "STORIES_NEXT_DEEPLINK", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChangeStoryReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChangeStoryReason[] $VALUES;
    public static final ChangeStoryReason STORIES_NEXT_CLICK = new ChangeStoryReason("STORIES_NEXT_CLICK", 0);
    public static final ChangeStoryReason STORIES_PREVIEW_CLICK = new ChangeStoryReason("STORIES_PREVIEW_CLICK", 1);
    public static final ChangeStoryReason STORIES_NEXT_TIME = new ChangeStoryReason("STORIES_NEXT_TIME", 2);
    public static final ChangeStoryReason STORIES_NEXT_DEEPLINK = new ChangeStoryReason("STORIES_NEXT_DEEPLINK", 3);

    private static final /* synthetic */ ChangeStoryReason[] $values() {
        return new ChangeStoryReason[]{STORIES_NEXT_CLICK, STORIES_PREVIEW_CLICK, STORIES_NEXT_TIME, STORIES_NEXT_DEEPLINK};
    }

    static {
        ChangeStoryReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ChangeStoryReason(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ChangeStoryReason valueOf(String str) {
        return (ChangeStoryReason) Enum.valueOf(ChangeStoryReason.class, str);
    }

    public static ChangeStoryReason[] values() {
        return (ChangeStoryReason[]) $VALUES.clone();
    }
}
