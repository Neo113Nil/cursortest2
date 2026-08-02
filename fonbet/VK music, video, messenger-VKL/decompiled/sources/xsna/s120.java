package xsna;

import java.util.Iterator;
import java.util.Map;
import xsna.lzg0;

/* compiled from: MediatorLiveData.java */
/* loaded from: classes.dex */
public class s120<T> extends ug50<T> {
    public final lzg0<androidx.lifecycle.n<?>, a<?>> l = new lzg0<>();

    /* compiled from: MediatorLiveData.java */
    public static class a<V> implements fr70<V> {
        public final androidx.lifecycle.n<V> b;
        public final fr70<? super V> c;
        public int d = -1;

        public a(androidx.lifecycle.n<V> nVar, fr70<? super V> fr70Var) {
            this.b = nVar;
            this.c = fr70Var;
        }

        @Override // xsna.fr70
        public final void a(V v) {
            int i = this.d;
            int i2 = this.b.g;
            if (i != i2) {
                this.d = i2;
                this.c.a(v);
            }
        }

        public final void b() {
            this.b.f(this);
        }
    }

    @Override // androidx.lifecycle.n
    public final void g() {
        Iterator<Map.Entry<androidx.lifecycle.n<?>, a<?>>> it = this.l.iterator();
        while (true) {
            lzg0.e eVar = (lzg0.e) it;
            if (!eVar.hasNext()) {
                return;
            } else {
                ((a) ((Map.Entry) eVar.next()).getValue()).b();
            }
        }
    }

    @Override // androidx.lifecycle.n
    public final void h() {
        Iterator<Map.Entry<androidx.lifecycle.n<?>, a<?>>> it = this.l.iterator();
        while (true) {
            lzg0.e eVar = (lzg0.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.b.j(aVar);
        }
    }

    public <S> void l(androidx.lifecycle.n<S> nVar, fr70<? super S> fr70Var) {
        a<?> aVar;
        if (nVar == null) {
            throw new NullPointerException("source cannot be null");
        }
        a aVar2 = new a(nVar, fr70Var);
        lzg0<androidx.lifecycle.n<?>, a<?>> lzg0Var = this.l;
        lzg0.c<androidx.lifecycle.n<?>, a<?>> a2 = lzg0Var.a(nVar);
        if (a2 != null) {
            aVar = a2.c;
        } else {
            lzg0.c<K, V> cVar = new lzg0.c<>(nVar, aVar2);
            lzg0Var.e++;
            lzg0.c cVar2 = lzg0Var.c;
            if (cVar2 == null) {
                lzg0Var.b = cVar;
                lzg0Var.c = cVar;
            } else {
                cVar2.d = cVar;
                cVar.e = cVar2;
                lzg0Var.c = cVar;
            }
            aVar = null;
        }
        a<?> aVar3 = aVar;
        if (aVar3 != null && aVar3.c != fr70Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVar3 == null && this.c > 0) {
            aVar2.b();
        }
    }
}
