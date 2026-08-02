package xsna;

import android.os.Build;
import android.util.Size;
import com.mbridge.msdk.MBridgeConstans;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AdaptedFunctionReference;
import one.video.player.FormatSupport;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.error.OneVideoRendererException;
import one.video.player.error.OneVideoSourceException;
import one.video.player.error.OneVideoUnexpectedException;
import one.video.player.model.FrameSize;
import one.video.statistics.Quality;
import ru.ok.android.onelog.OneLogDirect;
import ru.ok.android.onelog.OneLogItem;
import ru.ok.android.onelog.OneLogSessionEventNumbering;
import ru.ok.android.utils.Logger;
import xsna.f3r0;

/* compiled from: OneLogVideoPlayer.kt */
@ozl
/* loaded from: classes8.dex */
public final class dj80 {
    public static final dj80 a = new dj80();

    /* compiled from: OneLogVideoPlayer.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements wzs<Object, Object, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(Object obj, Object obj2) {
            ((OneLogItem.Builder) this.receiver).setCustom(obj, obj2);
            return s3q0.a;
        }
    }

    public static OneLogItem a(String str, g4b0 g4b0Var, omx omxVar, Object obj, Long l) {
        Quality quality;
        String str2;
        OneLogItem.Builder custom = OneLogItem.builder().setCollector("ok.mobile.apps.video").setType(1).setOperation(str).setCount(1).setTime(0L).setCustom(MBridgeConstans.DYNAMIC_VIEW_WX_APP, cj80.b).setCustom("vid", g4b0Var.a);
        String str3 = g4b0Var.b;
        OneLogItem.Builder custom2 = custom.setCustom("vsid", str3).setCustom("cdn_host", g4b0Var.d).setCustom("ct", g4b0Var.e);
        boolean z = g4b0Var.g;
        OneLogItem.Builder custom3 = custom2.setCustom("auto", Boolean.valueOf(z)).setCustom("stat_type", z ? "auto" : "").setCustom("place", g4b0Var.f).setCustom("in_history", Boolean.valueOf(g4b0Var.i));
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
        } else {
            quality = null;
        }
        OneLogItem.Builder custom4 = custom3.setCustom("quality", quality).setCustom("param", obj);
        if (l != null && l.longValue() >= 0) {
            custom4.setTime(l.longValue());
        }
        pjz pjzVar = omxVar.b;
        if (pjzVar != null) {
            Long l2 = pjzVar.a;
            if (l2 != null) {
                custom4.setCustom("latency", Long.valueOf(l2.longValue()));
            }
            long j = pjzVar.b;
            if (j > 0) {
                custom4.setCustom("buffer_latency", Long.valueOf(j));
            }
        }
        Long l3 = omxVar.c;
        if (l3 != null) {
            long longValue = l3.longValue();
            if (longValue != 0) {
                custom4.setCustom("live_seek", Long.valueOf(longValue));
            }
        }
        if (omxVar.f) {
            custom4.setCustom((Object) "manual_quality", (Object) 1);
        }
        if (wn80.s) {
            custom4.setCustom("vfpo", Long.valueOf(omxVar.g));
        }
        fgq fgqVar = omxVar.a;
        if (fgqVar != null) {
            LinkedHashMap linkedHashMap = fgqVar.a;
            pn00.t(linkedHashMap).forEach(new y1u(1, new a(2, custom4, OneLogItem.Builder.class, "setCustom", "setCustom(Ljava/lang/Object;Ljava/lang/Object;)Lru/ok/android/onelog/OneLogItem$Builder;", 8)));
            s3q0 s3q0Var = s3q0.a;
            linkedHashMap.clear();
        }
        uwc0 uwc0Var = omxVar.d;
        if (uwc0Var != null) {
            custom4.setCustom("power_saving_mode", uwc0Var.a);
            custom4.setCustom("is_charging", uwc0Var.b);
        }
        if (wn80.w && str.toLowerCase(Locale.ROOT).equals(wn80.y) && Build.VERSION.SDK_INT >= 31) {
            str2 = Build.SOC_MODEL;
            custom4.setCustom("soc", str2);
        }
        if (wn80.w && wn80.x.contains(str.toLowerCase(Locale.ROOT))) {
            ik80 x = ((OneVideoPlayer) omxVar.j.c).x();
            if (x != null) {
                custom4.setCustom("bw", Long.valueOf(x.getBitrateEstimate() / 8000));
                custom4.setCustom("rtt", Long.valueOf(x.a() / 1000));
            }
            Size f = ((OneVideoPlayer) omxVar.k.c).f();
            if (f != null) {
                custom4.setCustom("vport", f);
            }
            String str4 = omxVar.h;
            if (str4 != null) {
                custom4.setCustom("vcodec", str4);
            }
            String str5 = omxVar.i;
            if (str5 != null) {
                custom4.setCustom("acodec", str5);
            }
            ymo L = ((OneVideoPlayer) omxVar.l.c).L();
            if (L != null) {
                custom4.setCustom("rendered_f", Long.valueOf(L.a));
                custom4.setCustom("dropped_f", Long.valueOf(L.b));
                custom4.setCustom("max_consecutive_dropped_f", Long.valueOf(L.e));
                custom4.setCustom("skipped_f", Long.valueOf(L.d));
                custom4.setCustom("dropped_to_keyframe", Long.valueOf(L.c));
            }
        }
        for (Map.Entry<String, Object> entry : OneLogSessionEventNumbering.INSTANCE.updateEventNumberFor(str3, g4b0Var.j).entrySet()) {
            custom4.setCustom(entry.getKey(), entry.getValue());
        }
        return custom4.build();
    }

    public static void b(String str, g4b0 g4b0Var, omx omxVar, Object obj, Long l) {
        if (g4b0Var.a != null) {
            OneLogItem a2 = a(str, g4b0Var, omxVar, obj, l);
            if (Logger.isLoggingEnable()) {
                Logger.v("will send %s | %s", a2.collector(), OneLogDirect.INSTANCE.dump(a2));
            }
            a2.log();
        }
    }

    public static void c(g4b0 g4b0Var, omx omxVar, one.video.player.tracks.c cVar) {
        Quality quality;
        cms0 cms0Var;
        FrameSize b;
        if (cVar == null || (cms0Var = (cms0) cVar.c) == null || (b = cms0Var.b()) == null) {
            quality = null;
        } else {
            switch (f3r0.a.$EnumSwitchMapping$0[b.ordinal()]) {
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
        }
        b("quality", g4b0Var, omxVar, quality, null);
    }

    public static void d(OneVideoPlaybackException oneVideoPlaybackException, awp awpVar, omx omxVar, g4b0 g4b0Var) {
        er10 h;
        String a2;
        FormatSupport i;
        String k;
        StringBuilder sb = new StringBuilder();
        if (awpVar != null) {
            sb.append(awpVar.a ? "fatal_" : "recoverable_");
        }
        sb.append(oneVideoPlaybackException.g());
        sb.append(".");
        sb.append(oneVideoPlaybackException.j());
        int i2 = om80.$EnumSwitchMapping$0[oneVideoPlaybackException.j().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                OneVideoRendererException h2 = oneVideoPlaybackException.h();
                if (h2 != null && (k = h2.k()) != null) {
                    sb.append(".");
                    sb.append(k);
                }
                OneVideoRendererException h3 = oneVideoPlaybackException.h();
                if (h3 != null && (i = h3.i()) != null) {
                    sb.append(".");
                    sb.append(i);
                }
                OneVideoRendererException h4 = oneVideoPlaybackException.h();
                if (h4 != null && (h = h4.h()) != null && (a2 = h.a()) != null) {
                    sb.append(".");
                    sb.append(a2);
                }
                OneVideoRendererException h5 = oneVideoPlaybackException.h();
                if (h5 != null) {
                    sb.append(".");
                    String message = h5.getMessage();
                    sb.append(message != null ? message : "UNKNOWN_MESSAGE");
                }
            } else if (i2 == 3) {
                OneVideoUnexpectedException k2 = oneVideoPlaybackException.k();
                if (k2 != null) {
                    sb.append(".");
                    String message2 = k2.getMessage();
                    sb.append(message2 != null ? message2 : "UNKNOWN_MESSAGE");
                }
            } else {
                if (i2 != 4 && i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                sb.append(".");
                String message3 = oneVideoPlaybackException.getMessage();
                sb.append(message3 != null ? message3 : "UNKNOWN_MESSAGE");
            }
        } else {
            OneVideoSourceException i3 = oneVideoPlaybackException.i();
            if (i3 != null) {
                sb.append(".");
                sb.append(i3.getMessage());
            }
        }
        b("content_error", g4b0Var, omxVar, sb.toString(), null);
    }
}
