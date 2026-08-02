package com.google.common.collect;

import defpackage.ffx;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
final class Iterators$EmptyModifiableIterator implements Iterator<Object> {
    private static final /* synthetic */ Iterators$EmptyModifiableIterator[] $VALUES;
    public static final Iterators$EmptyModifiableIterator INSTANCE;

    static {
        Iterators$EmptyModifiableIterator iterators$EmptyModifiableIterator = new Iterators$EmptyModifiableIterator("INSTANCE", 0);
        INSTANCE = iterators$EmptyModifiableIterator;
        $VALUES = new Iterators$EmptyModifiableIterator[]{iterators$EmptyModifiableIterator};
    }

    public static Iterators$EmptyModifiableIterator valueOf(String str) {
        return (Iterators$EmptyModifiableIterator) Enum.valueOf(Iterators$EmptyModifiableIterator.class, str);
    }

    public static Iterators$EmptyModifiableIterator[] values() {
        return (Iterators$EmptyModifiableIterator[]) $VALUES.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ffx.r("no calls to next() since the last call to remove()", false);
    }
}
