package xsna;

import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.user.api.data.CommunityProfileDeeplinkParams;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunityProfileReviewFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class mth {
    public final csh a;
    public final k6h b;
    public final bee c;

    public mth(csh cshVar, k6h k6hVar, bee beeVar) {
        this.a = cshVar;
        this.b = k6hVar;
        this.c = beeVar;
    }

    public final void a(ExtendedCommunityProfile extendedCommunityProfile) {
        ExtendedCommunityProfile.d dVar;
        csh cshVar = this.a;
        CommunityProfileDeeplinkParams communityProfileDeeplinkParams = cshVar.b;
        if (communityProfileDeeplinkParams != null) {
            if (communityProfileDeeplinkParams.b && !extendedCommunityProfile.s2 && (((dVar = extendedCommunityProfile.C2) != null && dVar.c) || communityProfileDeeplinkParams.d != null)) {
                this.c.invoke(new d.j.g1(communityProfileDeeplinkParams));
            }
            cshVar.b = null;
        }
    }
}
