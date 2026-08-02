package xsna;

import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemDto;
import com.vk.api.generated.wall.dto.WallPostTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import java.util.ArrayList;

/* compiled from: NewsfeedItemWallpostDtoToPostMapper.kt */
/* loaded from: classes4.dex */
public final class mn60 {
    public static Post a(NewsfeedNewsfeedItemDto.NewsfeedItemWallpostDto newsfeedItemWallpostDto) {
        UserId q = newsfeedItemWallpostDto.q();
        if (q == null) {
            q = newsfeedItemWallpostDto.k();
        }
        UserId userId = q;
        Integer f = newsfeedItemWallpostDto.f();
        int intValue = (f == null && (f = newsfeedItemWallpostDto.g()) == null) ? -1 : f.intValue();
        Flags flags = new Flags(0L, 1, null);
        Owner owner = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
        UserId userId2 = UserId.d;
        int e = newsfeedItemWallpostDto.e();
        String l = newsfeedItemWallpostDto.l();
        if (l == null) {
            l = "";
        }
        String str = l;
        WallPostTypeDto i = newsfeedItemWallpostDto.i();
        String i2 = i != null ? i.i() : null;
        EntryHeader a = pwu.a();
        ArrayList arrayList = new ArrayList();
        Counters counters = new Counters(0, 0, 0, 0, 0, 0, 63, null);
        NewsEntry.TrackData trackData = new NewsEntry.TrackData(newsfeedItemWallpostDto.r(), 0, 0L, false, false, null, null, 0, 254, null);
        Float j = newsfeedItemWallpostDto.j();
        NewsEntryWithAttachments.Cut cut = new NewsEntryWithAttachments.Cut(-1, -1, j != null ? j.floatValue() : 1.0f, false, 8, null);
        Integer d = newsfeedItemWallpostDto.d();
        return new Post(flags, userId, intValue, owner, userId2, null, e, str, i2, null, null, false, null, a, arrayList, null, null, null, null, counters, false, null, null, null, false, null, trackData, null, cut, null, null, null, null, d != null ? d.intValue() : 0, newsfeedItemWallpostDto.n(), null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 65416, null);
    }
}
