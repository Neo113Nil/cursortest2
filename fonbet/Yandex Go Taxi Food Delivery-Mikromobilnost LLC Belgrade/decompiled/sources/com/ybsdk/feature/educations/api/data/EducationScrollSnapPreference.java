package com.ybsdk.feature.educations.api.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationScrollSnapPreference;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "UNKNOWN", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EducationScrollSnapPreference {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EducationScrollSnapPreference[] $VALUES;
    public static final EducationScrollSnapPreference TOP = new EducationScrollSnapPreference("TOP", 0);
    public static final EducationScrollSnapPreference BOTTOM = new EducationScrollSnapPreference("BOTTOM", 1);
    public static final EducationScrollSnapPreference UNKNOWN = new EducationScrollSnapPreference("UNKNOWN", 2);

    private static final /* synthetic */ EducationScrollSnapPreference[] $values() {
        return new EducationScrollSnapPreference[]{TOP, BOTTOM, UNKNOWN};
    }

    static {
        EducationScrollSnapPreference[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private EducationScrollSnapPreference(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static EducationScrollSnapPreference valueOf(String str) {
        return (EducationScrollSnapPreference) Enum.valueOf(EducationScrollSnapPreference.class, str);
    }

    public static EducationScrollSnapPreference[] values() {
        return (EducationScrollSnapPreference[]) $VALUES.clone();
    }
}
