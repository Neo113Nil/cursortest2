package xsna;

import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastPage;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipsWrapperFragment.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class prf extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ prf(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
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
                VkTopBar vkTopBar = podcastEpisodeFragment.Y;
                if (vkTopBar != null) {
                    if (((xl40) podcastEpisodeFragment.o0.getValue()).isEnabled().getValue().booleanValue()) {
                        podcastEpisodeFragment.jo();
                    } else {
                        com.vk.music.podcast.impl.ui.episode.b bVar = (com.vk.music.podcast.impl.ui.episode.b) podcastEpisodeFragment.S;
                        if (bVar != null && (podcastPage = bVar.e) != null && (musicTrack = podcastPage.b) != null) {
                            ((kbj0) podcastEpisodeFragment.m0.getValue()).h(vkTopBar.getContext(), musicTrack);
                        }
                    }
                }
                break;
            default:
                ((uzh0) this.receiver).p();
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prf(Object obj) {
        super(0, obj, PodcastEpisodeFragment.class, "sharePodcastEpisode", "sharePodcastEpisode()V", 0);
        this.b = 1;
    }
}
