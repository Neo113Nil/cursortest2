package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.actions.SbpAccountUnbind;
import com.ybsdk.feature.main.api.SbpAccountInfoScreenParams;
import com.ybsdk.feature.main.internal.screens.sbpAccount.SbpAccountInfoFragment;
import com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersFragment;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class c2h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ p400 b;

    public /* synthetic */ c2h(p400 p400Var, int i) {
        this.a = i;
        this.b = p400Var;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        p400 p400Var = this.b;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.FpsAccountMembers)) {
                    return x0hVar;
                }
                p400Var.b.getClass();
                byte[] bArr = new byte[21];
                for (int i2 = 0; i2 < 21; i2++) {
                    bArr[i2] = (byte) (cg91.f[i2] ^ cg91.a[i2 % 8]);
                }
                return new v0h(Collections.singletonList(new FragmentScreen(new String(bArr, uza.a), false, null, null, qoi0.a(SbpPartnersFragment.class), OpenScreenRequirement.WithYbSession.INSTANCE, 14, null)), null, 6);
            case 1:
                return baseDeeplinkAction instanceof DeeplinkAction.Products ? new v0h(Collections.singletonList(p400Var.b()), null, 6) : x0hVar;
            case 2:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.SbpAccountDetails)) {
                    return x0hVar;
                }
                SbpAccountInfoScreenParams sbpAccountInfoScreenParams = new SbpAccountInfoScreenParams(((DeeplinkAction.SbpAccountDetails) baseDeeplinkAction).getSbpAccountId());
                p400Var.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("SbpAccountInfoScreen", false, sbpAccountInfoScreenParams, TransitionPolicyType.POPUP, qoi0.a(SbpAccountInfoFragment.class), OpenScreenRequirement.WithYbSession.INSTANCE)), null, 6);
            case 3:
                if (!(baseDeeplinkAction instanceof SbpAccountUnbind)) {
                    return x0hVar;
                }
                SbpAccountInfoScreenParams sbpAccountInfoScreenParams2 = new SbpAccountInfoScreenParams(((SbpAccountUnbind) baseDeeplinkAction).getSbpAccountId());
                p400Var.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("SbpAccountInfoScreen", false, sbpAccountInfoScreenParams2, TransitionPolicyType.POPUP, qoi0.a(SbpAccountInfoFragment.class), OpenScreenRequirement.WithYbSession.INSTANCE)), null, 6);
            default:
                return baseDeeplinkAction instanceof DeeplinkAction.ShowSplitQrTooltipOnMainScreen ? new v0h(Collections.singletonList(p400Var.b()), null, 6) : x0hVar;
        }
    }
}
