package xsna;

import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunityProfileToolbarRedesignStateBuilder.kt */
/* loaded from: classes5.dex */
public final class cuh {
    public static CommunityProfileState.d a(CommunityProfileState communityProfileState, ExtendedCommunityProfile extendedCommunityProfile, boolean z) {
        int i;
        CommunityProfileState.d dVar = communityProfileState.o;
        if (z) {
            return dVar;
        }
        boolean z2 = dVar instanceof CommunityProfileState.d.C1624d;
        return ((z2 || (dVar instanceof CommunityProfileState.d.e)) && (extendedCommunityProfile.a1 == 1)) ? CommunityProfileState.d.c.a : ((z2 || (dVar instanceof CommunityProfileState.d.c) || (dVar instanceof CommunityProfileState.d.a)) && (((i = extendedCommunityProfile.Y) == 0 && extendedCommunityProfile.Z == 0) || i == 2) && bwd0.h(extendedCommunityProfile)) ? CommunityProfileState.d.e.a : (!(dVar instanceof CommunityProfileState.d.e) || bwd0.h(extendedCommunityProfile)) ? dVar : CommunityProfileState.d.C1624d.a;
    }
}
