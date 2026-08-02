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

/* compiled from: VkAndroidAutoPlayerModel.kt */
/* loaded from: classes16.dex */
public final class m8u0 implements u2b0 {
    public final u2b0 b;
    public final b25 c;
    public final mxa0 d;
    public io.reactivex.rxjava3.disposables.c f;
    public final io.reactivex.rxjava3.disposables.g e = new io.reactivex.rxjava3.disposables.g();
    public boolean g = true;

    public m8u0(u2b0 u2b0Var, b25 b25Var, mxa0 mxa0Var) {
        this.b = u2b0Var;
        this.c = b25Var;
        this.d = mxa0Var;
    }

    @Override // xsna.u2b0
    public final boolean A0() {
        return this.b.A0();
    }

    @Override // xsna.u2b0
    public final void B0(int i, PlaybackActionMeta playbackActionMeta) {
        this.b.B0(i, playbackActionMeta);
    }

    @Override // xsna.u2b0
    public final long C1() {
        return this.b.C1();
    }

    @Override // xsna.u2b0
    public final boolean E0() {
        return this.b.E0();
    }

    @Override // xsna.u2b0
    public final void E1(PlayerTrack playerTrack, boolean z, PlaybackActionMeta playbackActionMeta, String str) {
        this.b.E1(playerTrack, z, playbackActionMeta, str);
    }

    @Override // xsna.u2b0
    public final long F0() {
        return this.b.F0();
    }

    @Override // xsna.u2b0
    public final void G0(int i, PlaybackActionMeta playbackActionMeta) {
        this.b.G0(i, playbackActionMeta);
    }

    @Override // xsna.i80
    public final void G1() {
        this.b.G1();
    }

    @Override // xsna.u2b0
    public final com.vk.music.player.f H() {
        return this.b.H();
    }

    @Override // xsna.u2b0
    public final void H0(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        this.b.H0(playerTrack, playerTrack2);
    }

    @Override // xsna.u2b0
    public final void I0() {
        this.b.I0();
    }

    @Override // xsna.u2b0
    public final boolean I1() {
        return this.b.I1();
    }

    @Override // xsna.u2b0
    public final boolean J0() {
        return this.b.J0();
    }

    @Override // xsna.u2b0
    public final boolean J1(String str) {
        return this.b.J1(str);
    }

    @Override // xsna.u2b0
    public final MusicTrack K0() {
        return this.b.K0();
    }

    @Override // xsna.u2b0
    public final void L0(PlaybackActionMeta playbackActionMeta) {
        this.b.L0(playbackActionMeta);
    }

    @Override // xsna.u2b0
    public final void N0(lqk0 lqk0Var) {
        this.b.N0(lqk0Var);
    }

    @Override // xsna.u2b0
    public final void P0(com.vk.music.player.e eVar, boolean z) {
        this.b.P0(eVar, z);
    }

    @Override // xsna.u2b0
    public final boolean T0() {
        return this.b.T0();
    }

    @Override // xsna.u2b0
    public final boolean U0() {
        return this.b.U0();
    }

    @Override // xsna.u2b0
    public final void V0() {
        this.b.V0();
    }

    @Override // xsna.u2b0
    public final void Y0() {
        this.b.Y0();
    }

    @Override // xsna.u2b0
    public final MusicTrack b() {
        return this.b.b();
    }

    @Override // xsna.u2b0
    public final void b1(PlaybackActionMeta playbackActionMeta) {
        this.b.b1(playbackActionMeta);
    }

    @Override // xsna.u2b0
    public final boolean c1() {
        return this.b.c1();
    }

    @Override // xsna.u2b0
    public final List<gza0> d() {
        return this.b.d();
    }

    @Override // xsna.i80
    public final Bundle e() {
        return this.b.e();
    }

