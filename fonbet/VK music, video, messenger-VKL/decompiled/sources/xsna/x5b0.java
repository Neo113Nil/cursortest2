package xsna;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.m;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import java.util.List;

/* compiled from: PlayingIndicationHelper.kt */
/* loaded from: classes3.dex */
public abstract class x5b0<T extends RecyclerView.Adapter<?>> extends m.b implements com.vk.music.player.e {
    public final u2b0 b;
    public final RecyclerView c;
    public final T d;
    public final s350 e;

    /* JADX WARN: Multi-variable type inference failed */
    public x5b0(u2b0 u2b0Var, RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        new Handler(Looper.getMainLooper());
        this.b = u2b0Var;
        this.c = recyclerView;
        this.d = adapter;
        this.e = new s350(recyclerView, adapter, 4);
        new w5b0(this);
    }

    public final void a() {
        s350 s350Var = this.e;
        s350Var.d.removeCallbacks(s350Var.i);
        s350Var.g = null;
        s350Var.a(androidx.recyclerview.widget.m.a(this, true));
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        return true;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final Object getChangePayload(int i, int i2) {
        return new Object();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getNewListSize() {
        return this.d.getItemCount();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getOldListSize() {
        return this.d.getItemCount();
    }

    @Override // com.vk.music.player.e
    public final void B1() {
    }

    @Override // com.vk.music.player.e
    public final void K1() {
    }

    @Override // com.vk.music.player.e
    public final void n3() {
    }

    @Override // com.vk.music.player.e
    public final void x0() {
    }

    @Override // com.vk.music.player.e
    public final void z3() {
    }

    public void W3(com.vk.music.player.f fVar) {
    }

    @Override // com.vk.music.player.e
    public final void o2(com.vk.music.player.f fVar) {
    }

    @Override // com.vk.music.player.e
    public final void onError(String str) {
    }

    public void y4(List<PlayerTrack> list) {
    }

    public void N3(PlayState playState, com.vk.music.player.f fVar) {
    }
}
