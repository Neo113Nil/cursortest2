package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.ipq;
import xsna.jm50;
import xsna.qn60;
import xsna.qr60;
import xsna.rpq;

/* compiled from: FaveFeedMviPagesTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class epq extends evg0<kpq, on50, rpq.b, rpq, ipq, xoq> {
    public final qn60 f;
    public final pn60 g;

    public epq(es60 es60Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = es60Var.a;
        this.g = es60Var.b;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        rpq.b bVar = (rpq.b) hn50Var;
        boolean z = bVar instanceof rpq.b.a;
        pn60 pn60Var = this.g;
        qn60 qn60Var = this.f;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z) {
            e(new ipq.a.C3071a(((rpq.b.a) bVar).b));
            Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new myi0(((kpq) nn50Var.getCurrentState()).g, pn60Var)));
            if (!(b instanceof Result.Failure)) {
                qn60.c cVar = (qn60.c) b;
                nn50Var.e(new hpq(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
            }
            Throwable a = Result.a(b);
            if (a != null) {
                com.vk.metrics.eventtracking.b.a.a(a);
            }
            return null;
        }
        if (!(bVar instanceof rpq.b.C3622b)) {
            throw new NoWhenBranchMatchedException();
        }
        e(new ipq.a.b(((rpq.b.C3622b) bVar).b));
        Object b2 = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new myi0(((kpq) nn50Var.getCurrentState()).g, pn60Var)));
        if (!(b2 instanceof Result.Failure)) {
            qn60.c cVar2 = (qn60.c) b2;
            nn50Var.e(new hpq(new qr60.a.c(cVar2.a, cVar2.b, false, null, 24)));
        }
        Throwable a2 = Result.a(b2);
        if (a2 != null) {
            com.vk.metrics.eventtracking.b.a.a(a2);
        }
        return null;
    }
}
