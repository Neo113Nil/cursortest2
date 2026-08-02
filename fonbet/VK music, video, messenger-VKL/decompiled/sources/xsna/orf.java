package xsna;

import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastPage;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vkontakte.android.data.b;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipsWrapperFragment.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class orf extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ orf(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PodcastPage podcastPage;
        MusicTrack musicTrack;
        switch (this.b) {
            case 0:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.receiver;
                int i = ClipsWrapperFragment.Q0;
                break;
            case 1:
                PodcastEpisodeFragment podcastEpisodeFragment = (PodcastEpisodeFragment) this.receiver;
                int i2 = PodcastEpisodeFragment.u0;
                com.vk.music.podcast.impl.ui.episode.b bVar = (com.vk.music.podcast.impl.ui.episode.b) podcastEpisodeFragment.S;
                if (bVar != null && (podcastPage = bVar.e) != null && (musicTrack = podcastPage.b) != null && podcastPage.d && fkq0.b(musicTrack.c)) {
                    String Fb = musicTrack.Fb();
                    com.vk.music.podcast.impl.ui.episode.b bVar2 = (com.vk.music.podcast.impl.ui.episode.b) podcastEpisodeFragment.S;
                    String t = bVar2 != null ? bVar2.n().t() : null;
                    String str = musicTrack.y;
                    b.d dVar = new b.d("podcast_follow_author");
                    dVar.b(t, "ref");
                    dVar.b(Fb, "audio_id");
                    dVar.b(str, "track_code");
                    dVar.e();
                    podcastEpisodeFragment.eo(hg1.m(com.vkontakte.android.data.b.d().L(new PodcastEpisodeFragment.e(new com.vk.music.podcast.impl.ui.episode.a(jnj.d(musicTrack.V), podcastPage.e, musicTrack.c, podcastEpisodeFragment)), false), podcastEpisodeFragment.getActivity(), 0L, false, 62).subscribe(new hms(new xgb0(new com.vk.movika.sdk.base.ui.r0(20, podcastPage, podcastEpisodeFragment), 0), 25), new gl30(ygb0.b, 12)));
                }
                break;
            default:
                ((uzh0) this.receiver).s();
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orf(Object obj) {
        super(0, obj, PodcastEpisodeFragment.class, "subscribeToAuthor", "subscribeToAuthor()V", 0);
        this.b = 1;
    }
}
