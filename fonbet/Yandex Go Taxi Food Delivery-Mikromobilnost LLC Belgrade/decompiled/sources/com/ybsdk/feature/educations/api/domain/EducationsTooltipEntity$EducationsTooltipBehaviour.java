package com.ybsdk.feature.educations.api.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/educations/api/domain/EducationsTooltipEntity$EducationsTooltipBehaviour", "", "Lcom/ybsdk/feature/educations/api/domain/EducationsTooltipEntity$EducationsTooltipBehaviour;", "<init>", "(Ljava/lang/String;I)V", "ABOVE_ANCHOR", "UNDER_ANCHOR", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EducationsTooltipEntity$EducationsTooltipBehaviour {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EducationsTooltipEntity$EducationsTooltipBehaviour[] $VALUES;
    public static final EducationsTooltipEntity$EducationsTooltipBehaviour ABOVE_ANCHOR = new EducationsTooltipEntity$EducationsTooltipBehaviour("ABOVE_ANCHOR", 0);
    public static final EducationsTooltipEntity$EducationsTooltipBehaviour UNDER_ANCHOR = new EducationsTooltipEntity$EducationsTooltipBehaviour("UNDER_ANCHOR", 1);

    private static final /* synthetic */ EducationsTooltipEntity$EducationsTooltipBehaviour[] $values() {
        return new EducationsTooltipEntity$EducationsTooltipBehaviour[]{ABOVE_ANCHOR, UNDER_ANCHOR};
    }

    static {
        EducationsTooltipEntity$EducationsTooltipBehaviour[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private EducationsTooltipEntity$EducationsTooltipBehaviour(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static EducationsTooltipEntity$EducationsTooltipBehaviour valueOf(String str) {
        return (EducationsTooltipEntity$EducationsTooltipBehaviour) Enum.valueOf(EducationsTooltipEntity$EducationsTooltipBehaviour.class, str);
    }

    public static EducationsTooltipEntity$EducationsTooltipBehaviour[] values() {
        return (EducationsTooltipEntity$EducationsTooltipBehaviour[]) $VALUES.clone();
    }
}
