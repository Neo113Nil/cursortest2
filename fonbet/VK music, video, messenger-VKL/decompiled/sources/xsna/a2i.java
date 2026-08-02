package xsna;

import com.vkontakte.android.R;

/* compiled from: CommunitySettingsBottomSheetStringRes.kt */
/* loaded from: classes5.dex */
public final class a2i {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2i)) {
            return false;
        }
        ((a2i) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.community_unsubscribe_from_posts) + shy.a(R.string.community_subscribe_to_posts, Integer.hashCode(R.string.story_open_community_archive) * 31, 31);
    }

    public final String toString() {
        return "CommunitySettingsBottomSheetStringRes(storyArchiveId=2131964330, subscribeToPosts=2131955307, unsubscribeFromPosts=2131955346)";
    }
}
