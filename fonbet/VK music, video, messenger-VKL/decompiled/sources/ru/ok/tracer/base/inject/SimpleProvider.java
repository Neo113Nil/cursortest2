package ru.ok.tracer.base.inject;

import xsna.e9e0;
import xsna.epx;
import xsna.so;

/* compiled from: ProviderUtils.kt */
/* loaded from: classes11.dex */
final class SimpleProvider<T> implements e9e0<T> {
    private final T value;

    public SimpleProvider(T t) {
        this.value = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimpleProvider copy$default(SimpleProvider simpleProvider, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = simpleProvider.value;
        }
        return simpleProvider.copy(obj);
    }

    public final T component1() {
        return this.value;
    }

    public final SimpleProvider<T> copy(T t) {
        return new SimpleProvider<>(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SimpleProvider) && epx.f(this.value, ((SimpleProvider) obj).value);
    }

    @Override // xsna.e9e0
    public T get() {
        return this.value;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t = this.value;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        return so.a(this.value, "SimpleProvider(value=", ")");
    }
}
