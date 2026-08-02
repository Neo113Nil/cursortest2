package xsna;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.discover.carousel.playlist.PlaylistsCarousel;
import com.vk.dto.discover.carousel.playlist.PlaylistsCarouselItem;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.common.recycler.holders.recommendations.ActionButtonStyle;
import com.vk.toggle.data.RecommendationsItemImageStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ffb0;

/* compiled from: PlaylistsCarouselItemsAdapter.kt */
/* loaded from: classes4.dex */
public final class gfb0 extends RecyclerView.Adapter<RecyclerView.e0> {
    public final String c;
    public final ffb0.a d;
    public final u2b0 e;
    public final h170 f;
    public ArrayList g = new ArrayList();
    public final sbf0 h = sbf0.a(sbf0.e, RecommendationsItemImageStyle.SQUARE);
    public boolean i;
    public boolean j;
    public final def0 k;
    public final b l;

    /* compiled from: PlaylistsCarouselItemsAdapter.kt */
    public static abstract class a {

        /* compiled from: PlaylistsCarouselItemsAdapter.kt */
        /* renamed from: xsna.gfb0$a$a, reason: collision with other inner class name */
        public static final class C2938a extends a {
            public final PlaylistsCarouselItem a;

            public C2938a(PlaylistsCarouselItem playlistsCarouselItem) {
                this.a = playlistsCarouselItem;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2938a) && epx.f(this.a, ((C2938a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Item(value=" + this.a + ')';
            }
        }

        /* compiled from: PlaylistsCarouselItemsAdapter.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: PlaylistsCarouselItemsAdapter.kt */
        public static final class c extends a {
            public static final c a = new c();
        }
    }

    /* compiled from: PlaylistsCarouselItemsAdapter.kt */
    public static final class b implements lbf0 {
        public final gfb0 a;
        public final ffb0.a b;
        public final vt30 c;

        public b(gfb0 gfb0Var, ffb0.a aVar, vt30 vt30Var) {
            this.a = gfb0Var;
            this.b = aVar;
            this.c = vt30Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.lbf0
        public final void a(kbf0 kbf0Var, vif0<?> vif0Var, final int i) {
            PlaylistsCarouselItem playlistsCarouselItem;
            Playlist playlist;
            gfb0 gfb0Var = (gfb0) this.c.c;
            final ffb0.a aVar = this.b;
            final ffb0 ffb0Var = ffb0.this;
            Object obj = this.a.g.get(i);
            a.C2938a c2938a = obj instanceof a.C2938a ? (a.C2938a) obj : null;
            if (c2938a == null || (playlistsCarouselItem = c2938a.a) == null || (playlist = playlistsCarouselItem.b) == null) {
                return;
            }
            if (kbf0Var.equals(kci.d)) {
                gfb0 gfb0Var2 = ffb0Var.F;
                final PlaylistsCarousel q6 = ffb0Var.q6();
                if (q6 == null) {
                    return;
                }
                if (gfb0Var2.g.size() > 2) {
                    aVar.a(i);
                    q6.o = rdi.A(i, q6.o);
                    return;
                } else {
                    nbf0 nbf0Var = ffb0Var.H;
                    if (nbf0Var != null) {
                        nbf0Var.c = new gzs() { // from class: xsna.efb0
                            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // xsna.gzs
                            public final Object invoke() {
                                ffb0 ffb0Var2 = ffb0.this;
                                nbf0 nbf0Var2 = ffb0Var2.H;
                                if (nbf0Var2 != null) {
                                    nbf0Var2.c = null;
                                }
                                aVar.a(i);
                                ((p870) ffb0Var2.G.getValue()).e(148, q6);
                                return s3q0.a;
                            }
                        };
                    }
                    gfb0Var2.notifyItemRemoved(i);
                    return;
                }
            }
            if (!kbf0Var.equals(jcr.c)) {
                if (!kbf0Var.equals(xus.c)) {
                    if (!kbf0Var.equals(sni.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                String str = gfb0Var.c;
                Activity o1 = hd60.a().o1();
                if (o1 == null) {
                    return;
                }
                hd60.a().d1(o1, playlist, ffb0Var.t6(), MusicPlaybackLaunchContext.Fb(str));
                iab0 R6 = ffb0Var.R6();
                if (R6 != null) {
                    ffb0Var.E.v(R6, playlist.b);
                    return;
                }
                return;
            }
            String str2 = gfb0Var.c;
            u2b0 u2b0Var = ffb0Var.C;
            if ((u2b0Var.j() instanceof StartPlayPlaylistSource) && epx.f(playlist.Ib(), u2b0Var.x0().Kb())) {
                u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
            } else {
                MusicPlaybackLaunchContext Db = MusicPlaybackLaunchContext.Fb(str2).Db(playlist);
                String str3 = playlist.x;
                String str4 = playlist.h;
                if (str4 == null) {
                    str4 = "";
                }
                u2b0Var.N0(new lqk0((StartPlaySource) new StartPlayPlaylistSource(new PlaySourceMeta.PlaylistPlaySourceMeta(str4, playlist.Eb(), playlist.c, playlist.b, 0, null, 48, null), null, null, str3, 6, null), (MusicTrack) null, (List) null, Db, 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) (0 == true ? 1 : 0), 0L, 886));
            }
            iab0 R62 = ffb0Var.R6();
            if (R62 != null) {
                ffb0Var.E.h0(R62, playlist.b);
            }
        }
    }

    public gfb0(String str, ffb0.a aVar, u2b0 u2b0Var, h170 h170Var) {
        this.c = str;
        this.d = aVar;
        this.e = u2b0Var;
        this.f = h170Var;
        this.k = new def0(u2b0Var);
        this.l = new b(this, aVar, new vt30(this, 14));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        a aVar = (a) this.g.get(i);
        if (aVar instanceof a.C2938a) {
            return 0;
        }
        if (epx.f(aVar, a.b.a)) {
            return 1;
        }
        if (epx.f(aVar, a.c.a)) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        Playlist playlist;
        Object obj = this.g.get(i);
        a.C2938a c2938a = obj instanceof a.C2938a ? (a.C2938a) obj : null;
        PlaylistsCarouselItem playlistsCarouselItem = c2938a != null ? c2938a.a : null;
        if (e0Var instanceof x7b0) {
            if (playlistsCarouselItem != null) {
                ((x7b0) e0Var).V5(playlistsCarouselItem);
            }
        } else if (!(e0Var instanceof gef0)) {
            if (e0Var instanceof uyj0) {
                ((uyj0) e0Var).V5(s3q0.a);
            }
        } else {
            if (playlistsCarouselItem == null || (playlist = playlistsCarouselItem.b) == null) {
                return;
            }
            ((gef0) e0Var).V5(playlist);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        sbf0 sbf0Var = this.h;
        if (i != 0) {
            return i != 1 ? this.i ? new uyj0(viewGroup) : new ubf0(viewGroup, ActionButtonStyle.PrimaryWithNoShadow, sbf0Var.c, sbf0Var.d, null) : new tbf0(viewGroup, new uq50(this, 14), sbf0Var, false);
        }
        if (this.i) {
            return new x7b0(viewGroup, this.j, this.e, this.l);
        }
        return new gef0(this.k, this.f.d() ? new pbf0(viewGroup, this.l, ActionButtonStyle.PrimaryWithNoShadow, sbf0Var.b, sbf0Var.a, sbf0Var.c) : new obf0(viewGroup, this.l, ActionButtonStyle.PrimaryWithNoShadow, sbf0Var.b, sbf0Var.a, sbf0Var.c, sbf0Var.d));
    }
}
