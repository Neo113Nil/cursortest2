package yads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class be1 implements Iterator {
    public static final be1 b;
    public static final /* synthetic */ be1[] c;

    static {
        be1 be1Var = new be1();
        b = be1Var;
        c = new be1[]{be1Var};
    }

    public static be1 valueOf(String str) {
        return (be1) Enum.valueOf(be1.class, str);
    }

    public static be1[] values() {
        return (be1[]) c.clone();
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
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
