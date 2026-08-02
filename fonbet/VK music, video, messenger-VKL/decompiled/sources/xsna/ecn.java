package xsna;

import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.data.b;

/* compiled from: DismissableProfilesRecommendationsHolder.kt */
/* loaded from: classes4.dex */
public final class ecn {
    public static void a(ProfilesRecommendations profilesRecommendations) {
        NewsEntry.TrackData trackData = profilesRecommendations.q;
        String str = "friend_recomm_view:" + trackData.h + ':' + trackData.b;
        if (com.vkontakte.android.data.b.i(str)) {
            return;
        }
        b.d dVar = new b.d("view_block");
        dVar.b = true;
        dVar.c = true;
        dVar.b("||" + trackData.d + '|' + trackData.h + '|' + trackData.b, "blocks");
        dVar.e();
        com.vkontakte.android.data.b.e(1000L, str);
    }
}
