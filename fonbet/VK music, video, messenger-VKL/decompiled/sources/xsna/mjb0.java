package xsna;

import android.view.ViewGroup;
import com.vk.dto.podcast.PodcastInfo;
import com.vkontakte.android.R;

/* compiled from: PodcastTabletHeaderHolder.kt */
/* loaded from: classes3.dex */
public final class mjb0 extends dib0<PodcastInfo> {
    public final hib0 n;

    public mjb0(ViewGroup viewGroup, sib0 sib0Var) {
        super(viewGroup, R.layout.music_tablet_podcast_page_header, 0);
        this.n = new hib0(this.itemView, sib0Var, true);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        this.n.a((PodcastInfo) obj);
    }
}
