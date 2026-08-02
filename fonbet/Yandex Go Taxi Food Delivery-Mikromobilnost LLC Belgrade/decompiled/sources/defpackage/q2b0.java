package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public class q2b0 implements Iterator, xfx {
    public final /* synthetic */ int a = 2;
    public int b;
    public Object c;
    public final Object w;

    public q2b0(enm enmVar) {
        this.w = enmVar;
        this.c = enmVar.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.w;
        switch (i) {
            case 0:
                return this.b < ((Map) obj).size();
            case 1:
                pyu0 pyu0Var = (pyu0) obj;
                Iterator it = (Iterator) this.c;
                while (this.b < pyu0Var.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                return this.b < pyu0Var.c && it.hasNext();
            default:
                return ((Iterator) this.c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.a;
        Object obj = null;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                if (hasNext()) {
                    obj = this.c;
                    this.b++;
                    Object obj3 = ((Map) obj2).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException(qv10.p("Hash code of an element (", ") has changed after it was added to the persistent set.", obj));
                    }
                    this.c = ((bqy) obj3).b;
                } else {
                    ny61.p();
                }
                return obj;
            case 1:
                pyu0 pyu0Var = (pyu0) obj2;
                Iterator it = (Iterator) this.c;
                while (this.b < pyu0Var.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                int i2 = this.b;
                if (i2 < pyu0Var.c) {
                    this.b = i2 + 1;
                    return it.next();
                }
                ny61.p();
                return null;
            default:
                wls wlsVar = (wls) ((enm) obj2).c;
                int i3 = this.b;
                this.b = i3 + 1;
                if (i3 >= 0) {
                    return wlsVar.invoke(Integer.valueOf(i3), ((Iterator) this.c).next());
                }
                scc.m();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q2b0(Object obj, Map map) {
        this.c = obj;
        this.w = map;
    }

    public q2b0(pyu0 pyu0Var) {
        this.w = pyu0Var;
        this.c = pyu0Var.a.iterator();
    }
}
