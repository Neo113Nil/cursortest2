package xsna;

import java.util.Iterator;
import xsna.ve;

/* compiled from: Sets.java */
/* loaded from: classes13.dex */
public final class gzi0 extends ve<Object> {
    public final Iterator<Object> d;
    public final /* synthetic */ com.google.common.collect.j e;

    public gzi0(com.google.common.collect.j jVar) {
        this.e = jVar;
        this.d = jVar.b.iterator();
    }

    @Override // xsna.ve
    public final Object a() {
        Object next;
        do {
            Iterator<Object> it = this.d;
            if (!it.hasNext()) {
                this.b = ve.a.DONE;
                return null;
            }
            next = it.next();
        } while (!this.e.c.contains(next));
        return next;
    }
}
