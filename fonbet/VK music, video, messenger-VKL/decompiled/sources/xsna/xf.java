package xsna;

import java.util.AbstractCollection;
import java.util.Collection;

/* compiled from: AbstractMutableCollection.kt */
/* loaded from: classes8.dex */
public abstract class xf<E> extends AbstractCollection<E> implements Collection<E>, hcy {
    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
