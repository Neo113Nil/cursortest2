package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.Playlist;
import xsna.k840;

/* compiled from: PlaylistAdapter.kt */
/* loaded from: classes3.dex */
public final class z6b0 extends g940<Playlist, se50<Playlist>> {
    public final fsv<Playlist> e;
    public final boolean f;
    public final long g;
    public final u750 h;

    public z6b0(fsv<Playlist> fsvVar, boolean z, long j) {
        this.e = fsvVar;
        this.f = z;
        this.g = j;
        s750 s750Var = k840.a.e;
        this.h = s750Var == null ? null : s750Var;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return ((Playlist) this.c.c(i)).Db();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        b8b0 b8b0Var = new b8b0(viewGroup, this.f, this.g, new ap30(this, 7));
        b8b0Var.itemView.setOnClickListener(new ckc(3, b8b0Var, this));
        return b8b0Var;
    }
}
