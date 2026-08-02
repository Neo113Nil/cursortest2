package xsna;

import android.database.DatabaseUtils;
import com.vk.im.engine.models.dialogs.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.r9m;
import xsna.x9m;

/* compiled from: DialogAppearanceStorageImpl.kt */
/* loaded from: classes2.dex */
public final class aam implements z9m {
    public final Iterable<plm> a;
    public final r9m b;
    public final bpn0 c;
    public final bpn0 d;
    public volatile boolean e;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String str = ((p9m) t).a;
            c.h hVar = c.h.c;
            int i = Integer.MAX_VALUE;
            Integer valueOf = Integer.valueOf(epx.f(str, hVar.a) ? 0 : epx.f(str, c.g.c.a) ? 1 : epx.f(str, c.C1124c.c.a) ? 2 : Integer.MAX_VALUE);
            String str2 = ((p9m) t2).a;
            if (epx.f(str2, hVar.a)) {
                i = 0;
            } else if (epx.f(str2, c.g.c.a)) {
                i = 1;
            } else if (epx.f(str2, c.C1124c.c.a)) {
                i = 2;
            }
            return jw5.b(valueOf, Integer.valueOf(i));
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            x9m x9mVar = (x9m) t;
            String str = x9mVar.a;
            c.h hVar = c.h.c;
            x9m x9mVar2 = (x9m) t2;
            return jw5.b(Integer.valueOf(epx.f(str, hVar.a) ? 0 : x9mVar.f), Integer.valueOf(epx.f(x9mVar2.a, hVar.a) ? 0 : x9mVar2.f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aam(tgl0 tgl0Var, Iterable<? extends plm> iterable) {
        this.a = iterable;
        r9m r9mVar = new r9m(tgl0Var);
        this.b = r9mVar;
        this.c = new bpn0(new myh(this, 5));
        this.d = new bpn0(new dne(this, 14));
        int i = tgl0Var.a().getInt("dialog_appearance_storage_version", 0);
        while (i < r9mVar.c) {
            r9m r9mVar2 = this.b;
            if (i == 1) {
                Collection<q9m> b2 = r9mVar2.b();
                ArrayList arrayList = new ArrayList(c5g.u(b2, 10));
                for (q9m q9mVar : b2) {
                    arrayList.add(new q9m(!epx.f(q9mVar.a, c.h.c.a) ? 1 : 0, q9mVar.b, q9mVar.a, q9mVar.c, q9mVar.d, q9mVar.e));
                }
                r9mVar2.b.b().h(new td0(13, r9mVar2, arrayList));
            }
            i++;
            tgl0Var.a().putInt("dialog_appearance_storage_version", i);
        }
    }

    public static x9m k(q9m q9mVar) {
        return new x9m(q9mVar.a, q9mVar.b, y9m.a(q9mVar.c), y9m.a(q9mVar.d), q9mVar.e, q9mVar.f);
    }

    @Override // xsna.z9m
    public final boolean a(long j, String str) {
        r9m r9mVar = this.b;
        q9m q9mVar = (q9m) r9m.a(r9mVar.b.b().d(r9mVar.a.a(r9m.a.NAME, str), null)).get(str);
        return q9mVar != null && q9mVar.b == j;
    }

    @Override // xsna.z9m
    public final ArrayList b() {
        List<x9m> all = getAll();
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (!((x9m) obj).e) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // xsna.z9m
    public final void c(String str) {
        r9m r9mVar = this.b;
        r9mVar.b.b().f(r9mVar.a.a, r9m.a.NAME.getKey() + " = ?", new String[]{DatabaseUtils.sqlEscapeString(str)});
    }

    @Override // xsna.z9m
    public final ArrayList d(List list) {
        List O0 = j5g.O0(list);
        Collection<q9m> b2 = this.b.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b2) {
            if (O0.contains(((q9m) obj).a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(k((q9m) it.next()));
        }
        return arrayList2;
    }

    @Override // xsna.z9m
    public final x9m e(String str) {
        r9m r9mVar = this.b;
        q9m q9mVar = (q9m) r9m.a(r9mVar.b.b().d(r9mVar.a.a(r9m.a.NAME, str), null)).get(str);
        if (q9mVar != null) {
            return k(q9mVar);
        }
        return null;
    }

    @Override // xsna.z9m
    public final boolean f() {
        return this.e;
    }

    @Override // xsna.z9m
    public final List<p9m> g() {
        plm plmVar = (plm) this.c.getValue();
        if (plmVar == null) {
            return EmptyList.b;
        }
        ArrayList b2 = b();
        ArrayList arrayList = new ArrayList(c5g.u(b2, 10));
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            x9m x9mVar = (x9m) it.next();
            String str = x9mVar.a;
            x9m.a aVar = x9mVar.c;
            npo0 npo0Var = new npo0(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g.a);
            x9m.a aVar2 = x9mVar.d;
            Map a2 = plmVar.a(npo0Var, new npo0(aVar2.a, aVar2.b, aVar2.c, aVar2.d, aVar2.e, aVar2.f, aVar2.g.a));
            if (a2 == null) {
                a2 = jgp.b;
            }
            arrayList.add(new p9m(str, a2));
        }
        return j5g.D0(new a(), j5g.u0(arrayList, (List) this.d.getValue()));
    }

    @Override // xsna.z9m
    public final List<x9m> getAll() {
        ulp0 ulp0Var = new ulp0(new i5g(this.b.b()), new tr0(this, 16));
        b bVar = new b();
        List B = rli0.B(ulp0Var);
        g5g.L(B, bVar);
        Iterator it = ((ArrayList) B).iterator();
        if (!it.hasNext()) {
            return EmptyList.b;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList b2 = y57.b(next);
        while (it.hasNext()) {
            b2.add(it.next());
        }
        return b2;
    }

    @Override // xsna.z9m
    public final void h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x9m x9mVar = (x9m) it.next();
            String str = x9mVar.a;
            boolean z = x9mVar.e;
            arrayList2.add(new q9m(x9mVar.f, x9mVar.b, str, y9m.b(x9mVar.c), y9m.b(x9mVar.d), z));
        }
        r9m r9mVar = this.b;
        r9mVar.b.b().h(new td0(13, r9mVar, arrayList2));
    }

    @Override // xsna.z9m
    public final void i() {
        this.e = true;
    }

    @Override // xsna.z9m
    public final boolean j(String str) {
        List list = (List) this.d.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (epx.f(((p9m) it.next()).a, str)) {
                return true;
            }
        }
        return false;
    }
}
