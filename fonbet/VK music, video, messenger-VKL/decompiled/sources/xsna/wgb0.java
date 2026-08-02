package xsna;

import com.vk.lists.c;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;

/* compiled from: PodcastEpisodeFragment.kt */
/* loaded from: classes3.dex */
public final class wgb0 implements c.i {
    public final /* synthetic */ PodcastEpisodeFragment b;

    public wgb0(PodcastEpisodeFragment podcastEpisodeFragment) {
        this.b = podcastEpisodeFragment;
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        com.vk.music.podcast.impl.ui.episode.b bVar = (com.vk.music.podcast.impl.ui.episode.b) this.b.S;
        return (bVar != null ? bVar.e : null) == null;
    }

    @Override // com.vk.lists.c.i
    public final void clear() {
        this.b.W.clear();
    }
}
