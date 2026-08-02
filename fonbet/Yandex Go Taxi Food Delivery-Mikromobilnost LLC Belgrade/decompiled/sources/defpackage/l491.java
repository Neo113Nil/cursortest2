package defpackage;

import java.util.Iterator;

/* loaded from: classes11.dex */
public final class l491 implements Iterator {
    public final /* synthetic */ Iterator a;
    public final /* synthetic */ Iterator b;

    public l491(w491 w491Var, Iterator it, Iterator it2) {
        this.a = it;
        this.b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a.hasNext()) {
            return true;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.a;
        if (it.hasNext()) {
            return new a791(((Integer) it.next()).toString());
        }
        Iterator it2 = this.b;
        if (it2.hasNext()) {
            return new a791((String) it2.next());
        }
        ny61.p();
        return null;
    }
}
