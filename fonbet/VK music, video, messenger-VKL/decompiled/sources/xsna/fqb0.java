package xsna;

import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollGradient;

/* compiled from: PollBackgroundSmallViewHolders.kt */
/* loaded from: classes4.dex */
public final class fqb0 extends bnb0<PollBackground> {
    public fqb0() {
        throw null;
    }

    @Override // xsna.bnb0, xsna.vif0
    public final void i6(Object obj) {
        PollBackground pollBackground = (PollBackground) obj;
        super.i6(pollBackground);
        t8m0 t8m0Var = (t8m0) this.r.getBackground();
        Float[] fArr = t8m0.k;
        t8m0Var.b(pollBackground, null);
    }

    @Override // xsna.bnb0
    public final String s6(PollBackground pollBackground) {
        String str;
        PollBackground pollBackground2 = pollBackground;
        PollGradient pollGradient = pollBackground2 instanceof PollGradient ? (PollGradient) pollBackground2 : null;
        return (pollGradient == null || (str = pollGradient.f) == null) ? super.s6(pollBackground2) : str;
    }
}
