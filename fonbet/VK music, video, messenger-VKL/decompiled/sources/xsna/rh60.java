package xsna;

import com.vk.api.generated.newsfeed.dto.NewsfeedCaptionInfoButtonActionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedDzenStoryNewsBlockItemDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedMediascopeResearchDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedMediascopeResearchEventDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderImageDto;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.ImagePhoto;
import com.vk.feed.core.models.NewsfeedResearch;
import com.vk.feed.core.models.NewsfeedResearchEvent;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.dzen.DzenStory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.sd60;

/* compiled from: NewsfeedDzenStoryNewsBlockItemDtoToDzenStoryItemMapper.kt */
/* loaded from: classes4.dex */
public final class rh60 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    public final DzenStory.DzenStoryItem a(NewsfeedDzenStoryNewsBlockItemDto newsfeedDzenStoryNewsBlockItemDto, LinkedHashMap linkedHashMap) {
        NewsfeedResearch newsfeedResearch;
        ?? r1;
        NewsfeedNewsfeedItemHeaderImageDto g = newsfeedDzenStoryNewsBlockItemDto.g();
        ImagePhoto o = g != null ? sd9.o(g, linkedHashMap) : null;
        DzenNews.ItemHeader a = sh60.a(newsfeedDzenStoryNewsBlockItemDto.j());
        String e = newsfeedDzenStoryNewsBlockItemDto.f().e();
        if (e == null) {
            e = "";
        }
        DzenStory.Description description = new DzenStory.Description(e);
        NewsfeedCaptionInfoButtonActionDto d = newsfeedDzenStoryNewsBlockItemDto.d();
        ActionOpenUrl actionOpenUrl = d != null ? new ActionOpenUrl(d.getUrl(), sd60.a.$EnumSwitchMapping$0[d.d().ordinal()] == 1 ? ActionOpenUrl.Target.f88internal : ActionOpenUrl.Target.f30default) : new ActionOpenUrl("", ActionOpenUrl.Target.f30default);
        String r = newsfeedDzenStoryNewsBlockItemDto.r();
        Integer e2 = newsfeedDzenStoryNewsBlockItemDto.e();
        int intValue = e2 != null ? e2.intValue() : 0;
        NewsfeedMediascopeResearchDto i = newsfeedDzenStoryNewsBlockItemDto.i();
        if (i != null) {
            List<String> e3 = i.e();
            if (e3 == null) {
                e3 = EmptyList.b;
            }
            List<NewsfeedMediascopeResearchEventDto> d2 = i.d();
            if (d2 != null) {
                List<NewsfeedMediascopeResearchEventDto> list = d2;
                r1 = new ArrayList(c5g.u(list, 10));
                for (NewsfeedMediascopeResearchEventDto newsfeedMediascopeResearchEventDto : list) {
                    UserId userId = new UserId(newsfeedMediascopeResearchEventDto.e() != null ? r11.intValue() : 0L);
                    String d3 = newsfeedMediascopeResearchEventDto.d();
                    if (d3 == null) {
                        d3 = "";
                    }
                    r1.add(new NewsfeedResearchEvent(userId, d3));
                }
            } else {
                r1 = EmptyList.b;
            }
            newsfeedResearch = new NewsfeedResearch(e3, r1);
        } else {
            newsfeedResearch = null;
        }
        return new DzenStory.DzenStoryItem(o, a, description, actionOpenUrl, r, intValue, newsfeedResearch);
    }
}
