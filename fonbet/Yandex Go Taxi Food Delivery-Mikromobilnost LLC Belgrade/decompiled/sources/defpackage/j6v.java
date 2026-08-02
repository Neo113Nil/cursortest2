package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.kycesia.internal.screens.browser.OpenEsiaFragment;
import com.ybsdk.feature.kycesia.internal.screens.browser.OpenEsiaParams;
import com.ybsdk.navigation.ScenarioResultReceiver$EsiaUpgradeResult;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.OpenEsiaIdentificationParams;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.upgrade.a;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class j6v implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ j6v(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        List singletonList;
        int i = this.a;
        x0h x0hVar = x0h.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CloseEsia)) {
                    return x0hVar;
                }
                String applicationId = ((DeeplinkAction.CloseEsia) baseDeeplinkAction).getApplicationId();
                if (applicationId != null) {
                    a.a(aVar.c, aVar.d.a, applicationId);
                }
                aVar.e.i(ScenarioResultReceiver$EsiaUpgradeResult.SUCCESS);
                aVar.b.s0.a.a("esia.close", null);
                aVar.a.e();
                return new v0h(EmptyList.a, null, 6);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.OpenEsia)) {
                    return x0hVar;
                }
                DeeplinkAction.OpenEsia openEsia = (DeeplinkAction.OpenEsia) baseDeeplinkAction;
                kbo kboVar = aVar.h;
                aVar.b.s0.a.a("esia.open", null);
                String applicationId2 = openEsia.getApplicationId();
                if (applicationId2 != null) {
                    a.a(aVar.c, aVar.d.a, applicationId2);
                }
                b bVar = aVar.f;
                String esiaStartDeeplink = ((OpenEsiaIdentificationParams) bVar.d(bVar.i.s).getData()).getEsiaStartDeeplink();
                if (openEsia.getEsiaStartUri() != null) {
                    OpenEsiaParams openEsiaParams = new OpenEsiaParams(openEsia.getEsiaStartUri());
                    kboVar.b.getClass();
                    singletonList = Collections.singletonList(new FragmentScreen("OpenEsiaScreen", false, openEsiaParams, TransitionPolicyType.NONE, qoi0.a(OpenEsiaFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 2, null));
                } else if (esiaStartDeeplink == null || (singletonList = ((l3h) ((j3h) aVar.g.get())).c(esiaStartDeeplink)) == null) {
                    OpenEsiaParams openEsiaParams2 = new OpenEsiaParams(null);
                    kboVar.b.getClass();
                    singletonList = Collections.singletonList(new FragmentScreen("OpenEsiaScreen", false, openEsiaParams2, TransitionPolicyType.NONE, qoi0.a(OpenEsiaFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 2, null));
                }
                return new v0h(singletonList, null, 4);
        }
    }
}
