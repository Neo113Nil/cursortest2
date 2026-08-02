package com.ybsdk.feature.card.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/card/api/CardScenarioEventsReceiver$ActivationResult", "", "Lcom/ybsdk/feature/card/api/CardScenarioEventsReceiver$ActivationResult;", "<init>", "(Ljava/lang/String;I)V", "FAIL", "SUCCESS", "feature-card-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardScenarioEventsReceiver$ActivationResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardScenarioEventsReceiver$ActivationResult[] $VALUES;
    public static final CardScenarioEventsReceiver$ActivationResult FAIL = new CardScenarioEventsReceiver$ActivationResult("FAIL", 0);
    public static final CardScenarioEventsReceiver$ActivationResult SUCCESS = new CardScenarioEventsReceiver$ActivationResult("SUCCESS", 1);

    private static final /* synthetic */ CardScenarioEventsReceiver$ActivationResult[] $values() {
        return new CardScenarioEventsReceiver$ActivationResult[]{FAIL, SUCCESS};
    }

    static {
        CardScenarioEventsReceiver$ActivationResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CardScenarioEventsReceiver$ActivationResult(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardScenarioEventsReceiver$ActivationResult valueOf(String str) {
        return (CardScenarioEventsReceiver$ActivationResult) Enum.valueOf(CardScenarioEventsReceiver$ActivationResult.class, str);
    }

    public static CardScenarioEventsReceiver$ActivationResult[] values() {
        return (CardScenarioEventsReceiver$ActivationResult[]) $VALUES.clone();
    }
}
