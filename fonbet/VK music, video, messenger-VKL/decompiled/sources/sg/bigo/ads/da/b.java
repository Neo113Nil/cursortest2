package sg.bigo.ads.da;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import sg.bigo.ads.ai.h;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.aj.g;
import sg.bigo.ads.aj.h;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.e;
import sg.bigo.ads.api.core.i;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.api.core.u;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.m;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.dc.d;
import xsna.dez0;
import xsna.fw3;
import xsna.hq;
import xsna.i5s;
import xsna.v11;

/* loaded from: classes9.dex */
public final class b {
    private static final String[][] a = {new String[]{"0", "1"}, new String[]{"2", "3"}};

    private static int a(i iVar) {
        i.a aF = iVar.aF();
        if (aF != null && aF.a() && iVar.aJ()) {
            return l.a(aF.b()) ? 1 : 2;
        }
        return 0;
    }

    public static int b() {
        int r = sg.bigo.ads.bw.a.r();
        int p = sg.bigo.ads.bw.a.p();
        int q = sg.bigo.ads.bw.a.q();
        int o = sg.bigo.ads.bw.a.o();
        int i = r == 2 ? 1 : 0;
        int i2 = p == 2 ? 1 : 0;
        int i3 = q == 2 ? 1 : 0;
        return (r << 4) | (p << 6) | (q << 8) | (o << 10) | (sg.bigo.ads.bw.a.n() << 12) | ((o == 2 ? 1 : 0) << 3) | (i3 << 2) | (i2 << 1) | i;
    }

    @NonNull
    public static Map<String, String> c(@NonNull sg.bigo.ads.api.core.b bVar, @NonNull sg.bigo.ads.aj.a aVar) {
        return a(bVar, aVar, true);
    }

    public static void d(Map<String, String> map) {
        a("06002067", map);
    }

    @NonNull
    private static Map<String, String> a(Map<String, String> map, @Nullable sg.bigo.ads.api.core.b bVar, String str, String str2, int i) {
        n bd;
        map.put("show_proportion", str);
        v11.c("ad_size", str2, map, "render_style", i);
        if ((bVar instanceof o) && (bd = ((o) bVar).bd()) != null) {
            map.put("creative_size", r.a("%1$d*%2$d", Integer.valueOf(bd.a), Integer.valueOf(bd.b)));
        }
        return map;
    }

    public static void b(int i, int i2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", String.valueOf(i));
        hashMap.put("scene", String.valueOf(i2));
        if (!r.a((CharSequence) str)) {
            hashMap.put("error", str);
        }
        a("06002063", hashMap);
    }

    public static void c(Map<String, String> map) {
        if (map != null) {
            j jVar = k.a;
            h B = jVar != null ? jVar.B() : null;
            String str = "0";
            map.put("checkByServer", (B == null || !B.a()) ? "0" : "1");
            j jVar2 = k.a;
            h B2 = jVar2 != null ? jVar2.B() : null;
            map.put("checkOnlyPurpose", (B2 == null || !B2.b()) ? "0" : "1");
            j jVar3 = k.a;
            h B3 = jVar3 != null ? jVar3.B() : null;
            if (B3 != null && B3.c()) {
                str = "1";
            }
            map.put("checkVendorConsents", str);
        }
        c.a().a("06002066", map);
    }

    private static void d(sg.bigo.ads.api.core.b bVar, Map<String, String> map) {
        int by;
        if (!(bVar instanceof o) || map == null || (by = ((o) bVar).by()) <= 0) {
            return;
        }
        map.put("ad_cur_page_indx", String.valueOf(by));
    }

    public static void b(Map<String, String> map) {
        a("06002014", map);
    }

    private static void c(sg.bigo.ads.api.core.b bVar, Map<String, String> map) {
        int bx;
        if (!(bVar instanceof o) || map == null || (bx = ((o) bVar).bx()) <= 0) {
            return;
        }
        map.put("ad_click_indx", String.valueOf(bx));
    }

    private static void b(@NonNull Map<String, String> map, @NonNull sg.bigo.ads.api.core.b bVar) {
        List<sg.bigo.ads.api.core.b> an = bVar.an();
        if (an == null || an.size() <= 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (sg.bigo.ads.api.core.b bVar2 : an) {
            if (bVar2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("ad_id", bVar2.s());
                    jSONObject.putOpt(CampaignEx.JSON_KEY_CREATIVE_ID, bVar2.A());
                    jSONObject.putOpt("is_playable", String.valueOf(bVar2.ae()));
                    if (bVar2 instanceof o) {
                        o oVar = (o) bVar2;
                        jSONObject.putOpt("media_type", oVar.bg());
                        jSONObject.putOpt("companion_type", a[oVar.aO() ? 1 : 0][oVar.aN() ? 1 : 0]);
                        if (oVar.x() == 2) {
                            jSONObject.putOpt("fill_strategy", String.valueOf(oVar.bl()));
                            jSONObject.putOpt("dl_status", String.valueOf(oVar.bn()));
                        }
                    }
                    jSONArray.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
        }
        map.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, jSONArray.toString());
    }

    private static void b(sg.bigo.ads.api.core.b bVar, Map<String, String> map) {
        int bw;
        if (!(bVar instanceof o) || map == null || (bw = ((o) bVar).bw()) <= 0) {
            return;
        }
        map.put("ad_imp_indx", String.valueOf(bw));
    }

    public static void b(@NonNull sg.bigo.ads.api.core.b bVar, @NonNull sg.bigo.ads.aj.a aVar) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        a2.put("rew_rslt", "1");
        a2.put("out_ad", String.valueOf(aVar.S()));
        a(a2, aVar, false);
        a("06002019", a2);
    }

