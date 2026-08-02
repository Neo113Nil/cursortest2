package defpackage;

import android.content.Context;
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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class n1d implements a1d {
    public static final l1d h = new l1d(0);
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public n1d(Executor executor, ArrayList arrayList, ArrayList arrayList2, i1d i1dVar) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        weo weoVar = new weo(executor);
        this.e = weoVar;
        this.g = i1dVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(j0d.c(weoVar, weo.class, vzu0.class, xyf0.class));
        int i = 0;
        arrayList3.add(j0d.c(this, n1d.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            j0d j0dVar = (j0d) it.next();
            if (j0dVar != null) {
                arrayList3.add(j0dVar);
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((zvf0) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((i1d) this.g).c(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException unused) {
                    it3.remove();
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((j0d) it4.next()).b.toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.d).contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            ((HashSet) this.d).add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (((HashMap) this.a).isEmpty()) {
                udq0.l(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.a).keySet());
                arrayList6.addAll(arrayList3);
                udq0.l(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                j0d j0dVar2 = (j0d) it5.next();
                ((HashMap) this.a).put(j0dVar2, new j3y(new m1d(i, this, j0dVar2)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f).get();
        if (bool != null) {
            h((HashMap) this.a, bool.booleanValue());
        }
    }

    @Override // defpackage.a1d
    public synchronized zvf0 b(jgg0 jgg0Var) {
        f7y f7yVar = (f7y) ((HashMap) this.c).get(jgg0Var);
        if (f7yVar != null) {
            return f7yVar;
        }
        return h;
    }

    @Override // defpackage.a1d
    public cg70 e(jgg0 jgg0Var) {
        zvf0 f = f(jgg0Var);
        return f == null ? new cg70(cg70.c, cg70.d) : f instanceof cg70 ? (cg70) f : new cg70(null, f);
    }

    @Override // defpackage.a1d
    public synchronized zvf0 f(jgg0 jgg0Var) {
        jhe0.a(jgg0Var, "Null interface requested.");
        return (zvf0) ((HashMap) this.b).get(jgg0Var);
    }

    public void h(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            j0d j0dVar = (j0d) entry.getKey();
            zvf0 zvf0Var = (zvf0) entry.getValue();
            int i = j0dVar.d;
            if (i == 1 || (i == 2 && z)) {
                zvf0Var.get();
            }
        }
        weo weoVar = (weo) this.e;
        synchronized (weoVar) {
            try {
                arrayDeque = weoVar.b;
                if (arrayDeque != null) {
                    weoVar.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw unr0.i(it);
            }
        }
    }

    public void i(boolean z) {
        HashMap hashMap;
        AtomicReference atomicReference = (AtomicReference) this.f;
        Boolean valueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap((HashMap) this.a);
        }
        h(hashMap, z);
    }

    public void j() {
        HashMap hashMap = (HashMap) this.b;
        HashMap hashMap2 = (HashMap) this.c;
        for (j0d j0dVar : ((HashMap) this.a).keySet()) {
            for (vwi vwiVar : j0dVar.c) {
                boolean z = vwiVar.b == 2;
                jgg0 jgg0Var = vwiVar.a;
                if (z && !hashMap2.containsKey(jgg0Var)) {
                    Set set = Collections.EMPTY_SET;
                    f7y f7yVar = new f7y();
                    f7yVar.b = null;
                    f7yVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    f7yVar.a.addAll(set);
                    hashMap2.put(jgg0Var, f7yVar);
                } else if (hashMap.containsKey(jgg0Var)) {
                    continue;
                } else {
                    int i = vwiVar.b;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + j0dVar + Extension.COLON_SPACE + jgg0Var);
                    }
                    if (i != 2) {
                        hashMap.put(jgg0Var, new cg70(cg70.c, cg70.d));
                    }
                }
            }
        }
    }

    public ArrayList k(ArrayList arrayList) {
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j0d j0dVar = (j0d) it.next();
            if (j0dVar.e == 0) {
                zvf0 zvf0Var = (zvf0) ((HashMap) this.a).get(j0dVar);
                for (jgg0 jgg0Var : j0dVar.b) {
                    if (hashMap.containsKey(jgg0Var)) {
                        arrayList2.add(new iy2(5, (cg70) ((zvf0) hashMap.get(jgg0Var)), zvf0Var));
                    } else {
                        hashMap.put(jgg0Var, zvf0Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    public ArrayList l() {
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            j0d j0dVar = (j0d) entry.getKey();
            if (j0dVar.e != 0) {
                zvf0 zvf0Var = (zvf0) entry.getValue();
                for (jgg0 jgg0Var : j0dVar.b) {
                    if (!hashMap2.containsKey(jgg0Var)) {
                        hashMap2.put(jgg0Var, new HashSet());
                    }
                    ((Set) hashMap2.get(jgg0Var)).add(zvf0Var);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                f7y f7yVar = (f7y) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new iy2(6, f7yVar, (zvf0) it.next()));
                }
            } else {
                jgg0 jgg0Var2 = (jgg0) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                f7y f7yVar2 = new f7y();
                f7yVar2.b = null;
                f7yVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                f7yVar2.a.addAll(set);
                hashMap.put(jgg0Var2, f7yVar2);
            }
        }
        return arrayList;
    }

    public n1d(Context context, LinkedHashMap linkedHashMap, ja2 ja2Var, rcz rczVar, c7z c7zVar) {
        this.a = context;
        this.b = linkedHashMap;
        this.c = ja2Var;
        this.d = rczVar;
        this.e = c7zVar;
        final int i = 0;
        this.f = a.a(new sls(this) { // from class: lc2
            public final /* synthetic */ n1d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                n1d n1dVar = this.b;
                switch (i2) {
                    case 0:
                        return new ru.yandex.taxi.locationsdk.locationprovider.android.a((Context) n1dVar.a, (rcz) n1dVar.d, (LinkedHashMap) n1dVar.b);
                    default:
                        return new fa2((c7z) n1dVar.e, (ja2) n1dVar.c);
                }
            }
        });
        final int i2 = 1;
        this.g = a.a(new sls(this) { // from class: lc2
            public final /* synthetic */ n1d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                n1d n1dVar = this.b;
                switch (i22) {
                    case 0:
                        return new ru.yandex.taxi.locationsdk.locationprovider.android.a((Context) n1dVar.a, (rcz) n1dVar.d, (LinkedHashMap) n1dVar.b);
                    default:
                        return new fa2((c7z) n1dVar.e, (ja2) n1dVar.c);
                }
            }
        });
    }

    public /* synthetic */ n1d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
    }
}
