package xsna;

import com.vk.music.player.api.helper.AudioPlayer;
import com.vk.music.player.api.helper.dto.AudioDiscontinuityReason;
import com.vk.music.player.api.helper.dto.AudioPlaybackError;

/* compiled from: AudioPlayerExt.kt */
/* loaded from: classes3.dex */
public final class ps4 implements rs4 {
    public final /* synthetic */ AudioPlayer.State a;
    public final /* synthetic */ rp1 b;
    public final /* synthetic */ AudioPlayer c;

    public ps4(AudioPlayer.State state, rp1 rp1Var, AudioPlayer audioPlayer) {
        this.a = state;
        this.b = rp1Var;
        this.c = audioPlayer;
    }

    @Override // xsna.rs4
    public final void e(AudioPlayer.State state) {
        if (this.a == state) {
            this.b.invoke();
            this.c.f(this);
        }
    }

    @Override // xsna.rs4
    public final void a(int i) {
    }

    @Override // xsna.rs4
    public final void c(AudioPlaybackError audioPlaybackError) {
    }

    @Override // xsna.rs4
    public final void g(AudioDiscontinuityReason audioDiscontinuityReason) {
    }

    @Override // xsna.rs4
    public final void onIsLoadingChanged(boolean z) {
    }

    @Override // xsna.rs4
    public final void onIsPlayingChanged(boolean z) {
    }
}
