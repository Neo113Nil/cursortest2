package com.google.common.base;

/* loaded from: classes.dex */
final class Absent<T> extends Optional<T> {
    public static final Absent a = new Absent();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // com.google.common.base.Optional
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
