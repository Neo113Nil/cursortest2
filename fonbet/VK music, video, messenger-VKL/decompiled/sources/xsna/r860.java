package xsna;

import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState;

/* compiled from: NewPrivacyViewStateMapper.kt */
/* loaded from: classes4.dex */
public final class r860 {
    public static PrivacyViewState.c a(PrivacyPostType privacyPostType, kfd0 kfd0Var) {
        boolean equals = kfd0Var.b.d.equals(privacyPostType);
        if (privacyPostType instanceof PrivacyPostType.AllUsers) {
            return new PrivacyViewState.c.a(Boolean.valueOf(equals));
        }
        if (privacyPostType instanceof PrivacyPostType.FriendsOnly) {
            return new PrivacyViewState.c.d(Boolean.valueOf(equals));
        }
        if (privacyPostType instanceof PrivacyPostType.BestFriends) {
            return new PrivacyViewState.c.b(Boolean.valueOf(equals), kfd0Var.c);
        }
        if (privacyPostType instanceof PrivacyPostType.SingleDonutLevel) {
            return new PrivacyViewState.c.C1435c(Boolean.valueOf(equals), kfd0Var.b.f.size() > 1, ((PrivacyPostType.SingleDonutLevel) privacyPostType).b);
        }
        return null;
    }
}
