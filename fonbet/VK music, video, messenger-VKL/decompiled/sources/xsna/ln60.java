package xsna;

import com.vk.api.generated.newsfeed.dto.NewsfeedItemDebugInfoDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemWallpostFeedbackDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemCaptionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: NewsfeedItemVideosForYouBlockDtoToVideosMapper.kt */
/* loaded from: classes4.dex */
public final class ln60 {
    public final pm01 a;

    public ln60(sv1 sv1Var, pm01 pm01Var) {
        this.a = pm01Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Videos a(NewsfeedNewsfeedItemDto.NewsfeedItemVideosForYouBlockDto newsfeedItemVideosForYouBlockDto, LinkedHashMap linkedHashMap) {
        EmptyList emptyList;
        Owner owner = (Owner) linkedHashMap.get(newsfeedItemVideosForYouBlockDto.l());
        List<VideoVideoFullDto> i = newsfeedItemVideosForYouBlockDto.i();
        if (i != null) {
            List<VideoVideoFullDto> list = i;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new EntryAttachment(((ppt0) ((bpn0) this.a.b).getValue()).a((VideoVideoFullDto) it.next(), linkedHashMap), null, null, null, 14, null));
            }
            emptyList = arrayList;
        } else {
            emptyList = EmptyList.b;
        }
        NewsfeedNewsfeedItemCaptionDto d = newsfeedItemVideosForYouBlockDto.d();
        Caption P = d != null ? x19.P(d, linkedHashMap) : null;
        Float k = newsfeedItemVideosForYouBlockDto.k();
        NewsEntryWithAttachments.Cut cut = new NewsEntryWithAttachments.Cut(-1, -1, k != null ? k.floatValue() : 1.0f, false, 8, null);
        EntryHeader b = owner != null ? pwu.b(owner) : pwu.a();
        Boolean n = newsfeedItemVideosForYouBlockDto.n();
        Boolean bool = Boolean.TRUE;
        boolean f = epx.f(n, bool);
        Videos videos = new Videos(newsfeedItemVideosForYouBlockDto.l().b, owner, newsfeedItemVideosForYouBlockDto.e(), p4g.q(emptyList), P, newsfeedItemVideosForYouBlockDto.getTitle(), b, newsfeedItemVideosForYouBlockDto.o().i(), cut, new ArrayList(), new NewsEntry.TrackData(newsfeedItemVideosForYouBlockDto.r(), 0, 0L, false, false, null, null, 0, 254, null), null, epx.f(newsfeedItemVideosForYouBlockDto.n(), bool), 0, null, 24576, null);
        videos.Sb(2, f);
        videos.c = epx.f(newsfeedItemVideosForYouBlockDto.j(), bool);
        videos.e = epx.f(newsfeedItemVideosForYouBlockDto.p(), bool);
        NewsfeedItemWallpostFeedbackDto g = newsfeedItemVideosForYouBlockDto.g();
        videos.g = g != null ? nn60.a(g) : null;
        NewsfeedItemDebugInfoDto f2 = newsfeedItemVideosForYouBlockDto.f();
        videos.h = f2 != null ? sv1.w(f2) : null;
        return videos;
    }
}
