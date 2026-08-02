package com.ybsdk.core.stories;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/core/stories/CloseButtonVisibility;", "", "<init>", "(Ljava/lang/String;I)V", "VISIBLE", "INVISIBLE", "GONE", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CloseButtonVisibility {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CloseButtonVisibility[] $VALUES;
    public static final CloseButtonVisibility VISIBLE = new CloseButtonVisibility("VISIBLE", 0);
    public static final CloseButtonVisibility INVISIBLE = new CloseButtonVisibility("INVISIBLE", 1);
    public static final CloseButtonVisibility GONE = new CloseButtonVisibility("GONE", 2);

    private static final /* synthetic */ CloseButtonVisibility[] $values() {
        return new CloseButtonVisibility[]{VISIBLE, INVISIBLE, GONE};
    }

    static {
        CloseButtonVisibility[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CloseButtonVisibility(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CloseButtonVisibility valueOf(String str) {
        return (CloseButtonVisibility) Enum.valueOf(CloseButtonVisibility.class, str);
    }

    public static CloseButtonVisibility[] values() {
        return (CloseButtonVisibility[]) $VALUES.clone();
    }
}
