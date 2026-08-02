package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.requests.WallGetMain;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.bwq0;
import xsna.ds60;
import xsna.jm50;
import xsna.lwq0;
import xsna.qr60;
import xsna.svq0;
import xsna.yo60;

/* compiled from: UserProfileMainWallMviPagingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class isq0 extends evg0<dwq0, on50, lwq0.c, lwq0, bwq0, svq0> {
    public final es60 f;
    public final eh60 g;
    public final sxy h;
    public final sa30 i;
    public final Object j;
    public final Object k;
    public final Object l;

    public isq0(fxq0 fxq0Var, es60 es60Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = es60Var;
        this.g = fxq0Var.c;
        this.h = fxq0Var.l;
        this.i = new sa30();
        y3l0 y3l0Var = new y3l0(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, y3l0Var);
        this.k = msy.a(lazyThreadSafetyMode, new c9m0(this, 6));
        this.l = msy.a(lazyThreadSafetyMode, new hyd0(6));
    }

    public final void A() {
        Hint p;
        boolean z = v().p(HintId.USER_PROFILE_MAIN_WALL_TAB_ONBOARDING.getId()) == null;
        if (v().n() || !z) {
            return;
        }
        if (!this.f.k.getValue().s().a(((dwq0) this.b.getCurrentState()).b) || (p = v().p(HintId.USER_PROFILE_MAIN_WALL_POST_OPTIONS_ONBOARDING.getId())) == null) {
            return;
        }
        c(new svq0.b.i.C3692b(p.c, new j5b0(this, 22), new i5(21, this, p)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    public final void E(boolean z) {
        Pair<String, String> pair;
        if (z) {
            A();
            dwq0 dwq0Var = (dwq0) this.b.getCurrentState();
            if (((Boolean) this.l.getValue()).booleanValue()) {
                if (this.f.k.getValue().s().a(dwq0Var.b) && !v().n() && epx.f(dwq0Var.i, Boolean.TRUE) && v().p(HintId.USER_PROFILE_MAIN_WALL_POST_OPTIONS_ONBOARDING.getId()) == null && (pair = dwq0Var.j) != null) {
                    String d = pair.d();
                    String g = pair.g();
                    ?? r1 = this.j;
                    ((q7v0) r1.getValue()).init();
                    ((q7v0) r1.getValue()).c(new svd(this, d, g, 12));
                }
            }
        }
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        lwq0.c cVar = (lwq0.c) hn50Var;
        boolean z = cVar instanceof lwq0.c.b;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z) {
            s();
            c(new svq0.a(yo60.j.c.a));
            e(new awq0(new qr60.a.e(ListLoadingState.RELOADING)));
            return g(new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.x(new dzw(new ape0(this, 18)).b(new io.reactivex.rxjava3.internal.operators.single.o(w(((dwq0) nn50Var.getCurrentState()).b, null), new pd40(new hfm0(this, 7), 16)))), new hhj0(new xvl0(this, 10), 5)), new fl30(this, 29), new jw80(this, 19));
        }
        boolean z2 = cVar instanceof lwq0.c.C3307c;
        es60 es60Var = this.f;
        if (!z2) {
            if (cVar instanceof lwq0.c.e) {
                return y();
            }
            if (cVar instanceof lwq0.c.d) {
                NewsEntry newsEntry = ((lwq0.c.d) cVar).b;
                if ((newsEntry instanceof Post) && na60.e(newsEntry)) {
                    a(lwq0.c.e.b);
                    return null;
                }
            } else {
                if (cVar instanceof lwq0.c.g) {
                    A();
                    return null;
                }
                if (!(cVar instanceof lwq0.c.f)) {
                    if (!(cVar instanceof lwq0.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    es60Var.b.a();
                    es60Var.a.a();
                    e(new awq0(new qr60.a.g(EmptyList.b, d9x.a, null, false, false, null, null, 96)));
                    c(svq0.b.e.a);
                    return null;
                }
            }
            return null;
        }
        ds60.f fVar = ((lwq0.c.C3307c) cVar).b;
        if ((fVar instanceof ds60.f.c) || (fVar instanceof ds60.f.d)) {
            return y();
        }
        if (fVar instanceof ds60.f.b) {
            s();
            e(new bwq0.a.g(true));
            c(new svq0.a(yo60.j.c.a));
            e(new awq0(new qr60.a.e(ListLoadingState.REFRESHING)));
            return g(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.o(w(((dwq0) nn50Var.getCurrentState()).b, null), new d120(new wug0(this, 23), 24)).h(new s440(new mmm0(this, 7), 19)), new l960(new b8e0(this, 17), 12)), new t520(this, 26), new k5j0(this, 11));
        }
        if (!(fVar instanceof ds60.f.a) && !(fVar instanceof ds60.f.e)) {
            throw new NoWhenBranchMatchedException();
        }
        s();
        e(new awq0(new qr60.a.e(ListLoadingState.LOADING)));
        dwq0 dwq0Var = (dwq0) nn50Var.getCurrentState();
        return g(new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.x(new eqz(es60Var.a, es60Var.b, new yyl0(this, 8)).b(new io.reactivex.rxjava3.internal.operators.single.o(w(dwq0Var.b, dwq0Var.q.d), new r7a0(new n3b0(this, 18), 16)))).h(new s440(new mmm0(this, 7), 19)), new s1j0(new ie90(this, 25), 8)), new p9p0(this, 2), new o3y(this, 28));
    }

    public final void s() {
        n().a(atc0.b);
        n().a(tjf.b);
        n().a(qjf.b);
        n().a(rjf.b);
        n().a(sjf.b);
        n().a(ujf.b);
    }

    public final void t() {
        e(new bwq0.a.g(false));
        c(svq0.b.g.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final h7v v() {
        return (h7v) this.k.getValue();
    }

    public final io.reactivex.rxjava3.core.x w(UserId userId, String str) {
        io.reactivex.rxjava3.core.q y0;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (!epx.f(((dwq0) nn50Var.getCurrentState()).k, Boolean.TRUE)) {
            return io.reactivex.rxjava3.core.x.k(WallWithCounters.b);
        }
        String str2 = ((dwq0) nn50Var.getCurrentState()).o;
        nsq0 nsq0Var = (nsq0) this.h.b;
        WallGetMain wallGetMain = new WallGetMain(userId, 30, sa30.C(userId), str, str2, false);
        if (nsq0Var.b) {
            nsq0Var.b = false;
            JSONObject b = nsq0Var.a.b(userId);
            if (b != null) {
                io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new uhc(3, wallGetMain, b));
                asu0 asu0Var = asu0.a;
                asu0Var.getClass();
                y0 = s0Var.r0(asu0.i()).a0(asu0Var.d()).c0(rsg0.y0(wallGetMain, null, null, 3));
                return y0.K().l(new uf20(new p7x(nsq0Var), 16));
            }
        }
        y0 = rsg0.y0(wallGetMain, null, null, 3);
        return y0.K().l(new uf20(new p7x(nsq0Var), 16));
    }

    public final void x(WallWithCounters wallWithCounters, boolean z) {
        sa30 sa30Var = this.i;
        if (!z) {
            Integer num = ((dwq0) this.b.getCurrentState()).l;
            sa30Var.getClass();
            sa30.g(wallWithCounters, num);
            return;
        }
        NewsEntry newsEntry = (NewsEntry) j5g.a0(wallWithCounters);
        Integer num2 = null;
        if (newsEntry != null) {
            if (!na60.e(newsEntry) || !na60.f(newsEntry)) {
                newsEntry = null;
            }
            if (newsEntry != null) {
                num2 = Integer.valueOf(di60.u(newsEntry));
            }
        }
        e(new bwq0.a.j(num2));
        sa30Var.getClass();
        sa30.g(wallWithCounters, num2);
    }

    public final zvg0 y() {
        s();
        e(new bwq0.a.g(true));
        c(new svq0.a(yo60.j.c.a));
        e(new awq0(new qr60.a.e(ListLoadingState.RELOADING)));
        return g(new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.x(new dzw(new qjm0(this, 4)).b(new io.reactivex.rxjava3.internal.operators.single.o(w(((dwq0) this.b.getCurrentState()).b, null), new q440(new gj80(this, 28), 25)))), new hkc0(new l850(this, 26), 8)), new fsq0(this, 0), new ow40(this, 25));
    }

    public final void z() {
        dwq0 dwq0Var = (dwq0) this.b.getCurrentState();
        if (dwq0Var.d != null) {
            c(new svq0.b.m());
            e(new bwq0.a.p(dwq0Var.c));
        }
    }
}
