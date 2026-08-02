package sg.bigo.ads.cs;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.utils.q;

/* loaded from: classes9.dex */
public final class b {
    public Set<sg.bigo.ads.av.b> a;
    public Set<sg.bigo.ads.av.b> b;
    private final sg.bigo.ads.cr.a c;
    private long d = 0;
    private c e;

    public b(@NonNull sg.bigo.ads.cr.a aVar) {
        this.c = aVar;
        this.a = q.a(aVar.a);
        this.b = q.a(aVar.a);
        sg.bigo.ads.ct.b.a(new Runnable() { // from class: sg.bigo.ads.cs.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this);
            }
        });
    }

    private void f() {
        c cVar = this.e;
        if (cVar == null || cVar.b()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.d;
        if (currentTimeMillis - j >= 300000) {
            c cVar2 = this.e;
            sg.bigo.ads.da.b.a(j, cVar2.a, cVar2.b, cVar2.c, cVar2.d);
            this.d = currentTimeMillis;
            sg.bigo.ads.bw.a.d(currentTimeMillis);
            this.e.c();
        }
    }

    private List<sg.bigo.ads.av.b> g() {
        return sg.bigo.ads.aw.b.a(this.c.a());
    }

    public final synchronized List<sg.bigo.ads.av.b> a() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.a);
            Iterator<sg.bigo.ads.av.b> it = this.b.iterator();
            while (it.hasNext()) {
                arrayList.remove(it.next());
            }
            this.a.clear();
            this.b.addAll(arrayList);
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized int b() {
        return this.a.size();
    }

    public final synchronized boolean c() {
        return this.a.isEmpty();
    }

    public final synchronized void d() {
        try {
            if (this.a.isEmpty()) {
                List<sg.bigo.ads.av.b> g = g();
                Iterator<sg.bigo.ads.av.b> it = this.b.iterator();
                while (it.hasNext()) {
                    g.remove(it.next());
                }
                this.a.addAll(g);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        this.b.clear();
        this.a.clear();
    }

    public final synchronized void a(List<sg.bigo.ads.av.b> list, boolean z) {
        try {
            this.b.removeAll(list);
            if (!z) {
                this.a.addAll(list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<sg.bigo.ads.av.b> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(it.next().a));
            }
            sg.bigo.ads.aw.b.a(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(sg.bigo.ads.av.b bVar) {
        this.a.add(bVar);
        bVar.a = sg.bigo.ads.aw.b.a(bVar);
        f();
        this.e.a(bVar.b);
    }

    public static /* synthetic */ void a(b bVar) {
        sg.bigo.ads.aw.b.a(System.currentTimeMillis() - bVar.c.c);
        bVar.a.addAll(bVar.g());
        long k = sg.bigo.ads.bw.a.k();
        bVar.d = k;
        if (k == 0) {
            bVar.d = System.currentTimeMillis();
        }
        bVar.e = c.a();
        bVar.f();
    }
}
