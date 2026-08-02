package xsna;

import com.vk.api.generated.newsfeed.dto.NewsfeedItemDebugInfoDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemVideoVideoDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemWallpostFeedbackDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemCaptionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemTypeDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.wall.dto.WallWallpostAdsEasyPromoteDto;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.ads.EasyPromote;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: NewsfeedItemVideoDtoToVideosMapper.kt */
/* loaded from: classes4.dex */
public final class kn60 {
    public final pm01 a;

    /* compiled from: NewsfeedItemVideoDtoToVideosMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NewsfeedNewsfeedItemTypeDto.values().length];
            try {
                iArr[NewsfeedNewsfeedItemTypeDto.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kn60(sv1 sv1Var, pm01 pm01Var) {
        this.a = pm01Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Videos a(NewsfeedNewsfeedItemDto.NewsfeedItemVideoDto newsfeedItemVideoDto, LinkedHashMap linkedHashMap) {
        List<VideoVideoFullDto> d;
        EmptyList emptyList;
        EasyPromote easyPromote;
        Owner owner = (Owner) linkedHashMap.get(newsfeedItemVideoDto.p());
        if (a.$EnumSwitchMapping$0[newsfeedItemVideoDto.B().ordinal()] == 1) {
            NewsfeedItemVideoVideoDto C = newsfeedItemVideoDto.C();
            if (C != null) {
                d = C.d();
            }
            d = null;
        } else {
            NewsfeedItemVideoVideoDto g = newsfeedItemVideoDto.g();
            if (g != null) {
                d = g.d();
            }
            d = null;
        }
        if (d != null) {
            List<VideoVideoFullDto> list = d;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new EntryAttachment(((ppt0) ((bpn0) this.a.b).getValue()).a((VideoVideoFullDto) it.next(), linkedHashMap), null, null, null, 14, null));
            }
            emptyList = arrayList;
        } else {
            emptyList = EmptyList.b;
        }
        NewsfeedNewsfeedItemCaptionDto f = newsfeedItemVideoDto.f();
        Caption P = f != null ? x19.P(f, linkedHashMap) : null;
        NewsfeedNewsfeedItemHeaderDto l = newsfeedItemVideoDto.l();
        EntryHeader j = l != null ? skd.j(l, linkedHashMap) : pwu.b(owner);
        Float o = newsfeedItemVideoDto.o();
        NewsEntryWithAttachments.Cut cut = new NewsEntryWithAttachments.Cut(-1, -1, o != null ? o.floatValue() : 1.0f, false, 8, null);
        NewsEntry.TrackData trackData = new NewsEntry.TrackData(newsfeedItemVideoDto.r(), 0, 0L, false, false, null, null, 0, 254, null);
        Boolean u = newsfeedItemVideoDto.u();
        Boolean bool = Boolean.TRUE;
        boolean f2 = epx.f(u, bool);
        boolean f3 = epx.f(newsfeedItemVideoDto.e(), bool);
        WallWallpostAdsEasyPromoteDto d2 = newsfeedItemVideoDto.d();
        if (d2 != null) {
            int i = d2.g().i();
            Integer d3 = d2.d();
            easyPromote = new EasyPromote(i, d3 != null ? d3.intValue() : 0, d2.f(), d2.e());
        } else {
            easyPromote = null;
        }
        Videos videos = new Videos(newsfeedItemVideoDto.p().b, owner, newsfeedItemVideoDto.i(), p4g.q(emptyList), P, null, j, newsfeedItemVideoDto.B().i(), cut, new ArrayList(), trackData, null, f2, 0, easyPromote, 8192, null);
        videos.Sb(2, f2);
        videos.Sb(4, f3);
        videos.c = epx.f(newsfeedItemVideoDto.n(), bool);
        NewsfeedItemWallpostFeedbackDto k = newsfeedItemVideoDto.k();
        videos.g = k != null ? nn60.a(k) : null;
        NewsfeedItemDebugInfoDto j2 = newsfeedItemVideoDto.j();
        videos.h = j2 != null ? sv1.w(j2) : null;
        return videos;
    }
}
