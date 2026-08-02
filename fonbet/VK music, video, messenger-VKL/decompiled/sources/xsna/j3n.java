package xsna;

import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import kotlin.NoWhenBranchMatchedException;
import xsna.m2n;
import xsna.xn60;

/* compiled from: DiscoverMediaExternalActionActor.kt */
/* loaded from: classes4.dex */
public final class j3n extends al50<t4n, m2n.a, on50, l5n, h4n, e3n> {
    public final sj50<t4n, on50, l5n, h4n, e3n> c;
    public final hq60 d;

    public j3n(z3n z3nVar, sj50<t4n, on50, l5n, h4n, e3n> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = new hq60(new dht(this, z3nVar));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        NewsfeedExternalAction newsfeedExternalAction = ((m2n.a) lj50Var).b.b;
        boolean z = newsfeedExternalAction instanceof NewsfeedExternalAction.c;
        hq60 hq60Var = this.d;
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
        } else if (!(newsfeedExternalAction instanceof NewsfeedExternalAction.e) && !(newsfeedExternalAction instanceof fi60) && !(newsfeedExternalAction instanceof NewsfeedExternalAction.a)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
