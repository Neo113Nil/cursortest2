package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.vk.dto.music.Playlist;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.error.VkPlayerException;
import java.util.List;

/* compiled from: PlayingPlaylistIndicatorHelperCallback.kt */
/* loaded from: classes3.dex */
public final class u6b0<T extends RecyclerView.Adapter<?>> extends x5b0<T> {
    public final u2b0 f;
    public final T g;
    public final wzs<Integer, T, Playlist> h;

    /* JADX WARN: Multi-variable type inference failed */
    public u6b0(RecyclerView recyclerView, u2b0 u2b0Var, T t, wzs<? super Integer, ? super T, Playlist> wzsVar) {
        super(u2b0Var, recyclerView, t);
        this.f = u2b0Var;
        this.g = t;
        this.h = wzsVar;
    }

    @Override // xsna.x5b0, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        a();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        Playlist invoke = this.h.invoke(Integer.valueOf(i), this.g);
        if (invoke == null) {
            return true;
        }
        u2b0 u2b0Var = this.f;
        if (epx.f(u2b0Var.x0().Kb(), invoke.Ib()) || u2b0Var.x0().Kb().length() == 0) {
            return false;
        }
        u2b0Var.m0().i();
        return false;
    }

    @Override // com.vk.music.player.e
    public final boolean t3(VkPlayerException vkPlayerException) {
        return false;
    }

    @Override // xsna.x5b0, com.vk.music.player.e
    public final void y4(List<PlayerTrack> list) {
        a();
    }
}
