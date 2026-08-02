package xsna;

import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.podcast.dto.PodcastEpisodeListDto;
import com.vk.api.generated.podcasts.dto.PodcastsGetEpisodesOrderDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PodcastsGetEpisodesWithInfo.kt */
/* loaded from: classes3.dex */
public final class ykb0 extends awi<a> {
    public final UserId s;
    public final int t;
    public final int u;
    public final String v;

    /* compiled from: PodcastsGetEpisodesWithInfo.kt */
    public static final class a {
        public final PodcastInfo a;
        public final VKList<MusicTrack> b;
        public final VKList<MusicTrack> c;

        public a(PodcastInfo podcastInfo, VKList<MusicTrack> vKList, VKList<MusicTrack> vKList2) {
            this.a = podcastInfo;
            this.b = vKList;
            this.c = vKList2;
        }
    }

    public ykb0(int i, UserId userId, int i2, String str) {
        this.s = userId;
        this.t = i;
        this.u = i2;
        this.v = str;
    }

    public static VKList F0(PodcastEpisodeListDto podcastEpisodeListDto) {
        List<AudioAudioDto> d = podcastEpisodeListDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(oc4.d((AudioAudioDto) it.next()));
        }
        return new VKList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        clb0 clb0Var = new clb0();
        PodcastsGetEpisodesOrderDto podcastsGetEpisodesOrderDto = PodcastsGetEpisodesOrderDto.RECENT;
        Integer valueOf = Integer.valueOf(this.u);
        int i = this.t;
        io.reactivex.rxjava3.internal.operators.observable.l2 l0 = rsg0.l0(yfb.x(clb0Var.b(this.s, valueOf, Integer.valueOf(i), podcastsGetEpisodesOrderDto, this.v)), null, 3);
        if (i != 0) {
            return new a(null, null, F0((PodcastEpisodeListDto) l0.a()));
        }
        return (a) io.reactivex.rxjava3.core.q.J0(rsg0.l0(yfb.z(clb0Var.d(this.s, this.v), new xsq(19)), null, 3).L(new fhb0(new uv20(this, 21), 1), false), rsg0.l0(yfb.x(clb0Var.b(this.s, 3, 0, PodcastsGetEpisodesOrderDto.POPULAR, this.v)), null, 3), l0, new iu4(new lci(this), 29)).a();
    }
}
