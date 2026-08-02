package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams;
import com.ybsdk.feature.divkit.common.screen.api.DivkitScreenConfig;
import com.ybsdk.feature.status.screen.internal.ui.DivkitCommonFragment;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class a2h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ csl b;

    public /* synthetic */ a2h(csl cslVar, int i) {
        this.a = i;
        this.b = cslVar;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.A3RequisitesDivkit)) {
                    return x0hVar;
                }
                DeeplinkAction.A3RequisitesDivkit a3RequisitesDivkit = (DeeplinkAction.A3RequisitesDivkit) baseDeeplinkAction;
                String path = a3RequisitesDivkit.getPath();
                String skeleton = a3RequisitesDivkit.getSkeleton();
                String screen = a3RequisitesDivkit.getScreen();
                DivkitScreenConfig screenConfig = a3RequisitesDivkit.getScreenConfig();
                String invoiceId = a3RequisitesDivkit.getInvoiceId();
                this.b.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("DivkitA3RequisitesCommonFragment", false, new DivkitCommonScreenParams.A3Requisites(path, skeleton, screen, screenConfig, invoiceId), null, qoi0.a(DivkitCommonFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null)), null, 6);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Divkit)) {
                    return x0hVar;
                }
                DeeplinkAction.Divkit divkit = (DeeplinkAction.Divkit) baseDeeplinkAction;
                return new v0h(Collections.singletonList(this.b.b(divkit.getPath(), divkit.getSkeleton(), divkit.getScreen(), divkit.getScreenConfig(), divkit.getPayload(), divkit.getScreenSuffix())), null, 6);
        }
    }
}
