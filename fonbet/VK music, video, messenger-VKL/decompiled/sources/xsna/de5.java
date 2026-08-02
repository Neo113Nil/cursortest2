package xsna;

import com.vk.catalog.mvi.block.video.impl.channel.AuthorsChannelSliderView$AuthorsChannelState;
import kotlin.NoWhenBranchMatchedException;
import xsna.me5;
import xsna.yd5;

/* compiled from: AuthorsChannelInlineActor.kt */
/* loaded from: classes16.dex */
public final class de5 extends u1a<AuthorsChannelSliderView$AuthorsChannelState, me5> {
    public final ie5 c;
    public final m7a d;

    public de5(b2a b2aVar, ie5 ie5Var, m7a m7aVar) {
        super(b2aVar);
        this.c = ie5Var;
        this.d = m7aVar;
        w1a.b(this, null, new ae5(this, null), 3);
    }

    @Override // xsna.u1a
    public final void g(me5 me5Var) {
        me5 me5Var2 = me5Var;
        b2a b2aVar = (b2a) this.b.b;
        if (!(me5Var2 instanceof me5.b)) {
            if (!(me5Var2 instanceof me5.a)) {
                throw new NoWhenBranchMatchedException();
            }
            t(new yd5.b(((me5.a) me5Var2).b, ((AuthorsChannelSliderView$AuthorsChannelState) b2aVar.getCurrentState()).d));
            return;
        }
        bpn0 bpn0Var = o25.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        if (!((b25) bpn0Var.getValue()).b()) {
            t(new yd5.a(((me5.b) me5Var2).b));
        } else if (((AuthorsChannelSliderView$AuthorsChannelState) b2aVar.getCurrentState()).f) {
            w1a.b(this, null, new ce5(this, ((AuthorsChannelSliderView$AuthorsChannelState) b2aVar.getCurrentState()).d, null), 3);
        } else {
            w1a.b(this, null, new be5(this, ((AuthorsChannelSliderView$AuthorsChannelState) b2aVar.getCurrentState()).d, null), 3);
        }
    }
}
