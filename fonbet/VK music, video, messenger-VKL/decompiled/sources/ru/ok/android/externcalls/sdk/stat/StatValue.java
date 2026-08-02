package ru.ok.android.externcalls.sdk.stat;

import xsna.epx;

/* compiled from: StatDefinitions.kt */
/* loaded from: classes9.dex */
public final class StatValue<V> {
    private final StatKey<V> key;
    private final V value;

    /* JADX WARN: Multi-variable type inference failed */
    public StatValue(StatKey<? extends V> statKey, V v) {
        this.key = statKey;
        this.value = v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return StatValue.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.key, ((StatValue) obj).key);
    }

    public final StatKey<V> getKey() {
        return this.key;
    }

    public final V getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.key.hashCode();
    }
}
