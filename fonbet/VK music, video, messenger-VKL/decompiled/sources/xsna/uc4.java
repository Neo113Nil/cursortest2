package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.music.bottomsheets.audiobook.AudioBookBottomSheetLaunchPoint;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlayAudioBookSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stickyplayer.domain.PlayerContext;
import xsna.tx40;

/* compiled from: AudioBookActionHandler.kt */
/* loaded from: classes3.dex */
public final class uc4 implements n10 {
    public final u2b0 a;
    public final f4z b;

    public uc4(u2b0 u2b0Var, f4z f4zVar) {
        this.a = u2b0Var;
        this.b = f4zVar;
    }

    @Override // xsna.n10
    public final void b(sy40 sy40Var, PlayerTrack playerTrack, PlayerContext playerContext) {
        AudioBook audioBook;
        u2b0 u2b0Var = this.a;
        StartPlaySource j = u2b0Var.j();
        StartPlayAudioBookSource startPlayAudioBookSource = j instanceof StartPlayAudioBookSource ? (StartPlayAudioBookSource) j : null;
        if (startPlayAudioBookSource == null || (audioBook = startPlayAudioBookSource.c) == null) {
            return;
        }
        this.b.b(new tx40.e(audioBook, playerContext.h() ? AudioBookBottomSheetLaunchPoint.BigPlayer.b : AudioBookBottomSheetLaunchPoint.SmallPlayer.b, u2b0Var.x0()));
    }

    @Override // xsna.n10
    public final void d(MusicTrack musicTrack) {
        Integer num = musicTrack.d0;
        if (num != null) {
            this.b.b(new tx40.g(num.intValue(), this.a.x0()));
        }
    }

    @Override // xsna.n10
    public final void e(sy40 sy40Var) {
        MusicTrack musicTrack;
        PlayerTrack playerTrack = sy40Var.d;
        Integer num = (playerTrack == null || (musicTrack = playerTrack.b) == null) ? null : musicTrack.d0;
        if (num != null) {
            this.b.b(new tx40.g(num.intValue(), this.a.x0()));
        }
    }

    @Override // xsna.n10
    public final void a(sy40 sy40Var, MusicTrack musicTrack) {
    }

    @Override // xsna.n10
    public final void c(sy40 sy40Var, MusicTrack musicTrack) {
    }
}
