package xsna;

import android.support.v4.media.session.MediaSessionCompat;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PauseReason;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Player.kt */
/* loaded from: classes3.dex */
public interface kza0 extends xza0 {
    void A();

    void B(int i, String str, boolean z);

    com.vk.music.player.f C();

    void D(List<MusicTrack> list, Integer num, MusicPlaybackLaunchContext musicPlaybackLaunchContext, int i, boolean z, String str, StartPlaySource startPlaySource, PlaybackActionMeta playbackActionMeta, AdsAudioPixelsContainer adsAudioPixelsContainer);

    boolean E();

    void F();

    void H(String str);

    void J(boolean z, agk agkVar);

    boolean K(int i, PauseReason pauseReason, Runnable runnable, String str);

    boolean L(PlaybackActionMeta playbackActionMeta, String str);

    void N(String str);

    void O(String str, boolean z, String str2, PlaybackActionMeta playbackActionMeta, String str3);

    boolean P();

    long Q();

    LoopMode a();

    void b(LoopMode loopMode);

    boolean c();

    List<gza0> d();

    void e();

    List<PlayerTrack> g();

    long getDuration();

    MediaSessionCompat getMediaSession();

    PlayState getState();

    StartPlaySource i();

    int k();

    void l(String str, String str2);

    MusicPlaybackLaunchContext n();

    void o();

    int p();

    void s(float f, boolean z);

    void t(MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    void u(PlaybackActionMeta playbackActionMeta, String str);

    boolean v(PlaybackActionMeta playbackActionMeta, String str);

    void w(StartPlaySource startPlaySource, ArrayList arrayList, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z);

    void x(int i, boolean z);

    boolean y(boolean z, PlaybackActionMeta playbackActionMeta, String str);

    boolean z(PlaybackActionMeta playbackActionMeta, String str, String str2, boolean z);
}
