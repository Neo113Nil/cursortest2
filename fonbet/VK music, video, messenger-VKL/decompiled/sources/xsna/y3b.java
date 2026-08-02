package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.toggle.features.ImFeatures;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.b4b;
import xsna.f4b;
import xsna.g4b;
import xsna.x3b;

/* compiled from: ChannelMonetizationFeature.kt */
/* loaded from: classes16.dex */
public final class y3b extends wk50<l4b, j4b, x3b, f4b> {
    public final UserId f;
    public final UserId g;
    public final oib h;
    public final dy2 i;
    public final f4z j;
    public final f4z k;

    public y3b(UserId userId, UserId userId2, a1w a1wVar, oib oibVar, dy2 dy2Var) {
        super(x3b.b.b, new i4b());
        this.f = userId;
        this.g = userId2;
        this.h = oibVar;
        this.i = dy2Var;
        this.j = new f4z();
        this.k = new f4z();
        ImFeatures imFeatures = ImFeatures.VKM_CHANNEL_DONUT_REACTION;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            lxa lxaVar = new lxa(userId2.b, a1wVar);
            a7f0.a.e(this, lxaVar.e, null, new jm0(this, 9), new wh6(5), null, 9);
        }
    }

    @Override // xsna.wk50
    public final void N(j4b j4bVar, x3b x3bVar) {
        j4b j4bVar2 = j4bVar;
        x3b x3bVar2 = x3bVar;
        g4b g4bVar = j4bVar2.h;
        if (x3bVar2.equals(x3b.b.b)) {
            T(f4b.b.b);
            return;
        }
        if (x3bVar2.equals(x3b.a.b)) {
            U();
            return;
        }
        if (x3bVar2.equals(x3b.h.b)) {
            U();
            return;
        }
        boolean equals = x3bVar2.equals(x3b.d.b);
        f4z f4zVar = this.j;
        if (equals) {
            f4zVar.b(b4b.b.a);
            return;
        }
        boolean equals2 = x3bVar2.equals(x3b.g.b);
        UserId userId = this.f;
        if (equals2) {
            f4zVar.b(new b4b.e(userId));
            return;
        }
        if (x3bVar2.equals(x3b.e.b)) {
            if (g4bVar instanceof g4b.b) {
                f4zVar.b(new b4b.c(userId));
                return;
            }
            boolean z = !j4bVar2.e;
            this.h.getClass();
            tfx tfxVar = new tfx("channels.enableMessagesPaidReactions", new cr(7), new io.reactivex.rxjava3.internal.operators.observable.n0(12));
            tfx.n(tfxVar, "channel_id", this.g, 0L, -1L, 4);
            tfxVar.j("paid_reactions_enabled", z);
            a7f0.a.f(this, rsg0.W(yfb.x(tfxVar), 7), new com.vk.movika.sdk.base.ui.s0(5, j4bVar2, this), new rf(12), 1);
            return;
        }
        if (!x3bVar2.equals(x3b.f.b)) {
            if (!x3bVar2.equals(x3b.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(b4b.a.a);
        } else if (epx.f(g4bVar, g4b.b.a)) {
            f4zVar.b(new b4b.c(userId));
        } else {
            f4zVar.b(new b4b.d(userId));
        }
    }

    public final void U() {
        a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.n(rsg0.W(yfb.x(this.i.d(fkq0.e(this.f))), 7), new tp0(new zx0(this, 17), 5)), new fm0(this, 13), new g20(this, 18), 1);
    }
}
