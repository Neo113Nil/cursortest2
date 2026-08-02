package xsna;

import androidx.core.graphics.drawable.IconCompat;
import com.vk.log.L;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.user.impl.ui.f;
import xsna.e8v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ulq0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ulq0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                vlq0 vlq0Var = (vlq0) this.c;
                f.h hVar = (f.h) this.d;
                if (((Boolean) obj).booleanValue()) {
                    fpq0 fpq0Var = vlq0Var.k;
                    if (fpq0Var == null) {
                        fpq0Var = null;
                    }
                    fpq0Var.B(hVar);
                }
                return s3q0.a;
            case 1:
                ((q7v0) this.c).a((VkOnboardingCampaign) this.d, VkOnboardingType.Tooltip, e8v0.m.b);
                return s3q0.a;
            default:
                String str = (String) this.c;
                y4x0 y4x0Var = (y4x0) this.d;
                L.e("VVMOpponentAvatarDelegate", go9.b("Peer icon updated with url icon ", str));
                y4x0Var.g = (IconCompat) obj;
                return Boolean.TRUE;
        }
    }
}
