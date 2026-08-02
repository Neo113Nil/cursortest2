package xsna;

import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;

/* compiled from: CommunityProfileCoverReducerDelegate.kt */
/* loaded from: classes5.dex */
public final class jmh {
    public static CommunityProfileViewState.Data.c a(ExtendedCommunityProfile extendedCommunityProfile, r8h r8hVar) {
        Photo photo;
        if (extendedCommunityProfile == null) {
            return null;
        }
        ArrayList<StoriesContainer> arrayList = extendedCommunityProfile.d2;
        return w2h.c(extendedCommunityProfile) ? CommunityProfileViewState.Data.c.a.a : (arrayList == null || !(arrayList.isEmpty() ^ true) || r8hVar == null || bwd0.b(extendedCommunityProfile) || extendedCommunityProfile.g() || (!w2h.a(extendedCommunityProfile) && (bwd0.c(extendedCommunityProfile) || bwd0.f(extendedCommunityProfile)))) ? (extendedCommunityProfile.g() || (bwd0.f(extendedCommunityProfile) && extendedCommunityProfile.z1 == null && !w2h.a(extendedCommunityProfile))) ? CommunityProfileViewState.Data.c.AbstractC1625c.a.a : bwd0.b(extendedCommunityProfile) ? new CommunityProfileViewState.Data.c.AbstractC1625c.b(extendedCommunityProfile.n) : (!extendedCommunityProfile.e() || (photo = extendedCommunityProfile.A) == null) ? (!extendedCommunityProfile.e() && extendedCommunityProfile.A == null && w2h.a(extendedCommunityProfile)) ? CommunityProfileViewState.Data.c.AbstractC1625c.d.a : new CommunityProfileViewState.Data.c.AbstractC1625c.b(extendedCommunityProfile.n) : new CommunityProfileViewState.Data.c.AbstractC1625c.C1626c(photo, extendedCommunityProfile.n, w2h.a(extendedCommunityProfile)) : new CommunityProfileViewState.Data.c.b(r8hVar);
    }
}
