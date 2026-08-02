package xsna;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: JsonArray.java */
/* loaded from: classes.dex */
public final class l8y extends b9y implements Iterable<b9y> {
    public final ArrayList b;

    public l8y() {
        this.b = new ArrayList();
    }

    @Override // xsna.b9y
    public final b9y c() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return new l8y();
        }
        l8y l8yVar = new l8y(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l8yVar.l(((b9y) it.next()).c());
        }
        return l8yVar;
    }

    @Override // xsna.b9y
    public final boolean d() {
        ArrayList arrayList = this.b;
        if (arrayList.size() == 1) {
            return ((b9y) arrayList.get(0)).d();
        }
        throw new IllegalStateException();
    }

    @Override // xsna.b9y
    public final float e() {
        ArrayList arrayList = this.b;
        if (arrayList.size() == 1) {
            return ((b9y) arrayList.get(0)).e();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof l8y) && ((l8y) obj).b.equals(this.b);
        }
        return true;
    }

    @Override // xsna.b9y
    public final int f() {
        ArrayList arrayList = this.b;
        if (arrayList.size() == 1) {
            return ((b9y) arrayList.get(0)).f();
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<b9y> iterator() {
        return this.b.iterator();
    }

    @Override // xsna.b9y
    public final long j() {
        ArrayList arrayList = this.b;
        if (arrayList.size() == 1) {
            return ((b9y) arrayList.get(0)).j();
        }
        throw new IllegalStateException();
    }

    @Override // xsna.b9y
    public final String k() {
        ArrayList arrayList = this.b;
        if (arrayList.size() == 1) {
            return ((b9y) arrayList.get(0)).k();
        }
        throw new IllegalStateException();
    }

    public final void l(b9y b9yVar) {
        if (b9yVar == null) {
            b9yVar = u9y.b;
        }
        this.b.add(b9yVar);
    }

    public l8y(int i) {
        this.b = new ArrayList(i);
    }
}
