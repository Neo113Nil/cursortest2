package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.tbn;

/* compiled from: CompositeDiscStorage.kt */
/* loaded from: classes2.dex */
public final class vsi implements tbn {
    public final gpo a;
    public final List<tbn> b;

    public vsi(gpo gpoVar, List list) {
        this.a = gpoVar;
        this.b = list;
    }

    @Override // xsna.tbn
    public final void b() {
        this.a.b();
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((tbn) it.next()).b();
        }
    }

    @Override // xsna.tbn
    public final Collection<tbn.a> c() {
        ArrayList arrayList = new ArrayList();
        g5g.y(this.a.c(), arrayList);
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            g5g.y(((tbn) it.next()).c(), arrayList);
        }
        return arrayList;
    }

    @Override // xsna.tbn
    public final t27 d(Object obj, String str) {
        t27 d = this.a.d(obj, str);
        if (d != null) {
            return d;
        }
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            t27 d2 = ((tbn) it.next()).d(obj, str);
            if (d2 != null) {
                return d2;
            }
        }
        return null;
    }

    @Override // xsna.tbn
    public final long e(tbn.a aVar) {
        long e = this.a.e(aVar);
        if (e != -1) {
            return e;
        }
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            long e2 = ((tbn) it.next()).e(aVar);
            if (e2 != -1) {
                return e2;
            }
        }
        return -1L;
    }

    @Override // xsna.tbn
    public final void f() {
        this.a.f();
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((tbn) it.next()).f();
        }
    }

    @Override // xsna.tbn
    public final boolean g(Object obj, String str) {
        if (this.a.g(obj, str)) {
            return true;
        }
        List<tbn> list = this.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((tbn) it.next()).g(obj, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.tbn
    public final tbn.b h(Object obj, String str) {
        return this.a.h(obj, str);
    }

    @Override // xsna.tbn
    public final boolean isExternal() {
        return this.a.isExternal();
    }

    @Override // xsna.tbn
    public final long remove(String str) {
        long remove = this.a.remove(str);
        if (remove != -1) {
            return remove;
        }
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            long remove2 = ((tbn) it.next()).remove(str);
            if (remove2 != -1) {
                return remove2;
            }
        }
        return -1L;
    }
}
