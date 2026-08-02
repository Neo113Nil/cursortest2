package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.bwq0;
import xsna.ds60;
import xsna.jm50;
import xsna.lwq0;
import xsna.qn60;
import xsna.qr60;
import xsna.svq0;
import xsna.yo60;

/* compiled from: UserProfileWallMviPagingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class zvq0 extends evg0<dwq0, on50, lwq0.c, lwq0, bwq0, svq0> {
    public final es60 f;
    public final eh60 g;
    public final sxy h;
    public final sa30 i;

    public zvq0(fxq0 fxq0Var, es60 es60Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = es60Var;
        this.g = fxq0Var.c;
        this.h = fxq0Var.l;
        this.i = new sa30();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        lwq0.c cVar = (lwq0.c) hn50Var;
        boolean z = cVar instanceof lwq0.c.b;
        int i = 22;
        int i2 = 3;
        int i3 = 17;
        int i4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        boolean z2 = true;
        char c = 1;
        char c2 = 1;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z) {
            s();
            c(new svq0.a(yo60.j.c.a));
            e(new awq0(new qr60.a.e(ListLoadingState.RELOADING)));
            dwq0 dwq0Var = (dwq0) nn50Var.getCurrentState();
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.x(new dzw(new emh0(this, 10)).b(new io.reactivex.rxjava3.internal.operators.single.o(v(dwq0Var.b, null, dwq0Var.c), new uu60(new i0b0(this, 24), 27)))), new hl30(new z6f0(this, i), 17)).l(new i630(new agk(this, z2, i2), i3)), new c7q0(new c3k0(this, 7), 1)), new xvq0(this, i4), new jw80(this, 20));
        }
        boolean z3 = cVar instanceof lwq0.c.C3307c;
        es60 es60Var = this.f;
        if (z3) {
            ds60.f fVar = ((lwq0.c.C3307c) cVar).b;
            if ((fVar instanceof ds60.f.c) || (fVar instanceof ds60.f.d)) {
                return x();
            }
            int i5 = 4;
            if (fVar instanceof ds60.f.b) {
                s();
                e(new bwq0.a.g(true));
                c(new svq0.a(yo60.j.c.a));
                e(new awq0(new qr60.a.e(ListLoadingState.REFRESHING)));
                dwq0 dwq0Var2 = (dwq0) nn50Var.getCurrentState();
                return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.o(v(dwq0Var2.b, null, dwq0Var2.c), new vom0(new ptl0(this, 8), i2)).h(new yvq0(new ece0(this, 16), objArr4 == true ? 1 : 0)), new hl30(new z6f0(this, i), 17)).l(new i630(new agk((Object) this, (boolean) (objArr3 == true ? 1 : 0), i2), i3)), new c7q0(new c3k0(this, 7), 1)), new wvq0(this, objArr2 == true ? 1 : 0), new t6m0(this, i5));
            }
            if (!(fVar instanceof ds60.f.a) && !(fVar instanceof ds60.f.e)) {
                throw new NoWhenBranchMatchedException();
            }
            s();
            e(new awq0(new qr60.a.e(ListLoadingState.LOADING)));
            dwq0 dwq0Var3 = (dwq0) nn50Var.getCurrentState();
            return g(new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.x(new eqz(es60Var.a, es60Var.b, new b3m0(this, 9)).b(new io.reactivex.rxjava3.internal.operators.single.o(v(dwq0Var3.b, dwq0Var3.q.d, dwq0Var3.c), new f0o0(new svk0(this, 17), c2 == true ? 1 : 0)))).h(new yvq0(new ece0(this, 16), objArr == true ? 1 : 0)), new x310(new alj0(this, 13), 15)).l(new bj50(new m0m0(i5), 14)), new epq0(this, c == true ? 1 : 0), new u0o0(this, i2));
        }
        if (cVar instanceof lwq0.c.e) {
            return x();
        }
        if (cVar instanceof lwq0.c.d) {
            NewsEntry newsEntry = ((lwq0.c.d) cVar).b;
            if ((newsEntry instanceof Post) && na60.e(newsEntry)) {
                Post post = (Post) newsEntry;
                boolean zb = post.l.zb(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
                Integer valueOf = Integer.valueOf(post.n);
                if (!zb) {
                    valueOf = null;
                }
                Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(es60Var.a.f(new u0p0(newsEntry, es60Var.b)));
                if (!(b instanceof Result.Failure)) {
                    qn60.c cVar2 = (qn60.c) b;
                    nn50Var.e(new awq0(new qr60.a.c(cVar2.a, cVar2.b, false, null, 24)));
                }
                Throwable a = Result.a(b);
                if (a != null) {
                    com.vk.metrics.eventtracking.b.a.a(a);
                }
                e(new bwq0.a.j(valueOf));
                return null;
            }
        } else if (!(cVar instanceof lwq0.c.g)) {
            if (cVar instanceof lwq0.c.f) {
                return g(io.reactivex.rxjava3.core.x.t(Math.max(1L, ((lwq0.c.f) cVar).b - (System.currentTimeMillis() / 1000)), TimeUnit.SECONDS).m(asu0.a.c()), new rao(), new n1r(this, 29));
            }
            if (!(cVar instanceof lwq0.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            es60Var.b.a();
            es60Var.a.a();
            e(new awq0(new qr60.a.g(EmptyList.b, d9x.a, null, false, false, null, null, 96)));
            c(svq0.b.e.a);
            return null;
        }
        return null;
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

    public final io.reactivex.rxjava3.core.x<WallWithCounters> v(UserId userId, String str, WallGetMode wallGetMode) {
        if (!epx.f(((dwq0) this.b.getCurrentState()).k, Boolean.TRUE)) {
            return io.reactivex.rxjava3.core.x.k(WallWithCounters.b);
        }
        return rsg0.y0(new gxt(userId, str, 10, wallGetMode, sa30.C(userId), false).a(((b25) ((eml) this.h.a).b).a(userId)), null, null, 3).K();
    }

    public final void w(WallWithCounters wallWithCounters, boolean z) {
        sa30 sa30Var = this.i;
        if (!z) {
            Integer num = ((dwq0) this.b.getCurrentState()).l;
            sa30Var.getClass();
            sa30.h(wallWithCounters, num);
            return;
        }
        Object a0 = j5g.a0(wallWithCounters);
        Integer num2 = null;
        Post post = a0 instanceof Post ? (Post) a0 : null;
        if (post != null) {
            if (!post.l.zb(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) {
                post = null;
            }
            if (post != null) {
                num2 = Integer.valueOf(post.n);
            }
        }
        e(new bwq0.a.j(num2));
        sa30Var.getClass();
        sa30.h(wallWithCounters, num2);
    }

    public final zvg0 x() {
        s();
        e(new bwq0.a.g(true));
        c(new svq0.a(yo60.j.c.a));
        e(new awq0(new qr60.a.e(ListLoadingState.RELOADING)));
        dwq0 dwq0Var = (dwq0) this.b.getCurrentState();
        return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.x(new dzw(new qhg0(this, 17)).b(new io.reactivex.rxjava3.internal.operators.single.o(v(dwq0Var.b, null, dwq0Var.c), new k130(new e9i0(this, 15), 26)))), new hl30(new z6f0(this, 22), 17)).l(new i630(new agk((Object) this, false, 3), 17)), new c7q0(new c3k0(this, 7), 1)), new cc20(this, 29), new e7q0(this, 3));
    }

    public final void y() {
        dwq0 dwq0Var = (dwq0) this.b.getCurrentState();
        if (dwq0Var.d != null) {
            c(new svq0.b.m());
            e(new bwq0.a.p(dwq0Var.c));
        }
    }
}
