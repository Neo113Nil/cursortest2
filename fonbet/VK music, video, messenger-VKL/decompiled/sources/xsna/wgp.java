package xsna;

import android.os.Bundle;
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
import kotlin.collections.EmptyList;

/* compiled from: EmptyPlayerModel.kt */
/* loaded from: classes.dex */
public abstract class wgp implements u2b0 {
    public final EmptyList b;
    public final float c;
    public final PlayState d;
    public final PlayerMode e;
    public final LoopMode f;
    public final boolean g;
    public final EmptyList h;

    public wgp() {
        EmptyList emptyList = EmptyList.b;
        this.b = emptyList;
        this.c = 1.0f;
        this.d = PlayState.IDLE;
        this.e = PlayerMode.AUDIO;
        this.f = LoopMode.NONE;
        this.g = true;
        this.h = emptyList;
    }

    @Override // xsna.u2b0
    public final boolean A0() {
        return false;
    }

    @Override // xsna.u2b0
    public final long C1() {
        return 0L;
    }

    @Override // xsna.u2b0
    public final boolean E0() {
        return false;
    }

    @Override // xsna.u2b0
    public final long F0() {
        return 0L;
    }

    @Override // xsna.u2b0
    public com.vk.music.player.f H() {
        return null;
    }

    @Override // xsna.u2b0
    public final boolean I1() {
        return this.g;
    }

    @Override // xsna.u2b0
    public final boolean J0() {
        return false;
    }

    @Override // xsna.u2b0
    public final boolean J1(String str) {
        return false;
    }

    @Override // xsna.u2b0
    public MusicTrack K0() {
        return null;
    }

    @Override // xsna.u2b0
    public final boolean T0() {
        return false;
    }

    @Override // xsna.u2b0
    public final boolean U0() {
        return false;
    }

    @Override // xsna.u2b0
    public MusicTrack b() {
        return null;
    }

    @Override // xsna.u2b0
    public final boolean c1() {
        return false;
    }

    @Override // xsna.u2b0
    public List<gza0> d() {
        return this.h;
    }

    @Override // xsna.i80
    public final Bundle e() {
        return Bundle.EMPTY;
    }

    @Override // xsna.u2b0
    public List<PlayerTrack> g() {
        return this.b;
    }

    @Override // xsna.u2b0
    public final LoopMode getRepeatMode() {
        return this.f;
    }

    @Override // xsna.u2b0
    public boolean h() {
        return false;
    }

    @Override // xsna.u2b0
    public StartPlaySource j() {
        return null;
    }

    @Override // xsna.u2b0
    public final int k() {
        return 0;
    }

    @Override // xsna.u2b0
    public final float l() {
        return this.c;
    }

    @Override // xsna.u2b0
    public PlayState m0() {
        return this.d;
    }

    @Override // xsna.u2b0
    public PlayerTrack o0() {
        return null;
    }

    @Override // xsna.u2b0
    public final int p() {
        return 0;
    }

    @Override // xsna.u2b0
    public final MusicPlaybackLaunchContext x0() {
        return MusicPlaybackLaunchContext.d;
    }

    @Override // xsna.u2b0
    public final PlayerMode x1() {
        return this.e;
    }

    @Override // xsna.u2b0
    public boolean y0(MusicTrack musicTrack) {
        return false;
    }

    @Override // xsna.u2b0
    public final boolean z0() {
        return false;
    }

    @Override // xsna.u2b0
    public final boolean z1() {
        return false;
    }

    @Override // xsna.i80
    public final void G1() {
    }

    @Override // xsna.u2b0
    public final void I0() {
    }

    @Override // xsna.u2b0
    public final void V0() {
    }

    @Override // xsna.u2b0
    public final void Y0() {
    }

    @Override // xsna.u2b0
    public final void o() {
    }

    @Override // xsna.u2b0
    public final void q0() {
    }

    @Override // xsna.i80
    public void release() {
    }

    @Override // xsna.u2b0
    public final void L0(PlaybackActionMeta playbackActionMeta) {
    }

    @Override // xsna.u2b0
    public void N0(lqk0 lqk0Var) {
    }

    @Override // xsna.u2b0
    public final void b1(PlaybackActionMeta playbackActionMeta) {
    }

    @Override // xsna.u2b0
    public void f(PlaybackActionMeta playbackActionMeta) {
    }

    @Override // xsna.u2b0
    public void n0(com.vk.music.player.e eVar) {
    }

    @Override // xsna.u2b0
    public void pause(int i) {
    }

    @Override // xsna.u2b0
    public final void s0(PlaybackActionMeta playbackActionMeta) {
    }

    @Override // xsna.u2b0
    public final void setPayload(String str) {
    }

    @Override // xsna.u2b0
    public void stop(int i) {
    }

    @Override // xsna.i80
    public final void u(Bundle bundle) {
    }

    @Override // xsna.u2b0
    public final void v1(hhg hhgVar) {
    }

    @Override // xsna.u2b0
    public final void w1(PlaybackActionMeta playbackActionMeta) {
    }

    @Override // xsna.u2b0
    public final void B0(int i, PlaybackActionMeta playbackActionMeta) {
    }

    @Override // xsna.u2b0
    public final void G0(int i, PlaybackActionMeta playbackActionMeta) {
    }

    @Override // xsna.u2b0
    public final void H0(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
    }

    @Override // xsna.u2b0
    public void P0(com.vk.music.player.e eVar, boolean z) {
    }

    @Override // xsna.u2b0
    public final void s(float f, boolean z) {
    }

    @Override // xsna.u2b0
    public final void w0(boolean z, PlaybackActionMeta playbackActionMeta) {
    }

    @Override // xsna.u2b0
    public final void t1(int i, PauseReason pauseReason, Runnable runnable) {
    }

    @Override // xsna.u2b0
    public final void E1(PlayerTrack playerTrack, boolean z, PlaybackActionMeta playbackActionMeta, String str) {
    }

    @Override // xsna.u2b0
    public final void m1(StartPlaySource startPlaySource, List<MusicTrack> list, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z, PlaybackActionMeta playbackActionMeta) {
    }
}
