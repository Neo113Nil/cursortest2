package defpackage;

import com.yandex.go.something_wrong_screen.ui.SomethingWrongOnboardingScreenModalView;
import com.yandex.go.taxi.order.info.OrderInfoModalView;

/* loaded from: classes14.dex */
public final class by70 extends m230 {
    public final /* synthetic */ int E = 0;
    public final yvf0 F;
    public final w030 G;
    public final boolean H;

    public by70(w030 w030Var, ge50 ge50Var) {
        super(null);
        this.G = w030Var;
        this.F = ge50Var;
        this.H = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.E) {
        }
        return this.G;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.E) {
        }
        return this.H;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        switch (this.E) {
            case 0:
                return (OrderInfoModalView) this.F.get();
            default:
                return (SomethingWrongOnboardingScreenModalView) this.F.get();
        }
    }

    public by70(zmm0 zmm0Var, w030 w030Var) {
        super(null);
        this.F = zmm0Var;
        this.G = w030Var;
        this.H = true;
    }
}
