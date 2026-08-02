package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PauseReason;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerMode;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlaySource;
import java.util.List;

/* compiled from: PlayerModel.kt */
/* loaded from: classes.dex */
public interface u2b0 extends i80 {
    public static final a a = a.a;

    /* compiled from: PlayerModel.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final wgp STUB = new C3783a();

        /* compiled from: PlayerModel.kt */
        /* renamed from: xsna.u2b0$a$a, reason: collision with other inner class name */
        public static final class C3783a extends wgp {
        }

        public final wgp getSTUB() {
            return STUB;
        }
    }

    static /* synthetic */ void v0(u2b0 u2b0Var, PlayerTrack playerTrack, String str, int i) {
        boolean z = (i & 2) == 0;
        PlaybackActionMeta playbackActionMeta = new PlaybackActionMeta(35, 0L, 2, null);
        if ((i & 8) != 0) {
            str = "new";
        }
        u2b0Var.E1(playerTrack, z, playbackActionMeta, str);
    }

    boolean A0();

    void B0(int i, PlaybackActionMeta playbackActionMeta);

    long C1();

    boolean E0();

    void E1(PlayerTrack playerTrack, boolean z, PlaybackActionMeta playbackActionMeta, String str);

    long F0();

    void G0(int i, PlaybackActionMeta playbackActionMeta);

    com.vk.music.player.f H();

    void H0(PlayerTrack playerTrack, PlayerTrack playerTrack2);

    void I0();

    boolean I1();

    boolean J0();

    boolean J1(String str);

    MusicTrack K0();

    void L0(PlaybackActionMeta playbackActionMeta);

    void N0(lqk0 lqk0Var);

    void P0(com.vk.music.player.e eVar, boolean z);

    boolean T0();

    boolean U0();

    void V0();

    void Y0();

    MusicTrack b();

    void b1(PlaybackActionMeta playbackActionMeta);

    boolean c1();

    List<gza0> d();

    void f(PlaybackActionMeta playbackActionMeta);

    List<PlayerTrack> g();

    LoopMode getRepeatMode();

    boolean h();

    default boolean isActive() {
        com.vk.music.player.f H = H();
        return H != null && H.m();
    }

    StartPlaySource j();

    int k();

    float l();

    PlayState m0();

    void m1(StartPlaySource startPlaySource, List<MusicTrack> list, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z, PlaybackActionMeta playbackActionMeta);

    void n0(com.vk.music.player.e eVar);

    void o();

    PlayerTrack o0();

    int p();

    void pause(int i);

    void q0();

    void s(float f, boolean z);

    void s0(PlaybackActionMeta playbackActionMeta);

    void setPayload(String str);

    void stop(int i);

    void t1(int i, PauseReason pauseReason, Runnable runnable);

    void v1(hhg hhgVar);

    void w0(boolean z, PlaybackActionMeta playbackActionMeta);

    void w1(PlaybackActionMeta playbackActionMeta);

    MusicPlaybackLaunchContext x0();

    PlayerMode x1();

    boolean y0(MusicTrack musicTrack);

    boolean z0();

    boolean z1();
}
