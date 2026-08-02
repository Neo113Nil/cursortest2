package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PauseReason;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerMode;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlaySource;
import java.util.List;
import kotlin.Pair;

/* compiled from: MusicTrackBottomSheetModel.kt */
/* loaded from: classes3.dex */
public final class ia50 implements a630, i80, u2b0 {
    public final MusicPlaybackLaunchContext b;
    public final Playlist c;
    public final MusicBottomSheetLaunchPoint d;
    public final ms1 e;
    public final g9o f;
    public final u2b0 g;

    public ia50(MusicPlaybackLaunchContext musicPlaybackLaunchContext, Playlist playlist, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, ms1 ms1Var, g9o g9oVar, u2b0 u2b0Var) {
        this.b = musicPlaybackLaunchContext;
        this.c = playlist;
        this.d = musicBottomSheetLaunchPoint;
        this.e = ms1Var;
        this.f = g9oVar;
        this.g = u2b0Var;
    }

    @Override // xsna.u2b0
    public final boolean A0() {
        return this.g.A0();
    }

    @Override // xsna.u2b0
    public final void B0(int i, PlaybackActionMeta playbackActionMeta) {
        this.g.B0(i, playbackActionMeta);
    }

    @Override // xsna.u2b0
    public final long C1() {
        return this.g.C1();
    }

