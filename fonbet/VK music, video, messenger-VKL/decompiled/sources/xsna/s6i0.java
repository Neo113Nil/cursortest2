package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.ui.utils.CreateChannelFlowTracker;
import kotlin.NoWhenBranchMatchedException;
import xsna.t6i0;
import xsna.w6i0;

/* compiled from: SelectChannelFeature.kt */
/* loaded from: classes16.dex */
public final class s6i0 extends di6<z6i0, w6i0, y6i0, t6i0> {
    public final a1w h;

    public s6i0(a1w a1wVar) {
        super(new z6i0(0));
        this.h = a1wVar;
        io.reactivex.rxjava3.internal.operators.single.c C = a1wVar.C(this, new ftt(Source.ACTUAL));
        asu0 asu0Var = asu0.a;
        j(C.q(asu0Var.c()).m(asu0Var.d()), new fv70(this, 10), new tts(this, 24));
    }

    @Override // xsna.di6
    public final void d(w6i0 w6i0Var) {
        w6i0 w6i0Var2 = w6i0Var;
        if (!(w6i0Var2 instanceof w6i0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Peer peer = ((w6i0.a) w6i0Var2).b;
        if (peer instanceof Peer.User) {
            CreateChannelFlowTracker.a(CreateChannelFlowTracker.CreateChannelFlowTrackEvent.CLICK_MAKE_PERSONAL_CHANNEL);
            m(new t6i0.a(peer));
            return;
        }
        CreateChannelFlowTracker.a(CreateChannelFlowTracker.CreateChannelFlowTrackEvent.CLICK_MAKE_CHANNEL_FROM_GROUP);
        io.reactivex.rxjava3.internal.operators.single.c C = this.h.C(this, new ywa(23, com.vk.dto.common.a.b(peer), null, null, false));
        asu0 asu0Var = asu0.a;
        j(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(C.q(asu0Var.c()).m(asu0Var.d()), new w250(new r6i0(this, 0), 15)), new v29(this, 3)), new ux00(this, 18), new a8v(this, 17));
    }
}
