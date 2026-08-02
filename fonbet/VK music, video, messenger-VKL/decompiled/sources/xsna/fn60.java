package xsna;

import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.groups.dto.GroupsSuggestionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemDebugInfoDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemWallpostFeedbackDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemDto;
import com.vk.dto.common.GroupsSuggestions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NewsfeedItemRecommendedGroupsBlockDtoToGroupSuggestionsMapper.kt */
/* loaded from: classes4.dex */
public final class fn60 {
    public final GroupsSuggestions a(NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedGroupsBlockDto newsfeedItemRecommendedGroupsBlockDto) {
        List<GroupsSuggestionDto> g = newsfeedItemRecommendedGroupsBlockDto.g();
        dqu dquVar = hru.a;
        ArrayList arrayList = new ArrayList(c5g.u(g, 10));
        Iterator<T> it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(hru.a((GroupsSuggestionDto) it.next()));
        }
        ArrayList q = p4g.q(arrayList);
        BaseLinkButtonDto d = newsfeedItemRecommendedGroupsBlockDto.d();
        GroupsSuggestions groupsSuggestions = new GroupsSuggestions(newsfeedItemRecommendedGroupsBlockDto.k().i(), newsfeedItemRecommendedGroupsBlockDto.getTitle(), newsfeedItemRecommendedGroupsBlockDto.j(), q, d != null ? wwf0.w(d) : null, newsfeedItemRecommendedGroupsBlockDto.r());
        groupsSuggestions.c = epx.f(newsfeedItemRecommendedGroupsBlockDto.i(), Boolean.TRUE);
        groupsSuggestions.e = newsfeedItemRecommendedGroupsBlockDto.l();
        NewsfeedItemWallpostFeedbackDto f = newsfeedItemRecommendedGroupsBlockDto.f();
        groupsSuggestions.g = f != null ? nn60.a(f) : null;
        NewsfeedItemDebugInfoDto e = newsfeedItemRecommendedGroupsBlockDto.e();
        groupsSuggestions.h = e != null ? sv1.w(e) : null;
        return groupsSuggestions;
    }
}
