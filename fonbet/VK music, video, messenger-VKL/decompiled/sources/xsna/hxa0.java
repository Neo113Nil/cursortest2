package xsna;

import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.a;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PlaybackQueue.kt */
/* loaded from: classes3.dex */
public interface hxa0 {
    boolean A(String str);

    void B(StartPlaySource startPlaySource, ArrayList arrayList, MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    PlayerTrack C();

    void a();

    PlayerTrack b();

    PlayerTrack c();

    ArrayList d();

    void e();

    PlayerTrack getFirst();

    PlayerTrack getLast();

    int getSize();

    boolean hasNext();

    com.vk.music.player.playback.e i();

    void j(PlayerTrack playerTrack);

    void k(List<String> list);

    void l(String str, String str2);

    boolean m();

    List<PlayerTrack> n();

    void o(StartPlaySource startPlaySource, Integer num, List list, boolean z, MusicPlaybackLaunchContext musicPlaybackLaunchContext, AdsAudioPixelsContainer adsAudioPixelsContainer, y1b0 y1b0Var);

    void p(izs<? super String, s3q0> izsVar);

    void q(boolean z, kb40 kb40Var);

    boolean r();

    void release();

    List<PlayerTrack> s(int i);

    PlayerTrack t(String str);

    PlayerTrack u();

    void v(StartPlaySource startPlaySource, ArrayList arrayList, MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    void w(a.C1330a c1330a);

    void x(z1b0 z1b0Var);

    void y(boolean z, ke4 ke4Var);

    void z(izs<? super String, s3q0> izsVar);
}
