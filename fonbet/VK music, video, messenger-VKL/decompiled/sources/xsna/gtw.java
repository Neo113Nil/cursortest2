package xsna;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.cq70;

/* compiled from: IncreasingQualityDataSourceSupplier.java */
/* loaded from: classes12.dex */
public final class gtw<T> implements yhn0<zuk<T>> {
    public final ArrayList a;

    public gtw(ArrayList arrayList) {
        sex0.b("List of suppliers is empty!", !arrayList.isEmpty());
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gtw) {
            return cq70.a(this.a, ((gtw) obj).a);
        }
        return false;
    }

    @Override // xsna.yhn0
    public final Object get() {
        return new a();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        cq70.a b = cq70.b(this);
        b.d(this.a, "list");
        return b.toString();
    }

    /* compiled from: IncreasingQualityDataSourceSupplier.java */
    public class a extends ae<T> {
        public ArrayList<zuk<T>> h;
        public int i;
        public int j;
        public AtomicInteger k;
        public Throwable l;
        public Map<String, Object> m;

        public a() {
            if (this.k != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.k == null) {
                        this.k = new AtomicInteger(0);
                        int size = gtw.this.a.size();
                        this.j = size;
                        this.i = size;
                        this.h = new ArrayList<>(size);
                        for (int i = 0; i < size; i++) {
                            zuk<T> zukVar = (zuk) ((yhn0) gtw.this.a.get(i)).get();
                            this.h.add(zukVar);
                            zukVar.d(new C2957a(i), ac9.b);
                            if (!zukVar.a()) {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public static void l(a aVar, int i, zuk zukVar) {
            zuk m;
            Throwable th;
            synchronized (aVar) {
                m = zukVar == aVar.o() ? null : zukVar == aVar.n(i) ? aVar.m(i) : zukVar;
            }
            if (m != null) {
                m.close();
            }
            if (i == 0) {
                aVar.l = zukVar.b();
                aVar.m = zukVar.getExtras();
            }
            if (aVar.k.incrementAndGet() != aVar.j || (th = aVar.l) == null) {
                return;
            }
            aVar.h(th, aVar.m);
        }

        @Override // xsna.ae, xsna.zuk
        public final synchronized boolean a() {
            boolean z;
            zuk<T> o = o();
            if (o != null) {
                z = o.a();
            }
            return z;
        }

        @Override // xsna.ae, xsna.zuk
        public final boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList<zuk<T>> arrayList = this.h;
                    this.h = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        zuk<T> zukVar = arrayList.get(i);
                        if (zukVar != null) {
                            zukVar.close();
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.ae, xsna.zuk
        public final synchronized T getResult() {
            zuk<T> o;
            o = o();
            return o != null ? o.getResult() : null;
        }

        public final synchronized zuk<T> m(int i) {
            zuk<T> zukVar;
            ArrayList<zuk<T>> arrayList = this.h;
            zukVar = null;
            if (arrayList != null && i < arrayList.size()) {
                zukVar = this.h.set(i, null);
            }
            return zukVar;
        }

        public final synchronized zuk<T> n(int i) {
            ArrayList<zuk<T>> arrayList;
            arrayList = this.h;
            return (arrayList == null || i >= arrayList.size()) ? null : this.h.get(i);
        }

        public final synchronized zuk<T> o() {
            return n(this.i);
        }

        /* compiled from: IncreasingQualityDataSourceSupplier.java */
        /* renamed from: xsna.gtw$a$a, reason: collision with other inner class name */
        public class C2957a implements vvk<T> {
            public final int a;

            public C2957a(int i) {
                this.a = i;
            }

            @Override // xsna.vvk
            public final void b(zuk<T> zukVar) {
                if (this.a == 0) {
                    a.this.i(zukVar.getProgress());
                }
            }

            @Override // xsna.vvk
            public final void c(zuk<T> zukVar) {
                a.l(a.this, this.a, zukVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
            @Override // xsna.vvk
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(zuk<T> zukVar) {
                Throwable th;
                int i;
                if (!zukVar.a()) {
                    if (zukVar.c()) {
                        a.l(a.this, this.a, zukVar);
                        return;
                    }
                    return;
                }
                a aVar = a.this;
                int i2 = this.a;
                boolean c = zukVar.c();
                synchronized (aVar) {
                    try {
                        int i3 = aVar.i;
                        if (zukVar == aVar.n(i2) && i2 != aVar.i) {
                            if (aVar.o() != null && (!c || i2 >= aVar.i)) {
                                i = i3;
                                while (i3 > i) {
                                    zuk<T> m = aVar.m(i3);
                                    if (m != null) {
                                        m.close();
                                    }
                                    i3--;
                                }
                            }
                            aVar.i = i2;
                            i = i2;
                            while (i3 > i) {
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (zukVar == aVar.o()) {
                    aVar.j(null, i2 == 0 && zukVar.c(), zukVar.getExtras());
                }
                if (aVar.k.incrementAndGet() != aVar.j || (th = aVar.l) == null) {
                    return;
                }
                aVar.h(th, aVar.m);
            }

            @Override // xsna.vvk
            public final void a() {
            }
        }
    }
}
