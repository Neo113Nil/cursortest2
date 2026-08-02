package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: CommunityProfileContentClipsPlaylistsAdapter.kt */
/* loaded from: classes5.dex */
public final class hgh extends zoj0<ClipsPlaylist, RecyclerView.e0> {
    public final com.vk.movika.sdk.base.observable.w e;
    public final gzs<s3q0> f;
    public boolean g;

    /* compiled from: CommunityProfileContentClipsPlaylistsAdapter.kt */
    public static final class a {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: CommunityProfileContentClipsPlaylistsAdapter.kt */
    public static final class b extends vif0<a> {
        public final gzs<s3q0> n;
        public final VkCell o;
        public final VkImageSimple p;

        public b(ViewGroup viewGroup, gzs<s3q0> gzsVar) {
            super(viewGroup, R.layout.holder_community_playlist, 0);
            this.n = gzsVar;
            VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.community_playlist_cell);
            this.o = vkCell;
            VkImageSimple vkImageSimple = (VkImageSimple) this.itemView.findViewById(R.id.community_playlist_image);
            this.p = vkImageSimple;
            jjc.g(vkCell, new igh(this, 0));
            jjc.g(vkImageSimple, new dwg(this, 2));
        }

        @Override // xsna.vif0
        public final void i6(a aVar) {
            boolean z = aVar.a;
            VkCell vkCell = this.o;
            VkImageSimple vkImageSimple = this.p;
            if (!z) {
                vkCell.setVisibility(8);
                vkImageSimple.setVisibility(0);
                vkImageSimple.setContentDescription(vkImageSimple.getContext().getString(R.string.community_content_create_playlist_accessibility));
                return;
            }
            vkImageSimple.setVisibility(8);
            vkCell.setVisibility(0);
            vkCell.setContentDescription(vkCell.getContext().getString(R.string.community_content_create_playlist_accessibility));
            vkCell.setBackground(m33.a(R.drawable.bg_content_clip_playlist, vkCell.getContext()));
            vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(R.drawable.vk_icon_list_add_outline_28, VkCell.Left.Main.Size.Medium, (k1u0) null, (tlo0.h) null, 12)));
            vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.post_create_title), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 14));
            ((TextView) vkCell.findViewById(R.id.ds_internal_cell_middle_title)).setTextColor(dhr0.t.c(R.attr.vk_ui_text_accent_themed));
        }
    }

    /* compiled from: CommunityProfileContentClipsPlaylistsAdapter.kt */
    public static final class c extends vif0<ClipsPlaylist> {
        public static final int p = cn70.b(32);
        public final VkCell n;
        public final izs<ClipsPlaylist, s3q0> o;

        /* compiled from: CommunityProfileContentClipsPlaylistsAdapter.kt */
        public static final class a implements VkCell.f {
            public final String a;

            public a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("PictureViewParams(url="), this.a, ')');
            }
        }

        public c(VkCell vkCell, com.vk.movika.sdk.base.observable.w wVar) {
            super(vkCell);
            this.n = vkCell;
            this.o = wVar;
            jjc.g(vkCell, new xcd(this, 7));
            vkCell.setBackground(m33.a(R.drawable.bg_content_clip_playlist, vkCell.getContext()));
            vkCell.setLeftMainViewController(new jgh(this));
        }

        @Override // xsna.vif0
        public final void i6(ClipsPlaylist clipsPlaylist) {
            ClipsPlaylist clipsPlaylist2 = clipsPlaylist;
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            VkCell.Middle.e eVar = new VkCell.Middle.e(oq.d(tlo0.Companion, clipsPlaylist2.c), 1, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 58);
            VkCell vkCell = this.n;
            VkCell.Left.b bVar = null;
            vkCell.setMiddle(VkCell.Middle.a.a(aVar, eVar, new VkCell.Middle.d(new tlo0.h(enj.f(R.plurals.profile_content_clips_in_playlist_count, clipsPlaylist2.e, vkCell.getContext())), (gzs) null, 1, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 58), null, 12));
            String str = (String) j5g.a0(clipsPlaylist2.d);
            if (str != null) {
                VkCell.Left.a aVar2 = VkCell.Left.Companion;
                a aVar3 = new a(str);
                int i = p;
                bVar = VkCell.Left.a.a(aVar2, new VkCell.Left.Main.e(aVar3, new Size(i, i)));
            }
            vkCell.setLeft(bVar);
        }
    }

    public hgh(com.vk.movika.sdk.base.observable.w wVar, gzs gzsVar) {
        this.e = wVar;
        this.f = gzsVar;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.g ? super.getItemCount() + 1 : super.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return (!this.g || i >= 1) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        boolean z = this.g;
        uuk uukVar = this.c;
        if (!z) {
            c cVar = e0Var instanceof c ? (c) e0Var : null;
            if (cVar != null) {
                cVar.V5(uukVar.c(i));
                return;
            }
            return;
        }
        if (e0Var instanceof b) {
            ((b) e0Var).V5(new a(getItemCount() == 1));
        } else if (e0Var instanceof c) {
            ((c) e0Var).V5(uukVar.c(i - 1));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new b(viewGroup, this.f);
        }
        if (i == 1) {
            return new c(new VkCell(viewGroup.getContext(), null, 6, 0), this.e);
        }
        throw new IllegalStateException(lhg.a(i, "Can't create view holder for: "));
    }
}
