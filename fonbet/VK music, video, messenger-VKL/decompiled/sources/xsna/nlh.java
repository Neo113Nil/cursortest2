package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.common.Image;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.video.VideoAlbum;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* compiled from: CommunityProfileContentVideoAlbumsAdapter.kt */
/* loaded from: classes5.dex */
public final class nlh extends zoj0<VideoAlbum, b> {
    public final rlh e;

    /* compiled from: CommunityProfileContentVideoAlbumsAdapter.kt */
    public static final class a extends m.e<VideoAlbum> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(VideoAlbum videoAlbum, VideoAlbum videoAlbum2) {
            return videoAlbum.equals(videoAlbum2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(VideoAlbum videoAlbum, VideoAlbum videoAlbum2) {
            return epx.f(videoAlbum.zb(), videoAlbum2.zb());
        }
    }

    /* compiled from: CommunityProfileContentVideoAlbumsAdapter.kt */
    public static final class b extends vif0<VideoAlbum> {
        public static final Pair<Integer, Integer> s = new Pair<>(142, 80);
        public final VkTile n;
        public final izs<VideoAlbum, s3q0> o;
        public final Object p;
        public final Object q;
        public final Object r;

        /* compiled from: CommunityProfileContentVideoAlbumsAdapter.kt */
        public static final class a implements VkTile.h {
            public final VideoRestriction a;
            public final Image b;
            public final boolean c;

            public a(VideoRestriction videoRestriction, Image image, boolean z) {
                this.a = videoRestriction;
                this.b = image;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
            }

            public final int hashCode() {
                VideoRestriction videoRestriction = this.a;
                return Boolean.hashCode(this.c) + fq.b(this.b, (videoRestriction == null ? 0 : videoRestriction.hashCode()) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("VisualContentParams(restriction=");
                sb.append(this.a);
                sb.append(", image=");
                sb.append(this.b);
                sb.append(", imageBlur=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        public b(VkTile vkTile, rlh rlhVar) {
            super(vkTile);
            this.n = vkTile;
            this.o = rlhVar;
            wv0 wv0Var = new wv0(8);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.p = msy.a(lazyThreadSafetyMode, wv0Var);
            this.q = msy.a(lazyThreadSafetyMode, new xv0(6));
            this.r = msy.a(lazyThreadSafetyMode, new vi0(12));
            vkTile.setTextAlignment(VkTile.TextAlignment.Start);
            vkTile.setVisualContentController(new olh(this));
        }

        @Override // xsna.vif0
        public final void i6(VideoAlbum videoAlbum) {
            VideoAlbum videoAlbum2 = videoAlbum;
            ri0 ri0Var = new ri0(9, this, videoAlbum2);
            VkTile vkTile = this.n;
            jjc.g(vkTile, ri0Var);
            vkTile.setVisualContentParams(new a(videoAlbum2.o, videoAlbum2.h, videoAlbum2.i));
            String str = videoAlbum2.d;
            vkTile.setTitle(new VkTile.e(str != null ? oq.d(tlo0.Companion, str) : null, 0, null, null, null, null, null, 510));
            vkTile.setSubtitle(new VkTile.d(hq.b(tlo0.Companion, R.plurals.community_profile_video_count, videoAlbum2.f), 0, null, null, null, null, 62));
        }
    }

    public nlh(rlh rlhVar) {
        super(new com.vk.lists.a(new a()));
        this.e = rlhVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((b) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        VkTile vkTile = new VkTile(viewGroup.getContext(), null, 6);
        vkTile.setId(R.id.community_profile_video_album_item);
        vkTile.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new b(vkTile, this.e);
    }
}
