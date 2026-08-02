package yads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ay extends AbstractCollection {
    public final /* synthetic */ cy b;

    public ay(cy cyVar) {
        this.b = cyVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        cy cyVar = this.b;
        Map a = cyVar.a();
        return a != null ? a.values().iterator() : new vx(cyVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.size();
    }
}
