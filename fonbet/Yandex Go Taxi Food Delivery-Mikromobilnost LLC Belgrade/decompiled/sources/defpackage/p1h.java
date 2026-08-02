package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.resolver.api.LinkResolveType;
import com.ybsdk.feature.resolver.internal.screens.empty.EmptyLinkResolverFragment;
import com.ybsdk.feature.resolver.internal.screens.empty.EmptyLinkResolverParams;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class p1h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ fly b;

    public /* synthetic */ p1h(fly flyVar, int i) {
        this.a = i;
        this.b = flyVar;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        fly flyVar = this.b;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.ShortUriResolver.Adjust)) {
                    return x0hVar;
                }
                String uri = ((DeeplinkAction.ShortUriResolver.Adjust) baseDeeplinkAction).getUri().toString();
                zcp0 zcp0Var = ((gly) flyVar).b;
                EmptyLinkResolverParams.Adjust adjust = new EmptyLinkResolverParams.Adjust(uri);
                OpenScreenRequirement.WithoutRequirements withoutRequirements = OpenScreenRequirement.WithoutRequirements.INSTANCE;
                zcp0Var.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("EmptyOnboardingScreen", false, adjust, TransitionPolicyType.NONE, qoi0.a(EmptyLinkResolverFragment.class), withoutRequirements, 2, null)), null, 6);
            case 1:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.ShortUriResolver.Common)) {
                    return x0hVar;
                }
                return new v0h(Collections.singletonList(((gly) flyVar).b(new LinkResolveType.ShortLink(((DeeplinkAction.ShortUriResolver.Common) baseDeeplinkAction).getUri().toString()))), null, 6);
            case 2:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Onboarding)) {
                    return x0hVar;
                }
                return new v0h(Collections.singletonList(((gly) flyVar).b(new LinkResolveType.OnboardingDeeplink(((DeeplinkAction.Onboarding) baseDeeplinkAction).getDeeplink().toString()))), null, 6);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.OpenLandingFromStartSession)) {
                    return x0hVar;
                }
                return new v0h(Collections.singletonList(((gly) flyVar).b(LinkResolveType.LandingFromStartSession.INSTANCE)), null, 6);
        }
    }
}
