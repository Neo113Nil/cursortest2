package xsna;

import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.b330;
import xsna.ejp;
import xsna.fjp0;
import xsna.nag0;
import xsna.r7l;

/* compiled from: DecodeHelper.java */
/* loaded from: classes12.dex */
public final class q7l<Transcode> {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public com.bumptech.glide.c c;
    public Object d;
    public int e;
    public int f;
    public Class<?> g;
    public r7l.d h;
    public au80 i;
    public Map<Class<?>, clp0<?>> j;
    public Class<Transcode> k;
    public boolean l;
    public boolean m;
    public ady n;
    public Priority o;
    public bbn p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList b = b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                b330.a aVar = (b330.a) b.get(i);
                ady adyVar = aVar.a;
                List<ady> list = aVar.b;
                if (!arrayList.contains(adyVar)) {
                    arrayList.add(aVar.a);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add(list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List f = this.c.a().f(this.d);
            int size = f.size();
            for (int i = 0; i < size; i++) {
                b330.a a = ((b330) f.get(i)).a(this.d, this.e, this.f, this.i);
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Data> fqz<Data, ?, Transcode> c(Class<Data> cls) {
        fqz<Data, ?, Transcode> fqzVar;
        Class<Data> cls2;
        Class<?> cls3;
        Class cls4;
        fqz<Data, ?, Transcode> fqzVar2;
        ArrayList arrayList;
        bbg0 bbg0Var;
        Class cls5 = cls;
        Registry a = this.c.a();
        Class<?> cls6 = this.g;
        Class cls7 = this.k;
        gqz gqzVar = a.i;
        z440 andSet = gqzVar.b.getAndSet(null);
        if (andSet == null) {
            andSet = new z440();
        }
        andSet.a = cls5;
        andSet.b = cls6;
        andSet.c = cls7;
        synchronized (gqzVar.a) {
            fqzVar = (fqz) gqzVar.a.get(andSet);
        }
        gqzVar.b.set(andSet);
        a.i.getClass();
        if (gqz.c.equals(fqzVar)) {
            return null;
        }
        if (fqzVar != null) {
            return fqzVar;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a.c.b(cls5, cls6).iterator();
        while (it.hasNext()) {
            Class<?> cls8 = (Class) it.next();
            Iterator it2 = a.f.a(cls8, cls7).iterator();
            while (it2.hasNext()) {
                Class cls9 = (Class) it2.next();
                nag0 nag0Var = a.c;
                synchronized (nag0Var) {
                    arrayList = new ArrayList();
                    Iterator it3 = nag0Var.a.iterator();
                    while (it3.hasNext()) {
                        List<nag0.a> list = (List) nag0Var.b.get((String) it3.next());
                        if (list != null) {
                            for (nag0.a aVar : list) {
                                if (aVar.a.isAssignableFrom(cls5) && cls8.isAssignableFrom(aVar.b)) {
                                    arrayList.add(aVar.c);
                                }
                            }
                        }
                    }
                }
                fjp0 fjp0Var = a.f;
                synchronized (fjp0Var) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        Iterator it4 = fjp0Var.a.iterator();
                        while (it4.hasNext()) {
                            fjp0.a aVar2 = (fjp0.a) it4.next();
                            if (aVar2.a.isAssignableFrom(cls8) && cls9.isAssignableFrom(aVar2.b)) {
                                bbg0Var = aVar2.c;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    bbg0Var = zq70.e;
                }
                arrayList2.add(new s7l(cls5, cls8, cls9, arrayList, bbg0Var, a.j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            fqzVar2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            fqzVar2 = new fqz<>(cls2, cls3, cls4, arrayList2, a.j);
        }
        gqz gqzVar2 = a.i;
        synchronized (gqzVar2.a) {
            gqzVar2.a.put(new z440(cls2, cls3, cls4), fqzVar2 != null ? fqzVar2 : gqz.c);
        }
        return fqzVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r1 = (xsna.yip<X>) r3.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <X> yip<X> d(X x) throws Registry.NoSourceEncoderAvailableException {
        yip<X> yipVar;
        ejp ejpVar = this.c.a().b;
        Class<?> cls = x.getClass();
        synchronized (ejpVar) {
            Iterator it = ejpVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    yipVar = null;
                    break;
                }
                ejp.a aVar = (ejp.a) it.next();
                if (aVar.a.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (yipVar != null) {
            return yipVar;
        }
        throw new Registry.NoSourceEncoderAvailableException(vr.b(x.getClass(), "Failed to find source encoder for data class: "));
    }

    public final <Z> clp0<Z> e(Class<Z> cls) {
        clp0<Z> clp0Var = (clp0) this.j.get(cls);
        if (clp0Var == null) {
            Iterator<Map.Entry<Class<?>, clp0<?>>> it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, clp0<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    clp0Var = (clp0) next.getValue();
                    break;
                }
            }
        }
        if (clp0Var != null) {
            return clp0Var;
        }
        if (!this.j.isEmpty() || !this.q) {
            return y3q0.b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
