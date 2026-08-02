package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;

/* compiled from: MusicPlayerTrackListAdapter.kt */
/* loaded from: classes3.dex */
public final class bz40 extends g940<whp0, se50<whp0>> {
    public final u2b0 e;
    public final yb40 f;
    public final com.vk.music.podcast.api.di.a g;
    public final wa5 h;
    public final az40 i = new az40(this);

    public bz40(u2b0 u2b0Var, yb40 yb40Var, com.vk.music.podcast.api.di.a aVar, wa5 wa5Var) {
        this.e = u2b0Var;
        this.f = yb40Var;
        this.g = aVar;
        this.h = wa5Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((whp0) this.c.c(i)).l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        az40 az40Var = this.i;
        wa5 wa5Var = this.h;
        u2b0 u2b0Var = this.e;
        if (i == 1 || i == 2) {
            ub50 ub50Var = new ub50(new xmz(11));
            se50<MusicTrack> a = this.g.a(viewGroup, u2b0Var);
            ub50Var.f = 4;
            ub50Var.l = a;
            ub50Var.e(wa5Var);
            ub50Var.m = u2b0Var;
            ub50Var.j = az40Var;
            return ub50Var.a(viewGroup);
        }
        if (i == 4) {
            ub50 ub50Var2 = new ub50(new oi40(3));
            ub50Var2.g = R.layout.tracklist_item_radio;
            ub50Var2.d();
            ub50Var2.e(wa5Var);
            ub50Var2.m = u2b0Var;
            ub50Var2.j = az40Var;
            return ub50Var2.a(viewGroup);
        }
        if (i != 5) {
            ub50 ub50Var3 = new ub50(new per(16));
            ub50Var3.g = R.layout.music_audio_item_no_duration;
            ub50Var3.d();
            ub50Var3.e(wa5Var);
            ub50Var3.i = new a23(com.vk.core.utils.newtork.b.a, 4);
            ub50Var3.m = u2b0Var;
            ub50Var3.j = az40Var;
            return ub50Var3.a(viewGroup);
        }
        ub50 ub50Var4 = new ub50(new h2w(10));
        bj4 bj4Var = new bj4(viewGroup, u2b0Var);
        ub50Var4.f = 4;
        ub50Var4.l = bj4Var;
        ub50Var4.e(wa5Var);
        ub50Var4.m = u2b0Var;
        ub50Var4.j = az40Var;
        return ub50Var4.a(viewGroup);
    }
}
