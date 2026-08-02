package com.ybsdk.feature.educations.api.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/educations/api/domain/EducationScrollSnapPreferenceEntity;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "UNKNOWN", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EducationScrollSnapPreferenceEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EducationScrollSnapPreferenceEntity[] $VALUES;
    public static final EducationScrollSnapPreferenceEntity TOP = new EducationScrollSnapPreferenceEntity("TOP", 0);
    public static final EducationScrollSnapPreferenceEntity BOTTOM = new EducationScrollSnapPreferenceEntity("BOTTOM", 1);
    public static final EducationScrollSnapPreferenceEntity UNKNOWN = new EducationScrollSnapPreferenceEntity("UNKNOWN", 2);

    private static final /* synthetic */ EducationScrollSnapPreferenceEntity[] $values() {
        return new EducationScrollSnapPreferenceEntity[]{TOP, BOTTOM, UNKNOWN};
    }

    static {
        EducationScrollSnapPreferenceEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private EducationScrollSnapPreferenceEntity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static EducationScrollSnapPreferenceEntity valueOf(String str) {
        return (EducationScrollSnapPreferenceEntity) Enum.valueOf(EducationScrollSnapPreferenceEntity.class, str);
    }

    public static EducationScrollSnapPreferenceEntity[] values() {
        return (EducationScrollSnapPreferenceEntity[]) $VALUES.clone();
    }
}
