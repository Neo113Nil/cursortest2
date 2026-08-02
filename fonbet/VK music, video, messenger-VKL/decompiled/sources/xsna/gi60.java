package xsna;

import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.newsfeed.utils.NewsDebuggerPoint;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.lsw;
import xsna.r070;
import xsna.vs60;
import xsna.xn60;

/* compiled from: NewsfeedExternalActionActor.kt */
/* loaded from: classes4.dex */
public final class gi60 extends al50<qz60, vs60.b, on50, r070, jv60, xh60> {
    public final sj50<qz60, on50, r070, jv60, xh60> c;
    public final xc60 d;
    public final hq60 e;

    public gi60(ot60 ot60Var, zz60 zz60Var, sj50<qz60, on50, r070, jv60, xh60> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = new xc60(zz60Var.d, zz60Var.j, zz60Var.k);
        this.e = new hq60(new dht(this, ot60Var));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        NewsfeedExternalAction newsfeedExternalAction = ((vs60.b) lj50Var).b.b;
        boolean z = newsfeedExternalAction instanceof NewsfeedExternalAction.c;
        hq60 hq60Var = this.e;
        if (z) {
            hq60Var.p(new xn60.a(newsfeedExternalAction));
            return;
        }
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.d.a) {
            hq60Var.p(new xn60.a(newsfeedExternalAction));
            return;
        }
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.d.b) {
            hq60Var.p(new xn60.a(newsfeedExternalAction));
            return;
        }
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.d.c) {
            hq60Var.p(new xn60.a(newsfeedExternalAction));
            return;
        }
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.Navigation) {
            hq60Var.p(new xn60.a(newsfeedExternalAction));
            return;
        }
        if (newsfeedExternalAction instanceof NewsfeedExternalAction.b.a) {
            hq60Var.p(new xn60.a(newsfeedExternalAction));
            return;
        }
        if (newsfeedExternalAction instanceof ei60) {
            hq60Var.p(new xn60.a(newsfeedExternalAction));
            return;
        }
        if (!(newsfeedExternalAction instanceof NewsfeedExternalAction.e)) {
            if (newsfeedExternalAction instanceof fi60) {
                a(new r070.j.a(((fi60) newsfeedExternalAction).a));
                return;
            } else {
                if (!(newsfeedExternalAction instanceof NewsfeedExternalAction.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((NewsfeedExternalAction.a) newsfeedExternalAction).getClass();
                a(new r070.c(false, false));
                return;
            }
        }
        NewsfeedExternalAction.e eVar = (NewsfeedExternalAction.e) newsfeedExternalAction;
        xc60 xc60Var = this.d;
        lsw lswVar = xc60Var.a;
        AtomicReference<wn60> atomicReference = xc60Var.b;
        if (eVar.equals(NewsfeedExternalAction.e.b.a)) {
            x1o0.q(atomicReference, true);
            lswVar.a(lsw.b.e.C3291b.a);
        } else {
            if (!eVar.equals(NewsfeedExternalAction.e.a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            x1o0.q(atomicReference, false);
            lswVar.a(lsw.b.e.a.a);
        }
        xc60Var.c.k(NewsDebuggerPoint.ScreenVisibility, new us60(atomicReference.get().a));
    }
}
