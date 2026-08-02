package com.google.common.collect;

import defpackage.hie0;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes11.dex */
public final class s extends a {
    public final /* synthetic */ int w = 0;
    public final Iterator x;
    public final /* synthetic */ Object y;

    public s(Set set, Set set2) {
        this.y = set2;
        this.x = set.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.common.collect.a
    public final Object a() {
        int i = this.w;
        Object obj = this.y;
        Iterator it = this.x;
        switch (i) {
            case 0:
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((hie0) obj).apply(next)) {
                        break;
                    }
                }
                this.b = AbstractIterator$State.DONE;
                break;
            default:
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (((Set) obj).contains(next2)) {
                        break;
                    }
                }
                this.b = AbstractIterator$State.DONE;
                break;
        }
        return null;
    }

    public s(Iterator it, hie0 hie0Var) {
        this.x = it;
        this.y = hie0Var;
    }
}
