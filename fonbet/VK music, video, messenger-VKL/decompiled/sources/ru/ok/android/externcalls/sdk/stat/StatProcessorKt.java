package ru.ok.android.externcalls.sdk.stat;

import kotlin.Result;

/* compiled from: StatProcessor.kt */
/* loaded from: classes9.dex */
public final class StatProcessorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <V> StatValue<V> extractOrEmpty(StatKey<? extends V> statKey, StatPack statPack, InnerExtractionContext innerExtractionContext) {
        StatValue<? extends V> statValue;
        try {
            statValue = statKey.extract(statPack, innerExtractionContext);
        } catch (Throwable th) {
            statValue = (StatValue<? extends V>) new Result.Failure(th);
        }
        if (Result.a(statValue) != null) {
            statValue = new StatValue<>(statKey, null);
        }
        return statValue;
    }
}
