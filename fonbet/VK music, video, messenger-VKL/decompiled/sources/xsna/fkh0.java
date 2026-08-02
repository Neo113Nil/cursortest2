package xsna;

import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import xsna.x9h0;

/* compiled from: SdkMeterProvider.java */
/* loaded from: classes8.dex */
public final class fkh0 implements cj20, Closeable {
    public static final Logger i = Logger.getLogger(fkh0.class.getName());
    public final List<mqf0> b;
    public final List<lqf0> c;
    public final List<cl20> d;
    public final ln5 e;
    public final u9i<dkh0> f;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final x9h0.b h;

    /* compiled from: SdkMeterProvider.java */
    public static class a implements cl20 {
        public final u9i<dkh0> a;
        public final dj20 b;
        public final lqf0 c;

        public a(u9i u9iVar, ln5 ln5Var, lqf0 lqf0Var) {
            this.a = u9iVar;
            this.b = ln5Var;
            this.c = lqf0Var;
        }

        @Override // xsna.cl20
        public final Collection a() {
            Collection<dkh0> unmodifiableCollection;
            ArrayList arrayList;
            Collection unmodifiableCollection2;
            List unmodifiableList;
            u9i<dkh0> u9iVar = this.a;
            synchronized (u9iVar.e) {
                unmodifiableCollection = Collections.unmodifiableCollection(new ArrayList(u9iVar.f));
            }
            ArrayList arrayList2 = new ArrayList();
            long r = ((gcd0) this.b.a()).r(true);
            for (dkh0 dkh0Var : unmodifiableCollection) {
                lqf0 lqf0Var = this.c;
                synchronized (dkh0Var.b) {
                    arrayList = new ArrayList(dkh0Var.c);
                }
                synchronized (dkh0Var.a) {
                    try {
                        if (dkh0Var.g) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((tb9) it.next()).a(lqf0Var, dkh0Var.d.d(), r);
                            }
                        }
                        gl20 gl20Var = dkh0Var.f.get(lqf0Var);
                        Objects.requireNonNull(gl20Var);
                        synchronized (gl20Var.a) {
                            unmodifiableCollection2 = Collections.unmodifiableCollection(new ArrayList(gl20Var.b.values()));
                        }
                        ArrayList arrayList3 = new ArrayList(unmodifiableCollection2.size());
                        Iterator it2 = unmodifiableCollection2.iterator();
                        while (it2.hasNext()) {
                            long j = r;
                            yk20 b = ((fl20) it2.next()).b(dkh0Var.d.c(), dkh0Var.e, dkh0Var.d.d(), j);
                            r = j;
                            if (!b.isEmpty()) {
                                arrayList3.add(b);
                            }
                        }
                        unmodifiableList = Collections.unmodifiableList(arrayList3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                arrayList2.addAll(unmodifiableList);
            }
            this.c.d = r;
            return Collections.unmodifiableCollection(arrayList2);
        }
    }

    /* compiled from: SdkMeterProvider.java */
    public static class b implements v4g {
        public final ArrayList b;
        public final dj20 c;

        public b(ArrayList arrayList, ln5 ln5Var) {
            this.b = arrayList;
            this.c = ln5Var;
        }

        @Override // xsna.v4g
        public final Collection<yk20> a() {
            ArrayList arrayList = this.b;
            if (arrayList.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            this.c.getClass();
            if (arrayList.size() == 1) {
                return ((cl20) arrayList.get(0)).a();
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.addAll(((cl20) it.next()).a());
            }
            return Collections.unmodifiableList(arrayList2);
        }
    }

    public fkh0(ArrayList arrayList, IdentityHashMap identityHashMap, ArrayList arrayList2, cvf cvfVar, gag0 gag0Var, edi ediVar, x9h0.b bVar) {
        int i2 = 1;
        long r = ((gcd0) cvfVar).r(true);
        this.b = arrayList;
        List<lqf0> list = (List) identityHashMap.entrySet().stream().map(new ax6(arrayList, i2)).collect(Collectors.toList());
        this.c = list;
        this.d = arrayList2;
        this.e = new ln5(cvfVar, gag0Var, r, ediVar);
        this.f = new u9i<>(new bx6(this, i2));
        this.h = bVar;
        for (lqf0 lqf0Var : list) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(new a(this.f, this.e, lqf0Var));
            dl20 dl20Var = lqf0Var.b;
            dl20Var.x1(new b(arrayList3, this.e));
            lqf0Var.d = r;
            if (dl20Var instanceof mx90) {
                mx90 mx90Var = (mx90) dl20Var;
                try {
                    Method declaredMethod = mx90.class.getDeclaredMethod("c", cj20.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(mx90Var, this);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw new IllegalStateException("Error calling setMeterProvider on PeriodicMetricReader", e);
                }
            }
        }
    }

    public static gkh0 n() {
        return new gkh0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v7i d;
        if (this.g.compareAndSet(false, true)) {
            List<lqf0> list = this.c;
            if (list.isEmpty()) {
                d = v7i.e;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<lqf0> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().b.shutdown());
                }
                d = v7i.d(arrayList);
            }
        } else {
            i.info("Multiple close calls");
            d = v7i.e;
        }
        d.c(10L, TimeUnit.SECONDS);
    }

    @Override // xsna.cj20
    public final aj20 meterBuilder(String str) {
        if (this.c.isEmpty()) {
            return sil.b.meterBuilder(str);
        }
        if (str == null || str.isEmpty()) {
            i.fine("Meter requested without instrumentation scope name.");
            str = "unknown";
        }
        return new ga10(this.f, str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkMeterProvider{clock=");
        ln5 ln5Var = this.e;
        sb.append(ln5Var.a);
        sb.append(", resource=");
        sb.append(ln5Var.b);
        sb.append(", metricReaders=");
        sb.append(this.c.stream().map(new ekh0()).collect(Collectors.toList()));
        sb.append(", metricProducers=");
        sb.append(this.d);
        sb.append(", views=");
        sb.append(this.b);
        sb.append(", meterConfigurator=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}
