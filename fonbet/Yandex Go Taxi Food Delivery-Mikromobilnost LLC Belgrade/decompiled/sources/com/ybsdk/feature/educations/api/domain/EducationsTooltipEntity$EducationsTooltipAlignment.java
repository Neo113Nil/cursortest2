package com.ybsdk.feature.educations.api.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/educations/api/domain/EducationsTooltipEntity$EducationsTooltipAlignment", "", "Lcom/ybsdk/feature/educations/api/domain/EducationsTooltipEntity$EducationsTooltipAlignment;", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EducationsTooltipEntity$EducationsTooltipAlignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EducationsTooltipEntity$EducationsTooltipAlignment[] $VALUES;
    public static final EducationsTooltipEntity$EducationsTooltipAlignment TOP = new EducationsTooltipEntity$EducationsTooltipAlignment("TOP", 0);
    public static final EducationsTooltipEntity$EducationsTooltipAlignment BOTTOM = new EducationsTooltipEntity$EducationsTooltipAlignment("BOTTOM", 1);

    private static final /* synthetic */ EducationsTooltipEntity$EducationsTooltipAlignment[] $values() {
        return new EducationsTooltipEntity$EducationsTooltipAlignment[]{TOP, BOTTOM};
    }

    static {
        EducationsTooltipEntity$EducationsTooltipAlignment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private EducationsTooltipEntity$EducationsTooltipAlignment(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static EducationsTooltipEntity$EducationsTooltipAlignment valueOf(String str) {
        return (EducationsTooltipEntity$EducationsTooltipAlignment) Enum.valueOf(EducationsTooltipEntity$EducationsTooltipAlignment.class, str);
    }

    public static EducationsTooltipEntity$EducationsTooltipAlignment[] values() {
        return (EducationsTooltipEntity$EducationsTooltipAlignment[]) $VALUES.clone();
    }
}