    @Override // xsna.a630
    public final boolean D(MusicTrack musicTrack) {
        return this.e.b.D(musicTrack);
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Boolean> E(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        return this.e.b.E(musicTrack, musicPlaybackLaunchContext);
    }

    @Override // xsna.u2b0
    public final boolean E0() {
        return this.g.E0();
    }

    @Override // xsna.u2b0
    public final void E1(PlayerTrack playerTrack, boolean z, PlaybackActionMeta playbackActionMeta, String str) {
        this.g.E1(playerTrack, z, playbackActionMeta, str);
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Pair<int[], Playlist>> F(MusicTrack musicTrack, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        return this.e.b.F(musicTrack, playlist, musicPlaybackLaunchContext);
    }

    @Override // xsna.u2b0
    public final long F0() {
        return this.g.F0();
    }

    @Override // xsna.a630
    public final boolean G(MusicTrack musicTrack) {
        return this.e.b.G(musicTrack);
    }

    @Override // xsna.u2b0
    public final void G0(int i, PlaybackActionMeta playbackActionMeta) {
        this.g.G0(i, playbackActionMeta);
    }

    @Override // xsna.i80
    public final void G1() {
        new i80[]{this.g}[0].G1();
    }

    @Override // xsna.u2b0
    public final com.vk.music.player.f H() {
        return this.g.H();
    }

    @Override // xsna.u2b0
    public final void H0(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        this.g.H0(playerTrack, playerTrack2);
    }

    @Override // xsna.u2b0
    public final void I0() {
        this.g.I0();
    }

    @Override // xsna.u2b0
    public final boolean I1() {
        return this.g.I1();
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Boolean> J(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        return this.e.b.J(musicTrack, musicPlaybackLaunchContext);
    }

    @Override // xsna.u2b0
    public final boolean J0() {
        return this.g.J0();
    }

    @Override // xsna.u2b0
    public final boolean J1(String str) {
        return this.g.J1(str);
    }

    @Override // xsna.u2b0
    public final MusicTrack K0() {
        return this.g.K0();
    }

    @Override // xsna.u2b0
    public final void L0(PlaybackActionMeta playbackActionMeta) {
        this.g.L0(playbackActionMeta);
    }

    @Override // xsna.a630
    public final void M(Context context, MusicTrack musicTrack) {
        this.e.M(context, musicTrack);
    }

    @Override // xsna.u2b0
    public final void N0(lqk0 lqk0Var) {
        this.g.N0(lqk0Var);
    }

    @Override // xsna.a630
    public final void P(Activity activity, int i, AudioBookChapter audioBookChapter, boolean z) {
        this.e.P(activity, i, audioBookChapter, z);
    }

    @Override // xsna.u2b0
    public final void P0(com.vk.music.player.e eVar, boolean z) {
        this.g.P0(eVar, z);
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Boolean> Q(int i, boolean z, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        return this.e.b.Q(i, z, musicPlaybackLaunchContext);
    }

    @Override // xsna.u2b0
    public final boolean T0() {
        return this.g.T0();
    }

    @Override // xsna.u2b0
    public final boolean U0() {
        return this.g.U0();
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Playlist> V(MusicTrack musicTrack, Playlist playlist) {
        return this.e.b.V(musicTrack, playlist);
    }

    @Override // xsna.u2b0
    public final void V0() {
        this.g.V0();
    }

    @Override // xsna.a630
    public final void W(Context context, MusicTrack musicTrack, boolean z, List<String> list) {
        this.e.W(context, musicTrack, z, list);
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Boolean> X0(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        return this.e.b.X0(musicTrack, musicPlaybackLaunchContext);
    }

    @Override // xsna.u2b0
    public final void Y0() {
        this.g.Y0();
    }

    @Override // xsna.u2b0
    public final MusicTrack b() {
        return this.g.b();
    }

    @Override // xsna.u2b0
    public final void b1(PlaybackActionMeta playbackActionMeta) {
        this.g.b1(playbackActionMeta);
    }

    @Override // xsna.u2b0
    public final boolean c1() {
        return this.g.c1();
    }

    @Override // xsna.u2b0
    public final List<gza0> d() {
        return this.g.d();
    }

    @Override // xsna.i80
    public final Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBundle("s0", new i80[]{this.g}[0].e());
        return bundle;
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Integer> e1(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z) {
        return this.e.b.e1(musicTrack, musicPlaybackLaunchContext, true);
    }

    @Override // xsna.u2b0
    public final void f(PlaybackActionMeta playbackActionMeta) {
        this.g.f(playbackActionMeta);
    }

    @Override // xsna.a630
    public final void f1(Context context, MusicTrack musicTrack, Playlist playlist) {
        this.e.f1(context, musicTrack, playlist);
    }

    @Override // xsna.u2b0
    public final List<PlayerTrack> g() {
        return this.g.g();
    }

    @Override // xsna.u2b0
    public final LoopMode getRepeatMode() {
        return this.g.getRepeatMode();
    }

    @Override // xsna.u2b0
    public final boolean h() {
        return this.g.h();
    }

    @Override // xsna.a630
    public final boolean i(MusicTrack musicTrack) {
        return this.e.b.i(musicTrack);
    }

    @Override // xsna.a630
    public final boolean i0(MusicTrack musicTrack) {
        return this.e.b.i0(musicTrack);
    }

    @Override // xsna.u2b0
    public final boolean isActive() {
        return this.g.isActive();
    }

    @Override // xsna.u2b0
    public final StartPlaySource j() {
        return this.g.j();
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Boolean> j0(int i, boolean z, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        return this.e.b.j0(i, z, musicPlaybackLaunchContext);
    }

    @Override // xsna.a630
    public final boolean j1(MusicTrack musicTrack) {
        return this.e.b.j1(musicTrack);
    }

    @Override // xsna.u2b0
    public final int k() {
        return this.g.k();
    }

    @Override // xsna.u2b0
    public final float l() {
        return this.g.l();
    }

    @Override // xsna.a630
    public final void l0(List<String> list, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, gzs<s3q0> gzsVar) {
        this.e.l0(list, musicTrack, musicPlaybackLaunchContext, gzsVar);
    }

    @Override // xsna.u2b0
    public final PlayState m0() {
        return this.g.m0();
    }

    @Override // xsna.u2b0
    public final void m1(StartPlaySource startPlaySource, List<MusicTrack> list, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z, PlaybackActionMeta playbackActionMeta) {
        this.g.m1(startPlaySource, list, musicPlaybackLaunchContext, z, playbackActionMeta);
    }

    @Override // xsna.u2b0
    public final void n0(com.vk.music.player.e eVar) {
        this.g.n0(eVar);
    }

    @Override // xsna.u2b0
    public final void o() {
        this.g.o();
    }

    @Override // xsna.u2b0
    public final PlayerTrack o0() {
        return this.g.o0();
    }

    @Override // xsna.u2b0
    public final int p() {
        return this.g.p();
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Boolean> p1(MusicTrack musicTrack, boolean z, boolean z2) {
        return this.e.b.p1(musicTrack, z, z2);
    }

    @Override // xsna.u2b0
    public final void pause(int i) {
        this.g.pause(i);
    }

    @Override // xsna.u2b0
    public final void q0() {
        this.g.q0();
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<Boolean> q1(MusicTrack musicTrack, boolean z) {
        return this.e.b.q1(musicTrack, z);
    }

    @Override // xsna.u2b0
    public final void s(float f, boolean z) {
        this.g.s(f, z);
    }

    @Override // xsna.u2b0
    public final void s0(PlaybackActionMeta playbackActionMeta) {
        this.g.s0(playbackActionMeta);
    }

    @Override // xsna.u2b0
    public final void stop(int i) {
        this.g.stop(i);
    }

    @Override // xsna.u2b0
    public final void t1(int i, PauseReason pauseReason, Runnable runnable) {
        this.g.t1(i, pauseReason, runnable);
    }

    @Override // xsna.i80
    public final void u(Bundle bundle) {
        i80[] i80VarArr = {this.g};
        Bundle bundle2 = bundle.getBundle("s0");
        if (bundle2 != null) {
            i80VarArr[0].u(bundle2);
        }
    }

    @Override // xsna.a630
    public final io.reactivex.rxjava3.core.q<List<String>> u1(MusicTrack musicTrack, boolean z) {
        return this.e.b.u1(musicTrack, z);
    }

    @Override // xsna.u2b0
    public final void v1(hhg hhgVar) {
        this.g.v1(hhgVar);
    }

    @Override // xsna.u2b0
    public final void w0(boolean z, PlaybackActionMeta playbackActionMeta) {
        this.g.w0(z, playbackActionMeta);
    }

    @Override // xsna.u2b0
    public final void w1(PlaybackActionMeta playbackActionMeta) {
        this.g.w1(playbackActionMeta);
    }

    @Override // xsna.u2b0
    public final MusicPlaybackLaunchContext x0() {
        return this.g.x0();
    }

    @Override // xsna.u2b0
    public final PlayerMode x1() {
        return this.g.x1();
    }

    @Override // xsna.a630
    public final boolean y(MusicTrack musicTrack) {
        return this.e.b.y(musicTrack);
    }

    @Override // xsna.u2b0
    public final boolean y0(MusicTrack musicTrack) {
        return this.g.y0(musicTrack);
    }

    @Override // xsna.a630
    public final void y1(Activity activity, AudioBook audioBook, AudioBookChapter audioBookChapter) {
        this.e.y1(activity, audioBook, audioBookChapter);
    }

    @Override // xsna.u2b0
    public final boolean z0() {
        return this.g.z0();
    }

    @Override // xsna.u2b0
    public final boolean z1() {
        return this.g.z1();
    }

    @Override // xsna.i80
    public final void release() {
    }

    @Override // xsna.u2b0
    public final void setPayload(String str) {
    }
}
