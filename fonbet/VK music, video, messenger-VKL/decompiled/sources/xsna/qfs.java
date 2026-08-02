package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import kotlin.NotImplementedError;
import one.video.player.BaseVideoPlayer;

/* compiled from: FramePlayerInternal.kt */
/* loaded from: classes3.dex */
public final class qfs extends BaseVideoPlayer {
    public final ufs J;

    /* compiled from: FramePlayerInternal.kt */
    public static final class a {
        public final qfs a;

        public a() {
            this.a = qfs.this;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qfs() {
        super(r0, r0, 6);
        boolean z = false;
        ufs ufsVar = new ufs(new a(), new Handler(Looper.getMainLooper()));
        ufsVar.start();
        this.J = ufsVar;
    }

    @Override // one.video.player.OneVideoPlayer
    public final void B(rt4 rt4Var) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean O() {
        return j() != null;
    }

    @Override // one.video.player.OneVideoPlayer
    public final void V(boolean z) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // one.video.player.OneVideoPlayer
    public final long Z() {
        return this.J.f();
    }

    @Override // one.video.player.OneVideoPlayer
    public final long a() {
        return 0L;
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean canPause() {
        return true;
    }

    @Override // one.video.player.OneVideoPlayer
    @ozl
    public final void clearVideoSurface() {
        this.J.n(null);
    }

    @Override // one.video.player.OneVideoPlayer
    public final void e() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // one.video.player.OneVideoPlayer
    public final void e0(rt4 rt4Var) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean f0() {
        return !this.J.v;
    }

    @Override // one.video.player.OneVideoPlayer
    public final int getBufferedPercentage() {
        return 0;
    }

    @Override // one.video.player.BaseVideoPlayer, one.video.player.OneVideoPlayer
    public final long getBufferedPosition() {
        return 0L;
    }

    @Override // one.video.player.OneVideoPlayer
    public final long getCurrentPosition() {
        return this.J.f();
    }

    @Override // one.video.player.OneVideoPlayer
    public final long getDuration() {
        return this.J.q;
    }

    @Override // one.video.player.OneVideoPlayer
    public final void h0(deb0 deb0Var) {
        one.video.player.j jVar = this.l;
        jVar.v(this);
        this.J.m(deb0Var.b);
        jVar.s(this);
    }

    @Override // one.video.player.OneVideoPlayer
    public final sht0 j() {
        y6b0 U = U();
        if (U != null) {
            return U.a(0);
        }
        return null;
    }

    @Override // one.video.player.OneVideoPlayer
    public final int m0() {
        return 0;
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean p() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // one.video.player.OneVideoPlayer
    public final void pause() {
        this.J.h();
    }

    @Override // one.video.player.BaseVideoPlayer
    public final void r0(y6b0 y6b0Var, deb0 deb0Var, boolean z) {
        sht0 a2 = y6b0Var.a(0);
        one.video.player.j jVar = this.l;
        jVar.w(this);
        jVar.v(this);
        this.J.i((fgs) a2, deb0Var.b, !z);
    }

    @Override // one.video.player.BaseVideoPlayer, one.video.player.OneVideoPlayer
    public final void release() {
        ufs ufsVar = this.J;
        ufsVar.interrupt();
        ufsVar.quitSafely();
        super.release();
    }

    @Override // one.video.player.OneVideoPlayer
    public final void resume() {
        this.J.k();
    }

    @Override // one.video.player.OneVideoPlayer
    public final void seekTo(long j) {
        one.video.player.j jVar = this.l;
        jVar.v(this);
        this.J.m(j);
        jVar.s(this);
    }

    @Override // one.video.player.OneVideoPlayer
    @ozl
    public final void setVideoSurface(Surface surface) {
        this.J.n(surface);
    }

    @Override // one.video.player.OneVideoPlayer
    public final Long u() {
        return null;
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean w() {
        return true;
    }
}
