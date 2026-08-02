package xsna;

import com.vk.voip.utils.timer.CountDownTimer;
import java.util.concurrent.TimeUnit;
import xsna.rwi0;
import xsna.swi0;
import xsna.wwi0;

/* compiled from: SessionRoomsFeature.kt */
/* loaded from: classes7.dex */
public final class owi0 implements CountDownTimer.a {
    public final /* synthetic */ mwi0 a;
    public final /* synthetic */ wwi0 b;

    public owi0(mwi0 mwi0Var, wwi0 wwi0Var) {
        this.a = mwi0Var;
        this.b = wwi0Var;
    }

    @Override // com.vk.voip.utils.timer.CountDownTimer.a
    public final void n0() {
        if (this.b.d) {
            mwi0 mwi0Var = this.a;
            mwi0Var.V(new rwi0.a.b(new f540(mwi0Var, 26)));
        }
    }

    @Override // com.vk.voip.utils.timer.CountDownTimer.a
    public final void s0(long j) {
        this.a.T(new swi0.a(new wwi0.a(j, true, TimeUnit.MILLISECONDS.toSeconds(j) <= 59)));
    }

    @Override // com.vk.voip.utils.timer.CountDownTimer.a
    public final void u0() {
        this.a.T(new swi0.a(new wwi0.a(0L, false, false)));
    }
}
