package com.ybsdk.feature.educations.api.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/ContentType;", "", "<init>", "(Ljava/lang/String;I)V", "HIGHLIGHT_AND_TOOLTIP", "HIGHLIGHT_AND_DIVKIT", "FULLSCREEN", "VIDEO", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ContentType[] $VALUES;
    public static final ContentType HIGHLIGHT_AND_TOOLTIP = new ContentType("HIGHLIGHT_AND_TOOLTIP", 0);
    public static final ContentType HIGHLIGHT_AND_DIVKIT = new ContentType("HIGHLIGHT_AND_DIVKIT", 1);
    public static final ContentType FULLSCREEN = new ContentType("FULLSCREEN", 2);
    public static final ContentType VIDEO = new ContentType("VIDEO", 3);

    private static final /* synthetic */ ContentType[] $values() {
        return new ContentType[]{HIGHLIGHT_AND_TOOLTIP, HIGHLIGHT_AND_DIVKIT, FULLSCREEN, VIDEO};
    }

    static {
        ContentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ContentType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ContentType valueOf(String str) {
        return (ContentType) Enum.valueOf(ContentType.class, str);
    }

    public static ContentType[] values() {
        return (ContentType[]) $VALUES.clone();
    }
}
