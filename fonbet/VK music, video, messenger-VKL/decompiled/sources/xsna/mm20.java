package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.ud50;
import xsna.vbb0;
import xsna.vfb0;

/* compiled from: MigrationSyncManager.kt */
/* loaded from: classes.dex */
public final class mm20 implements w8i {
    public final cb50 b;
    public final j8b0 c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new x0f(2));
    public final bpn0 e = new bpn0(new gat(this, 6));

    public mm20(cb50 cb50Var, j8b0 j8b0Var) {
        this.b = cb50Var;
        this.c = j8b0Var;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final synchronized void a() {
        try {
            if (((com.vk.music.pref.a) this.e.getValue()).O()) {
                return;
            }
            nu70 nu70Var = (nu70) this.d.getValue();
            Map p = nu70Var != null ? nu70Var.p() : jgp.b;
            if (!p.isEmpty()) {
                d(p);
            }
            nu70 nu70Var2 = (nu70) this.d.getValue();
            Map n = nu70Var2 != null ? nu70Var2.n() : jgp.b;
            if (!n.isEmpty()) {
                b(n);
            }
            nu70 nu70Var3 = (nu70) this.d.getValue();
            List o = nu70Var3 != null ? nu70Var3.o(p, n) : EmptyList.b;
            if (!o.isEmpty()) {
                c(o, p, n);
            }
            ((com.vk.music.pref.a) this.e.getValue()).k0();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Map<Integer, vbb0> map) {
        Collection<vbb0> values = map.values();
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "size=" + values.size()});
        }
        j8b0 j8b0Var = this.c;
        j8b0Var.b();
        Collection<vbb0> collection = values;
        ArrayList arrayList = new ArrayList(c5g.u(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(vbb0.a.a((vbb0) it.next()));
        }
        j8b0Var.k(arrayList);
    }

    public final void c(List list, Map map, Map map2) {
        L.n("OfflineDbConn", new tbb(map, map2, list, 3));
        cb50 cb50Var = this.b;
        cb50Var.g();
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(vfb0.a.a((vfb0) it.next()));
        }
        cb50Var.j(arrayList);
    }

    public final void d(Map<Integer, ud50> map) {
        Collection<ud50> values = map.values();
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "size=" + values.size()});
        }
        cb50 cb50Var = this.b;
        cb50Var.p();
        Collection<ud50> collection = values;
        ArrayList arrayList = new ArrayList(c5g.u(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(ud50.a.a((ud50) it.next()));
        }
        cb50Var.H(arrayList);
    }
}
