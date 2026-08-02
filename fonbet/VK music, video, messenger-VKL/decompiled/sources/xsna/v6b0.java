package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.error.VkPlayerException;

/* compiled from: PlayingProgressIndicatorHelperCallback.kt */
/* loaded from: classes3.dex */
public final class v6b0<T extends RecyclerView.Adapter<?>> extends x5b0<T> {
    public final u2b0 f;
    public final T g;
    public final wzs<Integer, T, MusicTrack> h;

    /* JADX WARN: Multi-variable type inference failed */
    public v6b0(RecyclerView recyclerView, u2b0 u2b0Var, T t, wzs<? super Integer, ? super T, MusicTrack> wzsVar) {
        super(u2b0Var, recyclerView, t);
        this.f = u2b0Var;
        this.g = t;
        this.h = wzsVar;
    }

    @Override // xsna.x5b0, com.vk.music.player.e
    public final void W3(com.vk.music.player.f fVar) {
        RecyclerView.l itemAnimator = this.c.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.n()) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        MusicTrack invoke = this.h.invoke(Integer.valueOf(i), this.g);
        if (invoke == null) {
            return true;
        }
        u2b0 u2b0Var = this.f;
        return (u2b0Var.y0(invoke) && u2b0Var.I1()) ? false : true;
    }

    @Override // com.vk.music.player.e
    public final boolean t3(VkPlayerException vkPlayerException) {
        return false;
    }
}
