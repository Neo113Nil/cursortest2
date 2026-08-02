package xsna;

import java.util.Iterator;

/* compiled from: Iterables.java */
/* loaded from: classes13.dex */
public final class iwx extends our<Object> {
    public final /* synthetic */ Iterable c;
    public final /* synthetic */ jxc0 d;

    public iwx(Iterable iterable, jxc0 jxc0Var) {
        this.c = iterable;
        this.d = jxc0Var;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        Iterator it = this.c.iterator();
        it.getClass();
        return new kwx(it, this.d);
    }
}
