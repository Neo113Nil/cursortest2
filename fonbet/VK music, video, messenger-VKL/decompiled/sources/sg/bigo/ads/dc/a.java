package sg.bigo.ads.dc;

import androidx.annotation.Nullable;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.O6;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.an.g;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class a {
    private final String a;
    private final long b = System.currentTimeMillis();
    private Map<String, String> c;

    public a(String str, @Nullable Map<String, String> map) {
        this.a = str;
        this.c = map;
    }

    private JSONObject a(g gVar) {
        String str;
        Object B;
        JSONObject jSONObject = new JSONObject();
        if (gVar != null) {
            try {
                jSONObject.putOpt(MBridgeConstans.APP_KEY, gVar.a());
                jSONObject.putOpt("pkg_name", gVar.b());
                jSONObject.putOpt("pkg_ver", gVar.c());
                jSONObject.putOpt("pkg_vc", Integer.valueOf(gVar.d()));
                jSONObject.putOpt("pkg_ch", gVar.e());
                jSONObject.putOpt(O6.F, gVar.i());
                jSONObject.putOpt("os_ver", gVar.j());
                jSONObject.putOpt(AnalyticsBaseParamsConstantsKt.OS_LANG, gVar.k());
                jSONObject.putOpt("vendor", gVar.l());
                jSONObject.putOpt("model", gVar.m());
                jSONObject.putOpt("isp", gVar.n());
                jSONObject.putOpt(CommonCode.MapKey.HAS_RESOLUTION, gVar.o());
                jSONObject.putOpt("dpi", Integer.valueOf(gVar.p()));
                jSONObject.putOpt("dpi_f", gVar.q());
                jSONObject.putOpt("net", gVar.r());
                jSONObject.putOpt("tz", gVar.s());
                jSONObject.putOpt("country", gVar.u());
                jSONObject.putOpt("state", gVar.w());
                jSONObject.putOpt("city", gVar.x());
                jSONObject.putOpt(HiAnalyticsConstant.BI_KEY_SDK_VER, gVar.y());
                jSONObject.putOpt("sdk_vc", 50900);
                if (sg.bigo.ads.bw.a.s()) {
                    str = "consent_status";
                    B = Integer.valueOf(sg.bigo.ads.da.b.b());
                } else {
                    jSONObject.putOpt(O6.X0, gVar.A());
                    jSONObject.putOpt("hw_id", gVar.G());
                    jSONObject.putOpt("fire_id", gVar.ae());
                    str = "af_id";
                    B = gVar.B();
                }
                jSONObject.putOpt(str, B);
                jSONObject.putOpt("uid", gVar.C());
                jSONObject.putOpt("ts", Integer.valueOf(gVar.D()));
                jSONObject.putOpt("abflags", gVar.E());
                jSONObject.putOpt("gg_service_ver", gVar.H());
                jSONObject.putOpt("webkit_ver", gVar.I());
                jSONObject.putOpt("time", Long.valueOf(this.b));
                jSONObject.putOpt("event_id", this.a);
                jSONObject.putOpt("sdk_channel", gVar.aa());
                jSONObject.putOpt("gp_vc", String.valueOf(gVar.ax()));
                Map<String, String> map = this.c;
                boolean z = false;
                if (map != null) {
                    if (r.a((CharSequence) map.get("session_id"))) {
                        this.c.put("session_id", UUID.randomUUID().toString());
                    } else {
                        z = true;
                    }
                    for (Map.Entry<String, String> entry : this.c.entrySet()) {
                        jSONObject.putOpt(entry.getKey(), entry.getValue());
                    }
                }
                if (!z) {
                    jSONObject.putOpt("gps_country", gVar.Q());
                    jSONObject.putOpt("sim_country", gVar.R());
                    jSONObject.putOpt("system_country", gVar.S());
                }
                jSONObject.putOpt("ts_cold", Long.valueOf(gVar.V()));
                jSONObject.putOpt("ts_hot", Long.valueOf(gVar.W()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final sg.bigo.ads.av.c a(g gVar, long j) {
        return new sg.bigo.ads.av.c(this.a, a(gVar).toString(), j);
    }
}
