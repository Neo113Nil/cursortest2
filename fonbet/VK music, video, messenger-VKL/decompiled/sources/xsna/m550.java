package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.MusicTrack;
import xsna.t24;

/* compiled from: MusicSelectableAdapter.kt */
/* loaded from: classes3.dex */
public final class m550 extends g940<MusicTrack, oai0> {
    public final t24.c e;
    public final u2b0 f;
    public fsv<MusicTrack> g = null;

    public m550(t24.c cVar, u2b0 u2b0Var) {
        this.e = cVar;
        this.f = u2b0Var;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return ((MusicTrack) this.c.c(i)).Gb();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        se50 b;
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ub50 ub50Var = new ub50(null);
        ub50Var.m = this.f;
        ub50Var.h = vkCell;
        b = ub50Var.b(viewGroup, null, (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : null, null, null, (r19 & 64) != 0 ? null : new bq00(this, 14), null, null, false, false);
        return new oai0(b, this.e);
    }
}
