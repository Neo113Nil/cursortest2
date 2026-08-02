package xsna;

import java.util.ArrayList;
import xsna.cq70;

/* compiled from: FirstAvailableDataSourceSupplier.java */
/* loaded from: classes12.dex */
public final class alr<T> implements yhn0<zuk<T>> {
    public final ArrayList a;

    public alr(ArrayList arrayList) {
        sex0.b("List of suppliers is empty!", !arrayList.isEmpty());
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alr) {
            return cq70.a(this.a, ((alr) obj).a);
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

    /* compiled from: FirstAvailableDataSourceSupplier.java */
    public class a extends ae<T> {
        public int h = 0;
        public zuk<T> i = null;
        public zuk<T> j = null;

        public a() {
            if (n()) {
                return;
            }
            h(new RuntimeException("No data source supplier or supplier returned null."), null);
        }

        public static void l(a aVar, zuk zukVar) {
            zuk<T> zukVar2;
            synchronized (aVar) {
                if (!aVar.f() && zukVar == aVar.i) {
                    aVar.i = null;
                    synchronized (aVar) {
                        zukVar2 = aVar.j;
                    }
                    if (zukVar != zukVar2) {
                        zukVar.close();
                    }
                    if (aVar.n()) {
                        return;
                    }
                    aVar.h(zukVar.b(), zukVar.getExtras());
                }
            }
        }

        public static void m(zuk zukVar) {
            if (zukVar != null) {
                zukVar.close();
            }
        }

        @Override // xsna.ae, xsna.zuk
        public final synchronized boolean a() {
            zuk<T> zukVar;
            synchronized (this) {
                zukVar = this.j;
            }
            return zukVar != null && zukVar.a();
            return zukVar != null && zukVar.a();
        }

        @Override // xsna.ae, xsna.zuk
        public final boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    zuk<T> zukVar = this.i;
                    this.i = null;
                    zuk<T> zukVar2 = this.j;
                    this.j = null;
                    m(zukVar2);
                    m(zukVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.ae, xsna.zuk
        public final synchronized T getResult() {
            zuk<T> zukVar;
            synchronized (this) {
                zukVar = this.j;
            }
            return zukVar != null ? zukVar.getResult() : null;
            return zukVar != null ? zukVar.getResult() : null;
        }

        public final boolean n() {
            yhn0 yhn0Var;
            synchronized (this) {
                if (f() || this.h >= alr.this.a.size()) {
                    yhn0Var = null;
                } else {
                    ArrayList arrayList = alr.this.a;
                    int i = this.h;
                    this.h = i + 1;
                    yhn0Var = (yhn0) arrayList.get(i);
                }
            }
            zuk<T> zukVar = yhn0Var != null ? (zuk) yhn0Var.get() : null;
            synchronized (this) {
                if (!f()) {
                    this.i = zukVar;
                    if (zukVar != null) {
                        zukVar.d(new C2549a(), ac9.b);
                        return true;
                    }
                }
            }
            if (zukVar == null) {
                return false;
            }
            zukVar.close();
            return false;
        }

        /* compiled from: FirstAvailableDataSourceSupplier.java */
        /* renamed from: xsna.alr$a$a, reason: collision with other inner class name */
        public class C2549a implements vvk<T> {
            public C2549a() {
            }

            @Override // xsna.vvk
            public final void b(zuk<T> zukVar) {
                a aVar = a.this;
                aVar.i(Math.max(aVar.getProgress(), zukVar.getProgress()));
            }

            @Override // xsna.vvk
            public final void c(zuk<T> zukVar) {
                a.l(a.this, zukVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
            @Override // xsna.vvk
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(zuk<T> zukVar) {
                zuk<T> zukVar2;
                zuk<T> zukVar3;
                if (!zukVar.a()) {
                    if (zukVar.c()) {
                        a.l(a.this, zukVar);
                        return;
                    }
                    return;
                }
                a aVar = a.this;
                boolean c = zukVar.c();
                synchronized (aVar) {
                    if (zukVar == aVar.i && zukVar != (zukVar3 = aVar.j)) {
                        if (zukVar3 != null && !c) {
                            zukVar3 = null;
                            if (zukVar3 != null) {
                                zukVar3.close();
                            }
                        }
                        aVar.j = zukVar;
                        if (zukVar3 != null) {
                        }
                    }
                }
                synchronized (aVar) {
                    zukVar2 = aVar.j;
                }
                if (zukVar == zukVar2) {
                    aVar.j(null, zukVar.c(), zukVar.getExtras());
                }
            }

            @Override // xsna.vvk
            public final void a() {
            }
        }
    }
}
