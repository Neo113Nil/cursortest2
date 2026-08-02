package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import xsna.f0p;

/* compiled from: MusicEditPlaylistTrackItemsAdapter.kt */
/* loaded from: classes3.dex */
public final class r0p extends g940<MusicTrack, q0p> {
    public final i0p e;
    public final f0p.a f;
    public final u2b0 g;

    /* compiled from: MusicEditPlaylistTrackItemsAdapter.kt */
    public static final class a {
        public u2b0 a;
        public i0p b;
    }

    /* compiled from: MusicEditPlaylistTrackItemsAdapter.kt */
    public static final class b implements VkCell.e {
        public final t3h a;

        public b(t3h t3hVar) {
            this.a = t3hVar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new t0p(context, this.a);
        }
    }

    public r0p(i0p i0pVar, f0p.a aVar, u2b0 u2b0Var) {
        this.e = i0pVar;
        this.f = aVar;
        this.g = u2b0Var;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return ((MusicTrack) this.c.c(i)).Gb();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        se50 b2;
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkCell.setBackgroundResource(R.drawable.music_selectable_bg);
        ub50 ub50Var = new ub50(null);
        ub50Var.h = vkCell;
        ub50Var.e(null);
        ub50Var.m = this.g;
        b2 = ub50Var.b(viewGroup, null, (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : new ve0(25), null, null, (r19 & 64) != 0 ? null : new yve(this, 19), null, null, false, false);
        vkCell.setRightExtraViewController(new b(new t3h(this, 15)));
        return new q0p(this.e.L(), b2, vkCell);
    }
}
