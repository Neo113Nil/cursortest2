package xsna;

import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.feature.ReactionsFeedMviState;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import kotlin.Result;
import xsna.ds60;
import xsna.jm50;
import xsna.qn60;
import xsna.qr60;

/* compiled from: ReactionsFeedMviExternalTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class f4f0 extends evg0<ReactionsFeedMviState, on50, t4f0, y4f0, k4f0, d4f0> {
    public final qn60 f;
    public final pn60 g;
    public final kq60 h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f4f0(g4f0 g4f0Var, es60 es60Var, nn50 nn50Var) {
        super(r4, nn50Var);
        jm50.a aVar = jm50.a.a;
        qn60 qn60Var = es60Var.a;
        this.f = qn60Var;
        pn60 pn60Var = es60Var.b;
        this.g = pn60Var;
        this.h = new kq60(qn60Var, pn60Var, es60Var.e, aVar, new eht(this, g4f0Var));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        ds60.b bVar = ((t4f0) hn50Var).b;
        NewsfeedExternalAction.c cVar = bVar.b;
        boolean z = cVar instanceof NewsfeedExternalAction.c.b;
        kq60 kq60Var = this.h;
        if (z) {
            kq60Var.s(new ds60.b(new NewsfeedExternalAction.c.f0(((NewsfeedExternalAction.c.b) cVar).a)));
            return null;
        }
        if (cVar instanceof NewsfeedExternalAction.c.e0) {
            kq60Var.s(new ds60.b(new NewsfeedExternalAction.c.f0(((NewsfeedExternalAction.c.e0) cVar).a)));
            return null;
        }
        boolean z2 = cVar instanceof NewsfeedExternalAction.c.h;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        pn60 pn60Var = this.g;
        qn60 qn60Var = this.f;
        if (z2) {
            Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new imo(((NewsfeedExternalAction.c.h) cVar).a, pn60Var)));
            if (!(b instanceof Result.Failure)) {
                qn60.c cVar2 = (qn60.c) b;
                nn50Var.e(new l4f0(new qr60.a.c(cVar2.a, cVar2.b, false, null, 24)));
            }
            Throwable a = Result.a(b);
            if (a != null) {
                com.vk.metrics.eventtracking.b.a.a(a);
            }
        } else if (cVar instanceof NewsfeedExternalAction.c.i) {
            Object b2 = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new hmo(((NewsfeedExternalAction.c.i) cVar).b, pn60Var)));
            if (!(b2 instanceof Result.Failure)) {
                qn60.c cVar3 = (qn60.c) b2;
                nn50Var.e(new l4f0(new qr60.a.c(cVar3.a, cVar3.b, false, null, 24)));
            }
            Throwable a2 = Result.a(b2);
            if (a2 != null) {
                com.vk.metrics.eventtracking.b.a.a(a2);
            }
        }
        kq60Var.s(bVar);
        return null;
    }
}
