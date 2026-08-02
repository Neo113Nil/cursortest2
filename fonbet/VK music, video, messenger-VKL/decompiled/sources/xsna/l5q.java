package xsna;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.b;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.music.player.api.helper.AudioPlayer;
import xsna.kr10;

/* compiled from: ExoAudioPlayer.kt */
/* loaded from: classes3.dex */
public final class l5q implements AudioPlayer {
    public final t6q a;
    public final h5q b;
    public final androidx.media3.exoplayer.c c;
    public final bpn0 d;

    public l5q(Context context, aw40 aw40Var) {
        t6q t6qVar = new t6q();
        this.a = t6qVar;
        h5q h5qVar = new h5q();
        this.b = h5qVar;
        ExoPlayer.b bVar = new ExoPlayer.b(context);
        bVar.d(aw40Var.e(context));
        b.a aVar = new b.a();
        z9l z9lVar = new z9l(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        fxc0.z(!aVar.o);
        aVar.b = z9lVar;
        aVar.b(480000, 600000, 2500, 5000);
        fxc0.z(!aVar.o);
        androidx.media3.exoplayer.b.i(60000, 0, "backBufferDurationMs", "0");
        aVar.n = 60000;
        aVar.c(true);
        bVar.b(aVar.a());
        androidx.media3.exoplayer.c a = bVar.a();
        a.n.a(new g200(t6qVar));
        a.X();
        a.t.G(h5qVar);
        this.c = a;
        this.d = new bpn0(new fgm(this, 6));
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final long a() {
        return this.c.a();
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final boolean d() {
        return this.c.getPlaybackState() == 2;
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final boolean e() {
        return this.c.e();
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void f(rs4 rs4Var) {
        this.a.b.remove(rs4Var);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void g(ks4 ks4Var) {
        this.b.b.add(ks4Var);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final int getAudioSessionId() {
        androidx.media3.exoplayer.c cVar = this.c;
        cVar.X();
        return cVar.D.a().intValue();
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final int getBufferedPercentage() {
        return this.c.t();
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final long getCurrentPosition() {
        return this.c.getCurrentPosition();
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final long getDuration() {
        return this.c.getDuration();
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final boolean getPlayWhenReady() {
        return this.c.getPlayWhenReady();
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final float getVolume() {
        androidx.media3.exoplayer.c cVar = this.c;
        cVar.X();
        return cVar.f0;
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final mr10 h() {
        kr10.f fVar;
        androidx.media3.exoplayer.c cVar = this.c;
        ewo0 currentTimeline = cVar.getCurrentTimeline();
        kr10 kr10Var = currentTimeline.p() ? null : currentTimeline.m(cVar.s(), cVar.b, 0L).c;
        return new mr10(kr10Var != null ? kr10Var.a : null, (kr10Var == null || (fVar = kr10Var.b) == null) ? null : fVar.a);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void i(rs4 rs4Var) {
        this.a.b.add(rs4Var);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final boolean isEnded() {
        return this.c.getPlaybackState() == 4;
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final boolean isReady() {
        return this.c.getPlaybackState() == 3;
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final boolean isReleased() {
        androidx.media3.exoplayer.c cVar = this.c;
        cVar.X();
        return cVar.n0;
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void j(ks4 ks4Var) {
        this.b.b.remove(ks4Var);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void release() {
        this.c.release();
        this.a.b.clear();
        this.b.b.clear();
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void seekTo(long j) {
        this.c.x(j);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void setPlayWhenReady(boolean z) {
        this.c.setPlayWhenReady(z);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void setPlaybackSpeed(float f) {
        this.c.O(new jwa0(f, 1.0f));
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void setVolume(float f) {
        this.c.setVolume(f);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void stop() {
        androidx.media3.exoplayer.c cVar = this.c;
        cVar.stop();
        cVar.k();
    }
}
