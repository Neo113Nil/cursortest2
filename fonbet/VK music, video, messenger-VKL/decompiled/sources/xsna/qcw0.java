package xsna;

import com.vk.voip.VoipService;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import kotlin.NoWhenBranchMatchedException;
import xsna.bjw0;
import xsna.tj50;
import xsna.u820;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qcw0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ qcw0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                u820 u820Var = (u820) obj;
                if (epx.f(u820Var, u820.a.a)) {
                    return new VoipActionsFeatureState.i(false, "", "");
                }
                if (!(u820Var instanceof u820.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                u820.b bVar = (u820.b) u820Var;
                return new VoipActionsFeatureState.i(true, bVar.a, bVar.b);
            case 1:
                return new bjw0.c(((tj50.a) obj).a(new riw0(0), ao8.d));
            default:
                Object obj2 = VoipService.q;
                return s3q0.a;
        }
    }
}
