package xsna;

import xsna.ds60;
import xsna.jm50;
import xsna.xoq;
import xsna.yo60;

/* compiled from: FaveFeedMviOptionsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class dpq extends evg0<kpq, on50, vpq, rpq, ipq, xoq> {
    public final com.vk.channels.impl.channel_screen.send_msg.c f;
    public final kr60 g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dpq(es60 es60Var, cpq cpqVar, nn50 nn50Var) {
        super(r6, nn50Var);
        jm50.a aVar = jm50.a.a;
        com.vk.channels.impl.channel_screen.send_msg.c cVar = es60Var.c;
        this.f = cVar;
        this.g = new kr60(cVar, es60Var.e, es60Var.g, es60Var.i, es60Var.j, aVar, new eht(this, cpqVar));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        ds60.e eVar = ((vpq) hn50Var).b;
        boolean z = eVar instanceof ds60.e.k;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z) {
            c(new xoq.a(new yo60.f.i(((ds60.e.k) eVar).b, this.f.a(), ((kpq) nn50Var.getCurrentState()).d)));
            return null;
        }
        if (!(eVar instanceof ds60.e.r0)) {
            return this.g.d(eVar);
        }
        c(new xoq.a(new up60(((ds60.e.r0) eVar).b, ((kpq) nn50Var.getCurrentState()).d)));
        return null;
    }
}
