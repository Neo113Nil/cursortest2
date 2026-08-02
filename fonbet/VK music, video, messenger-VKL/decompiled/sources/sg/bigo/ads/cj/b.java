package sg.bigo.ads.cj;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.b;

/* loaded from: classes9.dex */
public class b implements sg.bigo.ads.api.core.b {

    @Nullable
    private JSONObject A;

    @Nullable
    private List<sg.bigo.ads.api.core.b> B;
    private final long C;
    private final long E;

    @NonNull
    private final sg.bigo.ads.api.core.h F;
    private long G;
    private int H;
    private int I;
    private boolean K;
    private long L;
    private sg.bigo.ads.ai.o M;
    private sg.bigo.ads.ai.o N;
    private final String O;
    private String P;
    private boolean Q;
    private boolean R;
    private String S;
    private final double U;
    private String V;
    private final boolean W;
    private String X;
    private String Y;
    private String Z;

    @NonNull
    protected final sg.bigo.ads.ai.n a;
    private b.d aa;
    private int ab;
    private String ac;
    private int ad;
    private int ae;
    private boolean af;
    private int ag;
    private boolean ah;
    private int aj;
    private int ak;
    private sg.bigo.ads.api.core.q al;
    private String am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private String as;
    private String at;
    private String au;
    private int av;
    private String ax;
    private String ay;
    private String az;

    @NonNull
    protected String b;

    @Nullable
    protected String c;

    @Nullable
    protected String d;

    @Nullable
    protected String e;

    @NonNull
    protected final String f;
    protected int g;
    protected int h;
    protected long i;

    @Nullable
    protected String j;

    @Nullable
    protected String k;

    @Nullable
    protected b.e l;

    @Nullable
    protected b.f[] m;

    @Nullable
    protected b.f[] n;

    @Nullable
    protected b.f[] o;

    @Nullable
    protected b.f[] p;

    @Nullable
    protected List<b.c> q;

    @Nullable
    protected String r;
    protected long s;

    @Nullable
    protected String t;

    @Nullable
    protected String u;

    @NonNull
    protected b.InterfaceC2428b v;
    protected b.a w;
    public String x;
    public final Map<String, String> y;
    int z;
    private int J = 0;
    private int T = 2;
    private int ai = 1;
    private sg.bigo.ads.api.core.j aw = new sg.bigo.ads.api.core.j();
    private final long D = SystemClock.elapsedRealtime();

