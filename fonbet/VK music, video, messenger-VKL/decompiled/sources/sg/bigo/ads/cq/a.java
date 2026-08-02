package sg.bigo.ads.cq;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.O6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.ai.n;
import sg.bigo.ads.aj.c;
import sg.bigo.ads.aj.g;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.r;
import xsna.dez0;

/* loaded from: classes9.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static Map<String, Object> a(@NonNull String str, @NonNull n nVar, @NonNull sg.bigo.ads.api.b bVar, @Nullable sg.bigo.ads.api.core.b bVar2, @Nullable Integer num) {
        sg.bigo.ads.api.core.b j;
        HashMap a = dez0.a("action", str);
        a.put("slot", nVar.l());
        a.put("config_id", Long.valueOf(k.a.i()));
        a.put("placement_id", nVar.n());
        a.put("strategy_id", nVar.a());
        a.put("ad_type", Integer.valueOf(nVar.b()));
        a.put("abflags", r.a(k.a.j(), nVar.o()));
        a.put("ts", Long.valueOf(System.currentTimeMillis()));
        a.put("begin_ts", Long.valueOf(bVar.g.f));
        a.put("banner_type", Integer.valueOf(bVar.b));
        a.put("adn_name", "bigoad");
        JSONObject jSONObject = new JSONObject();
        b.a aVar = bVar.g;
        sg.bigo.ads.common.utils.k.a(jSONObject, "session_id", aVar.c());
        sg.bigo.ads.common.utils.k.a(jSONObject, "gps_country", aVar.d());
        sg.bigo.ads.common.utils.k.a(jSONObject, "sim_country", aVar.e());
        sg.bigo.ads.common.utils.k.a(jSONObject, "system_country", aVar.f());
        sg.bigo.ads.common.utils.k.a(jSONObject, "req_status", Integer.valueOf(aVar.h()));
        if (bVar2 != null) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "adx_country", bVar2.n());
        }
        if (nVar.w()) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "config_country", k.a.k());
        }
        String g = aVar.g();
        if (!r.a((CharSequence) g)) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "load_ext", g);
        }
        if (num != null) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "auc_mode", num);
        }
        if ((bVar instanceof sg.bigo.ads.aj.b) && (j = ((sg.bigo.ads.aj.b) bVar).j()) != null) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "host_slot", j.b());
            sg.bigo.ads.common.utils.k.a(jSONObject, "host_placement", j.c());
            sg.bigo.ads.common.utils.k.a(jSONObject, "host_sid", Long.valueOf(j.z()));
            sg.bigo.ads.common.utils.k.a(jSONObject, "host_ad_id", j.s());
        }
        if (bVar instanceof c) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "icon_req_num", Integer.valueOf(((c) bVar).k()));
        }
        a.put("extra_json", jSONObject.toString());
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bd, code lost:
    
        if (r0.bw() > 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01bf, code lost:
    
        sg.bigo.ads.common.utils.k.a(r8, "ad_imp_indx", java.lang.Integer.valueOf(r0.bw()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d6, code lost:
    
        if (r0.bw() > 0) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, Object> a(@NonNull String str, @NonNull n nVar, @NonNull sg.bigo.ads.api.b bVar, @Nullable sg.bigo.ads.api.core.b bVar2, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable sg.bigo.ads.aj.a aVar) {
        JSONObject jSONObject;
        String str4;
        sg.bigo.ads.api.b bVar3;
        o oVar;
        g gVar;
        Map<String, Object> a = a(str, nVar, bVar, bVar2, num);
        Object obj = a.get("extra_json");
        if (obj != null && (obj instanceof String)) {
            try {
                jSONObject = new JSONObject((String) obj);
            } catch (JSONException unused) {
            } finally {
                new JSONObject();
            }
        }
        if (aVar instanceof g) {
            g gVar2 = (g) aVar;
            sg.bigo.ads.api.core.b bVar4 = (sg.bigo.ads.api.core.b) l.b(gVar2.a());
            if (bVar4 != null) {
                gVar = gVar2;
                a.put("adx_type", Integer.valueOf(bVar4.x()));
                a.put(O6.e1, Long.valueOf(bVar4.z()));
                a.put("dsp", bVar4.w());
                a.put("logid", Long.valueOf(bVar4.aa()));
            } else {
                gVar = gVar2;
            }
            str.getClass();
            switch (str) {
                case "filled":
                    sg.bigo.ads.common.utils.k.a(jSONObject, "icon_fill_num", Integer.valueOf(gVar.i()));
                    break;
                case "impression":
                case "clicked":
                    sg.bigo.ads.common.utils.k.a(jSONObject, "icon_fill_num", Integer.valueOf(gVar.i()));
                    sg.bigo.ads.common.utils.k.a(jSONObject, "icon_show_num", Integer.valueOf(gVar.j()));
                    break;
            }
            bVar3 = bVar;
            str4 = "extra_json";
        } else {
            if (bVar2 != null) {
                sg.bigo.ads.aj.a Q = aVar != null ? aVar.Q() : null;
                str4 = "extra_json";
                if (Q instanceof g) {
                    g gVar3 = (g) Q;
                    sg.bigo.ads.common.utils.k.a(jSONObject, "icon_fill_num", Integer.valueOf(gVar3.i()));
                    sg.bigo.ads.common.utils.k.a(jSONObject, "icon_show_num", Integer.valueOf(gVar3.j()));
                }
                a.put("ad_id", bVar2.s());
                a.put(CampaignEx.JSON_KEY_CREATIVE_ID, bVar2.A());
                a.put(O6.e1, Long.valueOf(bVar2.z()));
                a.put("series_id", bVar2.B());
                a.put("adx_type", Integer.valueOf(bVar2.x()));
                a.put("mapping_slot", bVar2.N());
                a.put("enc_price", bVar2.I());
                String J = bVar2.J();
                if (!TextUtils.isEmpty(J)) {
                    a.put("abflags", r.a((String) a.get("abflags"), J));
                }
                sg.bigo.ads.common.utils.k.a(jSONObject, "dsp", bVar2.w());
                sg.bigo.ads.common.utils.k.a(jSONObject, "logid", Long.valueOf(bVar2.aa()));
                if (sg.bigo.ads.api.core.a.c(nVar.b())) {
                    sg.bigo.ads.common.utils.k.a(jSONObject, "style_id", bVar2.ac());
                }
                str.getClass();
                if (str.equals("impression")) {
                    if (bVar2 instanceof o) {
                        oVar = (o) bVar2;
                    }
                } else if (str.equals("clicked")) {
                    boolean z = bVar2 instanceof o;
                    if (z) {
                        o oVar2 = (o) bVar2;
                        if (oVar2.bx() > 0) {
                            sg.bigo.ads.common.utils.k.a(jSONObject, "ad_click_indx", Integer.valueOf(oVar2.bx()));
                        }
                    }
                    if (z) {
                        oVar = (o) bVar2;
                    }
                }
            } else {
                str4 = "extra_json";
            }
            bVar3 = bVar;
        }
        sg.bigo.ads.common.utils.k.a(jSONObject, "session_id", bVar3.g.b);
        if (str2 != null) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "sec_price", str2);
        }
        if (str3 != null) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "sec_bidder", str3);
        }
        p b_ = aVar != null ? aVar.b_() : null;
        if (b_ != null && b_.a != null) {
            sg.bigo.ads.common.utils.k.a(jSONObject, "is_vpaid", 1);
        }
        a.put(str4, jSONObject.toString());
        return a;
    }
}
