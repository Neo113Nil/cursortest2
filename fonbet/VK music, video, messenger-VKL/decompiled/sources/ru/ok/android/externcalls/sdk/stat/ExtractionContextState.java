package ru.ok.android.externcalls.sdk.stat;

import kotlin.NotImplementedError;

/* compiled from: StatDefinitions.kt */
/* loaded from: classes9.dex */
public interface ExtractionContextState {
    default <V> StatValue<V> previousValue(StatKey<? extends V> statKey) {
        throw new NotImplementedError("previousValue not implemented by context");
    }
}
