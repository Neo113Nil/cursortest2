package com.ybsdk.feature.educations.api.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/educations/api/domain/EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType", "", "Lcom/ybsdk/feature/educations/api/domain/EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType;", "<init>", "(Ljava/lang/String;I)V", "HIGHLIGHT", "SHADOW", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType[] $VALUES;
    public static final EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType HIGHLIGHT = new EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType("HIGHLIGHT", 0);
    public static final EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType SHADOW = new EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType("SHADOW", 1);

    private static final /* synthetic */ EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType[] $values() {
        return new EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType[]{HIGHLIGHT, SHADOW};
    }

    static {
        EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType valueOf(String str) {
        return (EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType) Enum.valueOf(EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType.class, str);
    }

    public static EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType[] values() {
        return (EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType[]) $VALUES.clone();
    }
}
