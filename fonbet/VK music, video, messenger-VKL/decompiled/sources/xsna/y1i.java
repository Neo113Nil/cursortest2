package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastPage;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vkontakte.android.data.b;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CommunitySettingsActionsModalBottomSheet.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class y1i extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ y1i(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        com.vk.music.podcast.impl.ui.episode.b bVar;
        PodcastPage podcastPage;
        MusicTrack musicTrack;
        Episode episode;
        String str;
        switch (this.b) {
            case 0:
                ((k1i) this.receiver).c();
                break;
            default:
                PodcastEpisodeFragment podcastEpisodeFragment = (PodcastEpisodeFragment) this.receiver;
                VkTopBar vkTopBar = podcastEpisodeFragment.Y;
                if (vkTopBar != null && (bVar = (com.vk.music.podcast.impl.ui.episode.b) podcastEpisodeFragment.S) != null && (podcastPage = bVar.e) != null && (musicTrack = podcastPage.b) != null && (episode = musicTrack.w) != null && (str = episode.g) != null) {
                    String Fb = musicTrack.Fb();
                    com.vk.music.podcast.impl.ui.episode.b bVar2 = (com.vk.music.podcast.impl.ui.episode.b) podcastEpisodeFragment.S;
                    String t = bVar2 != null ? bVar2.n().t() : null;
                    String str2 = musicTrack.y;
                    b.d dVar = new b.d("podcast_to_post");
                    dVar.b(t, "ref");
                    dVar.b(Fb, "audio_id");
                    dVar.b(str2, "track_code");
                    dVar.e();
                    if (jnj.d(musicTrack.V)) {
                        i0q0.f(new i3r(vkTopBar.getContext(), 2));
                    } else {
                        FragmentActivity activity = podcastEpisodeFragment.getActivity();
                        if (activity != null) {
                            new io.reactivex.rxjava3.internal.operators.observable.c0(hg1.m(rsg0.y0(new i730(str), null, null, 3), activity, 0L, false, 62), io.reactivex.rxjava3.internal.functions.a.d, new qqb(1)).subscribe(new cp50(new k170(activity, 0), 3), new zyu(new fo20(6), 12));
                        }
                    }
                }
                break;
        }
        return s3q0.a;
    }

    public y1i(Object obj) {
        super(0, obj, PodcastEpisodeFragment.class, "goToPost", "goToPost()V", 0);
    }
}
