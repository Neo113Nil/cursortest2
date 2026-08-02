package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;

/* compiled from: PodcastEpisodeHeaderAdapter.kt */
/* loaded from: classes3.dex */
public final class zgb0 extends g940<MusicTrack, bhb0> {
    public final com.vk.music.podcast.impl.ui.episode.b e;
    public final bjk f;

    public zgb0(com.vk.music.podcast.impl.ui.episode.b bVar, bjk bjkVar) {
        this.e = bVar;
        this.f = bjkVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new bhb0(tf3.b(viewGroup, R.layout.music_podcast_screen_header, viewGroup, false), this.e, this.f);
    }
}
