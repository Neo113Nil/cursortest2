package xsna;

import com.ironsource.X3;
import java.util.concurrent.TimeUnit;
import one.video.player.error.OneVideoPlaybackException;
import ru.ok.android.onelog.ExperimentalOneLogDirect;

/* compiled from: MusicStatisticsListener.kt */
/* loaded from: classes3.dex */
public final class r750 extends oyk0 {
    @Override // xsna.oyk0
    public final void h(g4b0 g4b0Var, omx omxVar, long j) {
        wi80.b("download_bytes", g4b0Var, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void i(g4b0 g4b0Var, omx omxVar, long j) {
        wi80.b("close_at_empty_buffer", g4b0Var, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void k(g4b0 g4b0Var, omx omxVar, long j) {
        wi80.b("empty_buffer", g4b0Var, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void l(OneVideoPlaybackException oneVideoPlaybackException, awp awpVar, omx omxVar, g4b0 g4b0Var) {
        wi80.b("content_error", g4b0Var, oneVideoPlaybackException, null);
    }

    @Override // xsna.oyk0
    public final void m(g4b0 g4b0Var, omx omxVar, long j) {
        wi80.b("first_bytes", g4b0Var, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void o(g4b0 g4b0Var, omx omxVar, long j) {
        wi80.b(X3.i.f0, g4b0Var, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void p(g4b0 g4b0Var, omx omxVar, long j) {
        wi80.b("pause", g4b0Var, Long.valueOf(j / 1000), null);
    }

    @Override // xsna.oyk0
    public final void q(g4b0 g4b0Var, omx omxVar) {
        wi80.c(g4b0Var);
    }

    @Override // xsna.oyk0
    public final void r(g4b0 g4b0Var, omx omxVar, long j) {
        wi80.b("player_ready", g4b0Var, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void s(g4b0 g4b0Var, omx omxVar, long j) {
        wi80.b("seek", g4b0Var, "unknown", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    @Override // xsna.oyk0
    public final void t(g4b0 g4b0Var, omx omxVar) {
        wi80.b("stop", g4b0Var, null, null);
    }

    @Override // xsna.oyk0
    public final void v(g4b0 g4b0Var, omx omxVar, long j, long j2) {
        String a = f3r0.a(j, j2);
        if (g4b0Var.a != null) {
            ExperimentalOneLogDirect experimentalOneLogDirect = ExperimentalOneLogDirect.INSTANCE;
            experimentalOneLogDirect.flush();
            experimentalOneLogDirect.send(wi80.a("watch_coverage_record", g4b0Var, a, null));
        }
    }

    @Override // xsna.oyk0
    public final void j(g4b0 g4b0Var, omx omxVar, one.video.player.tracks.c cVar) {
    }

    @Override // xsna.oyk0
    public final void n(g4b0 g4b0Var, omx omxVar, long j) {
    }

    @Override // xsna.oyk0
    public final void u(g4b0 g4b0Var, omx omxVar, long j, long j2) {
    }
}
