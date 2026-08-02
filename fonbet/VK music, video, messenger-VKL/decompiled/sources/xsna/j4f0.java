package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.feature.ReactionsFeedMviState;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import xsna.a9q0;
import xsna.d4f0;
import xsna.ds60;
import xsna.jm50;
import xsna.k4f0;
import xsna.qr60;
import xsna.y4f0;
import xsna.yo60;

/* compiled from: ReactionsFeedMviPagingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class j4f0 extends evg0<ReactionsFeedMviState, on50, y4f0.a, y4f0, k4f0, d4f0> {
    public final h5f0 f;
    public final eh60 g;
    public final xa4 h;
    public final io.reactivex.rxjava3.internal.schedulers.d i;

    public j4f0(h5f0 h5f0Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = h5f0Var;
        this.g = h5f0Var.c;
        this.h = h5f0Var.g;
        asu0 asu0Var = asu0.a;
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        this.i = new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        y4f0.a aVar = (y4f0.a) hn50Var;
        boolean z = aVar instanceof y4f0.a.C4075a;
        int i = 10;
        int i2 = 28;
        int i3 = 29;
        int i4 = 9;
        int i5 = 13;
        int i6 = 7;
        h5f0 h5f0Var = this.f;
        io.reactivex.rxjava3.internal.schedulers.d dVar = this.i;
        xa4 xa4Var = this.h;
        if (z) {
            s();
            c(new d4f0.a(yo60.j.c.a));
            e(new l4f0(new qr60.a.e(ListLoadingState.RELOADING)));
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(v(io.reactivex.rxjava3.core.x.x(new dzw(new e2s(this, 25)).b(xa4Var.r(h5f0Var.h.a).m(dVar)))), new nit(new m360(this, i5), 16)).l(new hl30(new bzw(a9q0.a.a, i3), 9)), new jw80(new qw30(this, i2), i)), new j720(this, i6), new y730(this, i4));
        }
        if (!(aVar instanceof y4f0.a.b)) {
            if (!(aVar instanceof y4f0.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((y4f0.a.c) aVar).b;
            t(str);
            e(new k4f0.a(str));
            return null;
        }
        ds60.f fVar = ((y4f0.a.b) aVar).b;
        boolean z2 = fVar instanceof ds60.f.c;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z2 || (fVar instanceof ds60.f.d)) {
            s();
            c(new d4f0.a(yo60.j.c.a));
            e(new l4f0(new qr60.a.e(ListLoadingState.RELOADING)));
            return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(v(io.reactivex.rxjava3.core.x.x(new dzw(new ba40(this, 19)).b(xa4Var.r(((ReactionsFeedMviState) nn50Var.getCurrentState()).b).m(dVar)))), new nit(new m360(this, i5), 16)).l(new hl30(new bzw(a9q0.c.a, i3), 9)), new jw80(new qw30(this, i2), i)), new j720(this, i6), new h4f0(this, 0));
        }
        if (fVar instanceof ds60.f.b) {
            return t(((ReactionsFeedMviState) nn50Var.getCurrentState()).b);
        }
        if (!(fVar instanceof ds60.f.a) && !(fVar instanceof ds60.f.e)) {
            throw new NoWhenBranchMatchedException();
        }
        s();
        e(new l4f0(new qr60.a.e(ListLoadingState.LOADING)));
        ReactionsFeedMviState reactionsFeedMviState = (ReactionsFeedMviState) nn50Var.getCurrentState();
        String str2 = reactionsFeedMviState.c.d;
        bpn0 bpn0Var = cqm0.a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = reactionsFeedMviState.b;
        xa4Var.getClass();
        return g(new io.reactivex.rxjava3.internal.operators.single.r(v(io.reactivex.rxjava3.core.x.x(new eqz(h5f0Var.a, h5f0Var.b, new bk30(this, 26)).b(rsg0.W(new cp4(str2, g5f0.a(str3)), 7).m(dVar)))), new n8c0(new dn20(this, 20), 3)).l(new oyr(new d0k(27), 18)), new j720(this, i6), new w250(this, i5));
    }

    public final void s() {
        n().a(v5n.c);
        n().a(w5n.c);
        n().a(tjf.b);
        n().a(qjf.b);
        n().a(rjf.b);
        n().a(sjf.b);
        n().a(ujf.b);
    }

    public final zvg0 t(String str) {
        s();
        c(new d4f0.a(yo60.j.c.a));
        e(new l4f0(new qr60.a.e(ListLoadingState.REFRESHING)));
        return g(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(v(this.h.r(str).m(this.i)), new nit(new m360(this, 13), 16)).l(new hl30(new bzw(a9q0.b.a, 29), 9)), new jw80(new qw30(this, 28), 10)), new j720(this, 7), new o060(this, 11));
    }

    public final io.reactivex.rxjava3.internal.operators.single.l v(io.reactivex.rxjava3.core.x xVar) {
        return xVar.h(new m1r(new pod0(this, 1), 21));
    }
}
