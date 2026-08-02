package xsna;

import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.FrameSize;
import one.video.statistics.Quality;
import ru.ok.android.onelog.OneLogDirect;
import ru.ok.android.onelog.OneLogItem;
import xsna.f3r0;

/* compiled from: InteractiveStatisticListenerImpl.kt */
@ozl
/* loaded from: classes8.dex */
public final class ybx extends oyk0 {
    public final String u;
    public final dj80 v;
    public boolean w;

    public ybx(String str) {
        super((ww40) null, 2);
        this.u = str;
        this.v = dj80.a;
    }

    public static OneLogItem.Builder A(String str, g4b0 g4b0Var) {
        OneLogItem.Builder custom = OneLogItem.builder().setCollector("ok.mobile.apps.video").setType(1).setOperation(str).setCount(1).setTime(0L).setCustom("vsid", g4b0Var.b).setCustom("isid", g4b0Var.c).setCustom("vid", g4b0Var.a).setCustom("place", g4b0Var.f).setCustom("cdn_host", g4b0Var.d);
        for (Map.Entry<String, Object> entry : g4b0Var.j.entrySet()) {
            custom.setCustom(entry.getKey(), entry.getValue());
        }
        return custom;
    }

    @Override // xsna.oyk0
    public final void h(g4b0 g4b0Var, omx omxVar, long j) {
        g4b0Var.j.put("isid", g4b0Var.c);
        this.v.getClass();
        dj80.b("download_bytes", g4b0Var, omxVar, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void i(g4b0 g4b0Var, omx omxVar, long j) {
        g4b0Var.j.put("isid", g4b0Var.c);
        this.v.getClass();
        dj80.b("close_at_empty_buffer", g4b0Var, omxVar, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void j(g4b0 g4b0Var, omx omxVar, one.video.player.tracks.c cVar) {
        g4b0Var.j.put("isid", g4b0Var.c);
        this.v.getClass();
        dj80.c(g4b0Var, omxVar, cVar);
    }

    @Override // xsna.oyk0
    public final void k(g4b0 g4b0Var, omx omxVar, long j) {
        g4b0Var.j.put("isid", g4b0Var.c);
        this.v.getClass();
        dj80.b("empty_buffer", g4b0Var, omxVar, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void l(OneVideoPlaybackException oneVideoPlaybackException, awp awpVar, omx omxVar, g4b0 g4b0Var) {
        g4b0Var.j.put("isid", g4b0Var.c);
        this.v.getClass();
        dj80.d(oneVideoPlaybackException, awpVar, omxVar, g4b0Var);
    }

    @Override // xsna.oyk0
    public final void m(g4b0 g4b0Var, omx omxVar, long j) {
        g4b0Var.j.put("isid", g4b0Var.c);
        this.v.getClass();
        dj80.b("first_bytes", g4b0Var, omxVar, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void n(g4b0 g4b0Var, omx omxVar, long j) {
        g4b0Var.j.put("isid", g4b0Var.c);
        this.v.getClass();
        dj80.b("first_frame", g4b0Var, omxVar, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void o(g4b0 g4b0Var, omx omxVar, long j) {
        g4b0Var.j.put("isid", g4b0Var.c);
        this.v.getClass();
        dj80.b(X3.i.f0, g4b0Var, omxVar, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void p(g4b0 g4b0Var, omx omxVar, long j) {
        g4b0Var.j.put("isid", g4b0Var.c);
        this.v.getClass();
        dj80.b("pause", g4b0Var, omxVar, Long.valueOf(j / 1000), null);
    }

    @Override // xsna.oyk0
    public final void q(g4b0 g4b0Var, omx omxVar) {
        Quality quality;
        Map<String, Object> map = g4b0Var.j;
        map.put("isid", g4b0Var.c);
        long j = 0 / 1000;
        this.v.getClass();
        String str = g4b0Var.a;
        Quality quality2 = null;
        if (str != null) {
            OneLogDirect oneLogDirect = OneLogDirect.INSTANCE;
            oneLogDirect.flush();
            oneLogDirect.m362sendPCEVtD0(dj80.a("play", g4b0Var, omxVar, Long.valueOf(j), null), null);
        }
        if (this.w) {
            return;
        }
        this.w = true;
        boolean z = g4b0Var.g;
        if (str != null) {
            OneLogItem.Builder custom = OneLogItem.builder().setCollector("ok.mobile.apps.video").setType(1).setOperation("action_play_interactive").setCount(1).setTime(0L).setCustom(MBridgeConstans.DYNAMIC_VIEW_WX_APP, cj80.b).setCustom("vid", this.u).setCustom("vsid", g4b0Var.b).setCustom("cdn_host", g4b0Var.d).setCustom("ct", g4b0Var.e).setCustom("auto", Boolean.valueOf(z)).setCustom("stat_type", z ? "auto" : "").setCustom("place", g4b0Var.f);
            FrameSize frameSize = omxVar.e;
            if (frameSize != null) {
                switch (f3r0.a.$EnumSwitchMapping$0[frameSize.ordinal()]) {
                    case 1:
                        quality = Quality._144p;
                        break;
                    case 2:
                        quality = Quality._240p;
                        break;
                    case 3:
                        quality = Quality._360p;
                        break;
                    case 4:
                        quality = Quality._480p;
                        break;
                    case 5:
                        quality = Quality._720p;
                        break;
                    case 6:
                        quality = Quality._1080p;
                        break;
                    case 7:
                        quality = Quality._1440p;
                        break;
                    case 8:
                        quality = Quality._2160p;
                        break;
                    case 9:
                        quality = Quality._4320p;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                quality2 = quality;
            }
            OneLogItem.Builder custom2 = custom.setCustom("quality", quality2).setCustom("param", str);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                custom2.setCustom(entry.getKey(), entry.getValue());
            }
            OneLogItem build = custom2.build();
            OneLogDirect oneLogDirect2 = OneLogDirect.INSTANCE;
            oneLogDirect2.flush();
            oneLogDirect2.m362sendPCEVtD0(build, null);
        }
    }

    @Override // xsna.oyk0
    public final void r(g4b0 g4b0Var, omx omxVar, long j) {
        g4b0Var.j.put("isid", g4b0Var.c);
        this.v.getClass();
        dj80.b("player_ready", g4b0Var, omxVar, Long.valueOf(j), null);
    }

    @Override // xsna.oyk0
    public final void s(g4b0 g4b0Var, omx omxVar, long j) {
        g4b0Var.j.put("isid", g4b0Var.c);
        this.v.getClass();
        dj80.b("seek", g4b0Var, omxVar, "unknown", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    @Override // xsna.oyk0
    public final void t(g4b0 g4b0Var, omx omxVar) {
        g4b0Var.j.put("isid", g4b0Var.c);
        this.v.getClass();
        dj80.b("stop", g4b0Var, omxVar, null, null);
    }

    @Override // xsna.oyk0
    public final void u(g4b0 g4b0Var, omx omxVar, long j, long j2) {
        g4b0Var.j.put("isid", g4b0Var.c);
        String a = f3r0.a(j, j2);
        this.v.getClass();
        if (g4b0Var.a != null) {
            OneLogDirect oneLogDirect = OneLogDirect.INSTANCE;
            oneLogDirect.flush();
            oneLogDirect.m362sendPCEVtD0(dj80.a("watch_coverage_live", g4b0Var, omxVar, a, null), null);
        }
    }

    @Override // xsna.oyk0
    public final void v(g4b0 g4b0Var, omx omxVar, long j, long j2) {
        g4b0Var.j.put("isid", g4b0Var.c);
        String a = f3r0.a(j, j2);
        this.v.getClass();
        if (g4b0Var.a != null) {
            OneLogDirect oneLogDirect = OneLogDirect.INSTANCE;
            oneLogDirect.flush();
            oneLogDirect.m362sendPCEVtD0(dj80.a("watch_coverage_record", g4b0Var, omxVar, a, null), null);
        }
    }
}
