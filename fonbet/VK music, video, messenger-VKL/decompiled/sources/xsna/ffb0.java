package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.audio.dto.AudioGetFeedPlaylistsBlockResponseDto;
import com.vk.dto.discover.carousel.playlist.PlaylistsCarousel;
import com.vk.dto.discover.carousel.playlist.PlaylistsCarouselItem;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.playlist.PlaylistCarouselItemStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.bwy;
import xsna.gfb0;
import xsna.k840;

/* compiled from: PlaylistsCarouselHolder.kt */
/* loaded from: classes4.dex */
public final class ffb0 extends qi6<PlaylistsCarousel> implements w8i {
    public static final int I = iah0.a(12);
    public static final Object J = msy.a(LazyThreadSafetyMode.NONE, new d2(27));
    public final u2b0 C;
    public final ix4 D;
    public final u750 E;
    public final gfb0 F;
    public final Object G;
    public final nbf0 H;

    /* compiled from: PlaylistsCarouselHolder.kt */
    public final class a {
        public a() {
        }

        public final void a(int i) {
            String str;
            PlaylistsCarouselItem playlistsCarouselItem;
            PlaylistsCarouselItem playlistsCarouselItem2;
            ffb0 ffb0Var = ffb0.this;
            gfb0 gfb0Var = ffb0Var.F;
            Object obj = gfb0Var.g.get(i);
            gfb0.a.C2938a c2938a = obj instanceof gfb0.a.C2938a ? (gfb0.a.C2938a) obj : null;
            Playlist playlist = (c2938a == null || (playlistsCarouselItem2 = c2938a.a) == null) ? null : playlistsCarouselItem2.b;
            PlaylistsCarousel q6 = ffb0Var.q6();
            if (q6 != null && (str = q6.l) != null) {
                Object obj2 = gfb0Var.g.get(i);
                gfb0.a.C2938a c2938a2 = obj2 instanceof gfb0.a.C2938a ? (gfb0.a.C2938a) obj2 : null;
                Playlist playlist2 = (c2938a2 == null || (playlistsCarouselItem = c2938a2.a) == null) ? null : playlistsCarouselItem.b;
                ix4 ix4Var = ffb0Var.D;
                String valueOf = String.valueOf(playlist2 != null ? playlist2.Ib() : null);
                ix4Var.getClass();
                tfx tfxVar = new tfx("audio.hideRecommendedFeedPlaylist", new zn(5), new ao(5));
                tfx.o(tfxVar, "playlist", valueOf, 0, 0, 12);
                tfx.o(tfxVar, "track_code", str, 0, 0, 12);
                yfb.x(tfxVar).p();
            }
            if (i == -1) {
                gfb0Var.getClass();
            } else {
                gfb0Var.g.remove(i);
                gfb0Var.notifyItemRemoved(i);
            }
            iab0 R6 = ffb0Var.R6();
            if (R6 != null) {
                ffb0Var.E.b0(R6, false, playlist != null ? Integer.valueOf(playlist.b) : null);
            }
        }
    }

    /* compiled from: PlaylistsCarouselHolder.kt */
    public static final class b extends RecyclerView.n {
        public final int b;

        public b(ffb0 ffb0Var) {
            ffb0Var.itemView.getContext();
            this.b = ffb0.I;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (recyclerView.getChildAdapterPosition(view) < (recyclerView.getAdapter() != null ? r3.getItemCount() : 0) - 1) {
                rect.right = this.b;
            }
        }
    }

    public ffb0(ViewGroup viewGroup, u2b0 u2b0Var, h170 h170Var) {
        super(R.layout.recommended_playlists_carousel_holder, viewGroup);
        this.C = u2b0Var;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.recycler);
        this.D = k840.b;
        s750 s750Var = k840.a.e;
        this.E = s750Var == null ? null : s750Var;
        gfb0 gfb0Var = new gfb0(MusicPlaybackLaunchContext.O.t(), new a(), u2b0Var, h170Var);
        this.F = gfb0Var;
        this.G = msy.a(LazyThreadSafetyMode.NONE, new jz70(this, 7));
        u6b0 u6b0Var = new u6b0(recyclerView, u2b0Var, gfb0Var, new yh3(9));
        b bVar = new b(this);
        this.itemView.addOnAttachStateChangeListener(new y5b0(u6b0Var));
        recyclerView.setAdapter(gfb0Var);
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.addItemDecoration(bVar);
        int i = I;
        recyclerView.setPadding(i, 0, i, 0);
        recyclerView.setClipToPadding(false);
        nbf0 nbf0Var = new nbf0();
        this.H = nbf0Var;
        recyclerView.setItemAnimator(new jxq(nbf0Var));
        f4m.v(cn70.b(3), this.itemView);
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qi6
    public final void E6(PlaylistsCarousel playlistsCarousel) {
        Collection collection;
        PlaylistsCarousel playlistsCarousel2 = playlistsCarousel;
        boolean z = playlistsCarousel2.p == PlaylistCarouselItemStyle.COMPACT;
        gfb0 gfb0Var = this.F;
        gfb0Var.i = z;
        gfb0Var.j = playlistsCarousel2.q == AudioGetFeedPlaylistsBlockResponseDto.TypeDto.RECOMMENDED_PLAYLIST_OFFICIAL;
        if (!playlistsCarousel2.e || (epx.f(playlistsCarousel2.f, bwy.b.a) && !playlistsCarousel2.o.isEmpty())) {
            boolean h = this.C.h();
            iab0 R6 = R6();
            if (R6 != null) {
                this.E.c(R6, h);
            }
            List<PlaylistsCarouselItem> list = playlistsCarousel2.o;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new gfb0.a.C2938a((PlaylistsCarouselItem) it.next()));
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.add(gfb0.a.b.a);
            collection = arrayList2;
        } else {
            collection = (List) J.getValue();
        }
        gfb0Var.g = new ArrayList(collection);
        gfb0Var.notifyDataSetChanged();
    }

    public final iab0 R6() {
        PlaylistsCarousel q6 = q6();
        if (q6 == null) {
            return null;
        }
        return new iab0(q6.p, q6.q == AudioGetFeedPlaylistsBlockResponseDto.TypeDto.RECOMMENDED_PLAYLIST_OFFICIAL, String.valueOf(q6.r), q6.l);
    }
}
