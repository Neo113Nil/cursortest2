package com.ybsdk.feature.educations.api.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/educations/api/domain/EducationDivkitContentPositionEntity;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "CONTENT_RELATED_TOP", "CONTENT_RELATED_BOTTOM", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EducationDivkitContentPositionEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EducationDivkitContentPositionEntity[] $VALUES;
    public static final EducationDivkitContentPositionEntity TOP = new EducationDivkitContentPositionEntity("TOP", 0);
    public static final EducationDivkitContentPositionEntity BOTTOM = new EducationDivkitContentPositionEntity("BOTTOM", 1);
    public static final EducationDivkitContentPositionEntity CONTENT_RELATED_TOP = new EducationDivkitContentPositionEntity("CONTENT_RELATED_TOP", 2);
    public static final EducationDivkitContentPositionEntity CONTENT_RELATED_BOTTOM = new EducationDivkitContentPositionEntity("CONTENT_RELATED_BOTTOM", 3);

    private static final /* synthetic */ EducationDivkitContentPositionEntity[] $values() {
        return new EducationDivkitContentPositionEntity[]{TOP, BOTTOM, CONTENT_RELATED_TOP, CONTENT_RELATED_BOTTOM};
    }

    static {
        EducationDivkitContentPositionEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private EducationDivkitContentPositionEntity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static EducationDivkitContentPositionEntity valueOf(String str) {
        return (EducationDivkitContentPositionEntity) Enum.valueOf(EducationDivkitContentPositionEntity.class, str);
    }

    public static EducationDivkitContentPositionEntity[] values() {
        return (EducationDivkitContentPositionEntity[]) $VALUES.clone();
    }
}
