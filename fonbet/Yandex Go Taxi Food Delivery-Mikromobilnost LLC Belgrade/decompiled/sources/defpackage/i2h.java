package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.menu.presentation.MenuFragment;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class i2h implements k3h {
    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        if (!(baseDeeplinkAction instanceof DeeplinkAction.Profile)) {
            return x0h.a;
        }
        return new v0h(Collections.singletonList(new FragmentScreen("MenuScreen", false, null, TransitionPolicyType.POPUP, qoi0.a(MenuFragment.class), OpenScreenRequirement.WithYbSession.INSTANCE, 6, null)), null, 6);
    }
}
