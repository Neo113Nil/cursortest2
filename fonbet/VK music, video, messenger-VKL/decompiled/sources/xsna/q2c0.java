package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.jm50;
import xsna.on50;
import xsna.qn60;
import xsna.qr60;
import xsna.t5c0;

/* compiled from: PostEntryMviTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class q2c0 extends evg0<m5c0, on50, t5c0.b, t5c0, h5c0, d5c0> {
    public final qn60 f;
    public final pn60 g;

    public q2c0(es60 es60Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = es60Var.a;
        this.g = es60Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        Post R;
        t5c0.b bVar = (t5c0.b) hn50Var;
        boolean z = bVar instanceof t5c0.b.c;
        pn60 pn60Var = this.g;
        qn60 qn60Var = this.f;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z) {
            Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new ryi0(((t5c0.b.c) bVar).b, pn60Var)));
            if (!(b instanceof Result.Failure)) {
                qn60.c cVar = (qn60.c) b;
                nn50Var.e(new j5c0(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
            }
            Throwable a = Result.a(b);
            if (a != null) {
                com.vk.metrics.eventtracking.b.a.a(a);
            }
            return null;
        }
        if (bVar instanceof t5c0.b.d) {
            m5c0 m5c0Var = (m5c0) nn50Var.getCurrentState();
            NewsEntry newsEntry = m5c0Var.i;
            if (newsEntry != null && (R = di60.R(newsEntry)) != null) {
                UserId userId = R.m;
                ((t5c0.b.d) bVar).getClass();
                if (epx.f(userId, on50.a.a)) {
                    R.J = ((t5c0.b.d) bVar).b == 0;
                }
                e(new i5c0(newsEntry, m5c0Var.l, m5c0Var.e));
                Object b2 = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new s8q0(Collections.singletonList(newsEntry), pn60Var)));
                if (!(b2 instanceof Result.Failure)) {
                    qn60.c cVar2 = (qn60.c) b2;
                    nn50Var.e(new j5c0(new qr60.a.c(cVar2.a, cVar2.b, false, null, 24)));
                }
                Throwable a2 = Result.a(b2);
                if (a2 != null) {
                    com.vk.metrics.eventtracking.b.a.a(a2);
                }
                return null;
            }
        } else if (bVar instanceof t5c0.b.C3721b) {
            m5c0 m5c0Var2 = (m5c0) nn50Var.getCurrentState();
            NewsEntry newsEntry2 = m5c0Var2.i;
            if (newsEntry2 != 0) {
                l490 l490Var = newsEntry2 instanceof l490 ? (l490) newsEntry2 : null;
                Owner s = l490Var != null ? l490Var.s() : null;
                Group group = ((t5c0.b.C3721b) bVar).b;
                if (s != null) {
                    s.e = group.e;
                    s.c = group.d;
                }
                NewsEntry h = na60.h(newsEntry2);
                e(new i5c0(h, m5c0Var2.l, m5c0Var2.e));
                Object b3 = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new s8q0(Collections.singletonList(h), pn60Var)));
                if (!(b3 instanceof Result.Failure)) {
                    qn60.c cVar3 = (qn60.c) b3;
                    nn50Var.e(new j5c0(new qr60.a.c(cVar3.a, cVar3.b, false, null, 24)));
                }
                Throwable a3 = Result.a(b3);
                if (a3 != null) {
                    com.vk.metrics.eventtracking.b.a.a(a3);
                }
                return null;
            }
        } else {
            if (!(bVar instanceof t5c0.b.e)) {
                if (bVar instanceof t5c0.b.f) {
                    NewsEntry newsEntry3 = ((m5c0) nn50Var.getCurrentState()).i;
                    Post R2 = newsEntry3 != null ? di60.R(newsEntry3) : null;
                    c(new c5c0(((t5c0.b.f) bVar).b, R2 != null ? R2.cc(((t5c0.b.f) bVar).b) : false));
                    return null;
                }
                if (!(bVar instanceof t5c0.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object b4 = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new wxf0()));
                if (!(b4 instanceof Result.Failure)) {
                    qn60.c cVar4 = (qn60.c) b4;
                    nn50Var.e(new j5c0(new qr60.a.c(cVar4.a, cVar4.b, false, null, 24)));
                }
                Throwable a4 = Result.a(b4);
                if (a4 != null) {
                    com.vk.metrics.eventtracking.b.a.a(a4);
                }
                return null;
            }
            m5c0 m5c0Var3 = (m5c0) nn50Var.getCurrentState();
            NewsEntry newsEntry4 = m5c0Var3.i;
            if (newsEntry4 != 0) {
                l490 l490Var2 = newsEntry4 instanceof l490 ? (l490) newsEntry4 : null;
                Owner s2 = l490Var2 != null ? l490Var2.s() : null;
                UserProfile userProfile = ((t5c0.b.e) bVar).b;
                if (s2 != null) {
                    s2.u(userProfile.l0());
                }
                NewsEntry h2 = na60.h(newsEntry4);
                e(new i5c0(h2, m5c0Var3.l, m5c0Var3.e));
                Object b5 = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new s8q0(Collections.singletonList(h2), pn60Var)));
                if (!(b5 instanceof Result.Failure)) {
                    qn60.c cVar5 = (qn60.c) b5;
                    nn50Var.e(new j5c0(new qr60.a.c(cVar5.a, cVar5.b, false, null, 24)));
                }
                Throwable a5 = Result.a(b5);
                if (a5 != null) {
                    com.vk.metrics.eventtracking.b.a.a(a5);
                }
                return null;
            }
        }
        return null;
    }
}
