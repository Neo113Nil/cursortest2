package xsna;

import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.podcast.dto.PodcastEpisodeListDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastPage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: GetPodcastPage.kt */
/* loaded from: classes15.dex */
public final class ktt extends awi<PodcastPage> {
    public final UserId s;
    public final int t;
    public final int u = 30;
    public final String v;

    /* compiled from: GetPodcastPage.kt */
    public static final class a {
        public final AudioAudioDto a;
        public final PodcastEpisodeListDto b;
        public final boolean c;
        public final Integer d;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this((AudioAudioDto) null, (PodcastEpisodeListDto) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), 15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            AudioAudioDto audioAudioDto = this.a;
            int hashCode = (audioAudioDto == null ? 0 : audioAudioDto.hashCode()) * 31;
            PodcastEpisodeListDto podcastEpisodeListDto = this.b;
            int b = qoy.b((hashCode + (podcastEpisodeListDto == null ? 0 : podcastEpisodeListDto.hashCode())) * 31, 31, this.c);
            Integer num = this.d;
            return b + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InternalPodcastPage(current=");
            sb.append(this.a);
            sb.append(", also=");
            sb.append(this.b);
            sb.append(", canSubscribe=");
            sb.append(this.c);
            sb.append(", podcastId=");
            return uqi.b(sb, this.d, ')');
        }

        public /* synthetic */ a(AudioAudioDto audioAudioDto, PodcastEpisodeListDto podcastEpisodeListDto, Integer num, int i) {
            this((i & 1) != 0 ? null : audioAudioDto, (i & 2) != 0 ? null : podcastEpisodeListDto, false, (i & 8) != 0 ? null : num);
        }

        public a(AudioAudioDto audioAudioDto, PodcastEpisodeListDto podcastEpisodeListDto, boolean z, Integer num) {
            this.a = audioAudioDto;
            this.b = podcastEpisodeListDto;
            this.c = z;
            this.d = num;
        }
    }

    public ktt(UserId userId, int i, String str) {
        this.s = userId;
        this.t = i;
        this.v = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        ArrayList arrayList;
        List<AudioAudioDto> d;
        clb0 clb0Var = new clb0();
        tfx tfxVar = new tfx("podcasts.getEpisode", new cr(22), new e630(5));
        UserId userId = this.s;
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "episode_id", this.t, 0, 0, 8);
        String str = this.v;
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        a aVar = (a) new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.A(rsg0.w0(yfb.x(tfxVar)), rsg0.w0(yfb.x(blb0.a(clb0Var, this.s, Integer.valueOf(this.u), 0, null, this.v, 8))), rsg0.w0(yfb.x(clb0Var.d(userId, str))), new pa(new kbi(5), 20)), new j7(new nvg(this, 29), 28)).c();
        AudioAudioDto audioAudioDto = aVar.a;
        MusicTrack d2 = audioAudioDto != null ? oc4.d(audioAudioDto) : null;
        PodcastEpisodeListDto podcastEpisodeListDto = aVar.b;
        if (podcastEpisodeListDto == null || (d = podcastEpisodeListDto.d()) == null) {
            arrayList = new ArrayList(0);
        } else {
            List<AudioAudioDto> list = d;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(oc4.d((AudioAudioDto) it.next()));
            }
            arrayList = p4g.q(arrayList2);
        }
        boolean z = aVar.c;
        Integer num = aVar.d;
        return new PodcastPage(d2, arrayList, z, num != null ? num.intValue() : 0);
    }
}
