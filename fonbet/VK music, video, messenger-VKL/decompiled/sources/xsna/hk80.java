package xsna;

import android.content.Context;
import android.os.Looper;
import com.vk.music.player.api.helper.AudioPlayer;
import java.util.Iterator;
import java.util.function.Supplier;
import one.video.player.OneVideoPlayer;
import xsna.jza0;

/* compiled from: OneVideoAudioPlayer.kt */
/* loaded from: classes3.dex */
public final class hk80 implements AudioPlayer {
    public final tm80 a;
    public final h5q b;
    public final xk80 c;
    public final r750 d;

    /* compiled from: OneVideoAudioPlayer.kt */
    public final class a implements jza0.b {
        public a() {
        }

        @Override // xsna.jza0.b
        public final void a(int i) {
            Iterator<rs4> it = hk80.this.a.a.iterator();
            while (it.hasNext()) {
                it.next().a(i);
            }
        }
    }

    public hk80(Context context, final aw40 aw40Var) {
        tm80 tm80Var = new tm80();
        this.a = tm80Var;
        h5q h5qVar = new h5q();
        this.b = h5qVar;
        int i = wn80.a;
        rhh0 rhh0Var = new rhh0(8);
        xgp0 xgp0Var = xgp0.j;
        boolean z = wn80.e;
        r8l r8lVar = new r8l(false, false, 7);
        o3i0 o3i0Var = new o3i0(0L, 0L);
        psm0 psm0Var = new psm0(0);
        Looper mainLooper = Looper.getMainLooper();
        Supplier supplier = new Supplier(this) { // from class: xsna.gk80
            @Override // java.util.function.Supplier
            public final Object get() {
                aw40Var.f();
                return new zl80(480000, 600000, 2500, 5000, 60000, true);
            }
        };
        cm80 cm80Var = new cm80();
        cm80Var.b(supplier);
        xk80 xk80Var = new xk80(context.getApplicationContext(), mainLooper, cm80Var.a(), null, null, false, rhh0Var, xgp0Var, z, r8lVar, 2000L, null, null, false, o3i0Var, psm0Var);
        xk80Var.d0(tm80Var);
        a aVar = new a();
        androidx.media3.exoplayer.c cVar = xk80Var.m0;
        cVar.n.a(aVar);
        cVar.X();
        cVar.t.G(h5qVar);
        this.c = xk80Var;
        r750 r750Var = new r750(null, 3);
        r750Var.z(xk80Var);
        this.d = r750Var;
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final long a() {
        return this.c.a();
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final boolean d() {
        return this.c.getState() == OneVideoPlayer.State.BUFFERING;
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final boolean e() {
        return this.c.u() != null;
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void f(rs4 rs4Var) {
        this.a.a.remove(rs4Var);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void g(ks4 ks4Var) {
        this.b.b.add(ks4Var);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final int getAudioSessionId() {
        androidx.media3.exoplayer.c cVar = this.c.m0;
        cVar.X();
        return cVar.D.a().intValue();
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final int getBufferedPercentage() {
        return this.c.getBufferedPercentage();
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
        return this.c.f0();
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final float getVolume() {
        return this.c.A;
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final mr10 h() {
        sht0 j = this.c.j();
        return new mr10(null, j != null ? j.b : null);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void i(rs4 rs4Var) {
        this.a.a.add(rs4Var);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final boolean isEnded() {
        return this.c.getState() == OneVideoPlayer.State.ENDED;
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final boolean isReady() {
        xk80 xk80Var = this.c;
        return xk80Var.getState() == OneVideoPlayer.State.PLAYING || xk80Var.getState() == OneVideoPlayer.State.PAUSED;
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final boolean isReleased() {
        return this.c.getState() == OneVideoPlayer.State.RELEASED;
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void j(ks4 ks4Var) {
        this.b.b.remove(ks4Var);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void release() {
        this.c.release();
        this.a.a.clear();
        this.b.b.clear();
        this.d.z(null);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void seekTo(long j) {
        this.c.seekTo(j);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void setPlayWhenReady(boolean z) {
        xk80 xk80Var = this.c;
        if (z) {
            xk80Var.resume();
        } else {
            xk80Var.pause();
        }
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void setPlaybackSpeed(float f) {
        this.c.setPlaybackSpeed(f);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void setVolume(float f) {
        this.c.setVolume(f);
    }

    @Override // com.vk.music.player.api.helper.AudioPlayer
    public final void stop() {
        this.c.stop();
    }
}