    public b(long j, @NonNull sg.bigo.ads.api.core.h hVar, @NonNull sg.bigo.ads.ai.n nVar, @NonNull JSONObject jSONObject) {
        this.an = 1;
        this.ao = 0;
        this.ap = 1;
        this.z = 0;
        this.ax = "";
        this.E = j;
        this.F = hVar;
        this.a = nVar;
        this.b = jSONObject.optString("ad_id", "");
        this.c = jSONObject.optString("title", "");
        this.d = jSONObject.optString("description", "");
        this.e = jSONObject.optString(X3.i.G0, "");
        String optString = jSONObject.optString("dsp_name", "");
        this.f = optString;
        this.W = "BigoDsp".equalsIgnoreCase(optString);
        this.g = jSONObject.optInt("adx_type", 0);
        this.h = jSONObject.optInt("ad_type", -1);
        this.i = jSONObject.optLong(O6.e1);
        this.j = jSONObject.optString(CampaignEx.JSON_KEY_CREATIVE_ID, "");
        this.k = jSONObject.optString("series_id", "");
        JSONObject optJSONObject = jSONObject.optJSONObject("privacy");
        if (optJSONObject != null) {
            this.l = new o(optJSONObject);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("track_clicks_third");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    arrayList.add(new q(optJSONObject2));
                }
            }
            b.f[] fVarArr = new b.f[arrayList.size()];
            this.n = fVarArr;
            this.n = (b.f[]) arrayList.toArray(fVarArr);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("track_impls_third");
        if (optJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i2);
                if (optJSONObject3 != null) {
                    arrayList2.add(new q(optJSONObject3));
                }
            }
            b.f[] fVarArr2 = new b.f[arrayList2.size()];
            this.m = fVarArr2;
            this.m = (b.f[]) arrayList2.toArray(fVarArr2);
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("ad_nurls");
        if (optJSONArray3 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                JSONObject optJSONObject4 = optJSONArray3.optJSONObject(i3);
                if (optJSONObject4 != null) {
                    arrayList3.add(new q(optJSONObject4));
                }
            }
            b.f[] fVarArr3 = new b.f[arrayList3.size()];
            this.o = fVarArr3;
            this.o = (b.f[]) arrayList3.toArray(fVarArr3);
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("ad_lurls");
        if (optJSONArray4 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                JSONObject optJSONObject5 = optJSONArray4.optJSONObject(i4);
                if (optJSONObject5 != null) {
                    arrayList4.add(new q(optJSONObject5));
                }
            }
            b.f[] fVarArr4 = new b.f[arrayList4.size()];
            this.p = fVarArr4;
            this.p = (b.f[]) arrayList4.toArray(fVarArr4);
        }
        this.q = new ArrayList();
        JSONArray optJSONArray5 = jSONObject.optJSONArray("om_data");
        if (optJSONArray5 != null) {
            this.q = new ArrayList();
            for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                this.q.add(new m(optJSONArray5.optJSONObject(i5)));
            }
        }
        this.r = jSONObject.optString("enc_price", "");
        this.v = new k(jSONObject);
        this.w = new f(jSONObject);
        this.s = jSONObject.optLong("switch_bit_map", 0L);
        this.t = jSONObject.optString("abflags", "");
        this.C = jSONObject.optLong("expired_interval", 0L);
        this.u = jSONObject.optString("mapping_slot", "");
        this.G = jSONObject.optLong("probe_interval");
        this.H = jSONObject.optInt("playable_ad_switch", 0);
        this.x = jSONObject.optString("req_slot");
        a(jSONObject.optString("interstitial_style_getad_config"), false);
        a(jSONObject.optString("common_style_config"), true);
        this.aw.a(jSONObject.optString("ad_form"));
        this.P = jSONObject.optString(X3.i.F0);
        this.O = jSONObject.optString("sdk_style_id");
        this.Q = jSONObject.optInt("banner_show_ad", 0) == 1;
        this.R = jSONObject.optInt("banner_show_domain", 0) == 1;
        this.S = jSONObject.optString("ru_ad_marker");
        this.U = (jSONObject.optLong("bid_price", 0L) * 1.0d) / 1.0E8d;
        this.V = jSONObject.optString("adx_country");
        this.ak = jSONObject.optInt(X3.i.n, 0);
        if (sg.bigo.ads.api.core.a.d(this.h)) {
            this.A = jSONObject;
        }
        this.X = jSONObject.optString("ad_bundle_id", "");
        this.Y = jSONObject.optString("pop_h5");
        this.Z = jSONObject.optString("pop_img");
        JSONObject optJSONObject6 = jSONObject.optJSONObject("pop_page");
        if (optJSONObject6 != null) {
            this.aa = new n(optJSONObject6);
        }
        int optInt = jSONObject.optInt("ad_resp_type");
        this.ab = optInt;
        if (optInt == 2) {
            a(jSONObject, j, hVar, nVar);
        }
        this.y = sg.bigo.ads.common.utils.m.a(jSONObject.optString("pub_extra_info"));
        this.am = jSONObject.optString("dsp_extra");
        this.an = jSONObject.optInt("native_banner_fill_strategy", 1);
        this.ao = jSONObject.optInt("guide_type", 0);
        this.ap = jSONObject.optInt("native_banner_click_type", 0);
        this.aq = jSONObject.optInt("is_interactive", 0);
        this.z = jSONObject.optInt("vpaid_imp_method", 0);
        this.ax = jSONObject.optString("sponsored", "");
        this.az = jSONObject.optString("universal_ad_id_value", "");
        this.ay = jSONObject.optString("universal_ad_id_registry", "");
        JSONObject optJSONObject7 = jSONObject.optJSONObject("playable_cfg");
        if (optJSONObject7 != null) {
            this.ar = optJSONObject7.optInt("playable_load_type", 0);
            this.as = optJSONObject7.optString("zip_url", "");
            this.at = optJSONObject7.optString("html_path", "");
            JSONObject optJSONObject8 = optJSONObject7.optJSONObject("param_json");
            if (optJSONObject8 != null) {
                this.av = optJSONObject8.optInt("js_click", 0);
            }
            this.au = optJSONObject8 != null ? optJSONObject8.toString() : "";
        }
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String A() {
        return this.j;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String B() {
        return this.k;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.e C() {
        return this.l;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.f[] D() {
        return this.m;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.f[] E() {
        return this.n;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.f[] F() {
        return this.o;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.f[] G() {
        return this.p;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final List<b.c> H() {
        return this.q;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String I() {
        return this.r;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String J() {
        return this.t;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean K() {
        return (!this.K || this.L <= 0) ? SystemClock.elapsedRealtime() - this.D >= this.C * 1000 : System.currentTimeMillis() > this.L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[RETURN] */
    @Override // sg.bigo.ads.api.core.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long L() {
        long elapsedRealtime;
        if (this.K) {
            long j = this.L;
            if (j > 0) {
                long j2 = j - (this.C * 1000);
                elapsedRealtime = j2 > 0 ? System.currentTimeMillis() - j2 : 0L;
                if (elapsedRealtime <= 0) {
                    return elapsedRealtime;
                }
                return 0L;
            }
        }
        elapsedRealtime = SystemClock.elapsedRealtime() - this.D;
        if (elapsedRealtime <= 0) {
        }
    }

    @Override // sg.bigo.ads.api.core.b
    public final long M() {
        return this.C;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String N() {
        return this.u;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final b.InterfaceC2428b O() {
        return this.v;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.a P() {
        return this.w;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int Q() {
        return this.ab;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String R() {
        return this.ac;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int S() {
        return this.ad;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void T() {
        this.ad = this.ae;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void U() {
        this.af = true;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean V() {
        return this.af;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int W() {
        return this.ag;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int X() {
        return this.ai;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int Y() {
        return this.aj;
    }

    @Override // sg.bigo.ads.api.core.b
    public final sg.bigo.ads.api.core.q Z() {
        return this.al;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final long a() {
        return sg.bigo.ads.ai.k.a.i();
    }

    @Override // sg.bigo.ads.api.core.b
    public final String aA() {
        return this.as;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String aB() {
        return this.at;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String aC() {
        return this.au;
    }

    @Override // sg.bigo.ads.api.core.b
    public final long aa() {
        return this.E;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final sg.bigo.ads.api.core.h ab() {
        return this.F;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String ac() {
        return !sg.bigo.ads.common.utils.r.a((CharSequence) this.O) ? this.O : this.a.p();
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean ad() {
        return this.H == 1;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ae() {
        return this.I;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int af() {
        return this.J;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final JSONObject ag() {
        return this.A;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void ah() {
        this.K = true;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean ai() {
        return this.K;
    }

    @Override // sg.bigo.ads.api.core.b
    public final double aj() {
        return this.U;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ak() {
        return this.a.v();
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean al() {
        return this.a.v() == 2;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean am() {
        return this.W;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final List<sg.bigo.ads.api.core.b> an() {
        return this.B;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String ao() {
        return this.am;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ap() {
        return this.an;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int aq() {
        return this.ao;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ar() {
        return this.ap;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean as() {
        return this.ak == 1;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int at() {
        return this.aq;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int au() {
        return this.z;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String av() {
        return this.ax;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String aw() {
        return this.az;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String ax() {
        return this.ay;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ay() {
        return this.ar;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int az() {
        return this.av;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String b() {
        return this.a.l();
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String c() {
        return this.a.n();
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final sg.bigo.ads.ai.n d() {
        return this.a;
    }

    @Override // sg.bigo.ads.api.core.b
    public final sg.bigo.ads.ai.o e() {
        return this.M;
    }

    @Override // sg.bigo.ads.api.core.b
    public final sg.bigo.ads.ai.o f() {
        return this.N;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final sg.bigo.ads.ai.e g() {
        return this.aw;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int h() {
        return this.T;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean i() {
        sg.bigo.ads.ai.o oVar = this.M;
        return oVar != null && oVar.a("endpage.ad_component_layout") == 5;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String j() {
        return this.P;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean k() {
        return this.Q;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean l() {
        return this.R;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String m() {
        return this.S;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String n() {
        return this.V;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String o() {
        return this.X;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String p() {
        return this.Y;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String q() {
        return this.Z;
    }

    @Override // sg.bigo.ads.api.core.b
    public final b.d r() {
        return this.aa;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String s() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public String t() {
        if (!sg.bigo.ads.common.utils.r.a((CharSequence) this.c)) {
            return this.c;
        }
        b.d dVar = this.aa;
        return (dVar == null || sg.bigo.ads.common.utils.r.a((CharSequence) dVar.b())) ? this.c : this.aa.b();
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public String u() {
        if (!sg.bigo.ads.common.utils.r.a((CharSequence) this.d)) {
            return this.d;
        }
        b.d dVar = this.aa;
        return (dVar == null || sg.bigo.ads.common.utils.r.a((CharSequence) dVar.c())) ? this.d : this.aa.c();
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String v() {
        return this.e;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String w() {
        return this.f;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int x() {
        return this.g;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int y() {
        return this.h;
    }

    @Override // sg.bigo.ads.api.core.b
    public final long z() {
        return this.i;
    }

    @Nullable
    public static b a(long j, @NonNull sg.bigo.ads.api.core.h hVar, @NonNull sg.bigo.ads.ai.n nVar, String str) {
        try {
            return a(j, hVar, nVar, new JSONObject(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // sg.bigo.ads.api.core.b
    public final String b(String str) {
        if (str == null) {
            return "";
        }
        Map<String, String> map = this.y;
        String str2 = map != null ? map.get(str) : "";
        return str2 == null ? "" : str2;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void c(int i) {
        this.ag = i;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void d(int i) {
        this.I = i;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void e(int i) {
        this.J = i;
    }

    @Nullable
    public static b a(long j, sg.bigo.ads.api.core.h hVar, sg.bigo.ads.ai.n nVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("adx_type", 0);
        if (optInt != 1 && optInt != 2) {
            if (optInt == 3) {
                return new d(j, hVar, nVar, jSONObject);
            }
            if (optInt != 5) {
                return null;
            }
        }
        return new l(j, hVar, nVar, jSONObject);
    }

    @Override // sg.bigo.ads.api.core.b
    public final void b(int i) {
        this.ae = i;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(int i, int i2, boolean z) {
        if (!this.ah || z) {
            this.ah = true;
            this.ai = i;
            this.aj = i2;
        }
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(long j) {
        this.L = j;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(String str) {
        this.ac = str;
    }

    private void a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            sg.bigo.ads.ci.k kVar = new sg.bigo.ads.ci.k(new JSONObject(str));
            if (z) {
                this.N = kVar;
            } else {
                this.M = kVar;
            }
        } catch (JSONException unused) {
        }
    }

    private void a(JSONObject jSONObject, long j, sg.bigo.ads.api.core.h hVar, sg.bigo.ads.ai.n nVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        ArrayList arrayList = null;
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    b a = a(j, hVar, nVar, optJSONObject);
                    if (a != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        a.ab = this.ab;
                        arrayList.add(a);
                    } else {
                        sg.bigo.ads.da.b.a(1005, 10205, "Error ad in ads");
                    }
                }
            }
        }
        this.B = arrayList;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(@NonNull sg.bigo.ads.ai.o oVar) {
        this.M = oVar;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(sg.bigo.ads.api.core.q qVar) {
        this.al = qVar;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(boolean z) {
        this.T = z ? 1 : 2;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean a(int i) {
        return (this.s & ((long) i)) > 0;
    }
}
