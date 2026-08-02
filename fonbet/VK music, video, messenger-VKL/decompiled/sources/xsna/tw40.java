package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PauseReason;
import com.vk.network.kbh.state.NetworkState;
import com.vk.toggle.features.MusicFeatures;

/* compiled from: MusicPlayerFeature.kt */
/* loaded from: classes3.dex */
public final class tw40 implements q560 {
    public volatile NetworkState a;
    public final /* synthetic */ rw40 b;

    public tw40(rw40 rw40Var) {
        this.b = rw40Var;
    }

    @Override // xsna.q560
    public final void a(NetworkState networkState) {
        MusicTrack b;
        this.a = networkState;
        if (!MusicFeatures.AUDIO_PAUSE_MUSIC_WITH_VPN.h() || this.a != NetworkState.UNSTABLE || (b = this.b.y.b()) == null || b.S4()) {
            return;
        }
        this.b.y.t1(38, PauseReason.AUTO, new oe9());
    }
}
