package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.data.NewsfeedSearchList;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.ds60;
import xsna.ey60;
import xsna.jm50;
import xsna.qn60;
import xsna.qr60;
import xsna.sx60;
import xsna.vx60;
import xsna.yo60;

/* compiled from: NewsfeedSearchPagingTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class py60 extends evg0<xx60, on50, ey60.b, ey60, vx60, sx60> {
    public final qn60 f;
    public final c2f0 g;
    public final qy60 h;
    public final ca90 i;
    public final io.reactivex.rxjava3.internal.schedulers.d j;

    public py60(qn60 qn60Var, c2f0 c2f0Var, qy60 qy60Var, ca90 ca90Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = qn60Var;
        this.g = c2f0Var;
        this.h = qy60Var;
        this.i = ca90Var;
        asu0 asu0Var = asu0.a;
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        this.j = new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
    }

    public final io.reactivex.rxjava3.internal.operators.single.l A(io.reactivex.rxjava3.core.x xVar) {
        return xVar.h(new f5y(new fju(this, 15), 12));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y E(io.reactivex.rxjava3.internal.operators.single.r rVar) {
        return rVar.l(new ca6(new p010(this, 15), 28));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        ey60.b bVar = (ey60.b) hn50Var;
        gkf gkfVar = gkf.b;
        if (bVar instanceof ey60.b.C2841b) {
            return x();
        }
        boolean z = bVar instanceof ey60.b.d;
        int i = 1;
        io.reactivex.rxjava3.internal.schedulers.d dVar = this.j;
        ca90 ca90Var = this.i;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z) {
            s();
            n().a(gkfVar);
            c(new sx60.a(yo60.j.c.a));
            e(new vx60.b(((ey60.b.d) bVar).b));
            e(new ux60(new qr60.a.e(ListLoadingState.RELOADING)));
            xx60 xx60Var = (xx60) nn50Var.getCurrentState();
            String str = xx60Var.e;
            return g(v(E(z(y(A(this.g.e(str, xx60Var.f, xx60Var.h, ca90Var.a, xx60Var.b, null).m(dVar)), str, xx60Var)))), new xj50(this, i), new wnt(this, 13));
        }
        if (!(bVar instanceof ey60.b.c)) {
            if (!(bVar instanceof ey60.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ey60.b.a aVar = (ey60.b.a) bVar;
            Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(this.f.f(new aic()));
            if (!(b instanceof Result.Failure)) {
                qn60.c cVar = (qn60.c) b;
                nn50Var.e(new ux60(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
            }
            Throwable a = Result.a(b);
            if (a != null) {
                com.vk.metrics.eventtracking.b.a.a(a);
            }
            w(aVar.b);
            return null;
        }
        ds60.f fVar = ((ey60.b.c) bVar).b;
        int i2 = 8;
        int i3 = 3;
        if (fVar instanceof ds60.f.c) {
            s();
            n().a(gkfVar);
            c(new sx60.a(yo60.j.c.a));
            e(new ux60(new qr60.a.e(ListLoadingState.RELOADING)));
            xx60 xx60Var2 = (xx60) nn50Var.getCurrentState();
            String str2 = xx60Var2.e;
            return g(v(E(z(A(y(this.g.e(str2, xx60Var2.f, xx60Var2.h, ca90Var.a, xx60Var2.b, null).m(dVar), str2, xx60Var2))))), new uk40(this, i3), new fs00(this, i2));
        }
        if (fVar instanceof ds60.f.d) {
            return x();
        }
        if (fVar instanceof ds60.f.b) {
            s();
            n().a(gkfVar);
            c(new sx60.a(yo60.j.c.a));
            e(new ux60(new qr60.a.e(ListLoadingState.RELOADING)));
            xx60 xx60Var3 = (xx60) nn50Var.getCurrentState();
            String str3 = xx60Var3.e;
            return g(v(E(z(y(A(this.g.e(str3, xx60Var3.f, xx60Var3.h, ca90Var.a, xx60Var3.b, null).m(dVar)), str3, xx60Var3)))), new uk40(this, i3), new c120(this, 11));
        }
        if (!(fVar instanceof ds60.f.a) && !(fVar instanceof ds60.f.e)) {
            throw new NoWhenBranchMatchedException();
        }
        s();
        e(new ux60(new qr60.a.e(ListLoadingState.LOADING)));
        xx60 xx60Var4 = (xx60) nn50Var.getCurrentState();
        String str4 = xx60Var4.e;
        String str5 = xx60Var4.f;
        UserId userId = xx60Var4.b;
        io.reactivex.rxjava3.core.x e = this.g.e(str4, str5, xx60Var4.h, ca90Var.b, userId, xx60Var4.l.d);
        qy60 qy60Var = this.h;
        return g(new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.x(new eqz(qy60Var.b, qy60Var.c, new uh40(this, i3)).b(e)), new c8(new o3w(this, 23), 26)).l(new ac20(new q8w(i2), 9)), new uk40(this, i3), new f2u(this, 9));
    }

    public final void s() {
        n().a(dkf.b);
        n().a(ekf.b);
        n().a(fkf.b);
        n().a(ckf.b);
        n().a(tjf.b);
        n().a(qjf.b);
        n().a(rjf.b);
        n().a(sjf.b);
        n().a(ujf.b);
    }

    public final io.reactivex.rxjava3.internal.operators.single.y t(NewsfeedSearchList newsfeedSearchList, qn60.b... bVarArr) {
        String U;
        String str = newsfeedSearchList.suggestedQuery;
        SpannableString spannableString = null;
        if (str == null || drm0.N(str)) {
            String str2 = newsfeedSearchList.query;
            U = (str2 == null || drm0.N(str2)) ? hd60.a().U() : null;
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            gd60 a = hd60.a();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            spannableString = a.n1(context, spannableStringBuilder, newsfeedSearchList.suggestedQuery);
            U = null;
        }
        qy60 qy60Var = this.h;
        qy60Var.c.a();
        return odq.c(qy60Var.b, (qn60.b[]) Arrays.copyOf(bVarArr, bVarArr.length)).l(new b630(new tol(newsfeedSearchList, spannableString, U, 4), 6));
    }

    public final io.reactivex.rxjava3.internal.operators.single.o v(io.reactivex.rxjava3.internal.operators.single.y yVar) {
        return new io.reactivex.rxjava3.internal.operators.single.o(yVar, new n240(new ux40(this, 6), 5));
    }

    public final void w(Throwable th) {
        e(new ux60(new qr60.a.e(ListLoadingState.ERROR)));
        com.vk.metrics.eventtracking.b.a.a(th);
    }

    public final zvg0 x() {
        s();
        n().a(gkf.b);
        e(new ux60(new qr60.a.e(ListLoadingState.RELOADING)));
        xx60 xx60Var = (xx60) this.b.getCurrentState();
        String str = xx60Var.e;
        String str2 = xx60Var.f;
        UserId userId = xx60Var.b;
        return g(v(E(z(y(A(io.reactivex.rxjava3.core.x.x(new dzw(new o010(this, 16)).b(this.g.e(str, str2, xx60Var.h, this.i.a, userId, null).m(this.j)))), str, xx60Var)))), new uk40(this, 3), new be50(this, 3));
    }

    public final io.reactivex.rxjava3.core.x<NewsfeedSearchList<NewsEntry>> y(io.reactivex.rxjava3.core.x<NewsfeedSearchList<NewsEntry>> xVar, String str, xx60 xx60Var) {
        return (str == null || str.length() == 0 || xx60Var.f != null || xx60Var.b != null) ? xVar : new io.reactivex.rxjava3.internal.operators.single.n(xVar, new wx00(new ml1(17, this, str), 5));
    }

    public final io.reactivex.rxjava3.internal.operators.single.r z(io.reactivex.rxjava3.core.x xVar) {
        h8 h8Var = new h8(new fa00(this, 9), 29);
        xVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.r(xVar, h8Var);
    }
}
