package xsna;

import android.net.Uri;
import android.os.Handler;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import xsna.hfr;
import xsna.xal;

/* compiled from: PrefetchDelegate.kt */
/* loaded from: classes.dex */
public final class pzc0 {
    public final h9r a;
    public final tzc0 b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final bpn0 d = new bpn0(new xa3(this));
    public final bpn0 e = new bpn0(new x0f(6));
    public boolean f;

    /* compiled from: PrefetchDelegate.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public final Future<?> a;
        public final LinkedHashSet b;

        public a(Future future, LinkedHashSet linkedHashSet) {
            this.a = future;
            this.b = linkedHashSet;
        }

        public final Future<?> a() {
            return this.a;
        }

        public final Set<atr> b() {
            return this.b;
        }
    }

    /* compiled from: PrefetchDelegate.kt */
    /* loaded from: classes15.dex */
    public static final class b implements Runnable {
        public final /* synthetic */ bgk0 c;
        public final /* synthetic */ Collection d;

        public b(bgk0 bgk0Var, Collection collection) {
            this.c = bgk0Var;
            this.d = collection;
        }

        @Override // java.lang.Runnable
        public final void run() {
            tzc0 tzc0Var = pzc0.this.b;
            if (tzc0Var != null) {
                tzc0Var.c(this.c, this.d);
            }
        }
    }

    /* compiled from: PrefetchDelegate.kt */
    /* loaded from: classes15.dex */
    public static final class c implements Runnable {
        public final /* synthetic */ bgk0 c;
        public final /* synthetic */ List d;

        public c(bgk0 bgk0Var, List list) {
            this.c = bgk0Var;
            this.d = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            tzc0 tzc0Var = pzc0.this.b;
            if (tzc0Var != null) {
                tzc0Var.d(this.c, this.d);
            }
        }
    }

    public pzc0(h9r h9rVar, xal.e eVar) {
        this.a = h9rVar;
        this.b = eVar;
    }

    public final synchronized void a() {
        if (this.f) {
            throw new IllegalStateException("Instance already released");
        }
    }

    public final synchronized void b() {
        try {
            if (this.c.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = this.c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                ur4 ur4Var = (ur4) entry.getKey();
                a aVar = (a) entry.getValue();
                if (aVar.b().isEmpty()) {
                    arrayList.add(ur4Var);
                    arrayList2.add(aVar.a());
                    it.remove();
                }
            }
            if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                c().post(new rev(1, this, arrayList));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((Future) it2.next()).cancel(true);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Handler c() {
        return (Handler) this.e.getValue();
    }

    public final void d(ur4 ur4Var) {
        boolean z;
        boolean z2;
        boolean z3;
        hfr.a aVar = new hfr.a(rli0.j(new i5g(ur4Var.b()), new uuz(16)));
        while (true) {
            if (!aVar.hasNext()) {
                z = false;
                break;
            }
            try {
                z3 = new File(((Uri) aVar.next()).getPath()).canRead();
            } catch (Throwable unused) {
                z3 = false;
            }
            if (z3) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        hfr.a aVar2 = new hfr.a(rli0.j(new i5g(ur4Var.b()), new ept(21)));
        while (aVar2.hasNext()) {
            Uri uri = (Uri) aVar2.next();
            try {
                c().post(new qzc0(this, ur4Var, uri));
                this.a.a(uri, uri.toString());
                c().post(new rzc0(this, ur4Var, uri));
                z2 = true;
            } catch (Throwable th) {
                c().post(new szc0(this, ur4Var, uri, th));
                z2 = false;
            }
            if (z2) {
                return;
            }
        }
    }

    public final synchronized void e(bgk0 bgk0Var, atr atrVar, Collection<ur4> collection) {
        try {
            a();
            if (collection.isEmpty()) {
                return;
            }
            c().post(new b(bgk0Var, collection));
            for (final ur4 ur4Var : collection) {
                a aVar = (a) this.c.get(ur4Var);
                if (aVar == null) {
                    LinkedHashMap linkedHashMap = this.c;
                    Future<?> submit = ((ExecutorService) this.d.getValue()).submit(new Runnable() { // from class: xsna.ozc0
                        @Override // java.lang.Runnable
                        public final void run() {
                            pzc0 pzc0Var = pzc0.this;
                            ur4 ur4Var2 = ur4Var;
                            pzc0Var.getClass();
                            try {
                                pzc0Var.d(ur4Var2);
                                synchronized (pzc0Var) {
                                }
                            } catch (Throwable th) {
                                synchronized (pzc0Var) {
                                    throw th;
                                }
                            }
                        }
                    });
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(atrVar);
                    linkedHashMap.put(ur4Var, new a(submit, linkedHashSet));
                } else {
                    aVar.b().add(atrVar);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(atr atrVar, LinkedHashSet linkedHashSet) {
        try {
            a();
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (!this.c.isEmpty()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    a aVar = (a) this.c.get((ur4) it.next());
                    if (aVar != null) {
                        aVar.b().remove(atrVar);
                    }
                }
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(bgk0 bgk0Var) {
        try {
            a();
            if (!this.c.isEmpty()) {
                c().post(new c(bgk0Var, j5g.O0(this.c.keySet())));
                Iterator it = this.c.entrySet().iterator();
                while (it.hasNext()) {
                    ((a) ((Map.Entry) it.next()).getValue()).a().cancel(true);
                }
                this.c.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
