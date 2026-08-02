package xsna;

import android.os.SystemClock;
import com.vk.dto.music.MusicTrack;
import com.vk.music.attach.AttachMusicActivity;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.List;
import xsna.fsv;

/* compiled from: AttachMusicActivity.java */
/* loaded from: classes3.dex */
public final class p24 extends fsv.a<MusicTrack> {
    public final /* synthetic */ List b;
    public final /* synthetic */ AttachMusicActivity c;

    public p24(AttachMusicActivity attachMusicActivity, List list) {
        this.c = attachMusicActivity;
        this.b = list;
    }

    @Override // xsna.fsv
    public final void Ig(int i, Object obj) {
        MusicTrack musicTrack = (MusicTrack) obj;
        if (musicTrack != null) {
            ((AudioModelsComponent) this.c.K.getValue()).r().N0(new lqk0((StartPlaySource) null, musicTrack, (List<MusicTrack>) this.b, MusicPlaybackLaunchContext.d, false, 0, ShuffleMode.SHUFFLE_AUTO, PlayRequestTrigger.FAST_PLAY_SINGLE_AUDIO, (AdsAudioPixelsContainer) null, SystemClock.elapsedRealtime()));
        }
    }
}
