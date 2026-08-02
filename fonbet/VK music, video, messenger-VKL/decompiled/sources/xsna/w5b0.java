package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.e;
import java.util.List;

/* compiled from: PlayingIndicationHelper.kt */
/* loaded from: classes3.dex */
public final class w5b0 extends e.a {
    public final /* synthetic */ x5b0<RecyclerView.Adapter<?>> b;

    public w5b0(x5b0<RecyclerView.Adapter<?>> x5b0Var) {
        this.b = x5b0Var;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        this.b.a();
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void W3(com.vk.music.player.f fVar) {
        this.b.a();
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void y4(List<PlayerTrack> list) {
        this.b.a();
    }
}
