package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.discover.carousel.playlist.PlaylistsCarousel;
import com.vk.dto.discover.carousel.playlist.PlaylistsCarouselItem;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.feed.core.models.news.NewsEntry;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* compiled from: MusicRecommendationPlaylistPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class a350 extends de {
    public final ix4 b = k840.b;

    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        List<PlaylistsCarouselItem> list;
        NewsEntry newsEntry = u1c0Var.a;
        PlaylistsCarousel playlistsCarousel = newsEntry instanceof PlaylistsCarousel ? (PlaylistsCarousel) newsEntry : null;
        if (playlistsCarousel == null || (list = playlistsCarousel.o) == null) {
            return 0;
        }
        return list.size();
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        List<PlaylistsCarouselItem> list;
        PlaylistsCarouselItem playlistsCarouselItem;
        Playlist playlist;
        Thumb thumb;
        NewsEntry newsEntry = u1c0Var.a;
        PlaylistsCarousel playlistsCarousel = newsEntry instanceof PlaylistsCarousel ? (PlaylistsCarousel) newsEntry : null;
        if (playlistsCarousel == null || (list = playlistsCarousel.o) == null || (playlistsCarouselItem = (PlaylistsCarouselItem) j5g.b0(i, list)) == null || (playlist = playlistsCarouselItem.b) == null || (thumb = playlist.m) == null) {
            return null;
        }
        Serializer.c<Thumb> cVar = Thumb.CREATOR;
        return thumb.Ab(Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, false);
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q e0(String str, NewsEntry newsEntry) {
        if (newsEntry instanceof PlaylistsCarousel) {
            PlaylistsCarousel playlistsCarousel = (PlaylistsCarousel) newsEntry;
            if (playlistsCarousel.o.isEmpty()) {
                this.b.getClass();
                dz2 x = yfb.x(new tfx("audio.getFeedPlaylistsBlock", new io.reactivex.rxjava3.internal.operators.mixed.n(3), new zq(2)));
                x.n = true;
                return new io.reactivex.rxjava3.internal.operators.observable.p1(rsg0.y0(x, null, null, 3).U(new z250(new j4x(playlistsCarousel, this), 0)), new ga40(new ugm(newsEntry, 28), 2));
            }
        }
        return null;
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q<NewsEntry> f0(u1c0 u1c0Var) {
        return e0(u1c0Var.l, u1c0Var.b);
    }

    @Override // xsna.de
    public final boolean l0() {
        return true;
    }
}
