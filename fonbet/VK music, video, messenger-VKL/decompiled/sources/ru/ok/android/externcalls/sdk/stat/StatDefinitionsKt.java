package ru.ok.android.externcalls.sdk.stat;

import java.util.Map;
import xsna.epx;

/* compiled from: StatDefinitions.kt */
/* loaded from: classes9.dex */
public final class StatDefinitionsKt {
    public static final <V> StatValue<V> emptyVal(StatKey<? extends V> statKey) {
        return new StatValue<>(statKey, null);
    }

    public static final <V> StatValue<V> invoke(StatKey<? extends V> statKey, StatPack statPack, InnerExtractionContext innerExtractionContext) {
        return statKey.extract(statPack, innerExtractionContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <V> StatValue<V> typedBy(StatValue<?> statValue, StatKey<? extends V> statKey) {
        if (epx.f(statValue != 0 ? statValue.getKey() : null, statKey)) {
            return statValue;
        }
        return null;
    }

    public static final <V> StatValue<V> typedGet(Map<StatKey<?>, StatValue<?>> map, StatKey<? extends V> statKey) {
        StatValue<V> statValue = (StatValue) map.get(statKey);
        if (epx.f(statValue != null ? statValue.getKey() : null, statKey)) {
            return statValue;
        }
        return null;
    }
}
