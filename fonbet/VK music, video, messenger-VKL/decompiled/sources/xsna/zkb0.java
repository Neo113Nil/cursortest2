package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.MusicTrack;

/* compiled from: PodcastsPlaylistAdapter.kt */
/* loaded from: classes3.dex */
public final class zkb0 extends g940<MusicTrack, se50<MusicTrack>> {
    public final fsv<MusicTrack> e;
    public final u2b0 f;
    public final String g;

    public zkb0() {
        throw null;
    }

    public zkb0(fsv fsvVar, u2b0 u2b0Var, String str) {
        this.e = fsvVar;
        this.f = u2b0Var;
        this.g = str;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return ((MusicTrack) this.c.c(i)).Gb();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ub50 ub50Var = new ub50(null);
        String str = this.g;
        u2b0 u2b0Var = this.f;
        ujb0 ujb0Var = new ujb0(viewGroup, false, u2b0Var, str);
        ub50Var.f = 4;
        ub50Var.l = ujb0Var;
        ub50Var.e(null);
        ub50Var.m = u2b0Var;
        ub50Var.j = this.e;
        return ub50Var.a(viewGroup);
    }
}
