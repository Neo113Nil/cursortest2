package xsna;

import com.vk.api.generated.channels.dto.ChannelsChannelDto;
import com.vk.api.generated.channels.dto.ChannelsChannelTypeDto;
import com.vk.api.generated.channels.dto.ChannelsGetRecommendationsResponseDto;
import com.vk.api.generated.channels.dto.ChannelsRecommendationsResponseItemDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.channels.ChannelsRecommendation;
import com.vk.feed.core.models.channels.ChannelsRecommendations;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: ChannelsRecommendationsPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class cib extends de {

    /* compiled from: ChannelsRecommendationsPrefetchHelper.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<ChannelsGetRecommendationsResponseDto, ChannelsRecommendations> {
        @Override // xsna.izs
        public final ChannelsRecommendations invoke(ChannelsGetRecommendationsResponseDto channelsGetRecommendationsResponseDto) {
            ChannelsRecommendation a;
            GroupsGroupFullDto groupsGroupFullDto;
            Object obj;
            ChannelsGetRecommendationsResponseDto channelsGetRecommendationsResponseDto2 = channelsGetRecommendationsResponseDto;
            pfb pfbVar = (pfb) this.receiver;
            pfbVar.getClass();
            List<ChannelsRecommendationsResponseItemDto> e = channelsGetRecommendationsResponseDto2.e();
            ArrayList arrayList = new ArrayList(c5g.u(e, 10));
            Iterator<T> it = e.iterator();
            while (it.hasNext()) {
                arrayList.add(((ChannelsRecommendationsResponseItemDto) it.next()).d());
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                ChannelsChannelDto channelsChannelDto = (ChannelsChannelDto) next;
                List<String> f = channelsGetRecommendationsResponseDto2.f();
                String str = f != null ? (String) j5g.b0(i, f) : null;
                if (channelsChannelDto.e() == ChannelsChannelTypeDto.COMMUNITY_CHANNEL) {
                    List<GroupsGroupFullDto> d = channelsGetRecommendationsResponseDto2.d();
                    if (d != null) {
                        Iterator<T> it3 = d.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it3.next();
                            GroupsGroupFullDto groupsGroupFullDto2 = (GroupsGroupFullDto) obj;
                            UserId f2 = channelsChannelDto.f();
                            if (f2 != null && Math.abs(f2.b) == groupsGroupFullDto2.P0().b) {
                                break;
                            }
                        }
                        groupsGroupFullDto = (GroupsGroupFullDto) obj;
                    } else {
                        groupsGroupFullDto = null;
                    }
                    a = pfb.a(channelsChannelDto, groupsGroupFullDto != null ? groupsGroupFullDto.F() : null, str);
                } else {
                    a = pfb.a(channelsChannelDto, null, str);
                }
                arrayList2.add(a);
                i = i2;
            }
            ArrayList q = p4g.q(arrayList2);
            ChannelsRecommendations channelsRecommendations = pfbVar.a;
            ChannelsRecommendations channelsRecommendations2 = new ChannelsRecommendations(channelsRecommendations.i, q, channelsRecommendations.k, channelsRecommendations.l);
            channelsRecommendations2.c = channelsRecommendations.c;
            channelsRecommendations2.g = channelsRecommendations.g;
            channelsRecommendations2.h = channelsRecommendations.h;
            return channelsRecommendations2;
        }
    }

    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        ArrayList<ChannelsRecommendation> arrayList;
        NewsEntry newsEntry = u1c0Var.a;
        ChannelsRecommendations channelsRecommendations = newsEntry instanceof ChannelsRecommendations ? (ChannelsRecommendations) newsEntry : null;
        if (channelsRecommendations == null || (arrayList = channelsRecommendations.j) == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        ArrayList<ChannelsRecommendation> arrayList;
        ChannelsRecommendation channelsRecommendation;
        Image image;
        NewsEntry newsEntry = u1c0Var.a;
        ChannelsRecommendations channelsRecommendations = newsEntry instanceof ChannelsRecommendations ? (ChannelsRecommendations) newsEntry : null;
        if (channelsRecommendations == null || (arrayList = channelsRecommendations.j) == null || (channelsRecommendation = (ChannelsRecommendation) j5g.b0(i, arrayList)) == null || (image = channelsRecommendation.d) == null) {
            return null;
        }
        Serializer.c<Owner> cVar = Owner.CREATOR;
        return Owner.a.a(200, image);
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q e0(String str, NewsEntry newsEntry) {
        if (!(newsEntry instanceof ChannelsRecommendations)) {
            return null;
        }
        List singletonList = Collections.singletonList("category1_name");
        String uuid = UUID.randomUUID().toString();
        tfx tfxVar = new tfx("channels.getRecommendations", new zq(9), new com.vk.movika.sdk.android.defaultplayer.interactive.c(8));
        tfxVar.i("fields", singletonList);
        tfxVar.j("extended", true);
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, 0, 0, 0, 8);
        tfxVar.f(30, 1, 100, "count");
        if (uuid != null) {
            tfx.o(tfxVar, "query_uuid", uuid, 0, 0, 12);
        }
        dz2 x = yfb.x(tfxVar);
        x.n = true;
        return di60.N(rsg0.T(x), new a(1, new pfb((ChannelsRecommendations) newsEntry), pfb.class, "map", "map(Lcom/vk/api/generated/channels/dto/ChannelsGetRecommendationsResponseDto;)Lcom/vk/feed/core/models/channels/ChannelsRecommendations;", 0)).a0(asu0.a.d());
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q<NewsEntry> f0(u1c0 u1c0Var) {
        return e0(u1c0Var.l, u1c0Var.b);
    }

    @Override // xsna.de
    public final boolean l0() {
        return true;
    }
}
