package xsna;

import com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions;
import com.vk.profile.user.impl.util.UserProfileContentTab;

/* compiled from: ContentTabExt.kt */
/* loaded from: classes5.dex */
public final class dlj {
    public static final String a(ProfileTabOptions profileTabOptions) {
        if (profileTabOptions instanceof ProfileTabOptions.Wall) {
            return UserProfileContentTab.WALL.h();
        }
        if (profileTabOptions instanceof ProfileTabOptions.Photo) {
            return UserProfileContentTab.PHOTOS.h();
        }
        if (profileTabOptions instanceof ProfileTabOptions.Clip) {
            return UserProfileContentTab.SHORT_CLIPS.h();
        }
        if (profileTabOptions instanceof ProfileTabOptions.Video) {
            return UserProfileContentTab.VIDEOS.h();
        }
        if (profileTabOptions instanceof ProfileTabOptions.Music) {
            return UserProfileContentTab.AUDIOS.h();
        }
        if (profileTabOptions instanceof ProfileTabOptions.Narrative) {
            return UserProfileContentTab.NARRATIVES.h();
        }
        if (profileTabOptions instanceof ProfileTabOptions.Article) {
            return UserProfileContentTab.ARTICLES.h();
        }
        return null;
    }
}
