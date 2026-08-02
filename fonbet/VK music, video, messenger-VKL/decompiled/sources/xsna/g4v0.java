package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: VkMixDelegate.kt */
/* loaded from: classes16.dex */
public final class g4v0 {
    public static final void a(com.vk.catalog.mvi.block.music.impl.artists.mix.a aVar, String str, String str2, String str3, String str4, String str5, String str6, MixSettingsEntity mixSettingsEntity) {
        aVar.d.N0(new lqk0(new StartPlayVkMixSource(str, str2, str3, mixSettingsEntity != null, str4, mixSettingsEntity, str6, str5, null, null, Tensorflow.FRAME_HEIGHT, null), (MusicTrack) null, (List) null, MusicPlaybackLaunchContext.M.Bb(str), 0, ShuffleMode.SHUFFLE_OFF, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 822));
    }
}
