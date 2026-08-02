package ru.ok.android.externcalls.sdk.rate;

import java.util.List;

/* compiled from: RateManager.kt */
/* loaded from: classes9.dex */
public interface RateManager {
    List<RateHint> getRateHints();

    default boolean getShouldRateConversation() {
        return !getRateHints().isEmpty();
    }
}
