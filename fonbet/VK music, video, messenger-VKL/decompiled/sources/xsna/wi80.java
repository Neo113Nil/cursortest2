package xsna;

import com.mbridge.msdk.MBridgeConstans;
import java.io.Serializable;
import java.util.Map;
import ru.ok.android.onelog.ExperimentalOneLogDirect;
import ru.ok.android.onelog.OneLogItem;
import ru.ok.android.onelog.OneLogSessionEventNumbering;
import ru.ok.android.utils.Logger;

/* compiled from: OneLogAudioPlayer.kt */
/* loaded from: classes3.dex */
public final class wi80 {
    public static OneLogItem a(String str, g4b0 g4b0Var, Object obj, Long l) {
        OneLogItem.Builder custom = OneLogItem.builder().setCollector("ok.mobile.apps.video.vkmusic").setType(1).setOperation(str).setCount(1).setTime(System.currentTimeMillis()).setCustom(MBridgeConstans.DYNAMIC_VIEW_WX_APP, cj80.b).setCustom("vid", g4b0Var.a);
        String str2 = g4b0Var.b;
        OneLogItem.Builder custom2 = custom.setCustom("vsid", str2).setCustom("cdn_host", g4b0Var.d).setCustom("ct", g4b0Var.e);
        boolean z = g4b0Var.g;
        OneLogItem.Builder custom3 = custom2.setCustom("auto", Boolean.valueOf(z)).setCustom("stat_type", z ? "auto" : "").setCustom("place", g4b0Var.f).setCustom("in_history", Boolean.valueOf(g4b0Var.i)).setCustom("param", obj);
        if (l != null && l.longValue() >= 0) {
            custom3.setTime(l.longValue());
        }
        for (Map.Entry<String, Object> entry : OneLogSessionEventNumbering.INSTANCE.updateEventNumberFor(str2, g4b0Var.j).entrySet()) {
            custom3.setCustom(entry.getKey(), entry.getValue());
        }
        return custom3.build();
    }

    public static void b(String str, g4b0 g4b0Var, Serializable serializable, Long l) {
        if (g4b0Var.a != null) {
            OneLogItem a = a(str, g4b0Var, serializable, l);
            if (Logger.isLoggingEnable()) {
                Logger.v("will send %s | %s", a.collector(), ExperimentalOneLogDirect.INSTANCE.dump(a));
            }
            cj80.a.a().execute(new yv6(a, 4));
        }
    }

    public static void c(g4b0 g4b0Var) {
        if (g4b0Var.a != null) {
            ExperimentalOneLogDirect experimentalOneLogDirect = ExperimentalOneLogDirect.INSTANCE;
            experimentalOneLogDirect.flush();
            experimentalOneLogDirect.send(a("play", g4b0Var, Long.valueOf(0 / 1000), null));
        }
    }
}
