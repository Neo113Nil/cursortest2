package com.yandex.go.chargers.feedback.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/feedback/domain/model/ChargersFeedbackCompletedOrder$FinishingStage", "", "Lcom/yandex/go/chargers/feedback/domain/model/ChargersFeedbackCompletedOrder$FinishingStage;", "DEFAULT", "FREE_CHECK_SECONDS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersFeedbackCompletedOrder$FinishingStage {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersFeedbackCompletedOrder$FinishingStage[] $VALUES;
    public static final ChargersFeedbackCompletedOrder$FinishingStage DEFAULT;
    public static final ChargersFeedbackCompletedOrder$FinishingStage FREE_CHECK_SECONDS;

    static {
        ChargersFeedbackCompletedOrder$FinishingStage chargersFeedbackCompletedOrder$FinishingStage = new ChargersFeedbackCompletedOrder$FinishingStage("DEFAULT", 0);
        DEFAULT = chargersFeedbackCompletedOrder$FinishingStage;
        ChargersFeedbackCompletedOrder$FinishingStage chargersFeedbackCompletedOrder$FinishingStage2 = new ChargersFeedbackCompletedOrder$FinishingStage("FREE_CHECK_SECONDS", 1);
        FREE_CHECK_SECONDS = chargersFeedbackCompletedOrder$FinishingStage2;
        ChargersFeedbackCompletedOrder$FinishingStage[] chargersFeedbackCompletedOrder$FinishingStageArr = {chargersFeedbackCompletedOrder$FinishingStage, chargersFeedbackCompletedOrder$FinishingStage2};
        $VALUES = chargersFeedbackCompletedOrder$FinishingStageArr;
        $ENTRIES = a.a(chargersFeedbackCompletedOrder$FinishingStageArr);
    }

    public static ChargersFeedbackCompletedOrder$FinishingStage valueOf(String str) {
        return (ChargersFeedbackCompletedOrder$FinishingStage) Enum.valueOf(ChargersFeedbackCompletedOrder$FinishingStage.class, str);
    }

    public static ChargersFeedbackCompletedOrder$FinishingStage[] values() {
        return (ChargersFeedbackCompletedOrder$FinishingStage[]) $VALUES.clone();
    }
}
