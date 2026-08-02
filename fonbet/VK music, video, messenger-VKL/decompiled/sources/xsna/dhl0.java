package xsna;

import android.util.LruCache;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: StorageMemCacheByIdHelper.kt */
/* loaded from: classes2.dex */
public class dhl0<T, K> {
    public final int a;
    public final cil0<T> b;
    public final izs<T, K> c;
    public final izs<Collection<? extends K>, Map<K, T>> d;
    public final izs<Collection<? extends T>, s3q0> e;
    public final xgl0 f;
    public final LruCache<K, T> g;
    public final ArrayList<K> h = new ArrayList<>();
    public final ArrayList<T> i = new ArrayList<>();

    /* JADX WARN: Multi-variable type inference failed */
    public dhl0(int i, cil0<? super T> cil0Var, izs<? super T, ? extends K> izsVar, izs<? super Collection<? extends K>, ? extends Map<K, ? extends T>> izsVar2, izs<? super Collection<? extends T>, s3q0> izsVar3, xgl0 xgl0Var) {
        this.a = i;
        this.b = cil0Var;
        this.c = izsVar;
        this.d = izsVar2;
        this.e = izsVar3;
        this.f = xgl0Var;
        this.g = new LruCache<>(i);
    }

    public final void a(Serializable serializable, izs izsVar, izs izsVar2) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        this.f.u(new la8(this, serializable, ref$ObjectRef, izsVar, ref$ObjectRef2, izsVar2, 1));
        T t = ref$ObjectRef2.element;
        if (t != null) {
            T t2 = ref$ObjectRef.element;
            cil0<T> cil0Var = this.b;
            if (cil0Var != null) {
                cil0Var.c(Collections.singletonList(new hhl0(t2, t)));
            }
        }
    }

    public final void b(final Collection<? extends K> collection, final izs<? super T, ? extends T> izsVar, final izs<? super Collection<? extends T>, s3q0> izsVar2) {
        cil0<T> cil0Var;
        final ArrayList arrayList = new ArrayList();
        this.f.u(new izs() { // from class: xsna.chl0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                dhl0 dhl0Var = dhl0.this;
                Collection collection2 = collection;
                izs izsVar3 = izsVar2;
                izs izsVar4 = izsVar;
                ArrayList arrayList2 = arrayList;
                synchronized (dhl0Var.g) {
                    try {
                        Map e = dhl0Var.e(collection2);
                        dhl0Var.i.clear();
                        for (Object obj2 : e.values()) {
                            Object invoke = izsVar4.invoke(obj2);
                            if (!epx.f(obj2, invoke)) {
                                dhl0Var.i.add(invoke);
                                arrayList2.add(new hhl0(obj2, invoke));
                            }
                        }
                        if (!dhl0Var.i.isEmpty()) {
                            izsVar3.invoke(dhl0Var.i);
                            Iterator it = dhl0Var.i.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                dhl0Var.g.put(dhl0Var.c.invoke(next), next);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return s3q0.a;
            }
        });
        if (arrayList.isEmpty() || arrayList.isEmpty() || (cil0Var = this.b) == null) {
            return;
        }
        cil0Var.c(arrayList);
    }

    public final void c() {
        this.f.u(new z8l0(this, 1));
    }

    public final T d(K k) {
        T t = this.g.get(k);
        return t == null ? e(Collections.singletonList(k)).get(k) : t;
    }

    public final Map<K, T> e(Collection<? extends K> collection) {
        if (collection.isEmpty()) {
            return jgp.b;
        }
        return (Map) this.f.c(new twi0(5, this, collection));
    }

    public final void f(Collection<? extends T> collection) {
        cil0<T> cil0Var;
        if (collection.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f.u(new z63(this, collection, arrayList, 12));
        if (arrayList.isEmpty() || arrayList.isEmpty() || (cil0Var = this.b) == null) {
            return;
        }
        cil0Var.c(arrayList);
    }
}
