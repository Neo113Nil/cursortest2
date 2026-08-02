package yads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class wx extends AbstractSet {
    public final /* synthetic */ cy b;

    public wx(cy cyVar) {
        this.b = cyVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map a = this.b.a();
        if (a != null) {
            return a.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int a2 = this.b.a(entry.getKey());
            if (a2 != -1 && ma2.a(this.b.c(a2), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        cy cyVar = this.b;
        Map a = cyVar.a();
        return a != null ? a.entrySet().iterator() : new ux(cyVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int a;
        Map a2 = this.b.a();
        if (a2 != null) {
            return a2.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.b.c() || (a = dy.a(entry.getKey(), entry.getValue(), (1 << (this.b.f & 31)) - 1, this.b.f(), this.b.d(), this.b.e(), this.b.g())) == -1) {
            return false;
        }
        this.b.a(a, i);
        cy cyVar = this.b;
        cyVar.g--;
        cyVar.f += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }
}
