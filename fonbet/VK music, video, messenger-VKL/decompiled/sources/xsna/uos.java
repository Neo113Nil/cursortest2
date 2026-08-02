package xsna;

import com.vk.api.generated.friends.dto.FriendsGetRecommendationsResponseDto;
import com.vk.api.generated.friends.dto.FriendsRecBlockInfoCardDto;
import com.vk.api.generated.friends.dto.FriendsUserRecommendationsDto;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FriendsGetRecommendationsResponseDtoToProfilesRecommendationsMapper.kt */
/* loaded from: classes3.dex */
public final class uos {
    public final ProfilesRecommendations a;

    public uos(ProfilesRecommendations profilesRecommendations) {
        this.a = profilesRecommendations;
    }

    public final ProfilesRecommendations a(FriendsGetRecommendationsResponseDto friendsGetRecommendationsResponseDto) {
        xts xtsVar = new xts();
        String title = friendsGetRecommendationsResponseDto.getTitle();
        List<FriendsUserRecommendationsDto> e = friendsGetRecommendationsResponseDto.e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        Iterator<T> it = e.iterator();
        while (it.hasNext()) {
            arrayList.add(xtsVar.a((FriendsUserRecommendationsDto) it.next()));
        }
        ArrayList q = p4g.q(arrayList);
        String f = friendsGetRecommendationsResponseDto.f();
        FriendsRecBlockInfoCardDto d = friendsGetRecommendationsResponseDto.d();
        ProfilesRecommendations.InfoCard a = d != null ? qrs.a(d) : null;
        NewsEntry.TrackData zb = NewsEntry.TrackData.zb(this.a.q, friendsGetRecommendationsResponseDto.r());
        ProfilesRecommendations profilesRecommendations = this.a;
        ProfilesRecommendations Eb = ProfilesRecommendations.Eb(profilesRecommendations, title, f, q, a, zb);
        Eb.c = profilesRecommendations.c;
        Eb.g = profilesRecommendations.g;
        Eb.h = profilesRecommendations.h;
        return Eb;
    }
}
