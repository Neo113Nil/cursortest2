package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import java.util.ArrayList;

/* compiled from: AudioPlaylistHolder.kt */
/* loaded from: classes4.dex */
public final class bdk0 extends g940<MusicTrack, se50<MusicTrack>> {
    public final feb0 e;
    public final qi3 f;
    public Playlist g;
    public s6o h;

    public bdk0(feb0 feb0Var, qi3 qi3Var) {
        this.e = feb0Var;
        this.f = qi3Var;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return ((MusicTrack) ((ArrayList) y0()).get(i)).Gb();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Playlist playlist = this.g;
        return (playlist == null || !playlist.Eb()) ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        qi3 qi3Var = this.f;
        feb0 feb0Var = this.e;
        se50 gk1Var = i == 1 ? new gk1(new na40(viewGroup.getContext()), qi3Var, new s8(feb0Var, 16), new ow4(feb0Var, 10)) : new fcb0(new ua40(viewGroup.getContext()), qi3Var, new pw4(feb0Var, 8));
        s6o s6oVar = this.h;
        if (s6oVar != null) {
            gk1Var.j6(s6oVar);
        }
        return gk1Var;
    }
}
