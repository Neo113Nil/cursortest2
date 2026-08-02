package xsna;

import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;

/* compiled from: UserProfileRecommendationsFactoryDelegate.kt */
/* loaded from: classes5.dex */
public final class auq0 {
    public static UserProfileAdapterItem.p a(ExtendedUserProfile extendedUserProfile) {
        ProfilesRecommendations profilesRecommendations = extendedUserProfile.M;
        ArrayList<RecommendedProfile> arrayList = profilesRecommendations != null ? profilesRecommendations.l : null;
        if (arrayList == null || arrayList.isEmpty() || profilesRecommendations == null) {
            return null;
        }
        return new UserProfileAdapterItem.p(profilesRecommendations);
    }
}
