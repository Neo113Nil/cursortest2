package org.chromium.base.supplier;

/* loaded from: classes8.dex */
public interface Supplier<T> extends java.util.function.Supplier<T> {
    default boolean hasValue() {
        return get() != null;
    }
}
