package xsna;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.hms.common.data.DataBufferUtils;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedDeduplicator;
import com.vk.newsfeed.api.data.NewsfeedList;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.domain.model.NewsfeedInitialPost;
import com.vk.newsfeed.utils.NewsDebuggerPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import xsna.ds60;
import xsna.jm50;
import xsna.jv60;
import xsna.qn60;
import xsna.qr60;
import xsna.r070;
import xsna.whs;
import xsna.xh60;
import xsna.yo60;

/* compiled from: NewsfeedPagingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class dv60 extends evg0<qz60, on50, r070.h, r070, jv60, xh60> {
    public final ts60 f;
    public final f170 g;
    public final zz60 h;
    public final bpn0 i;
    public final Lazy j;
    public final Lazy k;
    public final bpn0 l;
    public final pn60 m;
    public final io.reactivex.rxjava3.internal.schedulers.d n;
    public final a o;
    public final bpn0 p;
    public final bpn0 q;
    public final bpn0 r;
    public final bpn0 s;
    public final bpn0 t;

    /* compiled from: NewsfeedPagingTaskExecutor.kt */
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

    public dv60() {
        throw null;
    }

    public dv60(ts60 ts60Var, f170 f170Var, st60 st60Var, zz60 zz60Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = ts60Var;
        this.g = f170Var;
        this.h = zz60Var;
        this.i = st60Var.d;
        this.j = st60Var.e;
        es60 es60Var = st60Var.a;
        this.k = es60Var.e;
        this.l = st60Var.g;
        this.m = es60Var.b;
        asu0 asu0Var = asu0.a;
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        this.n = new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
        this.o = new a(ts60Var);
        this.p = new bpn0(new com.vk.movika.tools.controls.seekbar.n(26));
        this.q = new bpn0(new r(18));
        this.r = new bpn0(new gu0(27));
        this.s = new bpn0(new x84(24));
        this.t = new bpn0(new y84(14));
    }

    public final io.reactivex.rxjava3.core.x<lu60> A(io.reactivex.rxjava3.core.x<lu60> xVar, int i) {
        kn4 kn4Var = new kn4();
        if (!((Boolean) this.p.getValue()).booleanValue() || i != 0) {
            return xVar;
        }
        fl30 fl30Var = new fl30(new qw30(this, kn4Var), 7);
        xVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.o(xVar, fl30Var);
    }

    @Override // xsna.dl50, xsna.mn50
    public final boolean B(hn50 hn50Var) {
        r070.h hVar = (r070.h) hn50Var;
        if (!(hVar instanceof r070.h.c)) {
            return true;
        }
        ds60.f fVar = ((r070.h.c) hVar).b;
        boolean z = fVar instanceof ds60.f.e;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (!z) {
            return !(fVar instanceof ds60.f.a) || ((qz60) nn50Var.getCurrentState()).b.e == ListLoadingState.IDLE;
        }
        qz60 qz60Var = (qz60) nn50Var.getCurrentState();
        ur60 ur60Var = qz60Var.b;
        if (ur60Var.e == ListLoadingState.ERROR) {
            return true;
        }
        String str = ur60Var.d;
        if (str == null || str.length() == 0) {
            return epx.f(qz60Var.h.b, whs.b.a) || y();
        }
        return false;
    }

    public final zvg0 E(final int i, final String str, final boolean z, final mu60 mu60Var, final boolean z2) {
        e(new kv60(new qr60.a.e(ListLoadingState.RELOADING)));
        mzp0 a2 = this.g.a();
        if (a2 != null) {
            a2.a();
        }
        a(new r070.e.d(false));
        ce60.b.getClass();
        final boolean z3 = !ce60.i.get();
        final boolean z4 = mu60Var.h != null;
        return z(mu60Var, new wzs() { // from class: xsna.xu60
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:12:0x00d1  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0165  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0179 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0086  */
            /* JADX WARN: Type inference failed for: r0v18, types: [io.reactivex.rxjava3.internal.operators.single.h] */
            /* JADX WARN: Type inference failed for: r5v16, types: [io.reactivex.rxjava3.internal.operators.single.i] */
            @Override // xsna.wzs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj, Object obj2) {
                io.reactivex.rxjava3.core.x<lu60> e0Var;
                io.reactivex.rxjava3.core.x<lu60> xVar;
                boolean z5;
                String str2;
                int i2;
                io.reactivex.rxjava3.internal.operators.single.y l;
                iw60 iw60Var = (iw60) obj;
                jw60 jw60Var = (jw60) obj2;
                boolean z6 = iw60Var.g;
                int i3 = iw60Var.c;
                dv60 dv60Var = dv60.this;
                if (z6) {
                    xVar = dv60Var.H(dv60Var.A(dv60Var.I(dv60Var.w().h(iw60Var, jw60Var), iw60Var.m), i3), i3);
                    if (dv60Var.y()) {
                        fs00 fs00Var = new fs00(new h2s(dv60Var, 24), 7);
                        xVar.getClass();
                        e0Var = new io.reactivex.rxjava3.internal.operators.single.o<>(xVar, fs00Var);
                    }
                    io.reactivex.rxjava3.core.x m = xVar.m(dv60Var.n);
                    z5 = !dv60Var.y();
                    boolean z7 = z3;
                    if (z5) {
                        m = new io.reactivex.rxjava3.internal.operators.single.o(m, new ca10(new z4v(z7, dv60Var, 1), 5));
                    }
                    io.reactivex.rxjava3.core.x x = io.reactivex.rxjava3.core.x.x(new dzw(new cqv(dv60Var, 22)).b(gv60.c(m, dv60Var.g)));
                    mu60 mu60Var2 = mu60Var;
                    int i4 = mu60Var2.b;
                    str2 = str;
                    i2 = i;
                    l = x.l(new nit(new tu60(i4, dv60Var, str2, i2), 11));
                    if (!dv60Var.y()) {
                        l = new io.reactivex.rxjava3.internal.operators.single.i(gv60.d(l, i3, mu60Var2.d, new qr0(dv60Var, 9)), new h53(dv60Var, 2));
                    }
                    if (dv60Var.y() && z2) {
                        l = new io.reactivex.rxjava3.internal.operators.single.h(l, new hms(new vu60(dv60Var, i2, str2), 16));
                    }
                    io.reactivex.rxjava3.internal.operators.single.y O = dv60Var.O(dv60Var.J(new io.reactivex.rxjava3.internal.operators.single.r(dv60Var.t(gv60.a(l)), new rt0(new wu60(dv60Var, i3, !z7 && ((Boolean) dv60Var.r.getValue()).booleanValue()), 25)), iw60Var));
                    io.reactivex.rxjava3.core.x xVar2 = O;
                    if (z) {
                        xVar2 = gv60.b(O, new n99(dv60Var, 7), new yu60(dv60Var, 0));
                    }
                    io.reactivex.rxjava3.internal.operators.single.l L = dv60Var.L(dv60Var.N(xVar2, i3, false));
                    return !((Boolean) dv60Var.t.getValue()).booleanValue() ? new io.reactivex.rxjava3.internal.operators.single.o(L, new c120(new zu60(z4, dv60Var), 9)) : L;
                }
                io.reactivex.rxjava3.core.x<lu60> A = dv60Var.A(dv60Var.w().k(i3, iw60Var.d, iw60Var.l), i3);
                si60 si60Var = new si60(new ev60(0), 1);
                A.getClass();
                e0Var = new io.reactivex.rxjava3.internal.operators.single.e0<>(new io.reactivex.rxjava3.internal.operators.single.r(A, si60Var), new r2v(new isg(dv60Var, iw60Var, jw60Var, 5), 10));
                xVar = e0Var;
                io.reactivex.rxjava3.core.x m2 = xVar.m(dv60Var.n);
                z5 = !dv60Var.y();
                boolean z72 = z3;
                if (z5) {
                }
                io.reactivex.rxjava3.core.x x2 = io.reactivex.rxjava3.core.x.x(new dzw(new cqv(dv60Var, 22)).b(gv60.c(m2, dv60Var.g)));
                mu60 mu60Var22 = mu60Var;
                int i42 = mu60Var22.b;
                str2 = str;
                i2 = i;
                l = x2.l(new nit(new tu60(i42, dv60Var, str2, i2), 11));
                if (!dv60Var.y()) {
                }
                if (dv60Var.y()) {
                    l = new io.reactivex.rxjava3.internal.operators.single.h(l, new hms(new vu60(dv60Var, i2, str2), 16));
                }
                io.reactivex.rxjava3.internal.operators.single.y O2 = dv60Var.O(dv60Var.J(new io.reactivex.rxjava3.internal.operators.single.r(dv60Var.t(gv60.a(l)), new rt0(new wu60(dv60Var, i3, !z72 && ((Boolean) dv60Var.r.getValue()).booleanValue()), 25)), iw60Var));
                io.reactivex.rxjava3.core.x xVar22 = O2;
                if (z) {
                }
                io.reactivex.rxjava3.internal.operators.single.l L2 = dv60Var.L(dv60Var.N(xVar22, i3, false));
                if (!((Boolean) dv60Var.t.getValue()).booleanValue()) {
                }
            }
        });
    }

    public final io.reactivex.rxjava3.core.x<lu60> H(io.reactivex.rxjava3.core.x<lu60> xVar, int i) {
        if (i != 0) {
            return xVar;
        }
        uu60 uu60Var = new uu60(new wlw(this, i, 1), 0);
        xVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.n(xVar, uu60Var);
    }

    public final io.reactivex.rxjava3.core.x<lu60> I(io.reactivex.rxjava3.core.x<lu60> xVar, NewsfeedInitialPost newsfeedInitialPost) {
        if (newsfeedInitialPost == null || !((Boolean) this.t.getValue()).booleanValue()) {
            return xVar;
        }
        return io.reactivex.rxjava3.core.x.B(new io.reactivex.rxjava3.internal.operators.single.o(w().m(newsfeedInitialPost), new ux00(new c2u(this, 26), 7)), xVar, new xb20(new vx7((byte) 0, 3), 8));
    }

    public final io.reactivex.rxjava3.internal.operators.single.o J(io.reactivex.rxjava3.internal.operators.single.r rVar, iw60 iw60Var) {
        return new io.reactivex.rxjava3.internal.operators.single.o(rVar, new o330(new ng3(28, this, iw60Var), 4));
    }

    public final io.reactivex.rxjava3.internal.operators.single.l L(io.reactivex.rxjava3.internal.operators.single.l lVar) {
        return lVar.h(new bdz(new h630(this, 8), 8));
    }

    public final io.reactivex.rxjava3.internal.operators.single.l N(io.reactivex.rxjava3.core.x xVar, int i, boolean z) {
        return new io.reactivex.rxjava3.internal.operators.single.o(xVar, new p350(new bv60(this, i, z), 1)).h(new skz(new cv60(this, i, z), 9));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y O(io.reactivex.rxjava3.internal.operators.single.o oVar) {
        return oVar.l(new or20(new qz40(this, 4), 8));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        String str;
        r070.h hVar = (r070.h) hn50Var;
        boolean z = hVar instanceof r070.h.b;
        ts60 ts60Var = this.f;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z) {
            s();
            NewsDebuggerPoint newsDebuggerPoint = NewsDebuggerPoint.ChangeList;
            ts60Var.T();
            NewsfeedInitialPost newsfeedInitialPost = ((qz60) nn50Var.getCurrentState()).i;
            r070.h.b bVar = (r070.h.b) hVar;
            int i = bVar.b;
            String str2 = bVar.c;
            NewsfeedList newsfeedList = ((qz60) nn50Var.getCurrentState()).e;
            return E(i, str2, true, new mu60(null, i, newsfeedList != null ? newsfeedList.c : null, "initial", null, bVar.d || (newsfeedInitialPost != null && ((Boolean) this.t.getValue()).booleanValue()), y(), newsfeedInitialPost, 48), true);
        }
        if (hVar instanceof r070.h.d) {
            int i2 = ((r070.h.d) hVar).b;
            s();
            NewsDebuggerPoint newsDebuggerPoint2 = NewsDebuggerPoint.ChangeList;
            ts60Var.T();
            NewsfeedList newsfeedList2 = ((qz60) nn50Var.getCurrentState()).e;
            mu60 mu60Var = new mu60(null, i2, newsfeedList2 != null ? newsfeedList2.c : null, "fresh", null, false, false, null, 496);
            return z(mu60Var, new yn7(7, this, mu60Var));
        }
        if (!(hVar instanceof r070.h.c)) {
            if (!(hVar instanceof r070.h.a)) {
                throw new NoWhenBranchMatchedException();
            }
            NewsfeedList newsfeedList3 = ((r070.h.a) hVar).b;
            s();
            qz60 qz60Var = (qz60) nn50Var.getCurrentState();
            qn60 qn60Var = this.h.g;
            LinkedHashSet c = qn60Var.c();
            ArrayList arrayList = new ArrayList();
            for (Object obj : c) {
                if (obj instanceof NewsEntry) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty() && !x(qz60Var, qz60Var.c)) {
                NewsDebuggerPoint newsDebuggerPoint3 = NewsDebuggerPoint.ChangeList;
                ts60Var.T();
                w().b(qz60Var.c, qz60Var.b.d, epx.f(qz60Var.d, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP)), arrayList);
            }
            qn60Var.f(new aic());
            jv60.c.a aVar = new jv60.c.a(newsfeedList3);
            int i3 = newsfeedList3.b;
            e(aVar);
            NewsDebuggerPoint newsDebuggerPoint4 = NewsDebuggerPoint.ChangeList;
            ts60Var.T();
            if (y()) {
                a(new r070.f.a(i3));
            }
            if (qz60Var.h.a.indexOfKey(i3) < 0 || y()) {
                return E(qz60Var.c, qz60Var.d, false, new mu60(null, newsfeedList3.b, TextUtils.isEmpty(newsfeedList3.c) ? null : newsfeedList3.c, "reload", null, false, false, null, 496), false);
            }
            SparseArray<lu60> sparseArray = qz60Var.h.a;
            u4q0 u4q0Var = zik0.a;
            lu60 lu60Var = sparseArray.get(i3);
            if (lu60Var != null) {
                qtc0 qtc0Var = qz60Var.b.c;
                qz60 qz60Var2 = (qz60) nn50Var.getCurrentState();
                pn60 pn60Var = this.m;
                pn60Var.a();
                Object f = qn60Var.f(new aic(), new rn0(i3, qz60Var2.f, pn60Var), new qn0(qz60Var2.g.a, pn60Var), new xc3(lu60Var.a(), qtc0Var, this.m, (NewsfeedDeduplicator) this.l.getValue(), epx.f(lu60Var.c(), Boolean.TRUE) ? (h6c0) this.j.getValue() : null, true, sua.m(lu60Var)));
                if (!(f instanceof Result.Failure)) {
                    qn60.c cVar = (qn60.c) f;
                    v(lu60Var.a());
                    e(new jv60.a.c(i3));
                    e(new kv60(new qr60.a.g(cVar.a, cVar.b, lu60Var.b(), true, false, null, null, 96)));
                }
            }
            c(new xh60.e(vp60.a));
            c(new xh60.b.a(false));
            return null;
        }
        ds60.f fVar = ((r070.h.c) hVar).b;
        if (fVar instanceof ds60.f.d) {
            s();
            NewsDebuggerPoint newsDebuggerPoint5 = NewsDebuggerPoint.ChangeList;
            ts60Var.T();
            qz60 qz60Var3 = (qz60) nn50Var.getCurrentState();
            int i4 = qz60Var3.c;
            String str3 = qz60Var3.d;
            NewsfeedList newsfeedList4 = qz60Var3.e;
            return E(i4, str3, true, new mu60(null, i4, newsfeedList4 != null ? newsfeedList4.c : null, "initial", null, false, false, null, 496), true);
        }
        int i5 = 9;
        if (fVar instanceof ds60.f.a) {
            qz60 qz60Var4 = (qz60) nn50Var.getCurrentState();
            NewsDebuggerPoint newsDebuggerPoint6 = NewsDebuggerPoint.ChangeList;
            ts60Var.T();
            String str4 = qz60Var4.b.d;
            int i6 = qz60Var4.c;
            NewsfeedList newsfeedList5 = qz60Var4.e;
            mu60 mu60Var2 = new mu60(str4, i6, newsfeedList5 != null ? newsfeedList5.c : null, DataBufferUtils.NEXT_PAGE, null, false, false, null, 496);
            e(new kv60(new qr60.a.e(ListLoadingState.LOADING)));
            return z(mu60Var2, new br0(this, mu60Var2, qz60Var4, i5));
        }
        boolean z2 = fVar instanceof ds60.f.b;
        f170 f170Var = this.g;
        if (z2) {
            s();
            qz60 qz60Var5 = (qz60) nn50Var.getCurrentState();
            if (qz60Var5.h.a.indexOfKey(qz60Var5.c) >= 0 && !y()) {
                a(r070.e.c.b);
                return null;
            }
            c(new xh60.e(yo60.j.c.a));
            e(new kv60(new qr60.a.e(ListLoadingState.REFRESHING)));
            mzp0 a2 = f170Var.a();
            if (a2 != null) {
                a2.a();
            }
            int i7 = qz60Var5.c;
            NewsfeedList newsfeedList6 = qz60Var5.e;
            mu60 mu60Var3 = new mu60(null, i7, newsfeedList6 != null ? newsfeedList6.c : null, "ptr", null, false, false, null, 496);
            NewsDebuggerPoint newsDebuggerPoint7 = NewsDebuggerPoint.ChangeList;
            ts60Var.T();
            return z(mu60Var3, new fyl(this, mu60Var3, qz60Var5));
        }
        if (fVar instanceof ds60.f.c) {
            s();
            qz60 qz60Var6 = (qz60) nn50Var.getCurrentState();
            c(new xh60.e(yo60.j.c.a));
            e(new kv60(new qr60.a.e(ListLoadingState.REFRESHING)));
            mzp0 a3 = f170Var.a();
            if (a3 != null) {
                a3.a();
            }
            int i8 = qz60Var6.c;
            NewsfeedList newsfeedList7 = qz60Var6.e;
            mu60 mu60Var4 = new mu60(null, i8, newsfeedList7 != null ? newsfeedList7.c : null, "reload", null, false, false, null, 496);
            NewsDebuggerPoint newsDebuggerPoint8 = NewsDebuggerPoint.ChangeList;
            ts60Var.T();
            return z(mu60Var4, new ar0(this, mu60Var4, qz60Var6, 6));
        }
        if (!(fVar instanceof ds60.f.e)) {
            throw new NoWhenBranchMatchedException();
        }
        qz60 qz60Var7 = (qz60) nn50Var.getCurrentState();
        NewsDebuggerPoint newsDebuggerPoint9 = NewsDebuggerPoint.ChangeList;
        ts60Var.T();
        if (((Boolean) this.r.getValue()).booleanValue() && (((str = qz60Var7.b.d) == null || str.length() == 0) && epx.f(qz60Var7.h.b, whs.b.a))) {
            a(r070.e.f.b);
            return null;
        }
        String str5 = qz60Var7.b.d;
        int i9 = qz60Var7.c;
        NewsfeedList newsfeedList8 = qz60Var7.e;
        mu60 mu60Var5 = new mu60(str5, i9, newsfeedList8 != null ? newsfeedList8.c : null, "initial", null, false, false, null, 496);
        e(new kv60(new qr60.a.e(ListLoadingState.LOADING)));
        return z(mu60Var5, new br0(this, mu60Var5, qz60Var7, i5));
    }

    public final void s() {
        n().a(c170.a);
        n().a(d170.a);
        n().a(b170.a);
        n().a(tjf.b);
        n().a(qjf.b);
        n().a(rjf.b);
        n().a(sjf.b);
        n().a(ujf.b);
    }

    public final io.reactivex.rxjava3.core.x t(io.reactivex.rxjava3.internal.operators.single.o oVar) {
        return !((Boolean) this.p.getValue()).booleanValue() ? oVar : new io.reactivex.rxjava3.internal.operators.single.o(oVar, new m1r(new bjk(this, 23), 10));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    public final void v(List<? extends NewsEntry> list) {
        if (((Boolean) this.p.getValue()).booleanValue()) {
            ?? r0 = ((qz60) this.b.getCurrentState()).b.c.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : r0.entrySet()) {
                Pair pair = (Pair) entry.getKey();
                long longValue = ((Number) pair.d()).longValue();
                int intValue = ((Number) pair.g()).intValue();
                List<? extends NewsEntry> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
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
            if (linkedHashMap.size() != r0.size()) {
                e(new kv60(new qr60.a.h(linkedHashMap)));
            }
        }
    }

    public final am60 w() {
        return ((NewsFeedComponent) this.k.getValue()).Aa();
    }

    public final boolean x(qz60 qz60Var, int i) {
        return qz60Var.h.a.indexOfKey(i) >= 0 && !y();
    }

    public final boolean y() {
        return ((Boolean) this.s.getValue()).booleanValue();
    }

    public final zvg0 z(mu60 mu60Var, wzs wzsVar) {
        return g(new io.reactivex.rxjava3.internal.operators.single.r(w().f(mu60Var), new iw3(new av60(wzsVar, System.currentTimeMillis(), this), 27)), new d120(this, 6), new dh40(this, 5));
    }
}
