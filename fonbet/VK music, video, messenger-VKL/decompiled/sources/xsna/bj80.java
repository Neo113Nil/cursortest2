package xsna;

import com.ironsource.X3;
import java.util.concurrent.TimeUnit;
import one.video.player.error.OneVideoPlaybackException;
import ru.ok.android.onelog.OneLogDirect;

/* compiled from: OneLogStatisticListenerImpl.kt */
@ozl
/* loaded from: classes8.dex */
public final class bj80 extends oyk0 {
    @Override // xsna.oyk0
    public final void h(g4b0 g4b0Var, omx omxVar, long j) {
        dj80.b("download_bytes", g4b0Var, omxVar, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void i(g4b0 g4b0Var, omx omxVar, long j) {
        dj80.b("close_at_empty_buffer", g4b0Var, omxVar, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void j(g4b0 g4b0Var, omx omxVar, one.video.player.tracks.c cVar) {
        dj80.c(g4b0Var, omxVar, cVar);
    }

    @Override // xsna.oyk0
    public final void k(g4b0 g4b0Var, omx omxVar, long j) {
        dj80.b("empty_buffer", g4b0Var, omxVar, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void l(OneVideoPlaybackException oneVideoPlaybackException, awp awpVar, omx omxVar, g4b0 g4b0Var) {
        dj80.d(oneVideoPlaybackException, awpVar, omxVar, g4b0Var);
    }

    @Override // xsna.oyk0
    public final void m(g4b0 g4b0Var, omx omxVar, long j) {
        dj80.b("first_bytes", g4b0Var, omxVar, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void n(g4b0 g4b0Var, omx omxVar, long j) {
        dj80.b("first_frame", g4b0Var, omxVar, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void o(g4b0 g4b0Var, omx omxVar, long j) {
        dj80.b(X3.i.f0, g4b0Var, omxVar, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void p(g4b0 g4b0Var, omx omxVar, long j) {
        dj80.b("pause", g4b0Var, omxVar, Long.valueOf(j / 1000), null);
    }

    @Override // xsna.oyk0
    public final void q(g4b0 g4b0Var, omx omxVar) {
        long j = 0 / 1000;
        if (g4b0Var.a != null) {
            OneLogDirect oneLogDirect = OneLogDirect.INSTANCE;
            oneLogDirect.flush();
            oneLogDirect.m362sendPCEVtD0(dj80.a("play", g4b0Var, omxVar, Long.valueOf(j), null), null);
        }
    }

    @Override // xsna.oyk0
    public final void r(g4b0 g4b0Var, omx omxVar, long j) {
        dj80.b("player_ready", g4b0Var, omxVar, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void s(g4b0 g4b0Var, omx omxVar, long j) {
        dj80.b("seek", g4b0Var, omxVar, "unknown", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    @Override // xsna.oyk0
    public final void t(g4b0 g4b0Var, omx omxVar) {
        dj80.b("stop", g4b0Var, omxVar, null, null);
    }

    @Override // xsna.oyk0
    public final void u(g4b0 g4b0Var, omx omxVar, long j, long j2) {
        String a = f3r0.a(j, j2);
        if (g4b0Var.a != null) {
            OneLogDirect oneLogDirect = OneLogDirect.INSTANCE;
            oneLogDirect.flush();
            oneLogDirect.m362sendPCEVtD0(dj80.a("watch_coverage_live", g4b0Var, omxVar, a, null), null);
        }
    }

    @Override // xsna.oyk0
    public final void v(g4b0 g4b0Var, omx omxVar, long j, long j2) {
        String a = f3r0.a(j, j2);
        if (g4b0Var.a != null) {
            OneLogDirect oneLogDirect = OneLogDirect.INSTANCE;
            oneLogDirect.flush();
            oneLogDirect.m362sendPCEVtD0(dj80.a("watch_coverage_record", g4b0Var, omxVar, a, null), null);
        }
    }
}
