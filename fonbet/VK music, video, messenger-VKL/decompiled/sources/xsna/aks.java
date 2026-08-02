package xsna;

import com.vk.api.generated.friends.dto.FriendsAddResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetRecommendationsResponseDto;
import com.vk.api.generated.friends.dto.FriendsUserRecommendationsDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FriendsAddWithRecommendations.kt */
/* loaded from: classes14.dex */
public final class aks extends awi<bks> {
    public final UserId s;
    public final String t;
    public final String u;
    public final Boolean v;
    public final String w;

    public aks(UserId userId, Boolean bool, String str, String str2, String str3) {
        this.s = userId;
        this.t = str;
        this.u = str2;
        this.v = bool;
        this.w = str3;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        ots otsVar = new ots();
        ProfilesRecommendations profilesRecommendations = null;
        String str = this.t;
        String str2 = (str == null || str.length() <= 0) ? null : str;
        Boolean bool = Boolean.FALSE;
        FriendsAddResponseDto friendsAddResponseDto = (FriendsAddResponseDto) yfb.x(nts.d(otsVar, this.s, str2, bool, this.u, null, this.w, null, 80)).f(l7r0Var);
        int i = friendsAddResponseDto.i();
        if (friendsAddResponseDto == FriendsAddResponseDto.SEND && epx.f(this.v, bool)) {
            FriendsGetRecommendationsResponseDto friendsGetRecommendationsResponseDto = (FriendsGetRecommendationsResponseDto) yfb.x(nts.i(otsVar, 20, null, this.u, "inline_user_rec", null, this.s, "on_add", 638)).f(l7r0Var);
            List<FriendsUserRecommendationsDto> e = friendsGetRecommendationsResponseDto.e();
            ArrayList arrayList = new ArrayList(c5g.u(e, 10));
            Iterator<T> it = e.iterator();
            while (it.hasNext()) {
                arrayList.add(new xts().a((FriendsUserRecommendationsDto) it.next()));
            }
            profilesRecommendations = new uos(new ProfilesRecommendations("inline_user_rec", null, null, p4g.q(arrayList), (int) this.s.b, null, null, "on_add", new NewsEntry.TrackData(friendsGetRecommendationsResponseDto.r(), 0, 0L, false, false, null, null, 0, 254, null))).a(friendsGetRecommendationsResponseDto);
        }
        return new bks(i, profilesRecommendations);
    }

    @Override // xsna.xz2
    public final int[] l() {
        return new int[]{9};
    }
}
