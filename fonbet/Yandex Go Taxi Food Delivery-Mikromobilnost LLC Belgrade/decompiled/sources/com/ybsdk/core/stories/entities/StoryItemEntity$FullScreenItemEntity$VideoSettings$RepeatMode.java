package com.ybsdk.core.stories.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/core/stories/entities/StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode", "", "Lcom/ybsdk/core/stories/entities/StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode;", "<init>", "(Ljava/lang/String;I)V", "OFF", "ONE", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode[] $VALUES;
    public static final StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode OFF = new StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode("OFF", 0);
    public static final StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode ONE = new StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode("ONE", 1);

    private static final /* synthetic */ StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode[] $values() {
        return new StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode[]{OFF, ONE};
    }

    static {
        StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode valueOf(String str) {
        return (StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode) Enum.valueOf(StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode.class, str);
    }

    public static StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode[] values() {
        return (StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode[]) $VALUES.clone();
    }
}
