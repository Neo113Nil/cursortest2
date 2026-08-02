package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.jm50;
import xsna.lwq0;
import xsna.qn60;
import xsna.qr60;

/* compiled from: UserProfileItemTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class lqq0 extends evg0<dwq0, on50, lwq0.b, lwq0, bwq0, svq0> {
    public final qn60 f;
    public final pn60 g;

    public lqq0(es60 es60Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = es60Var.a;
        this.g = es60Var.b;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        lwq0.b bVar = (lwq0.b) hn50Var;
        boolean z = bVar instanceof lwq0.b.C3306b;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        pn60 pn60Var = this.g;
        qn60 qn60Var = this.f;
        if (z) {
            lwq0.b.C3306b c3306b = (lwq0.b.C3306b) bVar;
            Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new eon0(c3306b.b, c3306b.c, pn60Var)));
            if (!(b instanceof Result.Failure)) {
                qn60.c cVar = (qn60.c) b;
                nn50Var.e(new awq0(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
            }
            Throwable a = Result.a(b);
            if (a != null) {
                com.vk.metrics.eventtracking.b.a.a(a);
            }
            return null;
        }
        if (!(bVar instanceof lwq0.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        lwq0.b.a aVar = (lwq0.b.a) bVar;
        Object b2 = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new d5g0(aVar.b, aVar.c, pn60Var)));
        if (!(b2 instanceof Result.Failure)) {
            qn60.c cVar2 = (qn60.c) b2;
            nn50Var.e(new awq0(new qr60.a.c(cVar2.a, cVar2.b, false, null, 24)));
        }
        Throwable a2 = Result.a(b2);
        if (a2 != null) {
            com.vk.metrics.eventtracking.b.a.a(a2);
        }
        return null;
    }
}
