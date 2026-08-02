package xsna;

import com.ironsource.C4504q2;
import com.vk.api.generated.podcasts.dto.PodcastsGetEpisodesOrderDto;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: PodcastsService.kt */
/* loaded from: classes.dex */
public interface blb0 {
    static /* synthetic */ xy2 a(clb0 clb0Var, UserId userId, Integer num, Integer num2, PodcastsGetEpisodesOrderDto podcastsGetEpisodesOrderDto, String str, int i) {
        if ((i & 8) != 0) {
            podcastsGetEpisodesOrderDto = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        return clb0Var.b(userId, num, num2, podcastsGetEpisodesOrderDto, str);
    }

    default tfx b(UserId userId, Integer num, Integer num2, PodcastsGetEpisodesOrderDto podcastsGetEpisodesOrderDto, String str) {
        tfx tfxVar = new tfx("podcasts.getEpisodes", new dn(29), new zy60(2));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "count", num.intValue(), 0, 100, 4);
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num2.intValue(), 0, 0, 12);
        if (podcastsGetEpisodesOrderDto != null) {
            tfx.o(tfxVar, C4504q2.u, podcastsGetEpisodesOrderDto.j(), 0, 0, 12);
        }
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx c(String str) {
        tfx tfxVar = new tfx("podcasts.getPodcast", new io.reactivex.rxjava3.internal.operators.mixed.n(24), new dr(27));
        if (str != null) {
            tfx.o(tfxVar, "podcast_id", str, 5, 0, 8);
        }
        return tfxVar;
    }
}
