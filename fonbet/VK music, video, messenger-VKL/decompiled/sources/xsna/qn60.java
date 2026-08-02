package xsna;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptySet;
import xsna.svh0;

/* compiled from: NewsfeedItemsUiDataSet.kt */
/* loaded from: classes4.dex */
public final class qn60 {
    public final yzs<List<? extends ol60>, Integer, ol60, nl60> a;
    public final ux80<Object, List<ol60>> b = new ux80<>();
    public final uvh0 c = new uvh0();
    public final a d = new a(this);

    /* compiled from: NewsfeedItemsUiDataSet.kt */
    public static final class a {
        public final qn60 a;

        public a(qn60 qn60Var) {
            this.a = qn60Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public static void n(List list, List list2) {
            z1c0 z1c0Var;
            if (list2 == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ol60 ol60Var = (ol60) it.next();
                if (ol60Var instanceof z1c0) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z1c0Var = 0;
                            break;
                        }
                        z1c0Var = it2.next();
                        ol60 ol60Var2 = (ol60) z1c0Var;
                        if ((ol60Var2 instanceof z1c0) && epx.f(((z1c0) ol60Var2).h, ((z1c0) ol60Var).h)) {
                            break;
                        }
                    }
                    z1c0 z1c0Var2 = z1c0Var instanceof z1c0 ? z1c0Var : null;
                    if (z1c0Var2 != null) {
                        u1c0 u1c0Var = ((z1c0) ol60Var).h;
                        u1c0 u1c0Var2 = z1c0Var2.h;
                        if ((u1c0Var2 instanceof iko0) && (u1c0Var instanceof iko0)) {
                            iko0 iko0Var = (iko0) u1c0Var;
                            iko0 iko0Var2 = (iko0) u1c0Var2;
                            iko0Var.v = iko0Var2.v;
                            iko0Var.r = iko0Var2.r;
                            iko0Var.q = iko0Var2.q;
                            iko0Var.u = iko0Var2.u;
                        } else if ((u1c0Var2 instanceof f28) && (u1c0Var instanceof f28)) {
                            ((f28) u1c0Var).q = ((f28) u1c0Var2).q;
                        }
                        Object obj = u1c0Var.g;
                        if (obj == null) {
                            obj = u1c0Var2.g;
                        }
                        u1c0Var.g = obj;
                    }
                }
            }
        }

        public final void a() {
            qn60 qn60Var = this.a;
            qn60Var.b.clear();
            Iterator<T> it = qn60Var.c.a.values().iterator();
            while (it.hasNext()) {
                ((svh0) it.next()).clear();
            }
        }

        public final boolean b(Object obj) {
            return this.a.b.b.b(obj);
        }

        public final HashSet c(svh0.a aVar) {
            uvh0 uvh0Var = this.a.c;
            rfc a = fpf0.a(aVar.getClass());
            HashMap<dcy<?>, svh0<?, ?>> hashMap = uvh0Var.a;
            if (hashMap.containsKey(a)) {
                Set<?> a2 = hashMap.get(a).a(aVar);
                if (a2 == null) {
                    return null;
                }
                return new HashSet(a2);
            }
            throw new IllegalArgumentException("Index with key type " + a + " is not registered");
        }

        public final Object d(rfc rfcVar) {
            Object obj;
            ArrayList arrayList = this.a.b.c;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i);
                if (fpf0.a(obj.getClass()).equals(rfcVar)) {
                    break;
                }
                i++;
            }
            if (obj == null) {
                return null;
            }
            return obj;
        }

        public final <T> void e(T t, izs<? super T, ? extends List<? extends ol60>> izsVar) {
            qn60 qn60Var = this.a;
            ux80<Object, List<ol60>> ux80Var = qn60Var.b;
            List<ol60> d = ux80Var.b.d(t);
            List<ol60> list = (List) izsVar.invoke(t);
            n(list, d);
            ux80Var.put(t, list);
            qn60Var.c.a(t);
        }

        public final <T> void f(Collection<? extends T> collection, izs<? super T, ? extends List<? extends ol60>> izsVar) {
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                e(it.next(), izsVar);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> void g(T t, izs<? super T, ? extends List<? extends ol60>> izsVar, izs<Object, Boolean> izsVar2) {
            qn60 qn60Var = this.a;
            ux80<Object, List<ol60>> ux80Var = qn60Var.b;
            if (ux80Var.b.f()) {
                e(t, izsVar);
                return;
            }
            int size = ux80Var.c.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = ux80Var.c.get(i2);
                Object d = ux80Var.b.d(obj);
                if (d != null) {
                    boolean booleanValue = izsVar2.invoke(obj).booleanValue();
                    if (!booleanValue) {
                        i = i2;
                    }
                    if (!booleanValue) {
                        break;
                    }
                }
            }
            ux80Var.a(i, t, izsVar.invoke(t));
            qn60Var.c.a(t);
        }

        public final <T> void h(T t) {
            qn60 qn60Var = this.a;
            qn60Var.b.remove(t);
            qn60Var.c.b(t);
        }

        public final <T> void i(Collection<? extends T> collection) {
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                h(it.next());
            }
        }

        public final void j(rfc rfcVar) {
            Object d = d(rfcVar);
            if (d == null) {
                return;
            }
            h(d);
        }

        public final <T> void k(Object obj, T t, izs<? super T, ? extends List<? extends ol60>> izsVar) {
            qn60 qn60Var = this.a;
            ux80<Object, List<ol60>> ux80Var = qn60Var.b;
            uvh0 uvh0Var = qn60Var.c;
            if (b(obj)) {
                uvh0Var.b(obj);
                List<ol60> d = ux80Var.b.d(obj);
                List<ol60> list = (List) izsVar.invoke(t);
                n(list, d);
                ux80Var.b(obj, t, list);
                uvh0Var.a(t);
            }
        }

        public final <T> void l(List<? extends T> list, izs<? super T, ? extends List<? extends ol60>> izsVar) {
            qn60 qn60Var = this.a;
            ux80<Object, List<ol60>> ux80Var = qn60Var.b;
            uvh0 uvh0Var = qn60Var.c;
            for (Object obj : list) {
                if (b(obj)) {
                    uvh0Var.b(obj);
                    List<ol60> d = ux80Var.b.d(obj);
                    List<ol60> list2 = (List) izsVar.invoke(obj);
                    n(list2, d);
                    ux80Var.put(obj, list2);
                    uvh0Var.a(obj);
                }
            }
        }

        public final void m(izs<Object, Boolean> izsVar, wzs<Object, ? super List<? extends ol60>, ? extends List<? extends ol60>> wzsVar) {
            HashMap hashMap = new HashMap();
            qn60 qn60Var = this.a;
            uvh0 uvh0Var = qn60Var.c;
            ux80<Object, List<ol60>> ux80Var = qn60Var.b;
            for (Map.Entry<Object, List<ol60>> entry : ux80Var.entrySet()) {
                Object key = entry.getKey();
                List<ol60> value = entry.getValue();
                List<ol60> d = ux80Var.b.d(key);
                if (izsVar.invoke(key).booleanValue()) {
                    uvh0Var.b(key);
                    List<? extends ol60> invoke = wzsVar.invoke(key, value);
                    n(invoke, d);
                    hashMap.put(key, invoke);
                    uvh0Var.a(key);
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                ux80Var.put(entry2.getKey(), (List) entry2.getValue());
            }
        }
    }

    /* compiled from: NewsfeedItemsUiDataSet.kt */
    public interface b {
        void a(a aVar);
    }

    /* compiled from: NewsfeedItemsUiDataSet.kt */
    public static final class c {
        public final ArrayList a;
        public final og50 b;

        public c(ArrayList arrayList, og50 og50Var) {
            this.a = arrayList;
            this.b = og50Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qn60(yzs<? super List<? extends ol60>, ? super Integer, ? super ol60, nl60> yzsVar) {
        this.a = yzsVar;
    }

    public final synchronized void a() {
        this.d.a();
    }

    public final synchronized Serializable b(svh0.a aVar) {
        Serializable failure;
        try {
            failure = this.d.c(aVar);
            if (failure == null) {
                failure = EmptySet.b;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return failure;
    }

    public final synchronized LinkedHashSet c() {
        return new LinkedHashSet(this.b.c);
    }

    public final synchronized boolean d(List<? extends Object> list) {
        ArrayList arrayList = this.b.c;
        if (list.size() > arrayList.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!epx.f(list.get(i), arrayList.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final void e(svh0 svh0Var, rfc rfcVar) {
        this.c.a.put(rfcVar, svh0Var);
    }

    public final synchronized Object f(b... bVarArr) {
        Object failure;
        try {
            int i = 0;
            for (b bVar : bVarArr) {
                bVar.a(this.d);
            }
            ArrayList v = c5g.v(this.b.values());
            og50 og50Var = new og50();
            Iterator it = v.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                long j = this.a.invoke(v, Integer.valueOf(i), (ol60) next).a;
                if (j != 0) {
                    og50Var.f(i, j);
                }
                i = i2;
            }
            failure = new c(v, og50Var);
        } finally {
            return failure;
        }
        return failure;
    }
}
