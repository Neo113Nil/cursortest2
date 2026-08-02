package xsna;

import java.util.Iterator;
import xsna.ve;

/* compiled from: Iterators.java */
/* loaded from: classes13.dex */
public final class kwx extends ve<Object> {
    public final /* synthetic */ Iterator d;
    public final /* synthetic */ jxc0 e;

    public kwx(Iterator it, jxc0 jxc0Var) {
        this.d = it;
        this.e = jxc0Var;
    }

    @Override // xsna.ve
    public final Object a() {
        Object next;
        do {
            Iterator it = this.d;
            if (!it.hasNext()) {
                this.b = ve.a.DONE;
                return null;
            }
            next = it.next();
        } while (!this.e.apply(next));
        return next;
    }
}
