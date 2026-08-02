package defpackage;

import androidx.fragment.app.Fragment;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.resolver.api.LinkResolveType;
import com.ybsdk.feature.resolver.internal.screens.empty.EmptyLinkResolverFragment;
import com.ybsdk.feature.resolver.internal.screens.empty.EmptyLinkResolverParams;
import java.util.Map;

/* loaded from: classes3.dex */
public final class gly implements fly, kcs {
    public final /* synthetic */ tc9 a;
    public final zcp0 b;

    public gly(zcp0 zcp0Var, Map map) {
        this.a = new tc9(map, 10);
        this.b = zcp0Var;
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        return this.a.a(str);
    }

    public final FragmentScreen b(LinkResolveType linkResolveType) {
        EmptyLinkResolverParams.Common common = new EmptyLinkResolverParams.Common(linkResolveType);
        OpenScreenRequirement openScreenRequirement = linkResolveType instanceof LinkResolveType.ShortLink ? OpenScreenRequirement.WithYbSession.INSTANCE : OpenScreenRequirement.WithoutRequirements.INSTANCE;
        this.b.getClass();
        return new FragmentScreen("EmptyOnboardingScreen", false, common, TransitionPolicyType.NONE, qoi0.a(EmptyLinkResolverFragment.class), openScreenRequirement, 2, null);
    }
}
