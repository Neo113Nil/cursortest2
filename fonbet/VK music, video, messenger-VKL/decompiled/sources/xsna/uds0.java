package xsna;

import android.os.Looper;
import android.os.SystemClock;
import one.video.player.OneVideoPlayer;

/* compiled from: VideoCoverageProcessor.kt */
/* loaded from: classes8.dex */
public abstract class uds0 extends de {
    public final tds0 b = new tds0(0);
    public final long c = wn80.b;

    public final void q0(long j) {
        g4b0 g4b0Var = oyk0.this.i;
        boolean z = g4b0Var != null ? g4b0Var.h : false;
        tds0 tds0Var = this.b;
        if (z) {
            tds0Var.a = SystemClock.elapsedRealtime();
        } else {
            tds0Var.a = j;
        }
        tds0Var.b = tds0Var.a;
    }

    public final long r0() {
        tds0 tds0Var = this.b;
        long j = tds0Var.a;
        if (j < 0) {
            return -1L;
        }
        long j2 = tds0Var.b;
        if (j2 > j || (j2 == 0 && j == 0)) {
            oyk0 oyk0Var = oyk0.this;
            g4b0 g4b0Var = oyk0Var.i;
            if (g4b0Var != null ? g4b0Var.h : false) {
                OneVideoPlayer oneVideoPlayer = oyk0Var.f;
                if (oneVideoPlayer != null && g4b0Var != null) {
                    Long valueOf = ((g4b0Var != null ? g4b0Var.h : false) && epx.f(Looper.myLooper(), Looper.getMainLooper())) ? Long.valueOf(oneVideoPlayer.getCurrentPosition()) : null;
                    fgq fgqVar = oyk0Var.d;
                    pjz pjzVar = oyk0Var.h;
                    oyk0Var.h = null;
                    ww40 ww40Var = oyk0Var.a;
                    oyk0Var.u(g4b0Var, new omx(oneVideoPlayer, fgqVar, pjzVar, valueOf, ww40Var != null ? ww40Var.a() : null), j, j2);
                }
            } else {
                OneVideoPlayer oneVideoPlayer2 = oyk0Var.f;
                if (oneVideoPlayer2 != null && g4b0Var != null) {
                    oyk0Var.v(g4b0Var, oyk0.f(oyk0Var, oneVideoPlayer2, oyk0Var.d), j, j2);
                }
            }
        }
        tds0Var.a();
        return j2;
    }
}
