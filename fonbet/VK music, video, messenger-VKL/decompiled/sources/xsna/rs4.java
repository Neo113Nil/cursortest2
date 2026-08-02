package xsna;

import com.vk.music.player.api.helper.AudioPlayer;
import com.vk.music.player.api.helper.dto.AudioDiscontinuityReason;
import com.vk.music.player.api.helper.dto.AudioPlaybackError;

/* compiled from: AudioPlayerListener.kt */
/* loaded from: classes3.dex */
public interface rs4 {
    default void a(int i) {
    }

    default void c(AudioPlaybackError audioPlaybackError) {
    }

    default void e(AudioPlayer.State state) {
    }

    default void g(AudioDiscontinuityReason audioDiscontinuityReason) {
    }

    default void onIsLoadingChanged(boolean z) {
    }

    default void onIsPlayingChanged(boolean z) {
    }
}
