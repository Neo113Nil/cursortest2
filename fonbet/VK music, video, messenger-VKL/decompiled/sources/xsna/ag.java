package xsna;

import java.util.AbstractSet;
import java.util.Set;

/* compiled from: AbstractMutableSet.kt */
/* loaded from: classes11.dex */
public abstract class ag<E> extends AbstractSet<E> implements Set<E>, pcy {
    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
