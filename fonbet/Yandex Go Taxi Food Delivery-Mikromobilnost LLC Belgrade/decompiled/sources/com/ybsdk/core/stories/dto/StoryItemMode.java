package com.ybsdk.core.stories.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/core/stories/dto/StoryItemMode;", "", "<init>", "(Ljava/lang/String;I)V", "DIVKIT", "FULL_SCREEN", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryItemMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StoryItemMode[] $VALUES;
    public static final StoryItemMode DIVKIT = new StoryItemMode("DIVKIT", 0);
    public static final StoryItemMode FULL_SCREEN = new StoryItemMode("FULL_SCREEN", 1);

    private static final /* synthetic */ StoryItemMode[] $values() {
        return new StoryItemMode[]{DIVKIT, FULL_SCREEN};
    }

    static {
        StoryItemMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private StoryItemMode(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static StoryItemMode valueOf(String str) {
        return (StoryItemMode) Enum.valueOf(StoryItemMode.class, str);
    }

    public static StoryItemMode[] values() {
        return (StoryItemMode[]) $VALUES.clone();
    }
}