    private static Map<String, String> a(Map<String, String> map, @Nullable sg.bigo.ads.api.core.h hVar) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (hVar != null) {
            map.put("session_id", hVar.c());
            map.put("gps_country", hVar.d());
            map.put("sim_country", hVar.e());
            map.put("system_country", hVar.f());
            map.put("req_status", String.valueOf(hVar.h()));
            map.put("uuid", String.valueOf(hVar.i()));
            map.put("cfg_sta", String.valueOf(hVar.j()));
            if (hVar.l() > 0) {
                long l = hVar.l() - hVar.k();
                if (l >= 0) {
                    map.put("cfg_cost", String.valueOf(l));
                }
            }
            if (hVar.m() > 0) {
                long m = hVar.m() - hVar.k();
                if (m >= 0) {
                    map.put("delay_cost", String.valueOf(m));
                }
            }
            if (hVar.m() > 0 && hVar.l() > 0) {
                long m2 = hVar.m() - hVar.l();
                if (m2 >= 0) {
                    map.put("req_queue_time", String.valueOf(m2));
                }
            }
            if (hVar.n() > 0) {
                long n = hVar.n() - hVar.k();
                if (n >= 0) {
                    map.put("net_cost", String.valueOf(n));
                }
            }
            String g = hVar.g();
            if (!r.a((CharSequence) g)) {
                map.put("load_ext", g);
            }
        }
        return map;
    }

    @NonNull
    private static Map<String, String> a(@Nullable sg.bigo.ads.ai.n nVar) {
        HashMap hashMap = new HashMap();
        if (nVar == null) {
            return hashMap;
        }
        hashMap.put("slot", nVar.l());
        hashMap.put("config_id", String.valueOf(k.a.i()));
        hashMap.put("placement_id", nVar.n());
        hashMap.put("strategy_id", nVar.a());
        hashMap.put("ad_type", String.valueOf(nVar.b()));
        hashMap.put("abflags", r.a(k.a.j(), nVar.o()));
        hashMap.put("auc_mode", String.valueOf(nVar.v()));
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
    
        if (r2.aJ().d() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d9, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d7, code lost:
    
        if (r2.aJ().d() != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0188  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Map<String, String> a(@NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.aj.a aVar, boolean z) {
        String valueOf;
        String J;
        sg.bigo.ads.ai.n d = bVar.d();
        Map<String, String> a2 = a(d);
        a2.put("dsp", bVar.w());
        a2.put("ad_id", bVar.s());
        a2.put(CampaignEx.JSON_KEY_CREATIVE_ID, bVar.A());
        a2.put(O6.e1, String.valueOf(bVar.z()));
        a2.put("series_id", bVar.B());
        a2.put("adx_type", String.valueOf(bVar.x()));
        a2.put("adx_country", bVar.n());
        String str = "video_type";
        if (bVar.y() != 2) {
            if (bVar instanceof o) {
                o oVar = (o) bVar;
                int x = oVar.x();
                if (x == 1) {
                    valueOf = String.valueOf(d.e());
                    str = "native_filled_type";
                } else if (x == 2) {
                    if (oVar.aJ() != null) {
                    }
                    int i = 0;
                    valueOf = String.valueOf(i);
                }
            }
            a2.put("mapping_slot", bVar.N());
            a2.put("enc_price", bVar.I());
            J = bVar.J();
            if (!TextUtils.isEmpty(J)) {
            }
            if (sg.bigo.ads.api.core.a.c(d.b())) {
            }
            a2.put("is_playable", String.valueOf(bVar.ae()));
            if (bVar.ae() != 1) {
            }
            a2.put("companion_type", String.valueOf(bVar.af()));
            a2.put("style_source", String.valueOf(bVar.h()));
            a2.put("auc_mode", String.valueOf(bVar.ak()));
            a2.put("ad_resp_type", String.valueOf(bVar.Q()));
            if (bVar.R() != null) {
            }
            if (!z) {
            }
            a(a2, aVar, false);
            a(a2, bVar.ab());
            return a2;
        }
        if (!(bVar instanceof i)) {
            if (bVar instanceof o) {
                o oVar2 = (o) bVar;
                a2.put("banner_type", oVar2.bu() ? "1" : "0");
                a2.put("nat_ban_fill_type", String.valueOf(bVar.ap()));
                if (bVar.x() == 2) {
                    if (oVar2.aJ() != null) {
                    }
                    int i2 = 0;
                    valueOf = String.valueOf(i2);
                }
            }
            a2.put("mapping_slot", bVar.N());
            a2.put("enc_price", bVar.I());
            J = bVar.J();
            if (!TextUtils.isEmpty(J)) {
                a2.put("abflags", r.a(a2.get("abflags"), J));
            }
            if (sg.bigo.ads.api.core.a.c(d.b())) {
                a2.put("style_id", bVar.ac());
            }
            a2.put("is_playable", String.valueOf(bVar.ae()));
            if (bVar.ae() != 1 || bVar.ae() == 2) {
                a2.put("companion_type", String.valueOf(bVar.af()));
            }
            a2.put("style_source", String.valueOf(bVar.h()));
            a2.put("auc_mode", String.valueOf(bVar.ak()));
            a2.put("ad_resp_type", String.valueOf(bVar.Q()));
            if (bVar.R() != null) {
                a2.put("session_id2", bVar.R());
            }
            if (!z) {
                a2.put("cache_ad", bVar.V() ? "1" : "0");
                a2.put("cache_ad_source", String.valueOf(bVar.W()));
                a2.put("cache_req_status", String.valueOf(bVar.S()));
                a2.put("req_type", String.valueOf(bVar.X()));
                a2.put("cur_req_status", String.valueOf(bVar.Y()));
            }
            a(a2, aVar, false);
            a(a2, bVar.ab());
            return a2;
        }
        i iVar = (i) bVar;
        a2.put("banner_type", iVar.aH() ? "1" : "0");
        valueOf = String.valueOf(a(iVar));
        str = "banner_preload";
        a2.put(str, valueOf);
        a2.put("mapping_slot", bVar.N());
        a2.put("enc_price", bVar.I());
        J = bVar.J();
        if (!TextUtils.isEmpty(J)) {
        }
        if (sg.bigo.ads.api.core.a.c(d.b())) {
        }
        a2.put("is_playable", String.valueOf(bVar.ae()));
        if (bVar.ae() != 1) {
        }
        a2.put("companion_type", String.valueOf(bVar.af()));
        a2.put("style_source", String.valueOf(bVar.h()));
        a2.put("auc_mode", String.valueOf(bVar.ak()));
        a2.put("ad_resp_type", String.valueOf(bVar.Q()));
        if (bVar.R() != null) {
        }
        if (!z) {
        }
        a(a2, aVar, false);
        a(a2, bVar.ab());
        return a2;
    }

    @NonNull
    private static Map<String, String> a(@NonNull sg.bigo.ads.api.core.b bVar, @NonNull sg.bigo.ads.aj.h hVar) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        b.InterfaceC2428b O = bVar.O();
        a2.put("final_url_type", String.valueOf(hVar.k()));
        a2.put("redirect_num", String.valueOf(hVar.l()));
        a2.put("preload_t", String.valueOf(O.g()));
        a2.put(NotificationCompat.CATEGORY_PROGRESS, String.valueOf(hVar.m()));
        a2.put("click_index", String.valueOf(hVar.o()));
        a2.put("preload_scene", String.valueOf(O.l()));
        a2.put("preload_ready", hVar.n() ? "1" : "0");
        a2.put("land_way", String.valueOf(hVar.p()));
        a2.put("webview_layout", String.valueOf(hVar.i()));
        a2.put("url", hVar.j());
        Map<String, String> q = hVar.q();
        if (q != null) {
            a2.putAll(q);
        }
        return a2;
    }

    public static void a() {
        HashMap hashMap = new HashMap();
        hashMap.put("build", sg.bigo.ads.by.a.b());
        hashMap.put("cpu_info", sg.bigo.ads.by.a.c());
        a("06002059", hashMap);
    }

    public static void a(int i, int i2, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", String.valueOf(i));
        hashMap.put("times", String.valueOf(i2));
        hashMap.put("cost", String.valueOf(j));
        a("06002064", hashMap);
    }

    public static void a(int i, int i2, String str) {
        a((sg.bigo.ads.api.core.b) null, i, i2, str);
    }

    public static void a(int i, long j, long j2) {
        HashMap hashMap = new HashMap();
        hashMap.put("start_type", String.valueOf(i));
        hashMap.put("start_time", String.valueOf(j));
        hashMap.put("duration", String.valueOf(j2));
        a("06002044", hashMap);
    }

    public static void a(long j, int i, int i2, int i3, int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put("ts", String.valueOf(j));
        hashMap.put("load_num", String.valueOf(i));
        hashMap.put("fill_num", String.valueOf(i2));
        hashMap.put("imp_num", String.valueOf(i3));
        hashMap.put("click_num", String.valueOf(i4));
        a("06002039", hashMap);
    }

    public static void a(long j, int i, int i2, String str, int i3, boolean z, int i4, String str2) {
        d dVar = new d("06002002");
        dVar.a("rslt", "0");
        dVar.a("cost", j);
        dVar.a("e_code", i);
        dVar.a("s_code", i2);
        dVar.a("error", str);
        dVar.a("src", i3);
        dVar.a("in_fg", String.valueOf(z ? 1 : 2));
        dVar.a("times", String.valueOf(i4));
        if (!TextUtils.isEmpty(str2)) {
            dVar.a("uuid", str2);
        }
        a(dVar);
    }

    public static void a(long j, int i, String str, String str2, Map<String, String> map) {
        d dVar = new d("06002001");
        dVar.a("states", "success");
        dVar.a("cost", j);
        dVar.a("status", i);
        dVar.a("cur_in_fg", sg.bigo.ads.at.b.c());
        if (!TextUtils.isEmpty(str)) {
            dVar.a("uuid", str);
        }
        dVar.a("tc_string", str2);
        String a2 = m.a(map);
        if (!TextUtils.isEmpty(a2)) {
            dVar.a("cost_map", a2);
        }
        a(dVar);
    }

    public static void a(long j, long j2, boolean z, int i, boolean z2, int i2, String str, @Nullable String str2, @Nullable String str3) {
        d dVar = new d("06002002");
        String str4 = "1";
        dVar.a("rslt", "1");
        dVar.a("config_id", j);
        dVar.a("cost", j2);
        dVar.a("n_rt", z ? "0" : "1");
        dVar.a("src", i);
        dVar.a("in_fg", String.valueOf(z2 ? 1 : 2));
        dVar.a("times", String.valueOf(i2));
        if (str2 == null && str3 == null) {
            str4 = "0";
        }
        dVar.a("reuse", str4);
        if (str2 != null) {
            dVar.a("reuse_global_md5", str2);
        }
        if (str3 != null) {
            dVar.a("reuse_slots_md5", str3);
        }
        if (!TextUtils.isEmpty(str)) {
            dVar.a("uuid", str);
        }
        dVar.a("cur_in_fg", sg.bigo.ads.at.b.c());
        a(dVar);
    }

    public static void a(long j, boolean z, String str, int i, String str2) {
        d dVar = new d("06002051");
        dVar.a("rslt", "0");
        dVar.a("cost", j);
        dVar.a("clear", z ? "1" : "0");
        dVar.a("url", str);
        dVar.a("e_code", i);
        dVar.a("error", str2);
        a(dVar);
    }

    public static void a(long j, boolean z, String str, boolean z2) {
        d dVar = new d("06002051");
        dVar.a("rslt", "1");
        dVar.a("cost", j);
        dVar.a("clear", z ? "1" : "0");
        dVar.a("update", z2 ? "1" : "0");
        dVar.a("url", str);
        a(dVar);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [sg.bigo.ads.api.core.b] */
    public static void a(Context context, @NonNull sg.bigo.ads.aj.a aVar, String str, String str2, int i, long j, long j2, long j3, int i2, int i3, int i4, int i5, int i6) {
        Map<String, String> a2;
        sg.bigo.ads.an.b h;
        if (aVar instanceof g) {
            g gVar = (g) aVar;
            a2 = a(aVar.T().i());
            a(a2, gVar, true);
            a2.put("icon_show_num", String.valueOf(gVar.j()));
            a2.put("scene_page", String.valueOf(gVar.b));
            a2.put("word_icon_style", String.valueOf(gVar.c ? 1 : 0));
            ?? f = gVar.f();
            if (f != 0) {
                a2.put("ori_ad_bundle", f.o());
                if (f.O() != null) {
                    if (!TextUtils.isEmpty(f.O().a())) {
                        a2.put("land_u", f.O().a());
                    }
                    if (!TextUtils.isEmpty(f.O().b())) {
                        a2.put("dp_u", f.O().b());
                    }
                }
            }
        } else {
            sg.bigo.ads.api.core.b f2 = aVar.f();
            a2 = a(f2, (sg.bigo.ads.aj.a) null, false);
            sg.bigo.ads.ai.o e = f2.e();
            if (e != null) {
                a2.put("page_group_type", String.valueOf(e.a("multi_ads.page_group_type", 1)));
            }
            boolean z = f2 instanceof o;
            if (z) {
                o oVar = (o) f2;
                n bd = oVar.bd();
                if (bd != null) {
                    a2.put("creative_size", r.a("%1$d*%2$d", Integer.valueOf(bd.a), Integer.valueOf(bd.b)));
                }
                int aK = oVar.aK();
                if (aK != 0) {
                    a2.put("show_method", String.valueOf(aK));
                }
                a2.put("companion_type", a[oVar.aO() ? 1 : 0][oVar.aN() ? 1 : 0]);
                if (oVar.x() == 2) {
                    a2.put("fill_strategy", String.valueOf(oVar.bl()));
                    a2.put("dl_status", String.valueOf(oVar.bn()));
                    if (oVar.bl() == 2) {
                        a2.put("backup_source", String.valueOf(!r.a((CharSequence) oVar.bb()) ? 1 : 0));
                        a2.put("backup_dl_status", String.valueOf(oVar.bp()));
                    }
                    a2.put("backup_creative", String.valueOf(oVar.bo()));
                }
                a2.put("media_type", oVar.bg());
                a(f2, a2);
                b(f2, a2);
                d(f2, a2);
            }
            if (!TextUtils.isEmpty(f2.o())) {
                a2.put("ori_ad_bundle", f2.o());
            }
            if (f2.O() != null) {
                if (!TextUtils.isEmpty(f2.O().a())) {
                    a2.put("land_u", f2.O().a());
                }
                if (!TextUtils.isEmpty(f2.O().b())) {
                    a2.put("dp_u", f2.O().b());
                }
            }
            a(a2, f2);
            if (z && f2.y() == 2 && (f2.x() == 2 || f2.x() == 1)) {
                if (i2 != -1) {
                    a2.put("icon_sta", String.valueOf(i2));
                }
                if (i3 != -1) {
                    a2.put("img_sta", String.valueOf(i3));
                }
                if (i4 != -1) {
                    a2.put("vid_sta", String.valueOf(i4));
                }
            }
        }
        a2.put("show_proportion", str);
        v11.c("ad_size", str2, a2, "render_style", i);
        a2.put("render_cost", String.valueOf(j));
        a2.put("attach_render_cost", String.valueOf(j2));
        a2.put("cost", String.valueOf(j3));
        a2.put("cur_in_fg", String.valueOf(sg.bigo.ads.at.b.c()));
        a2.put("out_ad", String.valueOf(aVar.S()));
        int i7 = aVar.U;
        if (i7 != 0) {
            a2.put("show_method_source", String.valueOf(i7));
        }
        int i8 = aVar.V;
        if (i8 != 0) {
            a2.put("show_acty_source", String.valueOf(i8));
        }
        j jVar = k.a;
        if (jVar != null && jVar.n().a(15) && (h = sg.bigo.ads.bz.b.h(context)) != null) {
            a2.put("bat_stat", String.valueOf(h.c));
            a2.put("bat_num", String.valueOf(h.a));
            a2.put("bat_scale", String.valueOf(h.b));
        }
        p b_ = aVar.b_();
        u uVar = b_ != null ? b_.a : null;
        if (uVar != null) {
            a2.put("is_vpaid", "1");
            a2.put("vpaid_imp_type", String.valueOf(uVar.d));
            a2.put("vpaid_start_cost", String.valueOf(uVar.e));
            a2.put("vpaid_impression_cost", String.valueOf(uVar.f));
        }
        if (i5 >= 0) {
            a2.put("a1", String.valueOf(i5));
        }
        if (i6 >= 0) {
            a2.put("a2", String.valueOf(i6));
        }
        a("06002010", a2);
    }

    public static void a(Context context, @NonNull sg.bigo.ads.api.core.b bVar, String str, String str2, String str3, int i, int i2, e eVar, long j, int i3, int i4, @NonNull sg.bigo.ads.aj.a aVar, String str4) {
        sg.bigo.ads.an.b h;
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        sg.bigo.ads.aj.a Q = aVar.Q();
        if (Q instanceof g) {
            g gVar = (g) Q;
            a2.put("icon_show_num", String.valueOf(gVar.j()));
            a2.put("scene_page", String.valueOf(gVar.b));
            a2.put("word_icon_style", String.valueOf(gVar.c ? 1 : 0));
        }
        a2.put("ad_size", str);
        a2.put("click_area", str2);
        v11.c("down_click_area", str3, a2, "click_module", i);
        a2.put("click_source", String.valueOf(i2));
        a2.put("open_way", String.valueOf(bVar.O().d()));
        a2.put("url_t", String.valueOf(eVar.a));
        a2.put("land_success", eVar.a() ? "1" : "0");
        a2.put("open_way_form", String.valueOf(eVar.m));
        a2.put("auto_clk_out_mode", String.valueOf(eVar.o));
        a2.put("cost", String.valueOf(j));
        if (bVar instanceof o) {
            o oVar = (o) bVar;
            n bd = oVar.bd();
            if (bd != null) {
                a2.put("creative_size", r.a("%1$d*%2$d", Integer.valueOf(bd.a), Integer.valueOf(bd.b)));
            }
            int aK = oVar.aK();
            if (aK != 0) {
                a2.put("show_method", String.valueOf(aK));
            }
            long aM = oVar.aM();
            if (aM > 0) {
                a2.put("page_cost", String.valueOf(SystemClock.elapsedRealtime() - aM));
            }
            int aL = oVar.aL();
            if (i2 == 11 && aL > 0) {
                a2.put("render_method", String.valueOf(aL));
            }
            if (oVar.x() == 2) {
                a2.put("backup_creative", String.valueOf(oVar.bo()));
            }
            a(bVar, a2);
            b(bVar, a2);
            c(bVar, a2);
            d(bVar, a2);
        }
        j jVar = k.a;
        if (jVar != null && jVar.n().a(15) && (h = sg.bigo.ads.bz.b.h(context)) != null) {
            a2.put("bat_stat", String.valueOf(h.c));
            a2.put("bat_num", String.valueOf(h.a));
            a2.put("bat_scale", String.valueOf(h.b));
        }
        a2.put("total_num", String.valueOf(i3));
        a2.put("current_num", String.valueOf(i4));
        a2.put("cur_in_fg", String.valueOf(sg.bigo.ads.at.b.c()));
        a2.put("out_ad", String.valueOf(aVar.S()));
        int i5 = aVar.U;
        if (i5 != 0) {
            a2.put("show_method_source", String.valueOf(i5));
        }
        a2.put("click_acty_source", String.valueOf(aVar.W));
        a(a2, bVar);
        a(a2, aVar, true);
        if (!TextUtils.isEmpty(str4)) {
            a2.put("land_u", str4);
        }
        if (!TextUtils.isEmpty(bVar.O().b())) {
            a2.put("dp_u", bVar.O().b());
        }
        if (!TextUtils.isEmpty(bVar.O().c())) {
            a2.put("sub_u", bVar.O().c());
        }
        if (!TextUtils.isEmpty(bVar.o())) {
            a2.put("ori_ad_bundle", bVar.o());
        }
        p b_ = aVar.b_();
        u uVar = b_ != null ? b_.a : null;
        if (uVar != null) {
            a2.put("is_vpaid", "1");
            a2.put("vpaid_click_url", uVar.g);
            a2.put("vpaid_click_handle", uVar.h ? "1" : "0");
            a2.put("vpaid_click_id", uVar.i);
        }
        a("06002011", a2);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        HashMap a2 = hq.a("rm_file_type", str, "expired_rm_num", str3);
        a2.put("over_rm_num", str4);
        a2.put("rm_trigger", str2);
        a2.put("weak_ref_num", str5);
        a2.put("res_total_num", str6);
        a2.put("total_memory", str7);
        a2.put("free_memory", str8);
        a2.put("total_rom_memory", str9);
        a2.put("rom_free_in", str10);
        a2.put("last_delete_gap", str11);
        a("06002071", a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(String str, String str2, boolean z, long j, int i, String str3, boolean z2, int i2, String str4, String str5, String str6, String str7, boolean z3, boolean z4, int i3, String str8, String str9) {
        HashMap a2 = hq.a("url", str, "domain_front", str2);
        a2.put("rslt", z ? "1" : "0");
        a2.put("cost", String.valueOf(j));
        a2.put("res_code", String.valueOf(i));
        a2.put("res_msg", String.valueOf(str3));
        a2.put("in_fg", String.valueOf(z2 ? 1 : 0));
        a2.put("size", String.valueOf(i2));
        int o = sg.bigo.ads.bw.a.o();
        int p = sg.bigo.ads.bw.a.p();
        int q = sg.bigo.ads.bw.a.q();
        int r = sg.bigo.ads.bw.a.r();
        if (o != 0 || p != 0 || q != 0 || r != 0) {
            String str10 = o == 1 ? "GDPR" : "";
            if (p == 1) {
                str10 = i5s.a(fw3.e(str10), str10.length() == 0 ? "" : "&", "CCPA");
            }
            if (q == 1) {
                str10 = i5s.a(fw3.e(str10), str10.length() == 0 ? "" : "&", "LGPD");
            }
            if (r == 1) {
                str10 = i5s.a(fw3.e(str10), str10.length() != 0 ? "&" : "", "COPPA");
            }
            a2.put("privacy", str10);
            a2.put(X3.j.b0, "1");
        }
        a2.put("gps_country", str4);
        a2.put("sim_country", str5);
        a2.put("system_country", str6);
        if (!TextUtils.isEmpty(str7)) {
            a2.put("uuid", str7);
        }
        a2.put("encrypt", z3 ? "1" : "0");
        a2.put("req_encrypt_enable", z4 ? "1" : "0");
        a2.put("resp_decrypt_enable", String.valueOf(i3));
        if (!TextUtils.isEmpty(str8)) {
            a2.put("enc_logid", String.valueOf(str8));
        }
        if (!TextUtils.isEmpty(str9)) {
            a2.put("http_type", str9);
        }
        a("06002015", a2);
    }

    private static void a(@NonNull String str, Map<String, String> map) {
        d dVar = new d(str);
        dVar.a(map);
        a(dVar);
    }

    public static void a(@Nullable String str, @Nullable sg.bigo.ads.api.core.b bVar, String str2, String str3, String str4, int i, int i2, int i3, String str5, long j, int i4, String str6, int i5, int i6, int i7, int i8, boolean z, boolean z2, int i9, String str7, p pVar) {
        Map<String, String> map;
        if (bVar == null) {
            map = new HashMap<>();
        } else {
            Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
            a2.put("ad_resp_type", String.valueOf(bVar.x()));
            if (bVar instanceof o) {
                o oVar = (o) bVar;
                if (bVar.x() == 2) {
                    a2.put("dl_status", String.valueOf(oVar.bn()));
                }
                if (oVar.x() == 2) {
                    a2.put("fill_strategy", String.valueOf(oVar.bl()));
                }
                if (oVar.bl() == 2) {
                    a2.put("backup_source", String.valueOf(!r.a((CharSequence) oVar.bb()) ? 1 : 0));
                }
                a2.put("companion_type", a[oVar.aO() ? 1 : 0][oVar.aN() ? 1 : 0]);
                a2.put("backup_dl_status", String.valueOf(oVar.bp()));
            }
            map = a2;
        }
        if (!map.containsKey("slot") && !TextUtils.isEmpty(str)) {
            map.put("slot", str);
        }
        if (!map.containsKey("ad_type") && !TextUtils.isEmpty(str2)) {
            map.put("ad_type", str2);
        }
        if (str3 == null) {
            str3 = "0";
        }
        map.put("session_id", str3);
        if (str4 == null) {
            str4 = "0";
        }
        v11.c("session_id2", str4, map, "rslt", i);
        map.put("e_code", String.valueOf(i2));
        map.put("s_code", String.valueOf(i3));
        if (str5 != null) {
            map.put("error", str5);
        }
        map.put("cost_total", String.valueOf(j));
        v11.c("cache_ad_source", String.valueOf(str6), map, "cache_ad", i4);
        map.put("cache_req_status", String.valueOf(i5));
        map.put("req_type", String.valueOf(i6));
        map.put("cur_req_status", String.valueOf(i7));
        map.put("adx_type_req", String.valueOf(i8));
        map.put("cur_in_fg", String.valueOf(sg.bigo.ads.at.b.c()));
        map.put("encrypt", z ? "1" : "0");
        v11.c("req_encrypt_enable", z2 ? "1" : "0", map, "resp_decrypt_enable", i9);
        if (!TextUtils.isEmpty(str7)) {
            map.put("enc_logid", str7);
        }
        u uVar = pVar != null ? pVar.a : null;
        if (uVar != null) {
            map.put("is_vpaid", "1");
            map.put("vpaid_version", String.valueOf(uVar.a));
            map.put("vpaid_version_cost", String.valueOf(uVar.b));
            map.put("vpaid_init_cost", String.valueOf(uVar.c));
        }
        a("06002057", map);
    }

    public static void a(Map<String, String> map) {
        a("06002013", map);
    }

    public static void a(@NonNull Map<String, String> map, @Nullable sg.bigo.ads.aj.a aVar, boolean z) {
        sg.bigo.ads.aj.a Q = aVar != null ? aVar.Q() : null;
        if (Q instanceof g) {
            g gVar = (g) Q;
            a(map, gVar, false);
            if (z) {
                map.put("scene_page", String.valueOf(gVar.b));
            }
        }
    }

    private static void a(@NonNull Map<String, String> map, @NonNull sg.bigo.ads.aj.b bVar) {
        sg.bigo.ads.api.core.b j = bVar.j();
        if (j != null) {
            map.put("host_slot", j.b());
            map.put("host_placement", j.c());
            map.put("host_sid", String.valueOf(j.z()));
            map.put("host_ad_id", j.s());
        }
        if (bVar instanceof sg.bigo.ads.aj.c) {
            map.put("icon_req_num", String.valueOf(((sg.bigo.ads.aj.c) bVar).k()));
        }
    }

    @NonNull
    private static void a(@NonNull Map<String, String> map, @NonNull g gVar, boolean z) {
        Object T = gVar.T();
        if (T instanceof sg.bigo.ads.aj.b) {
            a(map, (sg.bigo.ads.aj.b) T);
        }
        map.put("icon_fill_num", String.valueOf(gVar.i()));
        map.put("icon_fill_scene", String.valueOf(gVar.h()));
        sg.bigo.ads.api.core.b bVar = (sg.bigo.ads.api.core.b) l.b(gVar.a());
        if (!z || bVar == null) {
            return;
        }
        map.put(O6.e1, String.valueOf(bVar.z()));
        map.put("dsp", bVar.w());
        map.put("adx_type", String.valueOf(bVar.x()));
    }

    private static void a(@NonNull Map<String, String> map, @NonNull sg.bigo.ads.api.core.b bVar) {
        if (bVar instanceof o) {
            if ((bVar.y() == 3 || bVar.y() == 4) && bVar.x() == 2) {
                o oVar = (o) bVar;
                int aP = oVar.aP();
                map.put("ser_multi_vid", String.valueOf(aP));
                if (aP == 3) {
                    String aQ = oVar.aQ();
                    if (TextUtils.isEmpty(aQ)) {
                        return;
                    }
                    map.put("media_reason", String.valueOf(aQ));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@Nullable sg.bigo.ads.ai.n nVar, @Nullable sg.bigo.ads.api.b bVar, int i, int i2, String str, int i3, int i4, int i5, boolean z, int i6, String str2) {
        Map<String, String> a2 = a(nVar);
        v11.c("rslt", "0", a2, "e_code", i);
        a2.put("s_code", String.valueOf(i2));
        a2.put("error", str);
        if (bVar != 0) {
            if (!a2.containsKey("slot")) {
                a2.put("slot", bVar.d());
                a2.put("ad_type", String.valueOf(bVar.c()));
            }
            a2.put("banner_type", String.valueOf(bVar.b));
            String str3 = bVar.g.a;
            if (!r.a((CharSequence) str3)) {
                a2.put("load_ext", str3);
            }
            b.a aVar = bVar.g;
            a(a2, aVar);
            a2.put("cost", String.valueOf(Math.max(0L, aVar.n() - aVar.k())));
            if (bVar instanceof sg.bigo.ads.aj.b) {
                a(a2, (sg.bigo.ads.aj.b) bVar);
            }
        }
        a2.put("req_type", String.valueOf(i3));
        a2.put("cur_req_status", String.valueOf(i4));
        v11.c("cur_in_fg", String.valueOf(sg.bigo.ads.at.b.c()), a2, "encrypt", i5);
        v11.c("req_encrypt_enable", z ? "1" : "0", a2, "resp_decrypt_enable", i6);
        if (!TextUtils.isEmpty(str2)) {
            a2.put("enc_logid", str2);
        }
        if (i2 == 800 || i2 == -13) {
            a2.put("tcf_applies", String.valueOf(sg.bigo.ads.bg.b.d()));
            a2.put("tcf_purpose", sg.bigo.ads.bg.b.b());
            a2.put("tcf_interests", sg.bigo.ads.bg.b.e());
            a2.put("tcf_vendors", sg.bigo.ads.bg.b.c());
            a2.put("gdpr_switch", String.valueOf(sg.bigo.ads.ai.i.b()));
            a2.put("consent_status", String.valueOf(b()));
        }
        a("06002007", a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@NonNull sg.bigo.ads.aj.a aVar, int i, int i2, String str) {
        Map<String, String> a2;
        sg.bigo.ads.api.core.h hVar;
        if (aVar instanceof g) {
            sg.bigo.ads.api.b T = aVar.T();
            a2 = a(T.i());
            a(a2, (g) aVar, true);
            if (T instanceof sg.bigo.ads.aj.c) {
                a2.put("scene_page", String.valueOf(((sg.bigo.ads.aj.c) T).l()));
            }
            hVar = T.g;
        } else {
            sg.bigo.ads.api.core.b f = aVar.f();
            a2 = a(f, (sg.bigo.ads.aj.a) null, false);
            sg.bigo.ads.api.core.h ab = f.ab();
            if (f instanceof o) {
                o oVar = (o) f;
                a2.put("material_type", oVar.aZ() ? "2" : "1");
                a2.put("media_type", oVar.bg());
                a2.put("companion_type", a[oVar.aO() ? 1 : 0][oVar.aN() ? 1 : 0]);
                if (oVar.x() == 2) {
                    a2.put("fill_strategy", String.valueOf(oVar.bl()));
                    a2.put("dl_status", String.valueOf(oVar.bn()));
                    if (oVar.bl() == 2) {
                        a2.put("backup_source", String.valueOf(!r.a((CharSequence) oVar.bb()) ? 1 : 0));
                    }
                    a2.put("media_type", oVar.bg());
                }
                if (f.an() != null) {
                    a2.put("ad_resp_num", String.valueOf(f.an().size() + 1));
                }
                a(f, a2);
            }
            a(a2, f);
            b(a2, f);
            hVar = ab;
        }
        long o = hVar.o() - hVar.n();
        long o2 = hVar.o() - hVar.k();
        a2.put("rslt", "0");
        a2.put("cost", String.valueOf(o));
        a2.put("cost_total", String.valueOf(o2));
        v11.c("e_code", String.valueOf(i), a2, "s_code", i2);
        a2.put("error", str);
        a2.put("cur_in_fg", String.valueOf(sg.bigo.ads.at.b.c()));
        a2.remove("cache_ad");
        a2.remove("cache_ad_source");
        a2.remove("cache_req_status");
        a2.remove("session_id2");
        q R = aVar.R();
        if (R != null) {
            a2.put("encrypt", R.a ? "1" : "0");
            a2.put("req_encrypt_enable", R.b ? "1" : "0");
            a2.put("resp_decrypt_enable", String.valueOf(R.c));
            String str2 = R.d;
            if (!TextUtils.isEmpty(str2)) {
                a2.put("enc_logid", str2);
            }
        }
        a("06002008", a2);
    }

    public static void a(@NonNull sg.bigo.ads.aj.a aVar, String str, String str2, int i) {
        Map<String, String> a2;
        int aK;
        if (aVar instanceof g) {
            a2 = a(aVar.T().i());
            a(a2, (g) aVar, true);
            a(a2, (sg.bigo.ads.api.core.b) null, str, str2, i);
        } else {
            sg.bigo.ads.api.core.b f = aVar.f();
            a2 = a(f, (sg.bigo.ads.aj.a) null, false);
            a(a2, f, str, str2, i);
            if ((f instanceof o) && (aK = ((o) f).aK()) != 0) {
                a2.put("show_method", String.valueOf(aK));
            }
        }
        a("06002029", a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@NonNull sg.bigo.ads.aj.a aVar, boolean z) {
        Map<String, String> a2;
        sg.bigo.ads.api.core.h hVar;
        if (aVar instanceof g) {
            sg.bigo.ads.api.b T = aVar.T();
            a2 = a(T.i());
            a(a2, (g) aVar, true);
            if (T instanceof sg.bigo.ads.aj.c) {
                a2.put("scene_page", String.valueOf(((sg.bigo.ads.aj.c) T).l()));
            }
            hVar = T.g;
        } else {
            sg.bigo.ads.api.core.b f = aVar.f();
            a2 = a(f, (sg.bigo.ads.aj.a) null, false);
            sg.bigo.ads.api.core.h ab = f.ab();
            if (f instanceof o) {
                o oVar = (o) f;
                a2.put("material_type", oVar.aZ() ? "2" : "1");
                a2.put("media_type", oVar.bg());
                a2.put("companion_type", a[oVar.aO() ? 1 : 0][oVar.aN() ? 1 : 0]);
                if (oVar.x() == 2) {
                    a2.put("fill_strategy", String.valueOf(oVar.bl()));
                    a2.put("dl_status", String.valueOf(oVar.bn()));
                    if (oVar.bl() == 2) {
                        a2.put("backup_source", String.valueOf(!r.a((CharSequence) oVar.bb()) ? 1 : 0));
                        a2.put("backup_dl_status", String.valueOf(oVar.bp()));
                    }
                    a2.put("media_type", oVar.bg());
                }
                if (f.an() != null) {
                    a2.put("ad_resp_num", String.valueOf(f.an().size() + 1));
                }
                a(f, a2);
            }
            a(a2, f);
            b(a2, f);
            hVar = ab;
        }
        long o = hVar.o() - hVar.n();
        long o2 = hVar.o() - hVar.k();
        a2.put("rslt", "1");
        a2.put("cost", String.valueOf(o));
        a2.put("cost_total", String.valueOf(o2));
        a2.put("is_cache", z ? "1" : "0");
        a2.put("cur_in_fg", String.valueOf(sg.bigo.ads.at.b.c()));
        a2.remove("cache_ad");
        a2.remove("cache_ad_source");
        a2.remove("cache_req_status");
        a2.remove("session_id2");
        q R = aVar.R();
        if (R != null) {
            a2.put("encrypt", R.a ? "1" : "0");
            a2.put("req_encrypt_enable", R.b ? "1" : "0");
            a2.put("resp_decrypt_enable", String.valueOf(R.c));
            String str = R.d;
            if (!TextUtils.isEmpty(str)) {
                a2.put("enc_logid", str);
            }
        }
        p b_ = aVar.b_();
        u uVar = b_ != null ? b_.a : null;
        if (uVar != null) {
            a2.put("is_vpaid", "1");
            a2.put("vpaid_version", String.valueOf(uVar.a));
            a2.put("vpaid_version_cost", String.valueOf(uVar.b));
            a2.put("vpaid_init_cost", String.valueOf(uVar.c));
        }
        a("06002008", a2);
    }

    public static void a(@NonNull sg.bigo.ads.aj.h hVar, @Nullable h.a aVar, long j, int i, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.aj.a aVar2, String str, String str2) {
        Map<String, String> a2 = a(bVar, hVar);
        if (aVar != null) {
            a2.put("status", String.valueOf(aVar.a()));
            a2.put("cost", String.valueOf(aVar.b()));
        }
        a2.put("duration", String.valueOf(j));
        a2.put("num", String.valueOf(i));
        a2.put("out_ad", String.valueOf(aVar2 == null ? sg.bigo.ads.bu.a.a : aVar2.S()));
        if (!TextUtils.isEmpty(str)) {
            a2.put("task_affinity", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            a2.put("url_trace", str2);
        }
        a(a2, aVar2, false);
        a("06002062", a2);
    }

    public static void a(@NonNull sg.bigo.ads.aj.h hVar, @NonNull h.a aVar, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.aj.a aVar2, String str) {
        Map<String, String> a2 = a(bVar, hVar);
        a2.put("status", String.valueOf(aVar.a()));
        a2.put("cost", String.valueOf(aVar.b()));
        a2.put("out_ad", String.valueOf(aVar2 == null ? sg.bigo.ads.bu.a.a : aVar2.S()));
        if (!TextUtils.isEmpty(str)) {
            a2.put("task_affinity", str);
        }
        a(a2, aVar2, false);
        a("06002061", a2);
    }

    public static void a(sg.bigo.ads.an.g gVar) {
        String str;
        if (gVar == null || sg.bigo.ads.bw.a.s()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("gg_service_ver", gVar.H());
            jSONObject.putOpt("webkit_ver", gVar.I());
            jSONObject.putOpt("cpu_core_num", Integer.valueOf(gVar.J()));
            jSONObject.putOpt("cpu_clock_speed", Long.valueOf(gVar.K()));
            jSONObject.putOpt("total_memory", Long.valueOf(gVar.L()));
            jSONObject.putOpt("free_memory", Long.valueOf(gVar.M()));
            jSONObject.putOpt("rom_free_in", Long.valueOf(gVar.N()));
            jSONObject.putOpt("rom_free_ext", Long.valueOf(gVar.O()));
            jSONObject.putOpt(O6.i0, Float.valueOf(gVar.aj()));
            jSONObject.putOpt("note", Integer.valueOf(gVar.ak()));
            jSONObject.putOpt("font", Float.valueOf(gVar.al()));
            jSONObject.putOpt("scale", Integer.valueOf(gVar.am()));
            jSONObject.putOpt("theme", Integer.valueOf(gVar.an()));
            jSONObject.putOpt("gg_service", Integer.valueOf(gVar.ao() ? 1 : 0));
            jSONObject.putOpt("tsdk", String.valueOf(gVar.ap()));
            jSONObject.putOpt("msdk", String.valueOf(gVar.aq()));
            jSONObject.putOpt("apks", Long.valueOf(gVar.ar()));
            jSONObject.putOpt(PluginErrorDetails.Platform.UNITY, Integer.valueOf(gVar.as() ? 1 : 0));
            jSONObject.putOpt("ace", Integer.valueOf(gVar.at() ? 1 : 0));
            jSONObject.putOpt("exo", Integer.valueOf(gVar.au() ? 1 : 0));
            JSONObject aA = gVar.aA();
            jSONObject.putOpt("anti_info_full", aA == null ? "" : aA.toString());
            str = jSONObject.toString();
        } catch (Exception unused) {
            str = null;
        }
        if (str == null) {
            return;
        }
        a("06002068", dez0.a("data", sg.bigo.ads.bc.a.a(str, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F")));
    }

    public static void a(@Nullable sg.bigo.ads.api.core.b bVar) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        if (bVar instanceof o) {
            o oVar = (o) bVar;
            if (!TextUtils.isEmpty(oVar.bB())) {
                a2.put("media_type_url", oVar.bB());
            }
            if (!TextUtils.isEmpty(oVar.bC())) {
                a2.put("media_type_http", oVar.bC());
            }
            if (!TextUtils.isEmpty(oVar.bD())) {
                a2.put("media_type_file", oVar.bD());
            }
        }
        a("06002047", a2);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, int i) {
        HashMap hashMap = new HashMap();
        if (bVar != null) {
            hashMap.put("host_slot", bVar.b());
            hashMap.put("host_placement", bVar.c());
            hashMap.put("host_sid", String.valueOf(bVar.z()));
            hashMap.put("host_ad_id", bVar.s());
        }
        hashMap.put("show_icon_invoke", "1");
        hashMap.put("scene_page", String.valueOf(i));
        c.a().a("06002069", hashMap);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i, int i2) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        a2.put("page_style", String.valueOf(i));
        a2.put("page_source", String.valueOf(i2));
        if (bVar instanceof o) {
            a(bVar, a2);
            b(bVar, a2);
            d(bVar, a2);
        }
        a("06002041", a2);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, int i, int i2, int i3, int i4, int i5, int i6) {
        Map hashMap = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.aj.a) null, false);
        hashMap.put("multi_scene", String.valueOf(i));
        hashMap.put("action", String.valueOf(i2));
        hashMap.put("multi_num", String.valueOf(i3));
        hashMap.put("multi_status_loading_num", String.valueOf(i4));
        hashMap.put("multi_status_success_num", String.valueOf(i5));
        hashMap.put("multi_status_failed_num", String.valueOf(i6));
        a("06002058", (Map<String, String>) hashMap);
    }

    public static void a(@Nullable sg.bigo.ads.api.core.b bVar, int i, int i2, long j) {
        Map hashMap = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.aj.a) null, false);
        hashMap.put("page_type", String.valueOf(i));
        hashMap.put("action", String.valueOf(i2));
        hashMap.put("cost", String.valueOf(j));
        a("06002056", (Map<String, String>) hashMap);
    }

    public static void a(@Nullable sg.bigo.ads.api.core.b bVar, int i, int i2, long j, long j2) {
        Map hashMap = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.aj.a) null, false);
        hashMap.put("page_type", String.valueOf(i));
        hashMap.put("action", String.valueOf(i2));
        hashMap.put("cost1", String.valueOf(j));
        hashMap.put("cost2", String.valueOf(j2));
        a("06002055", (Map<String, String>) hashMap);
    }

    public static void a(@Nullable sg.bigo.ads.api.core.b bVar, int i, int i2, String str) {
        Map hashMap = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.aj.a) null, false);
        hashMap.put("e_code", String.valueOf(i));
        hashMap.put("s_code", String.valueOf(i2));
        hashMap.put("error", str);
        a("06002035", (Map<String, String>) hashMap);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, int i, int i2, String str, int i3, int i4, boolean z) {
        HashMap hashMap = new HashMap();
        if (bVar != null) {
            hashMap.put("host_slot", bVar.b());
            hashMap.put("host_placement", bVar.c());
            hashMap.put("host_sid", String.valueOf(bVar.z()));
            hashMap.put("host_ad_id", bVar.s());
        }
        hashMap.put("icon_show_rslt", "1");
        hashMap.put("scene_page", String.valueOf(i));
        hashMap.put("icon_fill_num", String.valueOf(i2));
        hashMap.put("icon_show_num", String.valueOf(i3));
        hashMap.put("icon_slot", String.valueOf(str));
        hashMap.put("icon_style", String.valueOf(i4));
        hashMap.put("word_icon_style", String.valueOf(z));
        c.a().a("06002069", hashMap);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, int i, int i2, String str, long j, boolean z, int i3, String str2) {
        Map hashMap = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.aj.a) null, false);
        hashMap.put("render_method", String.valueOf(i));
        hashMap.put("rslt", String.valueOf(i2));
        hashMap.put("cost", String.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("material_id", str);
        }
        if (z) {
            hashMap.put("e_code", String.valueOf(i3));
            hashMap.put("error", String.valueOf(str2));
        }
        a("06002050", (Map<String, String>) hashMap);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, int i, int i2, String str, String str2) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        v11.c("ad_pkg_name", str, a2, "open_rslt", i);
        a2.put("open_type", String.valueOf(i2));
        a2.put("ori_ad_bundle", bVar.o());
        a2.put("referrer", str2);
        a("06002070", a2);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i, long j) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        v11.c("rslt", "1", a2, "wrap", i);
        a2.put("cost", String.valueOf(j));
        if (bVar instanceof o) {
            o oVar = (o) bVar;
            a2.put("video_duration", String.valueOf(oVar.bc()));
            a2.put("video_type", oVar.bg());
            a2.put("has_video", String.valueOf(oVar.aG() != null ? 1 : 0));
            a2.put("companion_type", a[oVar.aO() ? 1 : 0][oVar.aN() ? 1 : 0]);
        }
        a2.put("cur_in_fg", String.valueOf(sg.bigo.ads.at.b.c()));
        a2.remove("cache_ad");
        a2.remove("cache_ad_source");
        a2.remove("cache_req_status");
        a2.remove("session_id2");
        a(bVar, a2);
        a("06002016", a2);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i, long j, long j2, @NonNull sg.bigo.ads.aj.a aVar) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        a2.put("close_source", String.valueOf(i));
        a2.put("duration", String.valueOf(j));
        a2.put("ad_front_duration", String.valueOf(j2));
        a2.put("close_type", "0");
        a2.put("out_ad", String.valueOf(aVar.S()));
        a(a2, aVar, false);
        a("06002023", a2);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i, long j, @Nullable String str, int i2, @Nullable String str2, @Nullable String str3) {
        a(bVar, i, j, str, i2, str2, str3, (Map<String, String>) null);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i, long j, @Nullable String str, int i2, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        a2.put("slot", String.valueOf(bVar.b()));
        a2.put("rslt", String.valueOf(i));
        a2.put("cost", String.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            a2.put("url", str);
        }
        if (i2 > 0) {
            a2.put("cnt", String.valueOf(i2));
        }
        if (!TextUtils.isEmpty(str2)) {
            a2.put("material_type", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            a2.put("error", str3);
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    a2.put(entry.getKey(), entry.getValue());
                }
            }
        }
        if (bVar instanceof o) {
            o oVar = (o) bVar;
            a2.put("companion_type", a[oVar.aO() ? 1 : 0][oVar.aN() ? 1 : 0]);
            a2.put("playable_load_type", String.valueOf(bVar.ay()));
            sg.bigo.ads.ai.o f = bVar.f();
            if (f != null) {
                a2.put("playable_loaded_progress", String.valueOf(f.a("playable_attr.playable_loaded_progress", 0)));
            }
            if (oVar.bl() == 2) {
                a2.put("backup_source", String.valueOf(!r.a((CharSequence) oVar.bb()) ? 1 : 0));
            }
        }
        a("06002042", a2);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i, @Nullable Double d, @Nullable String str) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        a2.put("auc_mode", String.valueOf(i));
        a2.put("bid_rslt", "1");
        if (d != null) {
            a2.put("sec_price", String.valueOf(d));
        }
        if (str != null) {
            a2.put("sec_bidder", str);
        }
        a("06002045", a2);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i, @Nullable Double d, @Nullable String str, int i2) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        a2.put("auc_mode", String.valueOf(i));
        a2.put("bid_rslt", "0");
        if (d != null) {
            a2.put("first_price", String.valueOf(d));
        }
        if (str != null) {
            a2.put("first_bidder", str);
        }
        a2.put("loss_reason", String.valueOf(i2));
        a("06002045", a2);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i, String str, int i2) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        a2.put("video_stat", String.valueOf(i));
        a2.put("video_url", str);
        a2.put("path_t", String.valueOf(i2));
        if (bVar instanceof o) {
            o oVar = (o) bVar;
            a2.put("video_duration", String.valueOf(oVar.bc()));
            n bd = oVar.bd();
            if (bd != null) {
                a2.put("video_actual_duration", String.valueOf(bd.c));
            }
            a(bVar, a2);
            b(bVar, a2);
            d(bVar, a2);
        }
        a("06002017", a2);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i, String str, long j, int i2, String str2) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        v11.c("rslt", "0", a2, "wrap", i);
        a2.put("wrap_url", str);
        a2.put("cost", String.valueOf(j));
        a2.put("e_code", String.valueOf(i2));
        a2.put("error", String.valueOf(str2));
        a2.put("cur_in_fg", String.valueOf(sg.bigo.ads.at.b.c()));
        a2.remove("cache_ad");
        a2.remove("cache_ad_source");
        a2.remove("cache_req_status");
        a2.remove("session_id2");
        a(bVar, a2);
        a("06002016", a2);
    }

    public static void a(@Nullable sg.bigo.ads.api.core.b bVar, int i, @NonNull String str, long j, long j2, @Nullable String str2) {
        a(bVar, i, str, j, j2, str2, -1);
    }

    public static void a(@Nullable sg.bigo.ads.api.core.b bVar, int i, @NonNull String str, long j, long j2, @Nullable String str2, int i2) {
        Map hashMap;
        String valueOf;
        if (bVar != null) {
            hashMap = a(bVar, (sg.bigo.ads.aj.a) null, false);
            hashMap.put("slot", bVar.b());
            hashMap.put("playable_load_type", String.valueOf(bVar.ay()));
            sg.bigo.ads.ai.o f = bVar.f();
            if (f != null) {
                hashMap.put("playable_loaded_progress", String.valueOf(f.a("playable_attr.playable_loaded_progress", 0)));
            }
        } else {
            hashMap = new HashMap();
        }
        hashMap.put("rslt", String.valueOf(i));
        hashMap.put("material_type", "playable_zip_pkg");
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("url", str);
        }
        String str3 = "zip_pkg_size";
        if (i != 0) {
            hashMap.put("cost", String.valueOf(j2));
            hashMap.put("zip_pkg_size", String.valueOf(j));
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("error", str2);
            }
            if (i == 1) {
                str3 = "zip_pkg_from_net";
                valueOf = String.valueOf(i2);
            }
            a("06002042", (Map<String, String>) hashMap);
        }
        valueOf = "0";
        hashMap.put("cost", "0");
        hashMap.put(str3, valueOf);
        a("06002042", (Map<String, String>) hashMap);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, int i, @NonNull e eVar, @Nullable sg.bigo.ads.aj.a aVar) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        a2.put("open_way_gp", String.valueOf(i));
        a2.put("open_rslt_gp", String.valueOf(eVar.b));
        a2.put("deep_rslt", String.valueOf(eVar.c));
        a2.put("webview_layout", String.valueOf(eVar.j));
        a2.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, eVar.k);
        a2.put("land_success", eVar.a() ? "1" : "0");
        a2.put("url_t", String.valueOf(eVar.a));
        if (!TextUtils.isEmpty(eVar.p)) {
            a2.put("fallback_url", eVar.p);
        }
        a2.put("ori_ad_bundle", bVar.o());
        if (eVar.b() >= 0) {
            a2.put("open_gp_inline", String.valueOf(eVar.b()));
        }
        if (!r.a((CharSequence) eVar.l)) {
            a2.put("pkg_name", eVar.l);
        }
        int i2 = eVar.i;
        if (i2 >= 0) {
            a2.put("open_pkg_delay_rslt", String.valueOf(i2));
        }
        a2.put("out_ad", String.valueOf(aVar == null ? sg.bigo.ads.bu.a.a : aVar.S()));
        a(a2, aVar, false);
        a("06002034", a2);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        a2.put("ad_destroy_duration", String.valueOf(j));
        a("06002065", a2);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, String str, int i, int i2) {
        Map hashMap = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.aj.a) null, false);
        hashMap.put("rslt", String.valueOf(str));
        hashMap.put("render_method", String.valueOf(i));
        hashMap.put("reason", String.valueOf(i2));
        a("06002049", (Map<String, String>) hashMap);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, String str, int i, int i2, String str2, int i3) {
        HashMap hashMap = new HashMap();
        if (bVar != null) {
            hashMap.put("host_slot", bVar.b());
            hashMap.put("host_placement", bVar.c());
            hashMap.put("host_sid", String.valueOf(bVar.z()));
            hashMap.put("host_ad_id", bVar.s());
        }
        hashMap.put("icon_show_rslt", "0");
        hashMap.put("icon_show_error", str);
        hashMap.put("scene_page", String.valueOf(i));
        hashMap.put("icon_fill_num", String.valueOf(i2));
        hashMap.put("icon_slot", String.valueOf(str2));
        hashMap.put("icon_style", String.valueOf(i3));
        c.a().a("06002069", hashMap);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, String str, int i, long j, int i2) {
        Map hashMap = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.aj.a) null, false);
        hashMap.put("rslt", "1");
        v11.c("video_url", str, hashMap, SignalingTransport.URL_TYPE_RETRY, i2);
        hashMap.put("media_player_status", String.valueOf(i));
        hashMap.put("cost", String.valueOf(j));
        a("06002054", (Map<String, String>) hashMap);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, String str, int i, long j, long j2, int i2, int i3, String str2, boolean z, String str3, String str4, String str5, String str6, int i4) {
        int i5;
        n bd;
        int i6 = 0;
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        a2.put("retry_times", String.valueOf(i4));
        a2.put("rslt", "1");
        v11.c("url", str, a2, "source", i);
        a2.put("cost", String.valueOf(j));
        a2.put("size", String.valueOf(j2));
        v11.c("dl_opt", String.valueOf(i2), a2, "material_type", i3);
        if ((bVar instanceof o) && (bd = ((o) bVar).bd()) != null) {
            a2.put("creative_size", r.a("%1$d*%2$d", Integer.valueOf(bd.a), Integer.valueOf(bd.b)));
        }
        a2.put("media_type", str2);
        a2.put("from_breakpoint", z ? "1" : "0");
        a2.put("cur_in_fg", String.valueOf(sg.bigo.ads.at.b.c()));
        a2.remove("cache_ad");
        a2.remove("cache_ad_source");
        a2.remove("cache_req_status");
        a2.remove("session_id2");
        if (!TextUtils.isEmpty(str3)) {
            a2.put("media_type_url", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            a2.put("media_type_http", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            a2.put("media_type_file", str5);
        }
        a(bVar, a2);
        if ("video".equals(str2) && k.a.n().a(29)) {
            if (i == 1) {
                sg.bigo.ads.av.a a3 = sg.bigo.ads.aw.a.a(str6);
                if (a3 != null) {
                    i6 = a3.d != sg.bigo.ads.bw.a.j() ? 2 : 1;
                    i5 = (int) ((System.currentTimeMillis() - a3.c) / 1000);
                } else {
                    i5 = 0;
                }
                a2.put("remove_type", String.valueOf(i6));
                a2.put("remove_time_gap", String.valueOf(i5));
                sg.bigo.ads.aw.a.b(str6);
            }
        }
        a("06002018", a2);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, String str, int i, long j, long j2, String str2, String str3, String str4, String str5, String str6) {
        a(bVar, str, i, j, j2, 0, 1, str2, false, str3, str4, str5, str6, 0);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, String str, int i, String str2, int i2) {
        Map hashMap = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.aj.a) null, false);
        hashMap.put("rslt", "0");
        v11.c("video_url", str, hashMap, SignalingTransport.URL_TYPE_RETRY, i2);
        hashMap.put("media_player_status", String.valueOf(i));
        hashMap.put("error", str2);
        a("06002054", (Map<String, String>) hashMap);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, String str, long j, int i, @Nullable Map<String, String> map) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        a2.put("action", str);
        a2.put("cost", String.valueOf(j));
        a2.put("rslt", String.valueOf(i));
        if (map != null) {
            a2.putAll(map);
        }
        a("06002025", a2);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, String str, String str2, int i) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        a(a2, bVar, str, str2, i);
        a("06002043", a2);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, String str, String str2, int i, int i2) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        a2.put("ad_size", str);
        v11.c("click_area", str2, a2, "click_module", i);
        a2.put("click_source", String.valueOf(i2));
        a2.put("interaction_type", "1");
        a2.put("click_action", "1");
        if (bVar instanceof o) {
            o oVar = (o) bVar;
            n bd = oVar.bd();
            if (bd != null) {
                a2.put("creative_size", bd.a + "*" + bd.b);
            }
            if (oVar.aZ()) {
                a2.put("backup_creative", String.valueOf(oVar.bo()));
            }
            a(bVar, a2);
            b(bVar, a2);
            c(bVar, a2);
            d(bVar, a2);
        }
        a("06002073", a2);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, String str, String str2, long j, long j2, int i, String str3, boolean z, String str4, String str5, String str6) {
        a(bVar, str, str2, j, j2, i, str3, z, str4, str5, str6, 0);
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, String str, String str2, long j, long j2, int i, String str3, boolean z, String str4, String str5, String str6, int i2) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        a2.put("retry_times", String.valueOf(i2));
        a2.put("rslt", "0");
        a2.put("url", str);
        a2.put("error", str2);
        a2.put("cost", String.valueOf(j));
        a2.put("size", String.valueOf(j2));
        a2.put("material_type", String.valueOf(i));
        a2.put("media_type", str3);
        a2.put("from_breakpoint", z ? "1" : "0");
        a2.put("cur_in_fg", String.valueOf(sg.bigo.ads.at.b.c()));
        a2.remove("cache_ad");
        a2.remove("cache_ad_source");
        a2.remove("cache_req_status");
        a2.remove("session_id2");
        if (!TextUtils.isEmpty(str4)) {
            a2.put("media_type_url", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            a2.put("media_type_http", str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            a2.put("media_type_file", str6);
        }
        a(bVar, a2);
        a("06002018", a2);
    }

    public static void a(sg.bigo.ads.api.core.b bVar, String str, List<String> list, String str2, int i) {
        Map hashMap = bVar == null ? new HashMap() : a(bVar, (sg.bigo.ads.aj.a) null, false);
        hashMap.put("rslt", str);
        if (!l.a((Collection) list)) {
            hashMap.put("reason", list.toString());
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("browser", str2);
        }
        hashMap.put("open_way", String.valueOf(i));
        a("06002060", (Map<String, String>) hashMap);
    }

    private static void a(sg.bigo.ads.api.core.b bVar, Map<String, String> map) {
        int bv;
        if (!(bVar instanceof o) || map == null || (bv = ((o) bVar).bv()) <= 0) {
            return;
        }
        map.put("ad_resp_indx", String.valueOf(bv));
    }

    public static void a(@NonNull sg.bigo.ads.api.core.b bVar, @NonNull sg.bigo.ads.aj.a aVar) {
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        a2.put("out_ad", String.valueOf(aVar.S()));
        a(a2, aVar, false);
        a("06002022", a2);
    }

    public static void a(@Nullable sg.bigo.ads.api.core.b bVar, @Nullable AdError adError) {
        a(bVar, adError, true, true);
    }

    public static void a(@Nullable sg.bigo.ads.api.core.b bVar, @Nullable AdError adError, boolean z, boolean z2) {
        if (bVar == null || adError == null) {
            return;
        }
        Map<String, String> a2 = a(bVar, (sg.bigo.ads.aj.a) null, false);
        StringBuilder sb = new StringBuilder();
        sb.append(adError.getCode());
        a2.put("e_code", sb.toString());
        a2.put("s_code", String.valueOf(adError.getSubCode()));
        if (adError.getCode() == 2000) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(bVar.L());
            a2.put("duration_expired", sb2.toString());
        }
        a2.put("error", adError.getMessage());
        a2.put("ad_impl", z ? "1" : "0");
        a2.put("fail_to_show", z2 ? "1" : "0");
        if ((bVar instanceof o) && bVar.x() == 2) {
            a2.put("dl_status", String.valueOf(((o) bVar).bn()));
        }
        a("06002048", a2);
    }

    public static void a(i iVar, long j, long j2, long j3, long j4, long j5) {
        Map<String, String> a2 = a((sg.bigo.ads.api.core.b) iVar, (sg.bigo.ads.aj.a) null, false);
        a2.put("by_js", String.valueOf(j));
        a2.put("by_js_cost", String.valueOf(j2));
        a2.put("by_bit", String.valueOf(j3));
        a2.put("by_bit_cost", String.valueOf(j4));
        a2.put("by_bit_run_cost", String.valueOf(j5));
        if (j > 0 && j2 >= 0 && j3 > 0 && j4 >= 0) {
            j2 = Math.min(j2, j4);
        } else if (j <= 0 || j2 < 0) {
            j2 = (j3 <= 0 || j4 < 0) ? -1L : j4;
        }
        a2.put("cost", String.valueOf(j2));
        a("06002040", a2);
    }

    private static void a(d dVar) {
        Map<String, String> map = dVar.a;
        if (r.a((CharSequence) map.get("session_id"))) {
            map.put("session_id", UUID.randomUUID().toString());
        }
        c.a().a(dVar.b, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@NonNull sg.bigo.ads.api.core.b[] bVarArr, @NonNull sg.bigo.ads.api.b bVar, boolean z, int i, int i2, int i3, boolean z2, int i4, String str) {
        Map<String, String> a2;
        int i5 = 1;
        if (bVar.f()) {
            a2 = a(bVar.i());
            sg.bigo.ads.api.core.b bVar2 = (sg.bigo.ads.api.core.b) l.b(bVarArr);
            a2.put("dsp", bVar2.w());
            a2.put(O6.e1, String.valueOf(bVar2.z()));
            a2.put("adx_type", String.valueOf(bVar2.x()));
            a2.put("icon_fill_num", String.valueOf(bVarArr.length));
        } else {
            sg.bigo.ads.api.core.b bVar3 = (sg.bigo.ads.api.core.b) l.b(bVarArr);
            int i6 = 0;
            a2 = a(bVar3, (sg.bigo.ads.aj.a) null, false);
            if ((bVar3 instanceof o) && bVar3.x() == 2) {
                o oVar = (o) bVar3;
                if (oVar.aJ() != null && oVar.aJ().b()) {
                    i6 = 1;
                }
                a2.put("video_type", String.valueOf(i6));
            }
            a(a2, bVar3);
            List<sg.bigo.ads.api.core.b> an = bVar3.an();
            if (an != null && an.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (sg.bigo.ads.api.core.b bVar4 : an) {
                    if (bVar4 != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.putOpt("ad_id", bVar4.s());
                            jSONObject.putOpt(CampaignEx.JSON_KEY_CREATIVE_ID, bVar4.A());
                            jSONArray.put(jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                }
                i5 = 1 + an.size();
                a2.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, jSONArray.toString());
            }
        }
        if (bVar instanceof sg.bigo.ads.aj.b) {
            a(a2, (sg.bigo.ads.aj.b) bVar);
        }
        a2.put("ad_resp_num", String.valueOf(i5));
        a2.put("rslt", "1");
        a2.put("banner_type", String.valueOf(bVar.b));
        String str2 = bVar.g.a;
        if (!r.a((CharSequence) str2)) {
            a2.put("load_ext", str2);
        }
        b.a aVar = bVar.g;
        a2.put("cost", String.valueOf(Math.max(0L, aVar.n() - aVar.k())));
        v11.c("is_playable", z ? "1" : "0", a2, "req_type", i);
        a2.put("cur_req_status", String.valueOf(i2));
        a2.put("cur_in_fg", String.valueOf(sg.bigo.ads.at.b.c()));
        a2.remove("cache_ad");
        a2.remove("cache_ad_source");
        a2.remove("cache_req_status");
        a2.remove("session_id2");
        a2.put("encrypt", String.valueOf(i3));
        v11.c("req_encrypt_enable", z2 ? "1" : "0", a2, "resp_decrypt_enable", i4);
        if (!TextUtils.isEmpty(str)) {
            a2.put("enc_logid", str);
        }
        a("06002007", a2);
    }
}
