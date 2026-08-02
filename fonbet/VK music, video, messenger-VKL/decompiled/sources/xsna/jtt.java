package xsna;

import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.podcast.dto.PodcastEpisodeListDto;
import com.vk.api.generated.podcasts.dto.PodcastsGetEpisodesOrderDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.podcast.PodcastListPage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.r1r0;
import xsna.wqu;

/* compiled from: GetPodcastListPageApiRequest.kt */
/* loaded from: classes3.dex */
public final class jtt extends awi<PodcastListPage> {
    public final UserId s;
    public final String t;
    public final int u;

    public jtt(int i, UserId userId, String str) {
        this.s = userId;
        this.t = str;
        this.u = i;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        String str;
        Object obj;
        String obj2;
        Iterator<E> it = PodcastsGetEpisodesOrderDto.i().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((PodcastsGetEpisodesOrderDto) obj).j(), this.t)) {
                break;
            }
        }
        PodcastsGetEpisodesOrderDto podcastsGetEpisodesOrderDto = (PodcastsGetEpisodesOrderDto) obj;
        if (podcastsGetEpisodesOrderDto == null) {
            podcastsGetEpisodesOrderDto = PodcastsGetEpisodesOrderDto.RECENT;
        }
        List<AudioAudioDto> d = ((PodcastEpisodeListDto) yfb.x(blb0.a(new clb0(), this.s, Integer.valueOf(this.u), 0, podcastsGetEpisodesOrderDto, null, 16)).f(l7r0Var)).d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it2 = d.iterator();
        while (it2.hasNext()) {
            arrayList.add(oc4.d((AudioAudioDto) it2.next()));
        }
        VKList vKList = new VKList(arrayList);
        UserId userId = this.s;
        if (fkq0.b(userId)) {
            List<GroupsGroupFullDto> d2 = ((GroupsGetByIdObjectResponseDto) yfb.x(wqu.a.a(null, Collections.singletonList(fkq0.a(userId)), null)).f(l7r0Var)).d();
            GroupsGroupFullDto groupsGroupFullDto = d2 != null ? (GroupsGroupFullDto) j5g.a0(d2) : null;
            obj2 = groupsGroupFullDto != null ? groupsGroupFullDto.y1() : null;
            if (groupsGroupFullDto != null) {
                str = groupsGroupFullDto.V1();
            }
        } else {
            List singletonList = Collections.singletonList(userId);
            if ((62 & 1) != 0) {
                singletonList = null;
            }
            UsersUserFullDto usersUserFullDto = (UsersUserFullDto) j5g.a0((List) yfb.x(r1r0.a.a(singletonList, null, null, null, null)).f(l7r0Var));
            StringBuilder sb = new StringBuilder();
            String D0 = usersUserFullDto != null ? usersUserFullDto.D0() : null;
            if (D0 == null) {
                D0 = "";
            }
            sb.append(D0);
            sb.append(' ');
            String x1 = usersUserFullDto != null ? usersUserFullDto.x1() : null;
            sb.append(x1 != null ? x1 : "");
            obj2 = drm0.p0(sb.toString()).toString();
            if (usersUserFullDto != null) {
                str = usersUserFullDto.r2();
            }
        }
        return new PodcastListPage(obj2, str, vKList);
    }
}
