package com.ybsdk.feature.educations.api.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationScrollType;", "", "<init>", "(Ljava/lang/String;I)V", "SCROLL_TO_SCREEN_EDGE", "SCROLL_TO_SCREEN_ITEM", "UNKNOWN", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EducationScrollType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EducationScrollType[] $VALUES;
    public static final EducationScrollType SCROLL_TO_SCREEN_EDGE = new EducationScrollType("SCROLL_TO_SCREEN_EDGE", 0);
    public static final EducationScrollType SCROLL_TO_SCREEN_ITEM = new EducationScrollType("SCROLL_TO_SCREEN_ITEM", 1);
    public static final EducationScrollType UNKNOWN = new EducationScrollType("UNKNOWN", 2);

    private static final /* synthetic */ EducationScrollType[] $values() {
        return new EducationScrollType[]{SCROLL_TO_SCREEN_EDGE, SCROLL_TO_SCREEN_ITEM, UNKNOWN};
    }

    static {
        EducationScrollType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private EducationScrollType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static EducationScrollType valueOf(String str) {
        return (EducationScrollType) Enum.valueOf(EducationScrollType.class, str);
    }

    public static EducationScrollType[] values() {
        return (EducationScrollType[]) $VALUES.clone();
    }
}
