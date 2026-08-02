package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.discover.carousel.tracks.MusicTracksCarousel;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: MusicTracksCarouselHolder.kt */
/* loaded from: classes4.dex */
public final class fe50 extends vu9<MusicTracksCarousel> {
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<com.vk.dto.discover.carousel.tracks.MusicTracksCarouselItem>] */
    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        MusicTracksCarousel musicTracksCarousel = (MusicTracksCarousel) newsEntry;
        R6(musicTracksCarousel);
        RecyclerView.Adapter<?> adapter = this.C;
        ge50 ge50Var = adapter instanceof ge50 ? (ge50) adapter : null;
        if (ge50Var != null) {
            ge50Var.d = musicTracksCarousel.o;
            ge50Var.notifyDataSetChanged();
        }
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        RecyclerView.Adapter<?> adapter = this.C;
        ge50 ge50Var = adapter instanceof ge50 ? (ge50) adapter : null;
        if (ge50Var != null) {
            ge50Var.c = u1c0Var.l;
        }
        super.a6(u1c0Var);
    }
}
