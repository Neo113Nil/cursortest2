package ru.ok.android.externcalls.sdk.stat;

import java.util.LinkedHashMap;
import java.util.Map;
import xsna.epx;

/* compiled from: StatState.kt */
/* loaded from: classes9.dex */
public final class StatState implements ExtractionContextState {
    private final Map<StatKey<?>, StatValue<?>> lastState = new LinkedHashMap();

    public final void clear() {
        this.lastState.clear();
    }

    @Override // ru.ok.android.externcalls.sdk.stat.ExtractionContextState
    public <V> StatValue<V> previousValue(StatKey<? extends V> statKey) {
        StatValue<V> statValue = (StatValue) this.lastState.get(statKey);
        if (epx.f(statValue != null ? statValue.getKey() : null, statKey)) {
            return statValue;
        }
        return null;
    }

    public final void update(Map<StatKey<?>, ? extends StatValue<?>> map) {
        this.lastState.clear();
        this.lastState.putAll(map);
    }
}