    @Override // xsna.u2b0
    public final void f(PlaybackActionMeta playbackActionMeta) {
        u2b0 u2b0Var = this.b;
        if (!u2b0Var.m0().i() || !this.c.b()) {
            u2b0Var.f(playbackActionMeta);
        } else {
            if (hg1.d(this.f)) {
                return;
            }
            this.f = this.d.a().subscribe(new l8u0(new snj0(6, this, playbackActionMeta), 0));
        }
    }

    @Override // xsna.u2b0
    public final List<PlayerTrack> g() {
        return this.b.g();
    }

    @Override // xsna.u2b0
    public final LoopMode getRepeatMode() {
        return this.b.getRepeatMode();
    }

    @Override // xsna.u2b0
    public final boolean h() {
        return this.b.h();
    }

    @Override // xsna.u2b0
    public final boolean isActive() {
        return this.b.isActive();
    }

    @Override // xsna.u2b0
    public final StartPlaySource j() {
        return this.b.j();
    }

    @Override // xsna.u2b0
    public final int k() {
        return this.b.k();
    }

    @Override // xsna.u2b0
    public final float l() {
        return this.b.l();
    }

    @Override // xsna.u2b0
    public final PlayState m0() {
        return this.b.m0();
    }

    @Override // xsna.u2b0
    public final void m1(StartPlaySource startPlaySource, List<MusicTrack> list, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z, PlaybackActionMeta playbackActionMeta) {
        this.b.m1(startPlaySource, list, musicPlaybackLaunchContext, z, playbackActionMeta);
    }

    @Override // xsna.u2b0
    public final void n0(com.vk.music.player.e eVar) {
        this.b.n0(eVar);
    }

    @Override // xsna.u2b0
    public final void o() {
        this.b.o();
    }

    @Override // xsna.u2b0
    public final PlayerTrack o0() {
        return this.b.o0();
    }

    @Override // xsna.u2b0
    public final int p() {
        return this.b.p();
    }

    @Override // xsna.u2b0
    public final void pause(int i) {
        this.g = false;
        this.e.dispose();
        this.b.pause(i);
    }

    @Override // xsna.u2b0
    public final void q0() {
        this.b.q0();
    }

    @Override // xsna.i80
    public final void release() {
        this.e.dispose();
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.u2b0
    public final void s(float f, boolean z) {
        this.b.s(f, z);
    }

    @Override // xsna.u2b0
    public final void s0(PlaybackActionMeta playbackActionMeta) {
        this.b.s0(playbackActionMeta);
    }

    @Override // xsna.u2b0
    public final void setPayload(String str) {
        this.b.setPayload(str);
    }

    @Override // xsna.u2b0
    public final void stop(int i) {
        this.g = false;
        this.e.dispose();
        this.b.stop(i);
    }

    @Override // xsna.u2b0
    public final void t1(int i, PauseReason pauseReason, Runnable runnable) {
        this.b.t1(i, pauseReason, runnable);
    }

    @Override // xsna.i80
    public final void u(Bundle bundle) {
        this.b.u(bundle);
    }

    @Override // xsna.u2b0
    public final void v1(hhg hhgVar) {
        this.b.v1(hhgVar);
    }

    @Override // xsna.u2b0
    public final void w0(boolean z, PlaybackActionMeta playbackActionMeta) {
        this.b.w0(z, playbackActionMeta);
    }

    @Override // xsna.u2b0
    public final void w1(PlaybackActionMeta playbackActionMeta) {
        this.g = false;
        this.e.dispose();
        this.b.w1(playbackActionMeta);
    }

    @Override // xsna.u2b0
    public final MusicPlaybackLaunchContext x0() {
        return this.b.x0();
    }

    @Override // xsna.u2b0
    public final PlayerMode x1() {
        return this.b.x1();
    }

    @Override // xsna.u2b0
    public final boolean y0(MusicTrack musicTrack) {
        return this.b.y0(musicTrack);
    }

    @Override // xsna.u2b0
    public final boolean z0() {
        return this.b.z0();
    }

    @Override // xsna.u2b0
    public final boolean z1() {
        return this.b.z1();
    }
}
