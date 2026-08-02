package xsna;

import com.vk.catalog2.common.ui.mvp.holder.music.MusicSignalVh;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;

/* compiled from: MusicSignalVh.kt */
/* loaded from: classes16.dex */
public final class r550 extends e.a {
    public final /* synthetic */ MusicSignalVh b;

    public r550(MusicSignalVh musicSignalVh) {
        this.b = musicSignalVh;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        MusicSignalVh musicSignalVh = this.b;
        musicSignalVh.b();
        ow2 ow2Var = musicSignalVh.l;
        if (ow2Var != null) {
            ow2Var.i6();
        }
    }
}
