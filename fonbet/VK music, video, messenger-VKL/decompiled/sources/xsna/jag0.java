package xsna;

import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import xsna.b330;
import xsna.buk;
import xsna.klp;

/* compiled from: ResourceCacheGenerator.java */
/* loaded from: classes12.dex */
public final class jag0 implements cuk, buk.a<Object> {
    public final r7l b;
    public final q7l<?> c;
    public int d;
    public int e = -1;
    public ady f;
    public List<b330<File, ?>> g;
    public int h;
    public volatile b330.a<?> i;
    public File j;
    public kag0 k;

    public jag0(q7l q7lVar, r7l r7lVar) {
        this.c = q7lVar;
        this.b = r7lVar;
    }

    @Override // xsna.cuk
    public final boolean a() {
        List list;
        ArrayList c;
        ArrayList a = this.c.a();
        boolean z = false;
        if (!a.isEmpty()) {
            q7l<?> q7lVar = this.c;
            Registry a2 = q7lVar.c.a();
            Class<?> cls = q7lVar.d.getClass();
            Class<?> cls2 = q7lVar.g;
            Class<?> cls3 = q7lVar.k;
            dyz0 dyz0Var = a2.h;
            z440 z440Var = (z440) ((AtomicReference) dyz0Var.a).getAndSet(null);
            if (z440Var == null) {
                z440Var = new z440(cls, cls2, cls3);
            } else {
                z440Var.a = cls;
                z440Var.b = cls2;
                z440Var.c = cls3;
            }
            synchronized (((zk3) dyz0Var.b)) {
                list = (List) ((zk3) dyz0Var.b).get(z440Var);
            }
            ((AtomicReference) dyz0Var.a).set(z440Var);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                d330 d330Var = a2.a;
                synchronized (d330Var) {
                    c = d330Var.a.c(cls);
                }
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    Iterator it2 = a2.c.b((Class) it.next(), cls2).iterator();
                    while (it2.hasNext()) {
                        Class cls4 = (Class) it2.next();
                        if (!a2.f.a(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                dyz0 dyz0Var2 = a2.h;
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((zk3) dyz0Var2.b)) {
                    ((zk3) dyz0Var2.b).put(new z440(cls, cls2, cls3), unmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List<b330<File, ?>> list3 = this.g;
                    if (list3 != null && this.h < list3.size()) {
                        this.i = null;
                        while (!z && this.h < this.g.size()) {
                            List<b330<File, ?>> list4 = this.g;
                            int i = this.h;
                            this.h = i + 1;
                            b330<File, ?> b330Var = list4.get(i);
                            File file = this.j;
                            q7l<?> q7lVar2 = this.c;
                            this.i = b330Var.a(file, q7lVar2.e, q7lVar2.f, q7lVar2.i);
                            if (this.i != null && this.c.c(this.i.c.b()) != null) {
                                this.i.c.d(this.c.o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.e + 1;
                    this.e = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.d + 1;
                        this.d = i3;
                        if (i3 >= a.size()) {
                            break;
                        }
                        this.e = 0;
                    }
                    ady adyVar = (ady) a.get(this.d);
                    Class cls5 = (Class) list2.get(this.e);
                    clp0<Z> e = this.c.e(cls5);
                    q7l<?> q7lVar3 = this.c;
                    this.k = new kag0(q7lVar3.c.a, adyVar, q7lVar3.n, q7lVar3.e, q7lVar3.f, e, cls5, q7lVar3.i);
                    File c2 = ((klp.c) q7lVar3.h).a().c(this.k);
                    this.j = c2;
                    if (c2 != null) {
                        this.f = adyVar;
                        this.g = this.c.c.a().f(c2);
                        this.h = 0;
                    }
                }
            } else if (!File.class.equals(this.c.k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.c.d.getClass() + " to " + this.c.k);
            }
        }
        return false;
    }

    @Override // xsna.buk.a
    public final void c(Object obj) {
        this.b.c(this.f, obj, this.i.c, DataSource.RESOURCE_DISK_CACHE, this.k);
    }

    @Override // xsna.cuk
    public final void cancel() {
        b330.a<?> aVar = this.i;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // xsna.buk.a
    public final void f(@NonNull Exception exc) {
        this.b.b(this.k, exc, this.i.c, DataSource.RESOURCE_DISK_CACHE);
    }
}
