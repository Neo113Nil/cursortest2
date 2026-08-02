package xsna;

import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;

/* compiled from: AudioPlaylistHolder.kt */
/* loaded from: classes4.dex */
public final class mt4 extends e.a {
    public final /* synthetic */ nt4 b;

    public mt4(nt4 nt4Var) {
        this.b = nt4Var;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        nt4 nt4Var = this.b;
        AudioPlaylistAttachment audioPlaylistAttachment = (AudioPlaylistAttachment) nt4Var.C;
        if (audioPlaylistAttachment != null) {
            nt4Var.X6(audioPlaylistAttachment);
        }
    }
}
