package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoFeedVideosForYouBlockItemsResultDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SuggestedVideosPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class e6n0 extends de {

    /* compiled from: SuggestedVideosPrefetchHelper.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<VideoFeedVideosForYouBlockItemsResultDto, Videos> {
        @Override // xsna.izs
        public final Videos invoke(VideoFeedVideosForYouBlockItemsResultDto videoFeedVideosForYouBlockItemsResultDto) {
            Map map;
            VideoFeedVideosForYouBlockItemsResultDto videoFeedVideosForYouBlockItemsResultDto2 = videoFeedVideosForYouBlockItemsResultDto;
            uks0 uks0Var = (uks0) this.receiver;
            Videos videos = uks0Var.a;
            List<GroupsGroupFullDto> e = videoFeedVideosForYouBlockItemsResultDto2.e();
            Map map2 = jgp.b;
            if (e != null) {
                List<GroupsGroupFullDto> list = e;
                equ equVar = uks0Var.c;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (GroupsGroupFullDto groupsGroupFullDto : list) {
                    equVar.getClass();
                    arrayList.add(equ.a(groupsGroupFullDto));
                }
                int e2 = on00.e(c5g.u(arrayList, 10));
                if (e2 < 16) {
                    e2 = 16;
                }
                map = new LinkedHashMap(e2);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    map.put(((Owner) next).b, next);
                }
            } else {
                map = map2;
            }
            List<UsersUserFullDto> g = videoFeedVideosForYouBlockItemsResultDto2.g();
            if (g != null) {
                List<UsersUserFullDto> list2 = g;
                k2r0 k2r0Var = uks0Var.b;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(k2r0Var.a((UsersUserFullDto) it2.next()));
                }
                int e3 = on00.e(c5g.u(arrayList2, 10));
                map2 = new LinkedHashMap(e3 >= 16 ? e3 : 16);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    map2.put(((Owner) next2).b, next2);
                }
            }
            List<VideoVideoFullDto> f = videoFeedVideosForYouBlockItemsResultDto2.f();
            ArrayList arrayList3 = new ArrayList(c5g.u(f, 10));
            Iterator<T> it4 = f.iterator();
            while (it4.hasNext()) {
                VideoFileOld d = ums0.d(ums0.a, (VideoVideoFullDto) it4.next(), null, null, null, 30);
                d.f1(fkq0.d(d.b) ? (Owner) map2.get(d.b) : fkq0.b(d.b) ? (Owner) map.get(d.b) : null);
                arrayList3.add(new EntryAttachment(new VideoAttachment(d), null, null, null, 14, null));
            }
            ArrayList<EntryAttachment> arrayList4 = videos.o;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
            ArrayList<EntryAttachment> arrayList5 = videos.o;
            if (arrayList5 != null) {
                arrayList5.addAll(arrayList3);
            }
            Videos videos2 = uks0Var.a;
            Videos Mb = Videos.Mb(videos2, videoFeedVideosForYouBlockItemsResultDto2.i().b, videoFeedVideosForYouBlockItemsResultDto2.d(), videoFeedVideosForYouBlockItemsResultDto2.getTitle(), null, 32730);
            Mb.c = videos2.c;
            Mb.g = videos2.g;
            Mb.h = videos2.h;
            return Mb;
        }
    }

    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 0;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        return null;
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q e0(String str, NewsEntry newsEntry) {
        String str2;
        Videos videos = newsEntry instanceof Videos ? (Videos) newsEntry : null;
        if (videos == null || (str2 = videos.v.b) == null) {
            return null;
        }
        tfx tfxVar = new tfx("video.feedVideosForYouBlockItems", new m2o0(3), new iyo0(2));
        tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        dz2 x = yfb.x(tfxVar);
        x.n = true;
        return di60.N(rsg0.y0(x, null, null, 3), new a(1, new uks0((Videos) newsEntry), uks0.class, "map", "map(Lcom/vk/api/generated/video/dto/VideoFeedVideosForYouBlockItemsResultDto;)Lcom/vk/dto/newsfeed/entries/Videos;", 0));
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q<NewsEntry> f0(u1c0 u1c0Var) {
        return e0(u1c0Var.l, u1c0Var.a);
    }

    @Override // xsna.de
    public final boolean l0() {
        return true;
    }
}
