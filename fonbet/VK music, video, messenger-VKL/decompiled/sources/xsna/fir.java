package xsna;

import android.text.TextUtils;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import org.json.JSONObject;
import xsna.mir;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class fir implements izs {
    public final /* synthetic */ mir b;
    public final /* synthetic */ zjr c;

    public /* synthetic */ fir(mir mirVar, zjr zjrVar) {
        this.b = mirVar;
        this.c = zjrVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        mir mirVar = this.b;
        zjr zjrVar = this.c;
        L.e("Firebase remote fetching config success");
        mir.c("config_fabric_non_fatal_log_frequency");
        mir.c("config_app_performance_enable");
        mir.c("config_crashlytics_ndk_enabled");
        fjr fjrVar = fjr.a;
        itz0 itz0Var = new itz0(zjrVar);
        fjrVar.getClass();
        fjr.e(itz0Var);
        try {
            mirVar.b.a.edit().putLong("config_app_update_interval", new JSONObject(zjrVar.d("config_network_proxy")).optLong("update_delay_minutes", -1L)).apply();
        } catch (Throwable th) {
            L.g("Parsing update_delay_minutes error", th);
        }
        vjr vjrVar = mirVar.b;
        boolean c = zjrVar.c("config_enable_proxy");
        String d = c ? zjrVar.d("config_network_proxy") : "";
        String d2 = c ? zjrVar.d("config_network_proxy_certs") : "";
        String d3 = c ? zjrVar.d("config_bro_hosts") : "";
        vjrVar.a.edit().putString("config_network_proxy", d).apply();
        vjrVar.a.edit().putString("config_network_proxy_certs", d2).apply();
        vjrVar.b.edit().putString("config_bro_hosts", d3).apply();
        vjrVar.a.edit().putBoolean("config_disable_pinning", zjrVar.c("config_disable_pinning")).apply();
        tdj.b(vjrVar.a, "config_disable_knet", zjrVar.c("config_disable_knet"));
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{air.b('!', "update proxies=", d)});
        }
        if (zjrVar.c("config_enable_analytics") && !TextUtils.isEmpty(zjrVar.d("config_enable_events"))) {
            com.vk.metrics.eventtracking.b.a.getClass();
            com.vk.metrics.eventtracking.b.b = true;
        }
        mirVar.d(zjrVar);
        mirVar.a(mir.a.c.a);
        return s3q0.a;
    }
}
