package xsna;

import android.os.SystemClock;
import android.util.SparseArray;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedDeduplicator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import xsna.jm50;
import xsna.jv60;
import xsna.qn60;
import xsna.qr60;
import xsna.r070;
import xsna.xh60;

/* compiled from: NewsfeedFreshNewsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class uj60 extends evg0<qz60, on50, r070.e, r070, jv60, xh60> {
    public final zz60 f;
    public final bpn0 g;
    public final Lazy h;
    public final Lazy i;
    public final bpn0 j;
    public final bpn0 k;
    public final jt60 l;
    public final qn60 m;
    public final pn60 n;
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;
    public final a r;

    /* compiled from: NewsfeedFreshNewsTaskExecutor.kt */
    public static final class a implements hw60 {
        public final ts60 a;

        public a(ts60 ts60Var) {
            this.a = ts60Var;
        }

        @Override // xsna.hw60
        public final void a(long j, int i, boolean z, String str, String str2) {
            this.a.b();
        }
    }

    public uj60() {
        throw null;
    }

    public uj60(zz60 zz60Var, st60 st60Var, io.reactivex.rxjava3.disposables.b bVar, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = zz60Var;
        this.g = st60Var.g;
        this.h = st60Var.e;
        es60 es60Var = st60Var.a;
        this.i = es60Var.e;
        this.j = st60Var.d;
        this.k = new bpn0(new uz(17));
        jt60 jt60Var = st60Var.b;
        this.l = jt60Var;
        this.m = es60Var.a;
        this.n = es60Var.b;
        this.o = new bpn0(new pr1(29));
        this.p = new bpn0(new daz(6));
        this.q = new bpn0(new d1(29));
        this.r = new a(zz60Var.k);
        bVar.b(jt60Var.e);
        jt60Var.o = new rj60(this, 0);
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        r070.e eVar = (r070.e) hn50Var;
        if (!((Boolean) this.q.getValue()).booleanValue()) {
            boolean z = eVar instanceof r070.e.g;
            jt60 jt60Var = this.l;
            if (z) {
                r070.e.g gVar = (r070.e.g) eVar;
                jt60Var.a(gVar.b, new wj60(1, this, uj60.class, "startTask", "startTask(Lcom/vk/mvi/MviTask;)V", 0), gVar.c);
                return null;
            }
            boolean z2 = eVar instanceof r070.e.c;
            nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
            if (z2) {
                qz60 qz60Var = (qz60) nn50Var.getCurrentState();
                int i = qz60Var.c;
                SparseArray<lu60> sparseArray = qz60Var.h.a;
                u4q0 u4q0Var = zik0.a;
                lu60 lu60Var = sparseArray.get(i);
                if (lu60Var != null) {
                    t(i, lu60Var);
                }
                c(new xh60.e(vp60.a));
                c(new xh60.b.a(false));
                return null;
            }
            boolean z3 = eVar instanceof r070.e.h;
            zz60 zz60Var = this.f;
            if (z3) {
                zz60Var.f.a = ((r070.e.h) eVar).b;
                return null;
            }
            if (eVar instanceof r070.e.a) {
                zz60Var.f.b = ((r070.e.a) eVar).b;
                return null;
            }
            if (eVar instanceof r070.e.d) {
                if (((r070.e.d) eVar).b) {
                    jt60Var.h.set(true);
                    return null;
                }
                jt60Var.h.set(false);
                return null;
            }
            if (eVar instanceof r070.e.C3587e) {
                vj60 vj60Var = new vj60(1, this, uj60.class, "startTask", "startTask(Lcom/vk/mvi/MviTask;)V", 0);
                if (!jt60Var.n) {
                    if (jt60Var.b.b != 1.0f) {
                        long c = an10.c(jt60Var.m * r1);
                        jt60Var.m = c;
                        jt60Var.c();
                        jt60Var.c.j();
                        jt60Var.b(c, c, vj60Var);
                        return null;
                    }
                }
            } else {
                boolean z4 = eVar instanceof r070.e.f;
                a170 a170Var = a170.a;
                if (z4) {
                    n().a(a170Var);
                    hx3 hx3Var = new hx3(1, this, uj60.class, "startTask", "startTask(Lcom/vk/mvi/MviTask;)V", 0, 4);
                    long j = jt60Var.m;
                    jt60Var.c();
                    jt60Var.c.j();
                    jt60Var.b(0L, j, hx3Var);
                    return null;
                }
                if (!(eVar instanceof r070.e.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = 3;
                if (((qz60) nn50Var.getCurrentState()).h.c <= 3) {
                    n().a(a170Var);
                    com.vk.core.utils.newtork.b.a.getClass();
                    return g(com.vk.core.utils.newtork.b.f().K(), new pd40(this, i2), new tz(this, 26));
                }
            }
        }
        return null;
    }

    public final ArrayList s(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        LinkedHashSet c = this.m.c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NewsEntry newsEntry = (NewsEntry) it.next();
            if (c.contains(newsEntry)) {
                arrayList.add(newsEntry);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    public final void t(int i, lu60 lu60Var) {
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        qz60 qz60Var = (qz60) nn50Var.getCurrentState();
        pn60 pn60Var = this.n;
        pn60Var.a();
        Object f = this.m.f(new aic(), new rn0(i, qz60Var.f, pn60Var), new qn0(qz60Var.g.a, pn60Var), new xc3(lu60Var.a(), qz60Var.b.c, this.n, (NewsfeedDeduplicator) this.g.getValue(), (h6c0) this.h.getValue(), true, sua.m(lu60Var)));
        if (f instanceof Result.Failure) {
            return;
        }
        qn60.c cVar = (qn60.c) f;
        if (i == 0) {
            List<NewsEntry> a2 = lu60Var.a();
            if (((Boolean) this.o.getValue()).booleanValue()) {
                ?? r2 = ((qz60) nn50Var.getCurrentState()).b.c.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : r2.entrySet()) {
                    Pair pair = (Pair) entry.getKey();
                    long longValue = ((Number) pair.d()).longValue();
                    int intValue = ((Number) pair.g()).intValue();
                    List<NewsEntry> list = a2;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                NewsEntry newsEntry = (NewsEntry) it.next();
                                if (k9q0.o(newsEntry).b == longValue && di60.n(newsEntry) == intValue) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                    break;
                                }
                            }
                        }
                    }
                }
                if (linkedHashMap.size() != r2.size()) {
                    e(new kv60(new qr60.a.h(linkedHashMap)));
                }
            }
        }
        e(new jv60.a.c(i));
        e(new kv60(new qr60.a.g(cVar.a, cVar.b, lu60Var.b(), true, false, null, null, 96)));
    }

    public final void v(int i, lu60 lu60Var) {
        byte b;
        boolean z;
        List<NewsEntry> a2 = lu60Var.a();
        zz60 zz60Var = this.f;
        uw60 uw60Var = zz60Var.f;
        int i2 = (int) ((uw60Var.a >> 48) & 65535);
        boolean z2 = i2 > 0 || uw60Var.b;
        boolean d = this.m.d(a2);
        boolean z3 = !d;
        byte b2 = zz60Var.j.get().a;
        if ((b2 & 1) == 0 || !wn60.b(b2)) {
            b = b2;
            z = false;
        } else {
            b = b2;
            z = true;
        }
        long j = ((AtomicLong) zz60Var.e.b).get();
        boolean z4 = (j != 0 ? SystemClock.elapsedRealtime() - j : 0L) > zz60Var.b.c;
        boolean z5 = (b & 8) != 0;
        boolean z6 = !z && z5 && z4;
        if (!z2 || z6) {
            String str = com.vk.newsfeed.common.util.k.a;
            com.vk.newsfeed.common.util.k.k(i2, i, z, z5, true, z3);
            t(i, lu60Var);
            c(new xh60.e(vp60.a));
            c(new xh60.b.a(false));
            return;
        }
        if (d) {
            w(a2);
            String str2 = com.vk.newsfeed.common.util.k.a;
            com.vk.newsfeed.common.util.k.e("update", i2, z, z5, true, i, z3);
        } else {
            e(new jv60.a.d(i, lu60Var));
            c(new xh60.b.a(true));
            String str3 = com.vk.newsfeed.common.util.k.a;
            com.vk.newsfeed.common.util.k.e("save", i2, z, z5, true, i, z3);
        }
    }

    public final void w(List<? extends NewsEntry> list) {
        Object f = this.m.f(new t0g0(list, this.n));
        if (f instanceof Result.Failure) {
            return;
        }
        qn60.c cVar = (qn60.c) f;
        e(new kv60(new qr60.a.c(cVar.a, cVar.b, false, null, 28)));
    }
}
