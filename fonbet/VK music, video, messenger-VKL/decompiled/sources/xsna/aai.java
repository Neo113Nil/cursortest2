package xsna;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import xsna.yrl;

/* compiled from: ComponentRuntime.java */
/* loaded from: classes.dex */
public final class aai implements x8i, f9i {
    public static final v9i h = new v9i();
    public final ayp e;
    public final m9i g;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference<Boolean> f = new AtomicReference<>();

    public aai(Executor executor, ArrayList arrayList, ArrayList arrayList2, m9i m9iVar) {
        ayp aypVar = new ayp(executor);
        this.e = aypVar;
        this.g = m9iVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(i8i.c(aypVar, ayp.class, bxm0.class, gfe0.class));
        arrayList3.add(i8i.c(this, f9i.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            i8i i8iVar = (i8i) it.next();
            if (i8iVar != null) {
                arrayList3.add(i8iVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((f9e0) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.g.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException unused) {
                    it3.remove();
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((i8i) it4.next()).b.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.d.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                ypk.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.a.keySet());
                arrayList6.addAll(arrayList3);
                ypk.a(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                final i8i i8iVar2 = (i8i) it5.next();
                this.a.put(i8iVar2, new cqy(new f9e0() { // from class: xsna.w9i
                    @Override // xsna.f9e0
                    public final Object get() {
                        i8i i8iVar3 = i8iVar2;
                        return i8iVar3.f.c(new lcg0(i8iVar3, aai.this));
                    }
                }));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = this.f.get();
        if (bool != null) {
            h(this.a, bool.booleanValue());
        }
    }

    @Override // xsna.x8i
    public final synchronized <T> f9e0<Set<T>> b(toe0<T> toe0Var) {
        mwy mwyVar = (mwy) this.c.get(toe0Var);
        if (mwyVar != null) {
            return mwyVar;
        }
        return h;
    }

    @Override // xsna.x8i
    public final synchronized <T> f9e0<T> d(toe0<T> toe0Var) {
        upj.a(toe0Var, "Null interface requested.");
        return (f9e0) this.b.get(toe0Var);
    }

    @Override // xsna.x8i
    public final <T> yrl<T> f(toe0<T> toe0Var) {
        f9e0<T> d = d(toe0Var);
        return d == null ? new yt80(yt80.c, yt80.d) : d instanceof yt80 ? (yt80) d : new yt80(null, d);
    }

    public final void h(HashMap hashMap, boolean z) {
        ArrayDeque<qxp> arrayDeque;
        Set<Map.Entry> entrySet;
        for (Map.Entry entry : hashMap.entrySet()) {
            i8i i8iVar = (i8i) entry.getKey();
            f9e0 f9e0Var = (f9e0) entry.getValue();
            int i = i8iVar.d;
            if (i == 1 || (i == 2 && z)) {
                f9e0Var.get();
            }
        }
        ayp aypVar = this.e;
        synchronized (aypVar) {
            try {
                arrayDeque = aypVar.b;
                if (arrayDeque != null) {
                    aypVar.b = null;
                } else {
                    arrayDeque = null;
                }
            } finally {
            }
        }
        if (arrayDeque != null) {
            for (qxp qxpVar : arrayDeque) {
                qxpVar.getClass();
                synchronized (aypVar) {
                    try {
                        ArrayDeque arrayDeque2 = aypVar.b;
                        if (arrayDeque2 != null) {
                            arrayDeque2.add(qxpVar);
                        } else {
                            synchronized (aypVar) {
                                try {
                                    Map map = (Map) aypVar.a.get(null);
                                    entrySet = map == null ? Collections.EMPTY_SET : map.entrySet();
                                } finally {
                                }
                            }
                            for (Map.Entry entry2 : entrySet) {
                                ((Executor) entry2.getValue()).execute(new ke9(3, entry2, qxpVar));
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public final void i(boolean z) {
        HashMap hashMap;
        AtomicReference<Boolean> atomicReference = this.f;
        Boolean valueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.a);
        }
        h(hashMap, z);
    }

    public final void j() {
        HashMap hashMap = this.b;
        HashMap hashMap2 = this.c;
        for (i8i i8iVar : this.a.keySet()) {
            for (gzl gzlVar : i8iVar.c) {
                boolean z = gzlVar.b == 2;
                toe0<?> toe0Var = gzlVar.a;
                if (z && !hashMap2.containsKey(toe0Var)) {
                    Set set = Collections.EMPTY_SET;
                    mwy mwyVar = new mwy();
                    mwyVar.b = null;
                    mwyVar.a = tj0.c();
                    mwyVar.a.addAll(set);
                    hashMap2.put(toe0Var, mwyVar);
                } else if (hashMap.containsKey(toe0Var)) {
                    continue;
                } else {
                    int i = gzlVar.b;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + i8iVar + ": " + toe0Var);
                    }
                    if (i != 2) {
                        hashMap.put(toe0Var, new yt80(yt80.c, yt80.d));
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i8i i8iVar = (i8i) it.next();
            if (i8iVar.e == 0) {
                final f9e0 f9e0Var = (f9e0) this.a.get(i8iVar);
                Iterator it2 = i8iVar.b.iterator();
                while (it2.hasNext()) {
                    toe0 toe0Var = (toe0) it2.next();
                    HashMap hashMap = this.b;
                    if (hashMap.containsKey(toe0Var)) {
                        final yt80 yt80Var = (yt80) ((f9e0) hashMap.get(toe0Var));
                        arrayList2.add(new Runnable() { // from class: xsna.x9i
                            @Override // java.lang.Runnable
                            public final void run() {
                                yrl.a<T> aVar;
                                yt80 yt80Var2 = yt80.this;
                                f9e0<T> f9e0Var2 = f9e0Var;
                                if (yt80Var2.b != yt80.d) {
                                    throw new IllegalStateException("provide() can be called only once.");
                                }
                                synchronized (yt80Var2) {
                                    aVar = yt80Var2.a;
                                    yt80Var2.a = null;
                                    yt80Var2.b = f9e0Var2;
                                }
                                aVar.a(f9e0Var2);
                            }
                        });
                    } else {
                        hashMap.put(toe0Var, f9e0Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList l() {
        HashMap hashMap = this.c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            i8i i8iVar = (i8i) entry.getKey();
            if (i8iVar.e != 0) {
                f9e0 f9e0Var = (f9e0) entry.getValue();
                Iterator it = i8iVar.b.iterator();
                while (it.hasNext()) {
                    toe0 toe0Var = (toe0) it.next();
                    if (!hashMap2.containsKey(toe0Var)) {
                        hashMap2.put(toe0Var, new HashSet());
                    }
                    ((Set) hashMap2.get(toe0Var)).add(f9e0Var);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                mwy mwyVar = (mwy) hashMap.get(entry2.getKey());
                Iterator it2 = ((Set) entry2.getValue()).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new y9i(0, mwyVar, (f9e0) it2.next()));
                }
            } else {
                toe0 toe0Var2 = (toe0) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                mwy mwyVar2 = new mwy();
                mwyVar2.b = null;
                mwyVar2.a = tj0.c();
                mwyVar2.a.addAll(set);
                hashMap.put(toe0Var2, mwyVar2);
            }
        }
        return arrayList;
    }
}
