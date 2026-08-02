package com.google.common.collect;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes11.dex */
public final class a0 extends a {
    public final Iterator w;
    public final Iterator x;
    public final /* synthetic */ Set y;

    public a0(Set set, Set set2) {
        this.y = set;
        this.w = set.iterator();
        this.x = set2.iterator();
    }

    @Override // com.google.common.collect.a
    public final Object a() {
        Object next;
        Iterator it = this.w;
        if (it.hasNext()) {
            return it.next();
        }
        do {
            Iterator it2 = this.x;
            if (!it2.hasNext()) {
                this.b = AbstractIterator$State.DONE;
                return null;
            }
            next = it2.next();
        } while (this.y.contains(next));
        return next;
    }
}
