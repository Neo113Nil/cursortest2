package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: VideoSession.kt */
/* loaded from: classes8.dex */
public final class yft0 {
    public final boolean a;
    public final com.vk.libvideo.autoplay.h b;
    public mm80 c;
    public final nwp d;
    public final lwp e;
    public final lec f;
    public final bgt0 g;
    public OneVideoPlayer h;
    public xds0 i;
    public one.video.stat2.a j;
    public final a k;

    /* compiled from: VideoSession.kt */
    public static final class a extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                ((OneVideoPlayer) message.obj).e();
            }
        }
    }

    /* compiled from: VideoSession.kt */
    public static final class b {
        public final OneVideoPlaybackException a;
        public final sht0 b;
        public final ieq c;

        public b(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, ieq ieqVar) {
            this.a = oneVideoPlaybackException;
            this.b = sht0Var;
            this.c = ieqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            sht0 sht0Var = this.b;
            int hashCode2 = (hashCode + (sht0Var == null ? 0 : sht0Var.hashCode())) * 31;
            ieq ieqVar = this.c;
            return hashCode2 + (ieqVar != null ? ieqVar.hashCode() : 0);
        }

        public final String toString() {
            return "ResolvedError(error=" + this.a + ", source=" + this.b + ", action=" + this.c + ")";
        }
    }

    public yft0(boolean z, mwp mwpVar, com.vk.libvideo.autoplay.h hVar) {
        this.a = z;
        this.b = hVar;
        vw3 vw3Var = pwp.a;
        this.d = new nwp(vw3Var, mwpVar.d, new n9m0(this, 18));
        this.e = new lwp(vw3Var, mwpVar);
        this.f = new lec(2);
        this.g = new bgt0(this);
        Looper myLooper = Looper.myLooper();
        this.k = new a(myLooper == null ? Looper.getMainLooper() : myLooper);
    }

    public static final void a(yft0 yft0Var, final OneVideoPlayer oneVideoPlayer, final sht0 sht0Var) {
        OneVideoPlayer a2;
        m7q c;
        a aVar = yft0Var.k;
        VideoAutoPlay videoAutoPlay = yft0Var.b.a;
        d3b0 d3b0Var = videoAutoPlay.p0;
        if (d3b0Var != null && (a2 = d3b0Var.a()) != null && (c = d3b0Var.c()) != null) {
            m7q a3 = m7q.a(c, sht0Var, null, null, 0, false, false, null, videoAutoPlay.getPosition(), null, null, false, 133955567);
            qu5.c().h(c.e, a3.e);
            d3b0Var.f(a3);
            nza0 h = d3b0Var.h();
            if (h != null) {
                h.a(a2, dx1.a(a3));
            }
        }
        final long currentPosition = oneVideoPlayer.getCurrentPosition();
        if (oneVideoPlayer.f0()) {
            aVar.post(new Runnable() { // from class: xsna.wft0
                @Override // java.lang.Runnable
                public final void run() {
                    OneVideoPlayer.this.n0(sht0Var, currentPosition);
                }
            });
        } else {
            aVar.post(new xft0(currentPosition, oneVideoPlayer, sht0Var, 0));
        }
    }

    public final void b(OneVideoPlayer oneVideoPlayer) {
        OneVideoPlayer.State state;
        if (epx.f(this.h, oneVideoPlayer)) {
            return;
        }
        OneVideoPlayer oneVideoPlayer2 = this.h;
        bgt0 bgt0Var = this.g;
        if (oneVideoPlayer2 != null) {
            oneVideoPlayer2.c0(bgt0Var);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.d0(bgt0Var);
        }
        if (oneVideoPlayer == null || (state = oneVideoPlayer.getState()) == null) {
            state = OneVideoPlayer.State.IDLE;
        }
        this.e.a(state);
        this.h = oneVideoPlayer;
        this.k.removeMessages(1);
    }
}
